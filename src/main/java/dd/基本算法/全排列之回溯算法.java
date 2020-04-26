package dd.基本算法;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-25 22:27
 **/

public class 全排列之回溯算法 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList();

        List<Integer> listone = new ArrayList<>();
        for (int i :nums
             ) {
            listone.add(i);
            

        }
        insetList(list,listone,0,nums.length);
        return list;
    }

    private void insetList(List<List<Integer>> list,List<Integer> num,int one,int length){
        if(length == one){
            list.add(new ArrayList<>(num));
        }

        for (int i = 0;i < one;i++){
            Collections.swap(list,i,one);
            insetList(list,num,one + 1,length);
            Collections.swap(list,one,i);
        }

    }


}

