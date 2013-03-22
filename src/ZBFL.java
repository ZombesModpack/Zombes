package net.minecraft.src;

public final class ZBFL extends BlockFarmland {

    public ZBFL() {
        super(60);
        setHardness(0.6F).setStepSound(soundGravelFootstep).getIndirectPowerOutput("farmland");
    }

    public void a(World map, int x, int y, int z, Entity ent, float f) {
        return;
    }

}
