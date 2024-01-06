package net.uriel.urielmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.uriel.urielmod.UrielMod;
import net.uriel.urielmod.item.custom.NegHeartContainer;
import net.uriel.urielmod.item.custom.PosHeartContainer;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UrielMod.MOD_ID);

    public static final RegistryObject<Item> MAGIC_WAND = ITEMS.register("magic_wand", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EMPTY_HEART_CONTAINER = ITEMS.register("empty_heart_container", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NEG_HEART_ESSENCE = ITEMS.register("neg_heart_essence", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POS_HEART_ESSENCE = ITEMS.register("pos_heart_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POS_HEART_CONTAINER = ITEMS.register("pos_heart_container", () -> new PosHeartContainer(new Item.Properties()));
    public static final RegistryObject<Item> NEG_HEART_CONTAINER = ITEMS.register("neg_heart_container", () -> new NegHeartContainer(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
