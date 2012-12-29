package net.minecraft.src;

import java.util.Random;

public final class ZBGP extends BlockPane {

    public ZBGP() {
        super(102, 49, 148, Material.glass, true);
        setHardness(0.3F).setStepSound(soundGlassFootstep).setBlockName("thinGlass");
    }

}
