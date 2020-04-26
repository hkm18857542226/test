package dd.javase;

import com.alibaba.druid.sql.visitor.functions.Char;
import net.mindview.util.TextFile;


import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-22 11:35
 **/

public class JavaIo {

    public static FilenameFilter filter(final String regex){
        return new FilenameFilter() {
//            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir,name);
                System.out.println(file.getName());

                return false;
            }
        };
    }

    public static void main(String[] args) throws IOException {

        File path = new File(".");
        String[] list ;
        if(args.length == 0){
            list = path.list();
        }
        else{

            System.out.println(args[0]);
        }
        list = path.list(filter(""));




    }

    static class DirFilter implements FilenameFilter{

        private Pattern pattern;

        public DirFilter(String  regx) {
            this.pattern = Pattern.compile(regx);
        }

        @Override
        public boolean accept(File dir, String name) {
            System.out.println(dir.getName());
            return false;
        }
    }



}

