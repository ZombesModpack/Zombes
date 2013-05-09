package net.minecraft.src;

import java.util.*;

public final class ZRND extends Random
{
    private final Random rnd;

    public ZRND(Random original)
    {
        rnd = original;
    }

    public int nextInt(int n)
    {
        return ZMod.mapRandomHandle(n, rnd.nextInt(n));
    }
    public boolean nextBoolean()
    {
        return rnd.nextBoolean();
    }
    public void nextBytes(byte[] bytes)
    {
        rnd.nextBytes(bytes);
    }
    public double nextDouble()
    {
        return rnd.nextDouble();
    }
    public float nextFloat()
    {
        return rnd.nextFloat();
    }
    public double nextGaussian()
    {
        return rnd.nextGaussian();
    }
    public int nextInt()
    {
        return rnd.nextInt();
    }
    public long nextLong()
    {
        return rnd.nextLong();
    }
    public void setSeed(long seed)
    {
        if (rnd != null)
        {
            rnd.setSeed(seed);
        }
        else
        {
            super.setSeed(seed);
        }
    }
}
