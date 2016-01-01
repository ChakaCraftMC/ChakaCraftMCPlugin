package cf.chakacraftmc.plugin.command;

import cf.chakacraftmc.plugin.ChakaCraftMC;
import cf.chakacraftmc.plugin.lib.ChatLib;
import cf.chakacraftmc.plugin.lib.PermLib;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CCMCCommand implements CommandExecutor {

    private final ChakaCraftMC plugin;

    public CCMCCommand(ChakaCraftMC plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender source, Command cmd, String alias, String[] args) {

        int length = args.length;

        if (cmd.getName().equalsIgnoreCase("ccmc")) {
            if (!source.hasPermission(PermLib.CMD_CCMC)) {
                source.sendMessage(ChatLib.Messages.NO_PERMS);
                return true;
            }

            source.sendMessage(ChatLib.Messages.CMD_CCMC_USEHELP);
            source.sendMessage(ChatLib.Messages.PL_VERSION);

            return true;
        }

        return false;
    }
}
