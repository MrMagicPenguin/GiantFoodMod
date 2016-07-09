package com.mrcrayfish.tutorial.proxy;

import com.mrcrayfish.tutorial.init.ModBlocks;
import com.mrcrayfish.tutorial.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModBlocks.registerRenders();
	}

}
