package rug.GiantFoodMod.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rug.GiantFoodMod.blocks.BlockBeefBurgerMeat;
import rug.GiantFoodMod.blocks.BlockBread;
import rug.GiantFoodMod.blocks.BlockBurger;
import rug.GiantFoodMod.blocks.BlockCheese;
import rug.GiantFoodMod.blocks.BlockDonut;
import rug.GiantFoodMod.blocks.BlockHotdog;
import rug.GiantFoodMod.blocks.BlockJar;
import rug.GiantFoodMod.blocks.BlockLettuce;
import rug.GiantFoodMod.blocks.BlockPorkBurgerMeat;
import rug.GiantFoodMod.blocks.BlockTomato;

public class ModBlocks {
	
	public static Block cheese;
	public static Block cracker;
	public static Block burger;
	public static Block jar;
	public static Block hotdog;
	public static Block donut;
	public static Block tomato;
	public static Block lettuce;
	public static Block beef_burgermeat;
	public static Block pork_burgermeat;
	
	public static void init() {
		cheese = new BlockCheese();
		cracker = new BlockBread();
		burger = new BlockBurger();
		jar = new BlockJar();
		hotdog = new BlockHotdog();
		donut = new BlockDonut();
		tomato = new BlockTomato();
		lettuce = new BlockLettuce();
		beef_burgermeat = new BlockBeefBurgerMeat();
		pork_burgermeat = new BlockPorkBurgerMeat();
	}
	
	public static void register() {
		registerBlock(cheese);
		registerBlock(cracker);
		registerBlock(burger);
		registerBlock(jar);
		registerBlock(hotdog);
		registerBlock(donut);
		registerBlock(tomato);
		registerBlock(lettuce);
		registerBlock(beef_burgermeat);
		registerBlock(pork_burgermeat);
		
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
		registerRender(hotdog);
		registerRender(donut);
		registerRender(tomato);
		registerRender(lettuce);
		registerRender(beef_burgermeat);
		registerRender(pork_burgermeat);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}