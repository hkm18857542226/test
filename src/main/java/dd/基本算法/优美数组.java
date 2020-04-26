package dd.基本算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: test
 * @description: 如果某个 连续 子数组中恰好有 k 个奇数数字，我们就认为这个子数组是「优美子数组」。
 * @author: 胡凯铭
 * @create: 2020-04-21 19:46
 **/

public class 优美数组 {
    public static void main(String[] args) {
        int[] i = new int[]{2,2,2,1,2,2,1,2,2,2};
        System.out.println(   numberOfSubarrays(i,2));
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        //先找出奇数的 并加入到list
        List<Integer> list = new ArrayList();
        for (int i = 0;i < nums.length;i++){
            if(nums[i] % 2 == 1){
                list.add(i);
            }
        }

        int sum = 0;
        for(int i  = 0;i < list.size() - k + 1;i++){
            // 奇数组的左值
            int left =getSum(nums,list.get(i ),true);
            // 奇数右的左值
            int right =getSum(nums,list.get(i + k - 1),false);
            //计算从 返回距离 边界值 到奇数或者边界值的 距离
            sum += left * right;


        }

        return sum;


    }

    /**
     *
     * @param nums  数组
     * @param k 从哪里开始
     * @param what true 为从左开始  false 为从右开始
     * @return
     */
    public static int getSum(int[]nums,int k,boolean what){
        int sum = 1;

        if(k == 0 || k == nums.length){
            return 1;
        }

        if(what){
            //往左边走
            for (int i = k - 1;i >= 0;i--){
                if(nums[i] % 2 == 1){
                  return sum;
                }
                sum++;

            }
        }else{
            //往右边走
            for(int i = k + 1;i < nums.length;i++){
                if(nums[i] % 2 == 1){
                   return sum;
                }
                sum++;
            }

        }

        return sum;



    }


}

