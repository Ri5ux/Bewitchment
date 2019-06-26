package com.bewitchment.common.core.statics;

import com.bewitchment.common.lib.LibMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

/**
 * Created by Joseph on 2/26/2018.
 */
public class ModLootTables {

	//Fortunes and chests
	public static final ResourceLocation JEWELS = new ResourceLocation(LibMod.MOD_ID, "chests/jewels");
	public static final ResourceLocation METALS = new ResourceLocation(LibMod.MOD_ID, "chests/metals");
	public static final ResourceLocation SAPLINGS = new ResourceLocation(LibMod.MOD_ID, "chests/saplings");
	public static final ResourceLocation KNOWLEDGE = new ResourceLocation(LibMod.MOD_ID, "chests/knowledge");
	public static final ResourceLocation INFERNAL_BOOKS = new ResourceLocation(LibMod.MOD_ID, "chests/infernal_books");

	public static void registerLootTables() {
		LootTableList.register(JEWELS);
		LootTableList.register(METALS);
		LootTableList.register(SAPLINGS);
		LootTableList.register(KNOWLEDGE);
		LootTableList.register(INFERNAL_BOOKS);
	}
}
