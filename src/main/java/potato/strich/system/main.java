package potato.strich.system;

import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("fly").setExecutor(new fly.CommandFly());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
