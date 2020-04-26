package dd.基本算法;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-03-19 14:42
 **/

public class 快速排序 {
    public static void quickSort(int[] a,int start,int end){

        int ref;
        if(start < end){
            //调用了parttion的方法对数组进行排序
            ref = partition(a,start,end);
            //对分割之后2个数据进行排序
            quickSort(a,start,ref - 1);
            quickSort(a,ref + 1 ,end);
        }
    }

    public static int partition(int[]a,int start,int end){
        //取出数组的第一个元素作为参考值
        int refvalue = a[start];
        // 从数组右边开始往左边兵力，直到找到小于参考值的元素
        while(start < end){
            while(end > start && a[end] >= refvalue){
                end--;
            }
            // 件元素直接赋予给左边第一个元素
            a[start] = a[end];
            //件序列的左边开始往右遍历直接找到大于基准的元素
            while(end > start && a[start] <= refvalue){
                start++;
            }
            a[end] = a[start];
            return  end;
        }
        a[start] = refvalue;
        return start;
    }
}

