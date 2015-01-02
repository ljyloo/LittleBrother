package com.Pyramid.LittleBrother;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * CommandExecutor of LittleBrother.
 */
public class LBCommands implements CommandExecutor {
	private LittleBrother plugin;
	private String Motd;
	private int port;
	public ConfigAccessor config;
	public Language msgs;
	
	public LBCommands(LittleBrother plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
		this.config = this.plugin.config;
		//this.msgs = this.plugin.msgs;
		//Motd = this.plugin.Motd;
		//port = this.plugin.port;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("LittleBrother")) { 
			if (args.length == 0){
				sender.sendMessage(Language.find("help.command"));
				//sender.sendMessage("§a/LittleBrother version - Shows you the version of the plugin.");
				sender.sendMessage(Language.find("help.version"));
				sender.sendMessage(Language.find("help.status"));
				sender.sendMessage(Language.find("help.reload"));
				return true;
			} else if ((args.length == 1) && args[0].equalsIgnoreCase("version")) {
				// version
				sender.sendMessage("§c["+plugin.getDescription().getName() + "-Version] §3" + plugin.getDescription().getVersion());
				return true;
			} else if ((args.length == 1) && args[0].equalsIgnoreCase("status")) {
				//Motd = this.plugin.Motd;
				//port = this.plugin.port;
				Motd = this.config.getConfig().getString("motd");
				port = this.config.getConfig().getInt("port"); 
				sender.sendMessage(Language.find("status.motd") + " " + Motd);
				sender.sendMessage(Language.find("status.port") + " " + port);
				return true;
			} else if ((args.length == 1) && args[0].equalsIgnoreCase("reload")) {
				sender.sendMessage(Language.find("plugin.config.reload.process"));
				this.plugin.reloadConfig();
				//this.plugin.Msg.reloadConfig();
				//plugin.reloadConfig();
				sender.sendMessage("plugin.config.reload.done");
				return true;
			}
		}
		return false;
	}
}
