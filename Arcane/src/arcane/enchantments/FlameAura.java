package com.example.arcane.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;

public class FlameAura extends Enchantment {
    public FlameAura() {
        super(Rarity.RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlot[]{EquipmentSlot.CHEST});
    }

    @Override
    public void onUserHurt(LivingEntity user, LivingEntity attacker, int level) {
        if (attacker != null) {
            attacker.attackEntityFrom(DamageSource.ON_FIRE, level * 2.0F);
            attacker.setFire(3 * level);
        }
    }
}