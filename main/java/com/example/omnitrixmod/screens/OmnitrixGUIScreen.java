package com.example.omnitrixmod.screens;

import com.example.omnitrixmod.OmnitrixMod;
import com.example.omnitrixmod.container.omnitrixdatacontainer1;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class OmnitrixGUIScreen extends ContainerScreen<omnitrixdatacontainer1> {

    private final ResourceLocation GUI = new ResourceLocation(OmnitrixMod.MODID, "textures/guis/omnitrixgui.png");

    public OmnitrixGUIScreen(omnitrixdatacontainer1 p_i51105_1_, PlayerInventory p_i51105_2_, ITextComponent p_i51105_3_) {
        super(p_i51105_1_, p_i51105_2_, p_i51105_3_);

        imageWidth = 257;
        imageHeight = 255;
    }


    @Override
    protected void renderBg(MatrixStack matrixStack, float ticks, int mx, int my) {
        RenderSystem.color4f(1f, 1f, 1f, 1f);
        this.minecraft.getTextureManager().bind(GUI);
        int i = this.getGuiLeft();
        int j = this.getGuiTop();
        this.blit(matrixStack, i, j, 1, 1, this.getXSize(), this.getYSize());

    }

    @Override
    public void render(MatrixStack matrixStack, int mx, int my, float ticks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack,mx,my,ticks);
        this.renderTooltip(matrixStack,mx,my);
    }
}
