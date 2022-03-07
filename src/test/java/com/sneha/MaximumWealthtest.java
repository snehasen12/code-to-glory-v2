package com.sneha;

import com.sneha.sample.MaximumWealth;
import org.junit.Assert;
import org.junit.Test;

public class MaximumWealthtest {
    @Test
    public void richest_maximum_wealth(){
        MaximumWealth mw= new MaximumWealth();
        Assert.assertEquals(mw.maximumWealth(new int[][]{{1,2,3},{3,2,1}}),6);
        Assert.assertEquals(mw.maximumWealth(new int[][]{{1,5},{7,3},{3,5}}),10);
        Assert.assertEquals(mw.maximumWealth(new int[][]{{2,8,7},{7,1,3},{1,9,5}}),17);
    }
}
