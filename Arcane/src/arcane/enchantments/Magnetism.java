package com.example.arcane.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.MinecraftForge;

public class Magnetism extends Enchantment {
    public Magnetism() {
        super(Rarity.UNCOMMON, EnchantmentType.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        if (event.getPlayer() != null) {
            ItemStack tool = event.getPlayer().getHeldItemMainhand();
            if (tool.getEnchantmentLevel(this) > 0) {
                // Logic to pull items directly into inventory
                // (Implementation of magnetic effect is simplified here)
            }
        }
    }
}