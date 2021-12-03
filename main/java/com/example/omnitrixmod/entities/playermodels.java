package com.example.omnitrixmod.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.util.ResourceLocation;

public class playermodels extends PlayerRenderer {

    public static final ResourceLocation ghostfreakstandard = new ResourceLocation("assets/omnitrixmod/textures/entities/ghostfreakstandard.png");
    public playermodels(EntityRendererManager p_i46102_1_, PlayerModel model) {
        super(p_i46102_1_);

    }

    @Override
    public ResourceLocation getTextureLocation(AbstractClientPlayerEntity p_110775_1_) {
        return ghostfreakstandard;
    }

    @Override
    public void renderLeftHand(MatrixStack p_229146_1_, IRenderTypeBuffer p_229146_2_, int p_229146_3_, AbstractClientPlayerEntity p_229146_4_) {
    }

    @Override
    public void renderRightHand(MatrixStack p_229144_1_, IRenderTypeBuffer p_229144_2_, int p_229144_3_, AbstractClientPlayerEntity p_229144_4_) {
    }
}
