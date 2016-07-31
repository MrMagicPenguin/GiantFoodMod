package rug.GiantFoodMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import rug.GiantFoodMod.Reference;

public class BlockBread extends Block {

	public BlockBread() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.TutorialBlocks.CRACKER.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.CRACKER.getRegistryName());
		setHardness(1.0F);
	}

}