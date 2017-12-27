package org.hit.data.random;

import org.hit.data.table.Globals;
import org.hit.data.text.TextPool;

public class RandomText
        extends AbstractRandomInt
{
    private static final double LOW_LENGTH_MULTIPLIER = 0.4;
    private static final double HIGH_LENGTH_MULTIPLIER = 1.6;

    private final TextPool textPool;
    private final int minLength;
    private final int maxLength;

    public RandomText(long seed, TextPool textPool){
    	this(seed, textPool, Globals.RandomText_averageLength, 1);
    }
    public RandomText(long seed, TextPool textPool, double averageTextLength)
    {
        this(seed, textPool, averageTextLength, 1);
    }

    public RandomText(long seed, TextPool textPool, double averageTextLength, int expectedRowCount)
    {
        super(seed, expectedRowCount * 2);
        this.textPool = textPool;
        this.minLength = (int) (averageTextLength * LOW_LENGTH_MULTIPLIER);
        this.maxLength = (int) (averageTextLength * HIGH_LENGTH_MULTIPLIER);
    }

    public String nextValue()
    {
        int offset = nextInt(0, textPool.size() - maxLength);
        int length = nextInt(minLength, maxLength);
        return textPool.getText(offset, offset + length);
    }
}