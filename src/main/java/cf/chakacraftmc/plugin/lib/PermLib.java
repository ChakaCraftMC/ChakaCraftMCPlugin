package cf.chakacraftmc.plugin.lib;

import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;

public class PermLib {

    public static void init(PluginManager pm) {
        pm.addPermission(CMD_CCMC);
    }

    public static Permission CMD_CCMC = new Permission("ccmc.cmd");
}
