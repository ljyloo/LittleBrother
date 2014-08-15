package com.Pyramid.LittleBrother;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class LBCommands implements CommandExecutor {
	private final LittleBrother plugin;
 
	public LBCommands(LittleBrother plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
	}
 
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("LittleBrother")) { 
			if (args.length == 0){
				sender.sendMessage("§a--- 本指令等同于/lb ---");
				sender.sendMessage("§a/LittleBrother version - §7显示当前版本.");
				return true;
			} else if ((args.length == 1) && args[0].equalsIgnoreCase("version")) {
				// version
				sender.sendMessage(plugin.getDescription().getName() + " §7" + plugin.getDescription().getVersion());
				return true;
			}
		}
		return false;
	}
}
