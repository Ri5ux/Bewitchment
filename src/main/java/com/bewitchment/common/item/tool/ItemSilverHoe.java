package com.bewitchment.common.item.tool;

import com.bewitchment.client.core.IModelRegister;
import com.bewitchment.client.handler.ModelHandler;
import com.bewitchment.common.core.helper.MobHelper;
import com.bewitchment.common.core.statics.ModCreativeTabs;
import com.bewitchment.common.item.ModMaterials;
import com.bewitchment.common.lib.LibItemName;
import com.bewitchment.common.lib.LibMod;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

/**
 * This class was created by BerciTheBeast on 27.3.2017.
 * It's distributed as part of Bewitchment under
 * the MIT license.
 * Parts of the code were created by Vazkii, for Botania.
 */
public class ItemSilverHoe extends ItemHoe implements IModelRegister {

	public ItemSilverHoe() {
		super(ModMaterials.TOOL_SILVER);
		setRegistryName(LibItemName.SILVER_HOE);
		setTranslationKey(LibMod.MOD_ID + "." + LibItemName.SILVER_HOE);
		setCreativeTab(ModCreativeTabs.ITEMS_CREATIVE_TAB);
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, @Nonnull EntityLivingBase attacker) {
		if (!target.world.isRemote) {
			if (target.getCreatureAttribute() == EnumCreatureAttribute.UNDEAD || MobHelper.isCorporealUndead(target) && attacker instanceof EntityPlayer) {
				target.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer) attacker), 12);
				stack.damageItem(25, attacker);
			} else {
				stack.damageItem(1, attacker);
			}
		}

		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced) {
		tooltip.add(TextFormatting.GRAY + I18n.format("tooltip.bewitchment." + getMaterialName() + "_tool" + "_description.name"));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModel() {
		ModelHandler.registerModel(this, 0);
	}
}
