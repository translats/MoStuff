package me.jasperchasetoq.mostuff;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class MoStuffItems {
    public static final NestedItemGroup MO_GENERAL = new NestedItemGroup(new NamespacedKey(MoStuff.getInstance(), "MO_GENERAL"), new CustomItemStack(Material.CHEST, "&bMoStuff"));
    public static final SubItemGroup MO_WANDS = new SubItemGroup(new NamespacedKey(MoStuff.getInstance(), "MO_WANDS"), MO_GENERAL, new CustomItemStack(Material.BLAZE_ROD, "&bWands"));
    public static final SubItemGroup MO_MISC = new SubItemGroup(new NamespacedKey(MoStuff.getInstance(), "MO_MISC"), MO_GENERAL, new CustomItemStack(Material.CHEST, "&bMisc"));
    public static final SubItemGroup MO_TOOLS = new SubItemGroup(new NamespacedKey(MoStuff.getInstance(), "MO_TOOLS"), MO_GENERAL, new CustomItemStack(Material.DIAMOND_PICKAXE, "&bMisc"));
    public static final SubItemGroup MO_INFO = new SubItemGroup(new NamespacedKey(MoStuff.getInstance(), "MO_INFO"), MO_GENERAL, new CustomItemStack(Material.BOOK, "&bAddon Info"));

    public static final ItemGroup MoStuffGeneral = new ItemGroup(new NamespacedKey(MoStuff.getInstance(), "MoStuff"),
            new CustomItemStack(Material.PISTON, "&bMoStuff"));

    //Wands
    public static final SlimefunItemStack MO_TRANSMUTATION_WAND = new SlimefunItemStack("MO_TRANSMUTATION_WAND", Material.BLAZE_ROD, "&dTransmutation Wand", "", "&fTransmutes certain items to their next form", "");
    //Misc
    public static final SlimefunItemStack MO_NETHER_RUNE = new SlimefunItemStack("MO_NETHER_RUNE", Material.FIREWORK_STAR, "&dNether Rune", "", "&fNether Rune", "");
    //Tools
    public static final SlimefunItemStack MO_NETHER_LUMBER_AXE = new SlimefunItemStack("MO_NETHER_LUMBER_AXE", Material.NETHERITE_AXE, "&dLumber Axe (Nether)", "", "&fCuts down the whole Tree...(Nether Edition)", "");
    //Info
}
