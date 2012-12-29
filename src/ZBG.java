package net.minecraft.src;

import java.util.Random;

public final class ZBG extends BlockGlass {

    public ZBG() {
        super(20, 49, Material.glass, false);
        setHardness(0.3F).setStepSound(soundGlassFootstep).setBlockName("glass");
    }

    public int quantityDroppedWithBonus(int zero, Random random) {
        return 1;
    }

    public int idDropped(int meta, Random random, int zero) {
        return 20;
    }

}
