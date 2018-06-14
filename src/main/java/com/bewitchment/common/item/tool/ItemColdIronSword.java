package com.bewitchment.common.item.tool;

import com.bewitchment.api.BewitchmentAPI;
import com.bewitchment.client.core.IModelRegister;
import com.bewitchment.client.handler.ModelHandler;
import com.bewitchment.common.core.ModCreativeTabs;
import com.bewitchment.common.item.ModMaterials;
import com.bewitchment.common.lib.LibItemName;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.DamageSource;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;

/**
 * Created by Joseph on 6/14/2018.
 */
public class ItemColdIronSword extends ItemSword implements IModelRegister {

	public ItemColdIronSword() {
		super(ModMaterials.TOOL_COLD_IRON);
		this.setMaxStackSize(1);
		setRegistryName(LibItemName.COLD_IRON_SWORD);
		setUnlocalizedName(LibItemName.COLD_IRON_SWORD);
		setCreativeTab(ModCreativeTabs.ITEMS_CREATIVE_TAB);
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, @Nonnull EntityLivingBase attacker) {
		if (!target.world.isRemote) {
			if (target.getCreatureAttribute() == BewitchmentAPI.getAPI().DEMON || target.getCreatureAttribute() == BewitchmentAPI.getAPI().SPIRIT && attacker instanceof EntityPlayer) {
				target.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer) attacker), 12);
				stack.damageItem(5, attacker);
			} else {
				stack.damageItem(1, attacker);
			}
		}

		return true;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModel() {
		ModelHandler.registerModel(this, 0);
	}
}