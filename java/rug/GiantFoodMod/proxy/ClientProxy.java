package rug.GiantFoodMod.proxy;

import rug.GiantFoodMod.init.ModBlocks;
import rug.GiantFoodMod.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
