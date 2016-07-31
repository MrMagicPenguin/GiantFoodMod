package rug.GiantFoodMod;

public class Reference {
	
	public static final String MOD_ID = "gfm";
	public static final String NAME = "Rug's Giant Food Mod";
	public static final String VERSION = "1.3";
	public static final String ACCEPTED_VERSIONS = "[1.9.4]";
	
	public static final String CLIENT_PROXY_CLASS = "rug.GiantFoodMod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "rug.GiantFoodMod.proxy.ServerProxy";
	
	public static enum TutorialItems {
		CHEESE("cheese", "ItemCheese"),
		CRACKER("cracker", "ItemCracker"),
		JAR("jar","ItemJar"),
		TOMATO("tomato", "ItemTomato"),
		SEEDBOMB("seedbomb", "ItemSeedbomb"),
		BURGER("burger", "ItemBurger"),
		BEEFBURGERMEAT("beef_burgermeat", "ItemBeefBurgerMeat"),
		PORKBURGERMEAT("pork_burgermeat", "ItemPorkBurgerMeat"),
		LETTUCE("lettuce","ItemLettuce"),
		HOTDOG("hotdog", "ItemHotdog"),
		DONUT("donut", "ItemDonut");
	
		private String unlocalizedName;
		private String registryName;
		
		TutorialItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum TutorialBlocks {
		CHEESE("cheese", "BlockCheese"),
		CRACKER("cracker","BlockBread"),
		BURGER("burger", "BlockBurger"),
		BEEFBURGERMEAT("beefburgermeat", "BlockBeefBurgerMeat"),
		PORKBURGERMEAT("pork_burgermeat", "BlockPorkBurgerMeat"),
		JAR("jar", "BlockJar"), 
		HOTDOG("hotdog", "BlockHotdog"),
		DONUT("donut", "BlockDonut"),
		TOMATO("tomato", "BlockTomato"),
		LETTUCE("lettuce","BlockLettuce");
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}