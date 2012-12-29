package net.minecraft.src;

public final class ZBF extends BlockFence {

    public ZBF() {
        super(85, 4);
        setHardness(2.0F).setResistance(5F).setStepSound(soundWoodFootstep).setBlockName("fence");
    }
    
    public boolean canPlaceBlockAt(World world, int i, int j, int k) {
        int l = world.getBlockId(i, j, k);
        return l == 0 || blocksList[l].blockMaterial.isReplaceable();
    }

}
