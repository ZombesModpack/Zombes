package net.minecraft.src;

import net.minecraft.client.Minecraft;

public final class ZER extends EntityRenderer
{
    public ZER(Minecraft minecraft, EntityRenderer prev)
    {
        super(minecraft);
        fogColorBuffer = prev.fogColorBuffer;
        itemRenderer = prev.itemRenderer;
        lightmapTexture = prev.lightmapTexture;
    }

    public void updateCameraAndRender(float par)
    {
        super.updateCameraAndRender(par);
        ZMod.pingDrawGUIHandle(par);
    }

    public void renderWorld(float par1, long par2)
    {
        // ZMod.beginRenderWorld(par1, par2);
        super.renderWorld(par1, par2);
        // ZMod.endRenderWorld(par1, par2);
    }

    protected void renderRainSnow(float par)
    {
        ZMod.beginRenderRainSnow(par);

        if (ZMod.forwardRenderRainSnow())
        {
            super.renderRainSnow(par);
        }

        ZMod.endRenderRainSnow(par);
    }

    public void updateRenderer()
    {
        Minecraft mc = ZMod.getMinecraft();
        EntityLiving view = mc.renderViewEntity;

        if (!(mc.renderViewEntity instanceof EntityPlayerSP))
        {
            mc.renderViewEntity = mc.thePlayer;
        }

        super.updateRenderer();
        mc.renderViewEntity = view;
    }

    public void getMouseOver(float par1)
    {
        Minecraft mc = ZMod.getMinecraft();
        EntityLiving view = mc.renderViewEntity;

        if (ZMod.isControllingPlayer())
        {
            mc.renderViewEntity = mc.thePlayer;
        }

        super.getMouseOver(par1);
        mc.renderViewEntity = view;
    }
}
