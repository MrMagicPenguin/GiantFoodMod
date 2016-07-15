package rug.GiantFoodMod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModCreativeTabs 
{
	public static final CreativeTabs tabGiantFood = new CreativeTabs("tabGiantFood"){
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModBlocks.burger);
	}
	
};
}
