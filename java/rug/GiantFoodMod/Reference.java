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
		SEEDBOMB("seedbomb", "ItemSeedbomb"),
		BURGER("burger", "ItemBurger"),
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
		CRACKER("cracker","BlockCracker"),
		BURGER("burger", "BlockBurger"), 
		JAR("jar", "BlockJar"), 
		HOTDOG("hotdog", "BlockHotdog"),
		DONUT("donut", "BlockDonut");
		
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