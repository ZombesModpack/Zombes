package net.minecraft.src;

import java.util.Random;

// BlockLeaves
public final class ZBL extends BlockLeaves {

    public ZBL() {
        super(18);
        setHardness(0.2F).setLightOpacity(1).setStepSound(soundGrassFootstep).getIndirectPowerOutput("leaves");
    }

    public int quantityDroppedWithBonus(int zero, Random random) {
        return ZMod.leavesDropHandle();
    }

    private static int _meta = 0;
    public int idDropped(int meta, Random random, int zero) {
        int id = ZMod.leavesHandle(meta & 3);
        _meta = id >> 16;
        return id & 65535;
    }

    public int damageDropped(int i) { // i=meta-data
        return _meta;
    }

}

