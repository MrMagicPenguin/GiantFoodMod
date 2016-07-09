package com.mrcrayfish.tutorial;

public class Reference {
	
	public static final String MOD_ID = "ctm";
	public static final String NAME = "MrCrayfish's Tutorial Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.9.4]";
	
	public static final String CLIENT_PROXY_CLASS = "com.mrcrayfish.tutorial.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.mrcrayfish.tutorial.proxy.ServerProxy";
	
	public static enum TutorialItems {
		CHEESE("cheese", "ItemCheese"),
		CRACKER("cracker", "ItemCracker"),
		SEEDBOMB("seedbomb", "ItemSeedbomb"),
		BURGER("burger", "ItemBurger"),
		JAR("jar","ItemJar");
		
		
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
		JAR("jar", "BlockJar");
		
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