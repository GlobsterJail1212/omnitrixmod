package com.example.omnitrixmod;

import com.example.omnitrixmod.items.galvanicpolymer;
import com.example.omnitrixmod.items.omnitrix;
import com.example.omnitrixmod.items.omnitrixprototype;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class renderingregistry {
    @SubscribeEvent
    public static void onItemRegistry(final RegistryEvent.Register<Item> itemRegisteryEvent){
        itemRegisteryEvent.getRegistry().register(omnitrixprototype.INSTANCE);
        itemRegisteryEvent.getRegistry().register(galvanicpolymer.Instance);
        itemRegisteryEvent.getRegistry().register(omnitrix.INSTANCE);
    }
    @SubscribeEvent
    public static void onEntityRegistry(final RegistryEvent.Register<EntityType<?>> event){

    }
}
