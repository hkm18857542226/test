package dd.基本算法;
import java.util.*;
/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-13 19:16
 **/

public class 两数之和 {

    //给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    //
    //你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
    public static void main(String[] args) {
        int[] a = new int[]{3,2,4};
        System.out.println(addArrayHash(a,6)[0]);
    }








    public static int[]addArray(int[] nums,int targe){
        for (int i = 0;i < nums.length;i++){

             for (int j  = i + 1;j <= nums.length - 1 ;j++){
                 if(nums[i] + nums[j] == targe){
                     int[] a = new int[] {i,j};
                     return a;
                 }
            }

        }
        return null;
    }

    public static int[]addArrayHash(int[]nums,int targes){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0;i < nums.length;i++){
            int chachi =targes -  nums[i];
            if(map.containsKey(chachi)){
                return new int[]{map.get(chachi),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}

