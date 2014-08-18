package com.Pyramid.LittleBrother;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class LBCommands implements CommandExecutor {
	private final LittleBrother plugin;
	private String Motd;
	private int port;
	private ConfigAccessor config;
 
	public LBCommands(LittleBrother plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
		this.config = this.plugin.config;
		//Motd = this.plugin.Motd;
		//port = this.plugin.port;
	}
 
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("LittleBrother")) { 
			if (args.length == 0){
				sender.sendMessage("§c---Command alias:/lb ---");
				sender.sendMessage("§a/LittleBrother version - Shows you the version of the plugin.");
				sender.sendMessage("§a/LittleBrother status - Shows the status of your LittleBrother PocketEdition Server.");
				sender.sendMessage("§a/LittleBrother reload - Reload config file.");
				return true;
			} else if ((args.length == 1) && args[0].equalsIgnoreCase("version")) {
				// version
				sender.sendMessage("§c["+plugin.getDescription().getName() + "-Version] §3" + plugin.getDescription().getVersion());
				return true;
			}else if ((args.length == 1) && args[0].equalsIgnoreCase("status")) {
				Motd = this.plugin.Motd;
				port = this.plugin.port;
				sender.sendMessage("§cThis PE server name：" + Motd);
				sender.sendMessage("§cThis PE server port：" + port);
				return true;
			} else if ((args.length == 1) && args[0].equalsIgnoreCase("reload")) {
				sender.sendMessage("§creloading config file....");
				//config.reloadConfig();
				//plugin.reloadConfig();
				sender.sendMessage("§cReload config file is complete！");
				return true;
			}
		}
		return false;
	}
}
