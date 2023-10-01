package space.yurisi.itemhat;

import org.bukkit.plugin.java.JavaPlugin;
import space.yurisi.itemhat.command.HatCommand;

import java.util.Objects;

public final class ItemHat extends JavaPlugin{

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("hat")).setExecutor(new HatCommand());

        getLogger().info("ItemHatを読み込みました");
    }
}
