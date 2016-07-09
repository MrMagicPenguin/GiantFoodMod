package com.mrcrayfish.tutorial.blocks;

import com.mrcrayfish.tutorial.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBurger extends Block {
	
	public BlockBurger() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.TutorialBlocks.BURGER.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.BURGER.getRegistryName());
		setHardness(1.0F);
		this.setCreativeTab(CreativeTabs.FOOD);
		
		 
	}
	public boolean isOpaqueCube(IBlockState state){
        return false;
    }

}
	
