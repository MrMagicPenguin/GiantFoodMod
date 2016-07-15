package rug.GiantFoodMod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rug.GiantFoodMod.items.ItemCheese;
import rug.GiantFoodMod.items.ItemCracker;
import rug.GiantFoodMod.items.ItemSeedbomb;

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
