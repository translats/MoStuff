package me.jasperchasetoq.mostuff.implementation.wands;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.LimitedUseItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import me.jasperchasetoq.mostuff.utils.GeneralUtils;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;

public class TransmutationWand extends LimitedUseItem {
    private static final Map<Material, Material> CONVERSIONS = new EnumMap<>(Material.class);


    static {
        //Deepslate
        CONVERSIONS.put(Material.DEEPSLATE, Material.COBBLED_DEEPSLATE);
        CONVERSIONS.put(Material.COBBLED_DEEPSLATE, Material.POLISHED_DEEPSLATE);
        CONVERSIONS.put(Material.POLISHED_DEEPSLATE, Material.DEEPSLATE_BRICKS);
        CONVERSIONS.put(Material.DEEPSLATE_BRICKS, Material.DEEPSLATE_TILES);
        //Copper
        CONVERSIONS.put(Material.COPPER_BLOCK, Material.EXPOSED_COPPER);
        CONVERSIONS.put(Material.EXPOSED_COPPER, Material.WEATHERED_COPPER);
        CONVERSIONS.put(Material.WEATHERED_COPPER, Material.OXIDIZED_COPPER);
        CONVERSIONS.put(Material.CUT_COPPER, Material.EXPOSED_CUT_COPPER);
        CONVERSIONS.put(Material.EXPOSED_CUT_COPPER, Material.WEATHERED_CUT_COPPER);
        CONVERSIONS.put(Material.WEATHERED_CUT_COPPER, Material.OXIDIZED_CUT_COPPER);
        //Stone
        CONVERSIONS.put(Material.COBBLESTONE, Material.STONE);
        CONVERSIONS.put(Material.STONE, Material.STONE_BRICKS);
        //Logs
        CONVERSIONS.put(Material.OAK_LOG, Material.OAK_WOOD);
        CONVERSIONS.put(Material.SPRUCE_LOG, Material.SPRUCE_WOOD);
        CONVERSIONS.put(Material.BIRCH_LOG, Material.BIRCH_WOOD);
        CONVERSIONS.put(Material.JUNGLE_LOG, Material.JUNGLE_WOOD);
        CONVERSIONS.put(Material.DARK_OAK_LOG, Material.DARK_OAK_WOOD);
        CONVERSIONS.put(Material.ACACIA_LOG, Material.ACACIA_WOOD);
    }


    @ParametersAreNonnullByDefault
    public TransmutationWand(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, int amount) {
        super(itemGroup, item, recipeType, recipe);
        setMaxUseCount(amount);
    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return e -> {
            final Player player = e.getPlayer();
            final Optional<Block> blockOptional = e.getClickedBlock();


            e.cancel();

            blockOptional.ifPresent(block -> convertBlock(player, block));


            damageItem(player, e.getItem());
        };
    }

    private void convertBlock(@Nonnull Player player, @Nonnull Block block) {
        if (GeneralUtils.hasPermission(player, block, Interaction.BREAK_BLOCK)) {
            convertBlock(block);
        }
    }

    public static void convertBlock(@Nonnull Block block) {
        if (BlockStorage.check(block) != null) {
            return;
        }

        Material material = block.getType();
        Material convertTo = CONVERSIONS.get(material);

        if (convertTo != null) {
            block.setType(convertTo, true);

        } else if (material == Material.DIRT) {
            dirt(block);
        }
    }

    private static void dirt(@Nonnull Block block) {
        block.setType(block.getY() < 0 ? Material.ROOTED_DIRT : Material.COARSE_DIRT);
    }


        public static Map<Material, Material> getConversions() {
            return CONVERSIONS;
        }
    }
