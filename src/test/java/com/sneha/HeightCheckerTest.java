package com.sneha;

import com.sneha.sample.HeightChecker;
import org.junit.Assert;
import org.junit.Test;

public class HeightCheckerTest {
    @Test
    public void check_height_ofstudents(){
        HeightChecker h=new HeightChecker();
        Assert.assertEquals(h.heightChecker(new int[]{1,1,4,2,1,3}),3);
        Assert.assertEquals(h.heightChecker(new int[]{5,1,2,3,4}),5);
        Assert.assertEquals(h.heightChecker(new int[]{1,2,3,4,5}),0);
    }
}
