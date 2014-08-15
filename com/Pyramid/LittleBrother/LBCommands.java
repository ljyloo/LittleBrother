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
				sender.sendMessage("§c--- 本指令等同于/lb ---");
				sender.sendMessage("§a/LittleBrother version - 显示当前版本.");
				sender.sendMessage("§a/LittleBrother status - 显示当前运行状态.");
				return true;
			} else if ((args.length == 1) && args[0].equalsIgnoreCase("version")) {
				// version
				sender.sendMessage("§c["+plugin.getDescription().getName() + "-Version] §3" + plugin.getDescription().getVersion());
				return true;
			}else if ((args.length == 1) && args[0].equalsIgnoreCase("status")) {
				sender.sendMessage("§c当前PE服务器名称："+Server.getMotd());
			}
		}
		return false;
	}
}
