package rug.GiantFoodMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import rug.GiantFoodMod.Reference;

public class BlockCheese extends Block {

	public BlockCheese() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.TutorialBlocks.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.CHEESE.getRegistryName());
		setHardness(1.0F);
	}

}
