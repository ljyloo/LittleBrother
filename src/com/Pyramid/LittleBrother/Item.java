package com.Pyramid.LittleBrother;

/**
 * Pocket item class.
 */
public class Item {
	public short id;
	public short meta = 0;
	public byte count = 1;
	public String name = "unknow";
	
	public Item(short id, short meta, byte count, String name){
		this.id = id;
		this.meta = meta;
		this.count = count;
		this.name = name;
	}
	
	public static HashMap<String, short> getList(){
		HashMap<String, short> list = new HashMap<String, short>();
		list.put("AIR", 0);
		list.put("STONE", 1);
		list.put("GRASS", 2);
		list.put("DIRT", 3);
		list.put("COBBLESTONE", 4);
		list.put("COBBLE", 4);
		list.put("PLANK", 5);
		list.put("PLANKS", 5);
		list.put("WOODEN_PLANK", 5);
		list.put("WOODEN_PLANKS", 5);
		list.put("SAPLING", 6);
		list.put("SAPLINGS", 6);
		list.put("BEDROCK", 7);
		list.put("WATER", 8);
		list.put("STILL_WATER", 9);
		list.put("LAVA", 10);
		list.put("STILL_LAVA", 11);
		list.put("SAND", 12);
		list.put("GRAVEL", 13);
		list.put("GOLD_ORE", 14);
		list.put("IRON_ORE", 15);
		list.put("COAL_ORE", 16);
		list.put("LOG", 17);
		list.put("WOOD", 17);
		list.put("TRUNK", 17);
		list.put("LEAVES", 18);
		list.put("LEAVE", 18);
		list.put("SPONGE", 19);
		list.put("GLASS", 20);
		list.put("LAPIS_ORE", 21);
		list.put("LAPIS_BLOCK", 22);
		list.put("SANDSTONE", 24);
		list.put("BED_BLOCK", 26);
		list.put("COBWEB", 30);
		list.put("TALL_GRASS", 31);
		list.put("BUSH", 32);
		list.put("DEAD_BUSH", 32);
		list.put("WOOL", 35);
		list.put("DANDELION", 37);
		list.put("ROSE", 38);
		list.put("POPPY", 38);
		list.put("BROWN_MUSHROOM", 39);
		list.put("RED_MUSHROOM", 40);
		list.put("GOLD_BLOCK", 41);
		list.put("IRON_BLOCK", 42);
		list.put("DOUBLE_SLAB", 43);
		list.put("DOUBLE_SLABS", 43);
		list.put("SLAB", 44);
		list.put("SLABS", 44);
		list.put("BRICKS", 45);
		list.put("BRICKS_BLOCK", 45);
		list.put("TNT", 46);
		list.put("BOOKSHELF", 47);
		list.put("MOSS_STONE", 48);
		list.put("MOSSY_STONE", 48);
		list.put("OBSIDIAN", 49);
		list.put("TORCH", 50);
		list.put("FIRE", 51);
		list.put("WOOD_STAIRS", 53);
		list.put("WOODEN_STAIRS", 53);
		list.put("OAK_WOOD_STAIRS", 53);
		list.put("OAK_WOODEN_STAIRS", 53);
		list.put("CHEST", 54);
		list.put("DIAMOND_ORE", 56);
		list.put("DIAMOND_BLOCK", 57);
		list.put("CRAFTING_TABLE", 58);
		list.put("WORKBENCH", 58);
		list.put("WHEAT_BLOCK", 59);
		list.put("FARMLAND", 60);
		list.put("FURNACE", 61);
		list.put("BURNING_FURNACE", 62);
		list.put("LIT_FURNACE", 62);
		list.put("SIGN_POST", 63);
		list.put("DOOR_BLOCK", 64);
		list.put("WOODEN_DOOR_BLOCK", 64);
		list.put("WOOD_DOOR_BLOCK", 64);
		list.put("LADDER", 65);
		list.put("COBBLE_STAIRS", 67);
		list.put("COBBLESTONE_STAIRS", 67);
		list.put("WALL_SIGN", 68);
		list.put("IRON_DOOR_BLOCK", 71);
		list.put("REDSTONE_ORE", 73);
		list.put("GLOWING_REDSTONE_ORE", 74);
		list.put("LIT_REDSTONE_ORE", 74);
		list.put("SNOW", 78);
		list.put("SNOW_LAYER", 78);
		list.put("ICE", 79);
		list.put("SNOW_BLOCK", 80);
		list.put("CACTUS", 81);
		list.put("CLAY_BLOCK", 82);
		list.put("REEDS", 83);
		list.put("SUGARCANE_BLOCK", 83);
		list.put("FENCE", 85);
		list.put("PUMPKIN", 86);
		list.put("NETHERRACK", 87);
		list.put("SOUL_SAND", 88);
		list.put("GLOWSTONE", 89);
		list.put("GLOWSTONE_BLOCK", 89);
		list.put("LIT_PUMPKIN", 91);
		list.put("JACK_O_LANTERN", 91);
		list.put("CAKE_BLOCK", 92);
		list.put("TRAPDOOR", 96);
		list.put("STONE_BRICKS", 98);
		list.put("STONE_BRICK", 98);
		list.put("IRON_BAR", 101);
		list.put("IRON_BARS", 101);
		list.put("GLASS_PANE", 102);
		list.put("GLASS_PANEL", 102);
		list.put("MELON_BLOCK", 103);
		list.put("PUMPKIN_STEM", 104);
		list.put("MELON_STEM", 105);
		list.put("FENCE_GATE", 107);
		list.put("BRICK_STAIRS", 108);
		list.put("STONE_BRICK_STAIRS", 109);
		list.put("NETHER_BRICKS", 112);
		list.put("NETHER_BRICK_BLOCK", 112);
		list.put("NETHER_BRICKS_STAIRS", 114);
		list.put("SANDSTONE_STAIRS", 128);
		list.put("EMERALD_ORE", 129);
		list.put("EMERALD_BLOCK", 133);
		list.put("SPRUCE_WOOD_STAIRS", 134);
		list.put("SPRUCE_WOODEN_STAIRS", 134);
		list.put("BIRCH_WOOD_STAIRS", 135);
		list.put("BIRCH_WOODEN_STAIRS", 135);
		list.put("JUNGLE_WOOD_STAIRS", 136);
		list.put("JUNGLE_WOODEN_STAIRS", 136);
		list.put("COBBLE_WALL", 139);
		list.put("STONE_WALL", 139);
		list.put("COBBLESTONE_WALL", 139);
		list.put("CARROT_BLOCK", 141);
		list.put("POTATO_BLOCK", 142);
		list.put("QUARTZ_BLOCK", 155);
		list.put("QUARTZ_STAIRS", 156);
		list.put("DOUBLE_WOOD_SLAB", 157);
		list.put("DOUBLE_WOODEN_SLAB", 157);
		list.put("DOUBLE_WOOD_SLABS", 157);
		list.put("DOUBLE_WOODEN_SLABS", 157);
		list.put("WOOD_SLAB", 158);
		list.put("WOODEN_SLAB", 158);
		list.put("WOOD_SLABS", 158);
		list.put("WOODEN_SLABS", 158);
		list.put("STAINED_CLAY", 159);
		list.put("STAINED_HARDENED_CLAY", 159);
		list.put("LEAVES2", 161);
		list.put("LEAVE2", 161);
		list.put("WOOD2", 162);
		list.put("TRUNK2", 162);
		list.put("LOG2", 162);
		list.put("ACACIA_WOOD_STAIRS", 163);
		list.put("ACACIA_WOODEN_STAIRS", 163);
		list.put("DARK_OAK_WOOD_STAIRS", 164);
		list.put("DARK_OAK_WOODEN_STAIRS", 164);
		list.put("HAY_BALE", 170);
		list.put("CARPET", 171);
		list.put("HARDENED_CLAY", 172);
		list.put("COAL_BLOCK", 173);
		list.put("BEETROOT_BLOCK", 244);
		list.put("STONECUTTER", 245);
		list.put("GLOWING_OBSIDIAN", 246);
		list.put("NETHER_REACTOR", 247);
		list.put("IRON_SHOVEL", 256); 
		list.put("IRON_PICKAXE", 257); 
		list.put("IRON_AXE", 258); 
		list.put("FLINT_STEEL", 259); 
		list.put("FLINT_AND_STEEL", 259); 
		list.put("APPLE", 260); 
		list.put("BOW", 261);
		list.put("ARROW", 262);
		list.put("COAL", 263); 
		list.put("DIAMOND", 264); 
		list.put("IRON_INGOT", 265); 
		list.put("GOLD_INGOT", 266); 
		list.put("IRON_SWORD", 267);
		list.put("WOODEN_SWORD", 268); 
		list.put("WOODEN_SHOVEL", 269); 
		list.put("WOODEN_PICKAXE", 270); 
		list.put("WOODEN_AXE", 271); 
		list.put("STONE_SWORD", 272);
		list.put("STONE_SHOVEL", 273);
		list.put("STONE_PICKAXE", 274);
		list.put("STONE_AXE", 275);
		list.put("DIAMOND_SWORD", 276);
		list.put("DIAMOND_SHOVEL", 277);
		list.put("DIAMOND_PICKAXE", 278);
		list.put("DIAMOND_AXE", 279);
		list.put("STICK", 280); 
		list.put("STICKS", 280);
		list.put("BOWL", 281); 
		list.put("MUSHROOM_STEW", 282);
		list.put("GOLD_SWORD", 283);
		list.put("GOLD_SHOVEL", 284);
		list.put("GOLD_PICKAXE", 285);
		list.put("GOLD_AXE", 286);
		list.put("GOLDEN_SWORD", 283);
		list.put("GOLDEN_SHOVEL", 284);
		list.put("GOLDEN_PICKAXE", 285);
		list.put("GOLDEN_AXE", 286);
		list.put("STRING", 287);
		list.put("FEATHER", 288); 
		list.put("GUNPOWDER", 289);
		list.put("WOODEN_HOE", 290);
		list.put("STONE_HOE", 291);
		list.put("IRON_HOE", 292); 
		list.put("DIAMOND_HOE", 293);
		list.put("GOLD_HOE", 294);
		list.put("GOLDEN_HOE", 294);
		list.put("SEEDS", 295);
		list.put("WHEAT_SEEDS", 295);
		list.put("WHEAT", 296);
		list.put("BREAD", 297);
		list.put("LEATHER_CAP", 298);
		list.put("LEATHER_TUNIC", 299);
		list.put("LEATHER_PANTS", 300);
		list.put("LEATHER_BOOTS", 301);
		list.put("CHAIN_HELMET", 302);
		list.put("CHAIN_CHESTPLATE", 303);
		list.put("CHAIN_LEGGINGS", 304);
		list.put("CHAIN_BOOTS", 305);
		list.put("IRON_HELMET", 306);
		list.put("IRON_CHESTPLATE", 307);
		list.put("IRON_LEGGINGS", 308);
		list.put("IRON_BOOTS", 309);
		list.put("DIAMOND_HELMET", 310);
		list.put("DIAMOND_CHESTPLATE", 311);
		list.put("DIAMOND_LEGGINGS", 312);
		list.put("DIAMOND_BOOTS", 313);
		list.put("GOLD_HELMET", 314);
		list.put("GOLD_CHESTPLATE", 315);
		list.put("GOLD_LEGGINGS", 316);
		list.put("GOLD_BOOTS", 317);
		list.put("FLINT", 318);
		list.put("RAW_PORKCHOP", 319);
		list.put("COOKED_PORKCHOP", 320);
		list.put("PAINTING", 321);
		list.put("GOLDEN_APPLE", 322);
		list.put("SIGN", 323);
		list.put("WOODEN_DOOR", 324);
		list.put("BUCKET", 325);
		list.put("MINECART", 329);
		list.put("IRON_DOOR", 330);
		list.put("REDSTONE", 331);
		list.put("REDSTONE_DUST", 331);
		list.put("SNOWBALL", 332);
		list.put("LEATHER", 334);
		list.put("BRICK", 336);
		list.put("CLAY", 337);
		list.put("SUGARCANE", 338);
		list.put("SUGAR_CANE", 338);
		list.put("SUGAR_CANES", 338);
		list.put("PAPER", 339);
		list.put("BOOK", 340);
		list.put("SLIMEBALL", 341);
		list.put("EGG", 344);
		list.put("COMPASS", 345);
		list.put("CLOCK", 347);
		list.put("GLOWSTONE_DUST", 348);
		list.put("DYE", 351);
		list.put("BONE", 352);
		list.put("SUGAR", 353);
		list.put("CAKE", 354);
		list.put("BED", 355);
		list.put("SHEARS", 359);
		list.put("MELON", 360);
		list.put("MELON_SLICE", 360);
		list.put("PUMPKIN_SEEDS", 361);
		list.put("MELON_SEEDS", 362);
		list.put("RAW_BEEF", 363);
		list.put("STEAK", 364);
		list.put("COOKED_BEEF", 364);
		list.put("RAW_CHICKEN", 365);
		list.put("COOKED_CHICKEN", 366);
		list.put("SPAWN_EGG", 383);
		list.put("EMERALD", 388);
		list.put("CARROT", 391);
		list.put("CARROTS", 391);
		list.put("POTATO", 392);
		list.put("POTATOES", 392);
		list.put("BAKED_POTATO", 393);
		list.put("BAKED_POTATOES", 393);
		list.put("PUMPKIN_PIE", 400);
		list.put("NETHER_BRICK", 405);
		list.put("QUARTZ", 406);
		list.put("NETHER_QUARTZ", 406);
		list.put("CAMERA", 456);
		list.put("BEETROOT", 457);
		list.put("BEETROOT_SEEDS", 458);
		list.put("BEETROOT_SEED", 458);
		list.put("BEETROOT_SOUP", 459);
	}
	
	/**
	 * Translate Pocket item into Bukkit item.
	 * @param id
	 * @param meta
	 * @param count
	 * @return
	 */
	public static Item get(short id, short meta, byte count){
		return new Item(id, meta, count, "unknow");
	}
	
	/**
	 * Return the id of this item.
	 * @return short
	 */
	public short getID(){
		return this.id;
	}
	
	/**
	 * Return damage.
	 * @return short
	 */
	public short getDamage(){
		return this.meta;
	}
	
	/**
	 * Return count.
	 * @return byte
	 */
	public byte getCount(){
		return this.count;
	}
}
