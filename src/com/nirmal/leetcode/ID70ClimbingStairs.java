package com.nirmal.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ID70ClimbingStairs {

    public int climbStairs(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);

        return options(n,map);
    }

    public static int options(int n,Map<Integer,Integer> map){
        if(map.containsKey(n)){
            return map.get(n);
        } else {
            int value=options(n-1,map) + options(n-2,map);
            map.put(n,value);
            return value;
        }
    }
}
