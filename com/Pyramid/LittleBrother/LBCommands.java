package com.Pyramid.LittleBrother;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class LBCommands implements CommandExecutor {
	private final LittleBrother plugin;
 
	public LBCommands(LittleBrother plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
	}
 
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("lb")) { 
			sender.sendMessage("This is LittleBrother Commands list:");
			return true;
		}
		return false;
	}
}
