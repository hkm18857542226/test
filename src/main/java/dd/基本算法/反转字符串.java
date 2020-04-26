package dd.基本算法;

import com.alibaba.druid.sql.visitor.functions.Char;

import java.util.*;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-10 19:15
 **/

public class 反转字符串 {

//    给定一个字符串，逐个翻转字符串中的每个单词。

    public static void main(String[] args) {
        System.out.println(setString("as  g"));

    }

    public static String setString(String s){
        // 除去开头和末尾的空白字符
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
        }


    }





