package net.minecraft.src;

import java.util.Random;

public final class ZBM extends BlockMobSpawner {

    public ZBM() {
        super(52, 65);
        setHardness(5F).setStepSound(soundMetalFootstep).setBlockName("mobSpawner").disableStats();
    }
    
    public void onBlockAdded(World map, int x, int y, int z) {
        super.onBlockAdded(map, x, y, z);
        String mob = ZMod.mobTypeHandle();
        if(mob == null) return;
        TileEntityMobSpawner spawner = (TileEntityMobSpawner)(map.getBlockTileEntity(x,y,z));
        spawner.setMobID(mob);
    }

    public int idDropped(int meta, Random random, int zero) {
        return ZMod.spawnderDropHandle() ? 52 : 0;
    }
    
    public int quantityDroppedWithBonus(int zero, Random random) {
        return ZMod.spawnderDropHandle() ? 1 : 0;
    }

}
