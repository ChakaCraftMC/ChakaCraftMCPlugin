package cf.chakacraftmc.plugin.listener;

import cf.chakacraftmc.plugin.ChakaCraftMC;
import cf.chakacraftmc.plugin.lib.Config;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;

public class PlayerListener implements Listener {

    private final ChakaCraftMC plugin;


    public PlayerListener(ChakaCraftMC plugin) {
        this.plugin = plugin;
        this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        String name = player.getName();
        String uuid = player.getUniqueId().toString();

        String host = Config.getConfig().getString("mysql.host");
        String db = Config.getConfig().getString("mysql.db");
        String user = Config.getConfig().getString("mysql.user");
        String pass = Config.getConfig().getString("mysql.pass");

        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://" + host + "/" + db;
            Class.forName(driver);

            Connection con = DriverManager.getConnection(url, user, pass);

            String query = "INSERT INTO players (username, uuid) VALUES (?, ?)";

            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setString(2, uuid);

            stmt.execute();

            con.close();
        } catch (Exception e) {
            this.plugin.getLogger().log(Level.WARNING, "An Error has occurred: " + e);
        }
    }
}
