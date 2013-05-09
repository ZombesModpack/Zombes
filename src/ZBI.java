package net.minecraft.src;

import java.util.Random;

public final class ZBI extends BlockIce {

    public ZBI() {
        super(79);
        setHardness(0.5F).setLightOpacity(3).setStepSound(soundGlassFootstep).setUnlocalizedName("ice");
    }
    
    public int quantityDroppedWithBonus(int zero, Random random) {
        return 1;
    }

    public int idDropped(int meta, Random random, int zero) {
        return 79;
    }

    public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
    {
        par2EntityPlayer.addStat(StatList.mineBlockStatArray[blockID], 1);
        par2EntityPlayer.addExhaustion(0.025F);

        if (canSilkHarvest() && EnchantmentHelper.getSilkTouchModifier(par2EntityPlayer.attackingPlayer))
        {
            ItemStack itemstack = createStackedBlock(par6);

            if (itemstack != null)
            {
                dropBlockAsItem_do(par1World, par3, par4, par5, itemstack);
            }
        }
        else
        {
            int i = EnchantmentHelper.getFortuneModifier(par2EntityPlayer.attackingPlayer);
            dropBlockAsItem(par1World, par3, par4, par5, par6, i);
        }
        // original fn ... just without the "isSolid/blocksMovement ||" part
        Material material = par1World.getBlockMaterial(par3, par4 - 1, par5);

        if (material.isLiquid())
        {
            par1World.setBlock(par3, par4, par5, Block.waterMoving.blockID);
        }
    }

}
