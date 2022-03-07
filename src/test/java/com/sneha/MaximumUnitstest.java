package com.sneha;

import com.sneha.sample.MaximumUnits;
import org.junit.Assert;
import org.junit.Test;

public class MaximumUnitstest {
    @Test
    public void maximum_units_test_algo_correct_test() {
        MaximumUnits m = new MaximumUnits();
        Assert.assertEquals(m.maximumUnits(new int[][]{{1,3}, {2,2}, {3,1}},4),8);
        Assert.assertEquals(m.maximumUnits(new int[][]{{5,10}, {2,5}, {4,7}, {3,9}},10),91);
    }
}
