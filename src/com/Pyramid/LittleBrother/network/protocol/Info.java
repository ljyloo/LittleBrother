package com.Pyramid.LittleBrother.network.protocol;

interface Info {

	/**
	 * Actual Minecraft: PE protocol version；
	 */
	int CURRENT_PROTOCOL = 20;


	byte LOGIN_PACKET = (byte) 0x82;
	byte LOGIN_STATUS_PACKET = (byte) 0x83;

	byte MESSAGE_PACKET = (byte) 0x85;
	byte SET_TIME_PACKET = (byte) 0x86;
	byte START_GAME_PACKET = (byte) 0x87;
	byte ADD_MOB_PACKET = (byte) 0x88;
	byte ADD_PLAYER_PACKET = (byte) 0x89;
	byte REMOVE_PLAYER_PACKET = (byte) 0x8a;

	byte ADD_ENTITY_PACKET = (byte) 0x8c;
	byte REMOVE_ENTITY_PACKET = (byte) 0x8d;
	byte ADD_ITEM_ENTITY_PACKET = (byte) 0x8e;
	byte TAKE_ITEM_ENTITY_PACKET = (byte) 0x8f;
	byte MOVE_ENTITY_PACKET = (byte) 0x90;

	byte ROTATE_HEAD_PACKET = (byte) 0x94;
	byte MOVE_PLAYER_PACKET = (byte) 0x95;
	//const PLACE_BLOCK_PACKET = (byte) 0x96;
	byte REMOVE_BLOCK_PACKET = (byte) 0x97;
	byte UPDATE_BLOCK_PACKET = (byte) 0x98;
	byte ADD_PAINTING_PACKET = (byte) 0x99;
	byte EXPLODE_PACKET = (byte) 0x9a;
	byte LEVEL_EVENT_PACKET = (byte) 0x9b;
	byte TILE_EVENT_PACKET = (byte) 0x9c;
	byte ENTITY_EVENT_PACKET = (byte) 0x9d;

	byte PLAYER_EQUIPMENT_PACKET = (byte) 0xa0;
	byte PLAYER_ARMOR_EQUIPMENT_PACKET = (byte) 0xa1;
	byte INTERACT_PACKET = (byte) 0xa2;
	byte USE_ITEM_PACKET = (byte) 0xa3;
	byte PLAYER_ACTION_PACKET = (byte) 0xa4;

	byte HURT_ARMOR_PACKET = (byte) 0xa6;
	byte SET_ENTITY_DATA_PACKET = (byte) 0xa7;
	byte SET_ENTITY_MOTION_PACKET = (byte) 0xa8;
	//byte SET_ENTITY_LINK_PACKET = (byte) 0xa9;
	byte SET_HEALTH_PACKET = (byte) 0xaa;
	byte SET_SPAWN_POSITION_PACKET = (byte) 0xab;
	byte ANIMATE_PACKET = (byte) 0xac;
	byte RESPAWN_PACKET = (byte) 0xad;
	byte SEND_INVENTORY_PACKET = (byte) 0xae;
	byte DROP_ITEM_PACKET = (byte) 0xaf;
	byte CONTAINER_OPEN_PACKET = (byte) 0xb0;
	byte CONTAINER_CLOSE_PACKET = (byte) 0xb1;
	byte CONTAINER_SET_SLOT_PACKET = (byte) 0xb2;
	byte CONTAINER_SET_DATA_PACKET = (byte) 0xb3;
	byte CONTAINER_SET_CONTENT_PACKET = (byte) 0xb4;
	//byte CONTAINER_ACK_PACKET = (byte) 0xb5;
	byte CHAT_PACKET = (byte) 0xb6;
	byte ADVENTURE_SETTINGS_PACKET = (byte) 0xb7;
	byte ENTITY_DATA_PACKET = (byte) 0xb8;
	//byte PLAYER_INPUT_PACKET = (byte) 0xb9;
	byte FULL_CHUNK_DATA_PACKET = (byte) 0xba;
	byte UNLOAD_CHUNK_PACKET = (byte) 0xbb;

}
