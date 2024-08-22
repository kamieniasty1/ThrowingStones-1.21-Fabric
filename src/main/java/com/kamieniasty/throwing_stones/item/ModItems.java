package com.kamieniasty.throwing_stones.item;

import com.kamieniasty.throwing_stones.ThrowingStones;
import com.kamieniasty.throwing_stones.item.custom.RockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ROCK = registerItem("rock",
            new RockItem(new Item.Settings().maxCount(16)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ThrowingStones.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ThrowingStones.LOGGER.info("Registering Mod Items for " + ThrowingStones.MOD_ID);
    }
}
