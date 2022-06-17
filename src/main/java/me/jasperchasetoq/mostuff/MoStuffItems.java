package me.jasperchasetoq.mostuff;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class MoStuffItems {
    public static final NestedItemGroup MO_GENERAL = new NestedItemGroup(new NamespacedKey(MoStuff.getInstance(), "MO_GENERAL"), new CustomItemStack(Material.CHEST, "&bMoStuff"));
    public static final SubItemGroup MO_WANDS = new SubItemGroup(new NamespacedKey(MoStuff.getInstance(), "MO_WANDS"), MO_GENERAL, new CustomItemStack(Material.BLAZE_ROD, "&bWands"));
    public static final SubItemGroup MO_MISC = new SubItemGroup(new NamespacedKey(MoStuff.getInstance(), "MO_MISC"), MO_GENERAL, new CustomItemStack(Material.CHEST, "&bMisc"));
    public static final SubItemGroup MO_INFO = new SubItemGroup(new NamespacedKey(MoStuff.getInstance(), "MO_INFO"), MO_GENERAL, new CustomItemStack(Material.BOOK, "&bAddon Info"));

    public static final ItemGroup MoStuffGeneral = new ItemGroup(new NamespacedKey(MoStuff.getInstance(), "MoStuff"),
            new CustomItemStack(Material.PISTON, "&bMoStuff"));
}
