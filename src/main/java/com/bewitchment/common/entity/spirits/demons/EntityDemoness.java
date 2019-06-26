package com.bewitchment.common.entity.spirits.demons;

import com.bewitchment.api.BewitchmentAPI;
import com.bewitchment.common.entity.LargeEntityAIAttackMelee;
import com.bewitchment.common.entity.ai.EntityDemonBase;
import com.bewitchment.common.lib.LibMod;
import com.bewitchment.common.potion.ModPotions;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;

/**
 * Created by Joseph on 1/14/2019.
 */
public class EntityDemoness extends EntityDemonBase implements IAnimatedEntity, IMob {

	@SuppressWarnings("deprecation")
	public static final Animation ANIMATION_TOSS = Animation.create(20, 10);
	private static final String PREFIX = "entity.bewitchment.prefix.";
	private static final String NAME = "entity.bewitchment.given_name.";

	private static final int PREFIXES = 53;
	private static final int NAMES = 326;
	private static final ResourceLocation loot = new ResourceLocation(LibMod.MOD_ID, "entities/demon");
	private final int prefix = rand.nextInt(PREFIXES);
	private final int name = rand.nextInt(NAMES);
	private int animationTick;
	private Animation currentAnimation;

	public EntityDemoness(World world) {
		super(world);
		setSize(1.8F, 4.6F);
		this.isImmuneToFire = true;
		this.setPathPriority(PathNodeType.WATER, -1.0F);
		this.setPathPriority(PathNodeType.LAVA, 8.0F);
		this.setPathPriority(PathNodeType.DANGER_FIRE, 0.0F);
		this.setPathPriority(PathNodeType.DAMAGE_FIRE, 0.0F);
		this.experienceValue = 165;
		this.moveHelper = new EntityMoveHelper(this);
		if (!world.isRemote && !this.hasCustomName())
			this.setCustomNameTag((rand.nextInt(3) == 0 ? new TextComponentTranslation(PREFIX + prefix).appendText(" ") : new TextComponentTranslation("")).appendSibling(new TextComponentTranslation(NAME + name)).getFormattedText());
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(175.0D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.25D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(6.66D);
	}

	@Override
	protected ResourceLocation getLootTable() {
		return loot;
	}

	@Override
	public int getSkinTypes() {
		return 6;
	}

	@Override
	protected void initEntityAI() {
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(3, new EntityAIAttackMelee(this, 0.3D, false));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.tasks.addTask(4, new EntityAIWatchClosest2(this, EntityPlayer.class, 5f, 1f));
		this.tasks.addTask(5, new EntityAIWander(this, 0.5D));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget<>(this, EntityPlayer.class, false));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<>(this, EntityLivingBase.class, 10, false, false, e -> e instanceof EntityUran || e instanceof EntityHellhound || (!e.isImmuneToFire() && e.getCreatureAttribute() != BewitchmentAPI.getAPI().DEMON && e.getCreatureAttribute() != EnumCreatureAttribute.UNDEAD)));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.tasks.addTask(3, new LargeEntityAIAttackMelee(this, 0.5D, false));
	}

	public boolean isPotionApplicable(PotionEffect potioneffectIn) {
		if (potioneffectIn.getPotion() == MobEffects.WITHER || potioneffectIn.getPotion() == MobEffects.POISON || potioneffectIn.getPotion() == ModPotions.rotting) {
			net.minecraftforge.event.entity.living.PotionEvent.PotionApplicableEvent event = new net.minecraftforge.event.entity.living.PotionEvent.PotionApplicableEvent(this, potioneffectIn);
			net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event);
			return event.getResult() == net.minecraftforge.fml.common.eventhandler.Event.Result.ALLOW;
		}
		return super.isPotionApplicable(potioneffectIn);
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		super.attackEntityAsMob(entity);
		boolean flag = entity.attackEntityFrom(DamageSource.causeMobDamage(this), ((int) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue()));
		if (flag) {
			this.applyEnchantments(this, entity);
			if (entity instanceof EntityLivingBase && this.getAnimation() != ANIMATION_TOSS) {
				{
					this.setAnimation(ANIMATION_TOSS);
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 2000, 1, false, false));
					setFire(500);
					entity.motionY += 0.6000000059604645D;
					this.applyEnchantments(this, entity);
				}
			}
			return flag;
		}
		return false;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		AnimationHandler.INSTANCE.updateAnimations(this);
	}

	public EnumCreatureAttribute getCreatureAttribute() {
		return BewitchmentAPI.getAPI().DEMON;
	}

	@Override
	public int getAnimationTick() {
		return animationTick;
	}

	@Override
	public void setAnimationTick(int tick) {
		animationTick = tick;
	}

	@Override
	public Animation getAnimation() {
		return currentAnimation;
	}

	@Override
	public void setAnimation(Animation animation) {
		currentAnimation = animation;
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{IAnimatedEntity.NO_ANIMATION, EntityDemoness.ANIMATION_TOSS};
	}

	@Override
	public float getEyeHeight() {
		return this.height * 0.75F;
	}

	private int intFromProfession(String prof) {
		if (prof.contains("warlord")) {
			return 0;
		}
		if (prof.contains("slaver")) {
			return 1;
		}
		if (prof.contains("noble")) {
			return 2;
		}
		if (prof.contains("brute")) {
			return 3;
		}
		if (prof.contains("apocryphal_teacher")) {
			return 4;
		}
		if (prof.contains("despot")) {
			return 5;
		}
		return 0;
	}

}

