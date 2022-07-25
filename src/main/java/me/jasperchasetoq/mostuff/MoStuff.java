package me.jasperchasetoq.mostuff;

import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;
import me.jasperchasetoq.mostuff.setup.MoStuffItemsSetup;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import net.guizhanss.guizhanlib.updater.GuizhanBuildsUpdater;

import javax.annotation.Nonnull;
import java.io.File;

public class MoStuff extends JavaPlugin implements SlimefunAddon {


    @Override
    public void onEnable() {

        Config cfg = new Config(this);

        MoStuffItemsSetup.setup(this);
        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveDefaultConfig();
        }

        if (getConfig().getBoolean("auto-update", true) && getDescription().getVersion().startsWith("Build")) {
            new GuizhanBuildsUpdater(this, getFile(), "SlimefunGuguProject", "MoStuff", "master", false, "zh-CN").start();        }


    }
    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // 您可以在此处返回指向 Bug Tracker 的链接而不是 null
        return "https://github.com/SlimefunGuguProject/MoStuff";
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    private static MoStuff instance;

    public MoStuff() {
        instance = this;
    }

    public static MoStuff getInstance() {
        return instance;
    }
}
