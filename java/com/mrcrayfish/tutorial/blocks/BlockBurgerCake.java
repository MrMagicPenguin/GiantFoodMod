package com.mrcrayfish.tutorial.blocks;

import com.mrcrayfish.tutorial.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBurgerCake extends Block{

	public BlockBurgerCake() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.TutorialBlocks.BURGERCAKE.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.BURGERCAKE.getRegistryName());
		setHardness(1.0F);
		
	}

}
