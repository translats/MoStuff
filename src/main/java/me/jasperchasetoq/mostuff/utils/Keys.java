package me.jasperchasetoq.mostuff.utils;

import lombok.Data;

import me.jasperchasetoq.mostuff.MoStuff;

import org.bukkit.NamespacedKey;

import javax.annotation.Nonnull;

@Data
public final class Keys {


    private Keys() {
        throw new IllegalStateException("Utility Class");
    }

    @Nonnull
    public static NamespacedKey newKey(@Nonnull String value) {
        return new NamespacedKey(MoStuff.getInstance(), value);
    }
}
