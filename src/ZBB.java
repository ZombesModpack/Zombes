package net.minecraft.src;

import java.util.Random;

public final class ZBB extends BlockBookshelf {

    public ZBB() {
        super(47);
        setHardness(1.5F).setStepSound(soundWoodFootstep).getIndirectPowerOutput("bookshelf");
    }

    public int quantityDroppedWithBonus(int zero, Random random) {
        return 1;
    }

    public int idDropped(int meta, Random random, int zero) {
        return 47;
    }

}
