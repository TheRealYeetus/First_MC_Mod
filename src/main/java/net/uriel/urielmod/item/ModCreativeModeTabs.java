package net.uriel.urielmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.uriel.urielmod.UrielMod;
import net.uriel.urielmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UrielMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> URIEL_TAB = CREATIVE_MODE_TABS.register("uriel_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MAGIC_WAND.get()))
                    .title(Component.translatable("creative_tab.uriel_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MAGIC_WAND.get());

                        pOutput.accept(ModItems.POS_HEART_ESSENCE.get());
                        pOutput.accept(ModItems.NEG_HEART_ESSENCE.get());

                        pOutput.accept(ModItems.EMPTY_HEART_CONTAINER.get());
                        pOutput.accept(ModItems.POS_HEART_CONTAINER.get());
                        pOutput.accept(ModItems.NEG_HEART_CONTAINER.get());

                        pOutput.accept(ModBlocks.POS_HEART_ORE.get());
                        pOutput.accept(ModBlocks.NEG_HEART_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
