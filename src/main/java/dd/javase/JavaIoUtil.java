package dd.javase;

import net.mindview.util.Directory;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @program: test
 * @description: io工具类
 * @author: 胡凯铭
 * @create: 2020-04-24 16:36
 **/

public class JavaIoUtil {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-\\d+"));
        System.out.println("5678".matches("-\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
//        local(new File("."),"df");
    }
    // 获取一个目录下面的文件的所有名车
    public static File[] local(File dir,final String regex){
        Pattern pattern = Pattern.compile(regex);
        return dir.listFiles((File file,String name) -> {

            System.out.println(name);
            return false;
        });
    }
    /**
     上面的重载
     */
    public static File[] local(String path,String regx){
        return local(new File(path),regx);
    }

    public static class TreeInfo implements Iterator<File>{
        public List<File> files = new ArrayList<>();
        public List<File> dirs = new ArrayList<>();

        public Iterator<File> iterator(){
            return files.iterator();
        }




        @Override
        public boolean hasNext() {
            return false;
        }


        @Override
        public File next() {
            return null;
        }
    }



}

