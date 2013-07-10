package net.minecraft.src;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.*;
import java.nio.*;

public class ZRG extends RenderGlobal {

    public ZRG(Minecraft minecraft) {
        super(minecraft);
    }

    public void forwardRenderClouds(float f) {
        super.renderClouds(f);
    }

    public void renderClouds(float f) {
        ZMod.onRenderClouds(f);
    }
    
    public int forwardSortAndRender(EntityLivingBase par1, int par2, double par3) {
        return super.sortAndRender(par1, par2, par3);
    }
    
    public int sortAndRender(EntityLivingBase par1, int par2, double par3) {
        return ZMod.onSortAndRender(par1, par2, par3);
    }
    
    public void updateClouds() {
        super.updateClouds();
    }

    public void loadRenderers() {
        ZMod.itemGraphicsLevelHandle(ZMod.getMinecraft().gameSettings.fancyGraphics);
        super.loadRenderers();
    }

}
