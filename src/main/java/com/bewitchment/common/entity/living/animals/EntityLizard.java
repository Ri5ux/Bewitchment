package com.bewitchment.common.entity.living.animals;

import com.bewitchment.common.lib.LibMod;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

/**
 * Created by Joseph on 10/2/2018.
 */

public class EntityLizard extends EntityAnimal implements IAnimatedEntity {

	private static final ResourceLocation loot = new ResourceLocation(LibMod.MOD_ID, "entities/lizard");
	private static final DataParameter<Integer> SKIN_TYPE = EntityDataManager.createKey(EntityLizard.class, DataSerializers.VARINT);
	private int animationTick;
	private Animation currentAnimation;

	public EntityLizard(World worldIn) {
		super(worldIn);
		setSize(1F, .3F);
		this.moveHelper = new EntityMoveHelper(this);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(SKIN_TYPE, getRNG().nextInt(4));
		this.dataManager.setDirty(SKIN_TYPE);
	}

	public int getSkinIndex() {
		return dataManager.get(SKIN_TYPE);
	}

	@Override
	public boolean getCanSpawnHere() {
		int i = MathHelper.floor(this.posX);
		int j = MathHelper.floor(this.getEntityBoundingBox().minY);
		int k = MathHelper.floor(this.posZ);
		BlockPos blockpos = new BlockPos(i, j, k);
		Block block = this.world.getBlockState(blockpos.down()).getBlock();
		return block instanceof BlockGrass && this.world.getLight(blockpos) > 8 && super.getCanSpawnHere();
	}

	@Override
	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAIPanic(this, 0.5D));
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(5, new EntityAIWander(this, 0.3D));
		this.tasks.addTask(5, new EntityAILookIdle(this));
		this.tasks.addTask(4, new EntityAIWatchClosest2(this, EntityPlayer.class, 5f, 1f));
		this.tasks.addTask(3, new EntityAIMate(this, 0.3d));
		this.tasks.addTask(4, new EntityAIFollowParent(this, 0.4D));
	}

	@Override
	protected ResourceLocation getLootTable() {
		return loot;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0.5D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(6.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.85d);
	}

	@Override
	public int getMaxSpawnedInChunk() {
		return 2;
	}

	@Override
	public boolean canMateWith(EntityAnimal otherAnimal) {
		if (otherAnimal == this || !(otherAnimal instanceof EntityLizard)) return false;
		return isInLove() && otherAnimal.isInLove();
	}

	@Override
	public boolean canBePushed() {
		return true;
	}

	@Override
	public boolean isBreedingItem(ItemStack stack) {
		return stack.getItem() == Items.SPIDER_EYE;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityLizard(world);
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setInteger("skin", getSkinIndex());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		dataManager.set(SKIN_TYPE, compound.getInteger("skin"));
		dataManager.setDirty(SKIN_TYPE);
	}

	@Override
	public int getAnimationTick() {
		return 0;
	}

	@Override
	public void setAnimationTick(int tick) {

	}

	@Override
	public Animation getAnimation() {
		return null;
	}

	@Override
	public void setAnimation(Animation animation) {

	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[0];
	}
}
