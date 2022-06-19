package me.jasperchasetoq.mostuff.setup;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.mostuff.MoStuff;
import me.jasperchasetoq.mostuff.MoStuffItems;
import me.jasperchasetoq.mostuff.implementation.wands.TransmutationWand;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

    public class MoStuffItemsSetup {
        private MoStuffItemsSetup() {
        }

        public static void setup(@Nonnull MoStuff plugin)
        {
            //Wands
            new TransmutationWand(MoStuffItems.MO_WANDS, MoStuffItems.MO_TRANSMUTATION_WAND, RecipeType.ANCIENT_ALTAR,
                    new ItemStack[] {
                            new ItemStack(Material.DEEPSLATE), SlimefunItems.EARTH_RUNE, new ItemStack(Material.STONE),
                            SlimefunItems.AIR_RUNE, new ItemStack(Material.BLAZE_ROD), SlimefunItems.FIRE_RUNE,
                            new ItemStack(Material.COPPER_BLOCK), SlimefunItems.WATER_RUNE, new ItemStack(Material.OAK_LOG),
                    },
                    500
                    ).register(plugin);
            //Tools
            new SlimefunItem(MoStuffItems.MO_TOOLS, MoStuffItems.MO_NETHER_LUMBER_AXE, RecipeType.MAGIC_WORKBENCH,
                    new ItemStack[] {
                            SlimefunItems.MAGIC_LUMP_3, SlimefunItems.ENDER_RUNE, SlimefunItems.MAGIC_LUMP_3,
                            SlimefunItems.ENDER_RUNE, SlimefunItems.LUMBER_AXE, SlimefunItems.ENDER_RUNE,
                            SlimefunItems.MAGIC_LUMP_3, SlimefunItems.ENDER_RUNE, SlimefunItems.MAGIC_LUMP_3,
                    }
            ).register(plugin);
            //Misc
            new SlimefunItem(MoStuffItems.MO_MISC, MoStuffItems.MO_NETHER_RUNE, RecipeType.MAGIC_WORKBENCH,
                    new ItemStack[] {
                            new ItemStack(Material.NETHERRACK), SlimefunItems.ENDER_RUNE, new ItemStack(Material.NETHERRACK),
                            SlimefunItems.ENDER_RUNE,SlimefunItems.BLANK_RUNE, SlimefunItems.ENDER_RUNE,
                            new ItemStack(Material.NETHERRACK), SlimefunItems.ENDER_RUNE, new ItemStack(Material.NETHERRACK),
                    }
            ).register(plugin);
        }
    }

