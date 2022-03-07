package com.sneha.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumWealth {
        public int maximumWealth(int[][] accounts) {
            int sum;
            List<Integer> customers=new ArrayList<Integer>();
            for(int i=0;i<accounts.length;i++){
                sum=0;
                for(int j=0;j<accounts[i].length;j++){
                    sum=sum+accounts[i][j];
                }
                customers.add(sum);
            }
            return Collections.max(customers);

        }
}
