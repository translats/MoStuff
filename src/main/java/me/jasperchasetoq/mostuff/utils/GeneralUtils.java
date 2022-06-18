package me.jasperchasetoq.mostuff.utils;

import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import lombok.experimental.UtilityClass;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.UUID;

@UtilityClass
public class GeneralUtils {
    @ParametersAreNonnullByDefault
    public static boolean hasPermission(Player player, Block block, Interaction interaction) {
        return hasPermission(player.getUniqueId(), block.getLocation(), interaction);
    }

    @ParametersAreNonnullByDefault
    public static boolean hasPermission(UUID player, Location location, Interaction interaction) {
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
        if (interaction == Interaction.ATTACK_PLAYER && !location.getWorld().getPVP()) {
            return false;
        }
        return Slimefun.getProtectionManager().hasPermission(offlinePlayer, location, interaction);
    }

    @ParametersAreNonnullByDefault
    public static boolean hasPermission(Player player, Location location, Interaction interaction) {
        return hasPermission(player.getUniqueId(), location, interaction);
    }
}
