package com.akaz.zombiemod.util;

import com.akaz.zombiemod.ZombieMod;
import com.akaz.zombiemod.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ZombieMod.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

}
