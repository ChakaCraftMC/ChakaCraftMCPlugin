package cf.chakacraftmc.plugin.lib;

import cf.chakacraftmc.plugin.ChakaCraftMC;
import org.bukkit.ChatColor;

public class ChatLib {

    public static class Messages {

        public static final String CHAT_PREFIX = ChatColor.WHITE + "[" + ChatColor.DARK_AQUA + "Chaka" + ChatColor.AQUA + "Craft" + ChatColor.WHITE + "MC] " + ChatColor.GREEN;

        public static final String NO_PERMS = CHAT_PREFIX + ChatColor.RED + "You do not have permission to use that command.";

        public static final String PL_VERSION = CHAT_PREFIX + "Version: " + ChatColor.DARK_AQUA + ChakaCraftMC.VERSION;

        public static final String CMD_CCMC_USEHELP = CHAT_PREFIX + "Use " + ChatColor.DARK_AQUA + "/ccmc help" + ChatColor.GREEN + " for a list of valid sub-commands.";
    }

    public static class Returns {

    }
}
