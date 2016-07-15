package rug.GiantFoodMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import rug.GiantFoodMod.Reference;

public class BlockCracker extends Block {

	public BlockCracker() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.TutorialBlocks.CRACKER.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.CRACKER.getRegistryName());
		setHardness(1.0F);
	}

}