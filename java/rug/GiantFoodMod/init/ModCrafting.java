package rug.GiantFoodMod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		final int WHITE_DYE_DAMAGE_VALUE = EnumDyeColor.WHITE.getDyeDamage();
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.seedbomb), "SBS",
																	   "SGS",
																	   "SBS", 'S', Blocks.SAPLING,'B', new ItemStack(Items.DYE, 1, WHITE_DYE_DAMAGE_VALUE), 'G', Items.GUNPOWDER);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.burger),"B B",
																	   	"TML",
																	   	" C ", 'B', Items.BREAD, 'T',ModBlocks.tomato, 'M', Items.COOKED_BEEF, 'L', ModBlocks.lettuce, 'C', ModItems.cheese);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.beef_burgermeat), "BB ",
																			   "BB ",
																			   "   ", 'B', Items.COOKED_BEEF);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.beef_burgermeat), "PP ",
				   															   "PP ",
				   															   "   ", 'P', Items.COOKED_PORKCHOP);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.donut), "BS ",
				   													 "DB ",
				   													 "   ", 'B', Items.BREAD, 'S', Items.SUGAR, 'D', Items.DYE);	
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.hotdog), "BPB",
																	  "   ",
																	  "   ", 'P', Items.COOKED_PORKCHOP, 'B', Items.BREAD);	
	}
}
