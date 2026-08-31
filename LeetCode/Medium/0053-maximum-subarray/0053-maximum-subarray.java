import java.util.*;
class Solution {
 static {
        for (int i = 0; i < 500; i++)
            maxSubArray(new int[1]);
    }
    public static int maxSubArray(int[] arr) {
     int csum = 0;
     int l = arr[0];

     for(int i = 0;i<arr.length;i++)
     {
        csum+=arr[i];
        l = Math.max(l,csum);
         if(csum<0)
        {
          csum = 0;
        }
     }
        return l;
    }
}