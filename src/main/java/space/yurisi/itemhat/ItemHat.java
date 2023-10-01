package space.yurisi.itemhat;

import org.bukkit.plugin.java.JavaPlugin;
import space.yurisi.itemhat.command.HatCommand;

public final class ItemHat extends JavaPlugin{

    @Override
    public void onEnable() {
        getCommand("hat").setExecutor(new HatCommand());

        getLogger().info("ItemHatを読み込みました");
    }
}
