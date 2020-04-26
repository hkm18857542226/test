package dd.基本算法;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-13 20:00
 **/

public class 两数想加 {

    public static void main(String[] args) {

        int[] hkkm = new int[]{5,7,6,15,7,5,4};

        for (int i = 0;i < hkkm.length; i++){
            for(int j = 0;j < hkkm.length  - i - 1;j++){
                if(hkkm[j] < hkkm[j + 1]){

                    int jj = hkkm[j];
                    hkkm[j] = hkkm[j + 1];
                    hkkm[j + 1] = jj;

                }
            }


        }
        for (int i:hkkm){
            System.out.println(i);
        }

//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
//
//        addTwoNumbersa(l1,l2);


        //输入：(7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
        //输出：7 -> 8 -> 0 -> 7
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode listNode = addTwoNumbersa(l1,l2);
        l2 = null;

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int jiajia = 0;
        ListNode listNode = new ListNode(0);
        ListNode gongJuRen = listNode;
        ListNode nextL1;
        ListNode nextL2;
        while(l1 != null){
            int l1value = l1 == null ?0:l1.val;
            int l2value = l2 == null ?0:l2.val;
            int sum = l1.val + l2.val;
            //如果上一个和为10 就 进一且为false
            if(jiajia != 0){
                sum++;
                jiajia = 0;
            }

            if(sum >= 10){
                jiajia = sum % 10  + 1 ;
                sum -= 10;
            }
            gongJuRen.next = new ListNode(sum);
            gongJuRen = gongJuRen.next;

            l1 = l1.next;
            l2 = l2.next;




        }
        System.out.println("停止了运行");
        if(jiajia > 0){
            gongJuRen.next = new ListNode(1);
        }
        return listNode.next;
    }


    public static ListNode addTwoNumbersa(ListNode l1, ListNode l2) {
            Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ListNode top = new ListNode(0);
        ListNode listNode = top;

        int index = 0;

        while(l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }

        while(l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }


        while(!stack1.empty() || !stack2.empty() || index > 0){
            int one = stack1.empty()?0:stack1.pop();
            int two  = stack2.empty()?0:stack2.pop();
            int sum = one + two + index;



            ListNode node = new ListNode(sum % 10);
            node.next = top;
            top = node;
            index = sum / 10;



        }


        return top.next;

    }

}




