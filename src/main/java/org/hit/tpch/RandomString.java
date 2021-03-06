package org.hit.tpch;

public class RandomString
        extends RandomInt
{
    private final Distribution distribution;

    public RandomString(long seed, Distribution distribution)
    {
        this(seed, distribution, 1);
    }

    public RandomString(long seed, Distribution distribution, int expectedRowCount)
    {
        super(seed, expectedRowCount);
        this.distribution = distribution;
    }

    public String nextValue()
    {
        return distribution.randomValue(this);
    }
}