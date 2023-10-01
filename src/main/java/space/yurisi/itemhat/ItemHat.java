package space.yurisi.itemhat;

import command.HatCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class ItemHat extends JavaPlugin{

    @Override
    public void onEnable() {
        getCommand("hat").setExecutor(new HatCommand());

        getLogger().info("ItemHatを読み込みました");
    }
}
