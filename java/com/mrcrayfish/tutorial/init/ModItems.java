package com.mrcrayfish.tutorial.init;

import com.mrcrayfish.tutorial.items.ItemCheese;
import com.mrcrayfish.tutorial.items.ItemCracker;
import com.mrcrayfish.tutorial.items.ItemSeedbomb;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item cheese;
	public static Item cracker;
	public static Item seedbomb;
	
	public static void init() {
		cheese = new ItemCheese();
		cracker = new ItemCracker();
		seedbomb = new ItemSeedbomb();
		
		
		
	}
	

	public static void register() {
		GameRegistry.register(cheese);
		GameRegistry.register(cracker);
		GameRegistry.register(seedbomb);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
		registerRender(cracker);
		registerRender(seedbomb);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
