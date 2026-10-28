package com.mochilaoj;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MOCHILA = new Item(new Item.Settings());

    public static void register() {
        Registry.register(Registries.ITEM, Identifier.of(MochilaOJMod.MOD_ID, "mochila"), MOCHILA);
    }
}
