package com.AlsoNiko.stonedrops.mixins;

import com.mojang.brigadier.exceptions.DynamicNCommandExceptionType;;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.server.command.SetBlockCommand;
import net.minecraft.server.command.SummonCommand;
import org.jetbrains.annotations.Async;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Block.class)
public abstract class StoneDropMixin {

    @Inject(at = @At("HEAD"), method = "onBreak (Lnet/minecraft/class_1937;Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;Lnet/minecraft/class_1657;)V")
    private void onBreak(CallbackInfo info) {

    }
}



