package dd.基本算法;



import java.util.*;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-09 19:44
 **/

public class 括号算法 {
//    url在  https://leetcode-cn.com/problems/generate-parentheses/solution/hui-su-suan-fa-by-liweiwei1419/

//    数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
public static void main(String[] args) {

    括号算法 i = new 括号算法();
    List<String> list = i.run(4);
    for (String s:list){
        System.out.println(s);
    }
}

//    1.掐头去尾 left++ right--
//    然后列出所有可能性
//    然后比较字符串左边的是否和 右边的一样

    private List<String> run(int number) {

        if(number < 1){
            return null;
        }


        List<String> list = new ArrayList<String>();
        allArray(new char[2 * number],0,list);
        return list;


}

    private void allArray(char[] chars, int i, List<String> list) {

        if(chars.length == i){
            //最后一步比较字符串是否相同
            if(isKuHao(chars)){
                list.add(new String(chars));
            }
        }else{
            chars[i] = '(';
            allArray(chars,i + 1,list);
            chars[i] = ')';
            allArray(chars,i + 1,list);
        }
    }

    //判断这个字符中的括号之间是否是一对的
    private boolean isKuHao(char[] chars) {
        if(chars[0] == ')' || chars[chars.length - 1] == '('){
            return false;
        }
        int j = 0;
        for(char i:chars){
            if(i == '(')
                j++;
            else
                j--;
            if(j < 0 )
                return false;

        }
        return  j == 0;


    }


}



