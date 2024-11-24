package com.example.arcane;

import com.example.arcane.enchantments.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraft.enchantment.Enchantment;

@Mod(Arcane.MODID)
public class Arcane {
    public static final String MODID = "arcane";

    public Arcane() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Custom setup logic here
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // Client-specific setup logic here
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // Server starting logic here
    }

    // Register the enchantments
    @Mod.EventBusSubscriber(modid = Arcane.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class EnchantmentRegistry {
        @SubscribeEvent
        public static void onRegisterEnchantments(RegistryEvent.Register<Enchantment> event) {
            event.getRegistry().registerAll(
                new TreeFeller().setRegistryName(MODID, "tree_feller"),
                new SwiftStrike().setRegistryName(MODID, "swift_strike"),
                new LevitationBlow().setRegistryName(MODID, "levitation_blow"),
                new Magnetism().setRegistryName(MODID, "magnetism"),
                new Frostbite().setRegistryName(MODID, "frostbite"),
                new FlameAura().setRegistryName(MODID, "flame_aura")
            );
        }
    }
}