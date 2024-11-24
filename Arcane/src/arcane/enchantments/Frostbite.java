package com.example.arcane.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Frostbite extends Enchantment {
    public Frostbite() {
        super(Rarity.RARE, EnchantmentType.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public void onEntityDamaged(LivingEntity user, LivingEntity target, int level) {
        if (target != null) {
            target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 40 * level, 2));
            target.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 40 * level, 1));
        }
    }
}