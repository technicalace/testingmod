package com.thatoneperson.testingmod.item;

import net.minecraft.network.chat.Component;

import com.thatoneperson.testingmod.TestingMod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = TestingMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab TESTING_TAB;   

    @SubscribeEvent 
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        TESTING_TAB = event.registerCreativeModeTab(new ResourceLocation(TestingMod.MODID, "testing_tab"),
            builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL.get()))
                .title(Component.translatable("creativemodetab.testing_tab")));
    }
}