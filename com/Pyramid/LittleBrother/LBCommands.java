public class MyPluginCommandExecutor implements CommandExecutor {
	private final LittleBrother plugin;
 
	public MyPluginCommandExecutor(LittleBrother plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
	}
 
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// implementation exactly as before...
	}
}
