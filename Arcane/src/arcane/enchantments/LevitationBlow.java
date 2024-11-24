package com.example.arcane.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.Entity;

public class SwiftStrike extends Enchantment {
    public SwiftStrike() {
        super(Rarity.RARE, EnchantmentType.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public float calcDamageByCreature(int level, net.minecraft.entity.LivingEntity target) {
        return level * 1.5f; // Increase attack speed
    }
}