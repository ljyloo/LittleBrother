package com.Pyramid.LittleBrother;

import java.util.HashMap;

/**
 * Pocket item class.
 */
public class Item {
	public short id;
	public short meta = 0;
	public byte count = 1;
	public String name = "unknow"; //WTF IS UNKNOW MAYBE UNKNOWN?
	
	public Item(short id, short meta, byte count, String name){
		this.id = id;
		this.meta = meta;
		this.count = count;
		this.name = name;
	}
	
	public static HashMap<String, Short> getList(){
		HashMap<String, Short> list = new HashMap<String, Short>();
		list.put("AIR", (short) 0);
		list.put("STONE", (short) 1);
		list.put("GRASS", (short) 2);
		list.put("DIRT", (short) 3);
		list.put("COBBLESTONE", (short) 4);
		list.put("COBBLE", (short) 4);
		list.put("PLANK", (short) 5);
		list.put("PLANKS", (short) 5);
		list.put("WOODEN_PLANK", (short) 5);
		list.put("WOODEN_PLANKS", (short) 5);
		list.put("SAPLING", (short) 6);
		list.put("SAPLINGS", (short) 6);
		list.put("BEDROCK", (short) 7);
		list.put("WATER", (short) 8);
		list.put("STILL_WATER", (short) 9);
		list.put("LAVA", (short) 10);
		list.put("STILL_LAVA", (short) 11);
		list.put("SAND", (short) 12);
		list.put("GRAVEL", (short) 13);
		list.put("GOLD_ORE", (short) 14);
		list.put("IRON_ORE", (short) 15);
		list.put("COAL_ORE", (short) 16);
		list.put("LOG", (short) 17);
		list.put("WOOD", (short) 17);
		list.put("TRUNK", (short) 17);
		list.put("LEAVES", (short) 18);
		list.put("LEAVE",(short) 18);
		list.put("SPONGE", (short) 19);
		list.put("GLASS", (short) 20);
		list.put("LAPIS_ORE", (short) 21);
		list.put("LAPIS_BLOCK", (short) 22);
		list.put("SANDSTONE", (short) 24);
		list.put("BED_BLOCK", (short) 26);
		list.put("COBWEB", (short) 30);
		list.put("TALL_GRASS", (short) 31);
		list.put("BUSH", (short) 32);
		list.put("DEAD_BUSH", (short) 32);
		list.put("WOOL", (short) 35);
		list.put("DANDELION", (short) 37);
		list.put("ROSE", (short)38);
		list.put("POPPY", (short)38);
		list.put("BROWN_MUSHROOM", (short) 39);
		list.put("RED_MUSHROOM", (short) 40);
		list.put("GOLD_BLOCK", (short) 41);
		list.put("IRON_BLOCK", (short) 42);
		list.put("DOUBLE_SLAB", (short) 43);
		list.put("DOUBLE_SLABS", (short) 43);
		list.put("SLAB", (short) 44);
		list.put("SLABS", (short) 44);
		list.put("BRICKS", (short) 45);
		list.put("BRICKS_BLOCK", (short)45);
		list.put("TNT", (short) 46);
		list.put("BOOKSHELF", (short) 47);
		list.put("MOSS_STONE", (short) 48);
		list.put("MOSSY_STONE", (short) 48);
		list.put("OBSIDIAN", (short) 49);
		list.put("TORCH", (short) 50);
		list.put("FIRE", (short) 51);
		list.put("WOOD_STAIRS", (short) 53);
		list.put("WOODEN_STAIRS", (short) 53);
		list.put("OAK_WOOD_STAIRS", (short) 53);
		list.put("OAK_WOODEN_STAIRS", (short) 53);
		list.put("CHEST", (short) 54);
		list.put("DIAMOND_ORE", (short) 56);
		list.put("DIAMOND_BLOCK", (short) 57);
		list.put("CRAFTING_TABLE", (short) 58);
		list.put("WORKBENCH", (short) 58);
		list.put("WHEAT_BLOCK", (short) 59);
		list.put("FARMLAND", (short) 60);
		list.put("FURNACE", (short) 61);
		list.put("BURNING_FURNACE", (short) 62);
		list.put("LIT_FURNACE", (short) 62);
		list.put("SIGN_POST", (short) 63);
		list.put("DOOR_BLOCK", (short) 64);
		list.put("WOODEN_DOOR_BLOCK", (short) 64);
		list.put("WOOD_DOOR_BLOCK", (short) 64);
		list.put("LADDER", (short) 65);
		list.put("COBBLE_STAIRS", (short) 67);
		list.put("COBBLESTONE_STAIRS",(short) 67);
		list.put("WALL_SIGN", (short) 68);
		list.put("IRON_DOOR_BLOCK", (short) 71);
		list.put("REDSTONE_ORE", (short) 73);
		list.put("GLOWING_REDSTONE_ORE", (short) 74);
		list.put("LIT_REDSTONE_ORE", (short) 74);
		list.put("SNOW", (short) 78);
		list.put("SNOW_LAYER",(short) 78);
		list.put("ICE", (short) 79);
		list.put("SNOW_BLOCK", (short) 80);
		list.put("CACTUS", (short) 81);
		list.put("CLAY_BLOCK", (short) 82);
		list.put("REEDS", (short) 83);
		list.put("SUGARCANE_BLOCK", (short) 83);
		list.put("FENCE", (short) 85);
		list.put("PUMPKIN", (short) 86);
		list.put("NETHERRACK", (short) 87);
		list.put("SOUL_SAND", (short) 88);
		list.put("GLOWSTONE", (short) 89);
		list.put("GLOWSTONE_BLOCK", (short) 89);
		list.put("LIT_PUMPKIN", (short) 91);
		list.put("JACK_O_LANTERN", (short) 91);
		list.put("CAKE_BLOCK", (short) 92);
		list.put("TRAPDOOR", (short) 96);
		list.put("STONE_BRICKS", (short) 98);
		list.put("STONE_BRICK",(short) 98);
		list.put("IRON_BAR",(short) 101);
		list.put("IRON_BARS", (short) 101);
		list.put("GLASS_PANE", (short) 102);
		list.put("GLASS_PANEL", (short) 102);
		list.put("MELON_BLOCK", (short) 103);
		list.put("PUMPKIN_STEM", (short) 104);
		list.put("MELON_STEM", (short) 105);
		list.put("FENCE_GATE", (short) 107);
		list.put("BRICK_STAIRS", (short) 108);
		list.put("STONE_BRICK_STAIRS", (short) 109);
		list.put("NETHER_BRICKS", (short) 112);
		list.put("NETHER_BRICK_BLOCK", (short) 112);
		list.put("NETHER_BRICKS_STAIRS", (short) 114);
		list.put("SANDSTONE_STAIRS", (short) 128);
		list.put("EMERALD_ORE", (short) 129);
		list.put("EMERALD_BLOCK", (short) 133);
		list.put("SPRUCE_WOOD_STAIRS", (short) 134);
		list.put("SPRUCE_WOODEN_STAIRS", (short) 134);
		list.put("BIRCH_WOOD_STAIRS", (short) 135);
		list.put("BIRCH_WOODEN_STAIRS", (short) 135);
		list.put("JUNGLE_WOOD_STAIRS",(short) 136);
		list.put("JUNGLE_WOODEN_STAIRS", (short) 136);
		list.put("COBBLE_WALL", (short) 139);
		list.put("STONE_WALL", (short) 139);
		list.put("COBBLESTONE_WALL", (short) 139);
		list.put("CARROT_BLOCK", (short) 141);
		list.put("POTATO_BLOCK", (short) 142);
		list.put("QUARTZ_BLOCK", (short) 155);
		list.put("QUARTZ_STAIRS", (short) 156);
		list.put("DOUBLE_WOOD_SLAB", (short) 157);
		list.put("DOUBLE_WOODEN_SLAB", (short) 157);
		list.put("DOUBLE_WOOD_SLABS", (short) 157);
		list.put("DOUBLE_WOODEN_SLABS", (short) 157);
		list.put("WOOD_SLAB", (short) 158);
		list.put("WOODEN_SLAB", (short) 158);
		list.put("WOOD_SLABS", (short) 158);
		list.put("WOODEN_SLABS", (short) 158);
		list.put("STAINED_CLAY", (short) 159);
		list.put("STAINED_HARDENED_CLAY", (short) 159);
		list.put("LEAVES2", (short) 161);
		list.put("LEAVE2", (short) 161);
		list.put("WOOD2", (short) 162);
		list.put("TRUNK2",(short) 162);
		list.put("LOG2", (short) 162);
		list.put("ACACIA_WOOD_STAIRS",(short) 163);
		list.put("ACACIA_WOODEN_STAIRS", (short) 163);
		list.put("DARK_OAK_WOOD_STAIRS", (short) 164);
		list.put("DARK_OAK_WOODEN_STAIRS", (short) 164);
		list.put("HAY_BALE", (short) 170);
		list.put("CARPET", (short) 171);
		list.put("HARDENED_CLAY", (short) 172);
		list.put("COAL_BLOCK", (short) 173);
		list.put("BEETROOT_BLOCK", (short) 244);
		list.put("STONECUTTER", (short) 245);
		list.put("GLOWING_OBSIDIAN", (short) 246);
		list.put("NETHER_REACTOR", (short) 247);
		list.put("IRON_SHOVEL", (short) 256); 
		list.put("IRON_PICKAXE", (short) 257); 
		list.put("IRON_AXE", (short) 258); 
		list.put("FLINT_STEEL", (short) 259); 
		list.put("FLINT_AND_STEEL", (short) 259); 
		list.put("APPLE", (short) 260); 
		list.put("BOW", (short) 261);
		list.put("ARROW", (short) 262);
		list.put("COAL", (short) 263); 
		list.put("DIAMOND", (short) 264); 
		list.put("IRON_INGOT", (short) 265); 
		list.put("GOLD_INGOT", (short) 266); 
		list.put("IRON_SWORD", (short) 267);
		list.put("WOODEN_SWORD", (short) 268); 
		list.put("WOODEN_SHOVEL", (short) 269); 
		list.put("WOODEN_PICKAXE", (short) 270); 
		list.put("WOODEN_AXE", (short) 271); 
		list.put("STONE_SWORD", (short) 272);
		list.put("STONE_SHOVEL", (short) 273);
		list.put("STONE_PICKAXE", (short) 274);
		list.put("STONE_AXE", (short) 275);
		list.put("DIAMOND_SWORD", (short) 276);
		list.put("DIAMOND_SHOVEL", (short) 277);
		list.put("DIAMOND_PICKAXE", (short) 278);
		list.put("DIAMOND_AXE", (short) 279);
		list.put("STICK", (short) 280); 
		list.put("STICKS", (short) 280);
		list.put("BOWL", (short) 281); 
		list.put("MUSHROOM_STEW", (short) 282);
		list.put("GOLD_SWORD", (short) 283);
		list.put("GOLD_SHOVEL", (short) 284);
		list.put("GOLD_PICKAXE", (short) 285);
		list.put("GOLD_AXE",(short) 286);
		list.put("GOLDEN_SWORD", (short) 283);
		list.put("GOLDEN_SHOVEL", (short) 284);
		list.put("GOLDEN_PICKAXE",(short) 285);
		list.put("GOLDEN_AXE", (short) 286);
		list.put("STRING", (short) 287);
		list.put("FEATHER", (short) 288); 
		list.put("GUNPOWDER", (short) 289);
		list.put("WOODEN_HOE", (short) 290);
		list.put("STONE_HOE", (short) 291);
		list.put("IRON_HOE", (short) 292); 
		list.put("DIAMOND_HOE", (short) 293);
		list.put("GOLD_HOE", (short) 294);
		list.put("GOLDEN_HOE", (short) 294);
		list.put("SEEDS", (short) 295);
		list.put("WHEAT_SEEDS", (short) 295);
		list.put("WHEAT", (short) 296);
		list.put("BREAD", (short) 297);
		list.put("LEATHER_CAP", (short) 298);
		list.put("LEATHER_TUNIC", (short) 299);
		list.put("LEATHER_PANTS", (short) 300);
		list.put("LEATHER_BOOTS", (short) 301);
		list.put("CHAIN_HELMET", (short) 302);
		list.put("CHAIN_CHESTPLATE", (short) 303);
		list.put("CHAIN_LEGGINGS", (short) 304);
		list.put("CHAIN_BOOTS", (short) 305);
		list.put("IRON_HELMET", (short) 306);
		list.put("IRON_CHESTPLATE", (short) 307);
		list.put("IRON_LEGGINGS", (short) 308);
		list.put("IRON_BOOTS",(short) 309);
		list.put("DIAMOND_HELMET",(short) 310);
		list.put("DIAMOND_CHESTPLATE", (short) 311);
		list.put("DIAMOND_LEGGINGS",(short) 312);
		list.put("DIAMOND_BOOTS",(short) 313);
		list.put("GOLD_HELMET", (short) 314);
		list.put("GOLD_CHESTPLATE", (short) 315);
		list.put("GOLD_LEGGINGS", (short) 316);
		list.put("GOLD_BOOTS", (short) 317);
		list.put("FLINT", (short) 318);
		list.put("RAW_PORKCHOP", (short) 319);
		list.put("COOKED_PORKCHOP", (short) 320);
		list.put("PAINTING", (short) 321);
		list.put("GOLDEN_APPLE", (short) 322);
		list.put("SIGN", (short) 323);
		list.put("WOODEN_DOOR",(short) 324);
		list.put("BUCKET", (short) 325);
		list.put("MINECART", (short) 329);
		list.put("IRON_DOOR", (short) 330);
		list.put("REDSTONE", (short) 331);
		list.put("REDSTONE_DUST", (short) 331);
		list.put("SNOWBALL", (short) 332);
		list.put("LEATHER", (short) 334);
		list.put("BRICK", (short) 336);
		list.put("CLAY", (short) 337);
		list.put("SUGARCANE", (short) 338);
		list.put("SUGAR_CANE", (short) 338);
		list.put("SUGAR_CANES", (short) 338);
		list.put("PAPER", (short) 339);
		list.put("BOOK",(short) 340);
		list.put("SLIMEBALL", (short) 341);
		list.put("EGG", (short) 344);
		list.put("COMPASS", (short) 345);
		list.put("CLOCK", (short) 347);
		list.put("GLOWSTONE_DUST", (short) 348);
		list.put("DYE", (short) 351);
		list.put("BONE", (short) 352);
		list.put("SUGAR", (short) 353);
		list.put("CAKE", (short) 354);
		list.put("BED", (short) 355);
		list.put("SHEARS", (short) 359);
		list.put("MELON", (short) 360);
		list.put("MELON_SLICE", (short) 360);
		list.put("PUMPKIN_SEEDS", (short) 361);
		list.put("MELON_SEEDS", (short) 362);
		list.put("RAW_BEEF", (short) 363);
		list.put("STEAK", (short) 364);
		list.put("COOKED_BEEF", (short) 364);
		list.put("RAW_CHICKEN", (short) 365);
		list.put("COOKED_CHICKEN", (short) 366);
		list.put("SPAWN_EGG", (short) 383);
		list.put("EMERALD", (short) 388);
		list.put("CARROT", (short) 391);
		list.put("CARROTS", (short) 391);
		list.put("POTATO", (short) 392);
		list.put("POTATOES", (short) 392);
		list.put("BAKED_POTATO", (short) 393);
		list.put("BAKED_POTATOES", (short) 393);
		list.put("PUMPKIN_PIE", (short) 400);
		list.put("NETHER_BRICK", (short) 405);
		list.put("QUARTZ", (short) 406);
		list.put("NETHER_QUARTZ", (short) 406);
		list.put("CAMERA", (short) 456);
		list.put("BEETROOT", (short) 457);
		list.put("BEETROOT_SEEDS", (short) 458);
		list.put("BEETROOT_SEED", (short) 458);
		list.put("BEETROOT_SOUP", (short) 459);
		return list;
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
