package me.jasperchasetoq.mostuff;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class MoStuffItems {
    public static final NestedItemGroup MO_GENERAL = new NestedItemGroup(new NamespacedKey(MoStuff.getInstance(), "MO_GENERAL"), new CustomItemStack(Material.CHEST, "&b魔杖工艺"));
    public static final SubItemGroup MO_MACHINES = new SubItemGroup(new NamespacedKey(MoStuff.getInstance(), "MO_MACHINES"), MO_GENERAL, new CustomItemStack(Material.FURNACE, "&b机器"));
    public static final SubItemGroup MO_WANDS = new SubItemGroup(new NamespacedKey(MoStuff.getInstance(), "MO_WANDS"), MO_GENERAL, new CustomItemStack(Material.BLAZE_ROD, "&b魔杖"));
    public static final SubItemGroup MO_MISC = new SubItemGroup(new NamespacedKey(MoStuff.getInstance(), "MO_MISC"), MO_GENERAL, new CustomItemStack(Material.CHEST, "&b杂项"));
    public static final SubItemGroup MO_TOOLS = new SubItemGroup(new NamespacedKey(MoStuff.getInstance(), "MO_TOOLS"), MO_GENERAL, new CustomItemStack(Material.DIAMOND_PICKAXE, "&b工具"));
    public static final SubItemGroup MO_INFO = new SubItemGroup(new NamespacedKey(MoStuff.getInstance(), "MO_INFO"), MO_GENERAL, new CustomItemStack(Material.BOOK, "&b插件信息"));

    public static final ItemGroup MoStuffGeneral = new ItemGroup(new NamespacedKey(MoStuff.getInstance(), "MoStuff"),
            new CustomItemStack(Material.PISTON, "&b魔杖工艺"));

    //Wands
    public static final SlimefunItemStack MO_TRANSMUTATION_WAND = new SlimefunItemStack("MO_TRANSMUTATION_WAND", Material.BLAZE_ROD, "&d蜕变魔杖", "", "&f用于转换方块/物品", "");
    //Misc
    public static final SlimefunItemStack MO_GLASS_CUTTER = new SlimefunItemStack("MO_GLASS_CUTTER", Material.STONECUTTER, "&f玻璃刀", "", "&f将玻璃切割成玻璃板", "");
    //Info
}
