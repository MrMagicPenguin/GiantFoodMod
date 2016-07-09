package com.mrcrayfish.tutorial.blocks;

import javax.annotation.Nullable;

import com.mrcrayfish.tutorial.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBurgerCake extends Block{
	public static final PropertyInteger BITES = PropertyInteger.create("bites", 0, 6);

	public BlockBurgerCake() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.TutorialBlocks.BURGERCAKE.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.BURGERCAKE.getRegistryName());
		setHardness(1.0F);
	}
		
		
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ){
		this.eatGiantFood(worldIn, pos, state, playerIn);
		return true;	
}

	private void eatGiantFood(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
	
	        if (player.canEat(false))
	        {
	            player.addStat(StatList.CAKE_SLICES_EATEN);
	            player.getFoodStats().addStats(2, 0.1F);
	            int i = ((Integer)state.getValue(BITES)).intValue();

	            if (i < 6)
	            {
	                worldIn.setBlockState(pos, state.withProperty(BITES, Integer.valueOf(i + 1)), 3);
	            }
	            else
	            {
	                worldIn.setBlockToAir(pos);
	            }
	        }
	    }
		
	}
