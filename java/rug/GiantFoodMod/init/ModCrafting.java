package rug.GiantFoodMod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		final int WHITE_DYE_DAMAGE_VALUE = EnumDyeColor.WHITE.getDyeDamage();
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.seedbomb), "SBS",
																	   "SGS",
																	   "SBS", 'S', Blocks.SAPLING,'B', new ItemStack(Items.DYE, 1, WHITE_DYE_DAMAGE_VALUE), 'G', Items.GUNPOWDER);
		
	}
}
