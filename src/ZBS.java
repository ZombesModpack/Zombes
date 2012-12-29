package net.minecraft.src;

import java.util.Random;

public final class ZBS extends BlockSponge {

    public ZBS() {
        super(19);
        setHardness(0.6F).setStepSound(soundGrassFootstep).setBlockName("sponge");
    }
    
    public void onBlockAdded(World map, int x, int y, int z) {
        boolean water = false;
        if(map.getBlockMaterial(x+1, y, z) == Material.water) water = true;
        else if(map.getBlockMaterial(x, y, z+1) == Material.water) water = true;
        else if(map.getBlockMaterial(x-1, y, z) == Material.water) water = true;
        else if(map.getBlockMaterial(x, y, z-1) == Material.water) water = true;
        if(water && map.getBlockMaterial(x, y+1, z) != Material.water) {
            map.setBlockAndMetadata(x,y,z, 19, 1);
            map.scheduleBlockUpdate(x,y,z, 19, 5);
        }
    }

    public void onBlockRemoval(World map, int x, int y, int z) { }

    public void updateTick(World map, int x, int y, int z, Random rnd) {
        int meta = map.getBlockMetadata(x,y,z);
        if(meta == 0) return;
        map.setBlockAndMetadata(x,y,z,0,0); // remove the block
        if(map.getBlockMaterial(x, y+1, z) == Material.water) return;

        if(map.getBlockMaterial(x+1, y, z) == Material.water) { map.setBlockAndMetadata(x+1,y,z, 19, 1); map.scheduleBlockUpdate(x+1,y,z, 19, 5); }
        if(map.getBlockMaterial(x, y, z+1) == Material.water) { map.setBlockAndMetadata(x,y,z+1, 19, 1); map.scheduleBlockUpdate(x,y,z+1, 19, 5); }
        if(map.getBlockMaterial(x-1, y, z) == Material.water) { map.setBlockAndMetadata(x-1,y,z, 19, 1); map.scheduleBlockUpdate(x-1,y,z, 19, 5); }
        if(map.getBlockMaterial(x, y, z-1) == Material.water) { map.setBlockAndMetadata(x,y,z-1, 19, 1); map.scheduleBlockUpdate(x,y,z-1, 19, 5); }
    }
    
    public int tickRate() {
        return 5;
    }

}
