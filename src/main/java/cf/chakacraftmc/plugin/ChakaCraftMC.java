package cf.chakacraftmc.plugin;

import cf.chakacraftmc.plugin.command.CCMCCommand;
import cf.chakacraftmc.plugin.lib.PermLib;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class ChakaCraftMC extends JavaPlugin {

    public static final String VERSION = "1.0.0-B1";

    private PluginManager pm = this.getServer().getPluginManager();

    @Override
    public void onDisable() {

        //Perm Lib Initialization
        PermLib.init(this.pm);

        //Command Registration
        this.getCommand("ccmc").setExecutor(new CCMCCommand(this));

        this.getLogger().log(Level.INFO, "Disabled");
    }

    @Override
    public void onEnable() {

        this.getLogger().log(Level.INFO, "Enabled");
    }
}