package com.mrcrayfish.tutorial.init;

import com.mrcrayfish.tutorial.blocks.BlockBurger;
import com.mrcrayfish.tutorial.blocks.BlockCheese;
import com.mrcrayfish.tutorial.blocks.BlockCracker;
import com.mrcrayfish.tutorial.blocks.BlockJar;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block cheese;
	public static Block cracker;
	public static Block burger;
	public static Block jar;
	
	
	public static void init() {
		cheese = new BlockCheese();
		cracker = new BlockCracker();
		burger = new BlockBurger();
		jar = new BlockJar();
	}
	
	public static void register() {
		registerBlock(cheese);
		registerBlock(cracker);
		registerBlock(burger);
		registerBlock(jar);
		
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
		registerRender(cracker);
		registerRender(burger);
		registerRender(jar);
		
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
