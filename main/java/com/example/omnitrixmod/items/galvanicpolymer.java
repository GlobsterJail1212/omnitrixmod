package com.example.omnitrixmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;

public class galvanicpolymer extends Item {
    public static final ResourceLocation model = new ResourceLocation("assets/textures/items/galvanicpolymer");
    public static Item Instance = new galvanicpolymer(new Properties().tab(ItemGroup.TAB_MISC)).setRegistryName("galvanicpolymer");

    public galvanicpolymer(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }
}
