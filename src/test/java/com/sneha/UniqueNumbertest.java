package com.sneha;

import com.sneha.sample.UniqueNumber;
import org.junit.Assert;
import org.junit.Test;

public class UniqueNumbertest {
    @Test
    public void unique_number_occurences(){
        UniqueNumber n=new UniqueNumber();
        Assert.assertEquals(n.uniqueOccurrences(new int[]{1,2,2,1,1,3}),true);
        Assert.assertEquals(n.uniqueOccurrences(new int[]{1,2}),false);
        Assert.assertEquals(n.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}),true);
    }
}
