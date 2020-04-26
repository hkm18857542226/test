package dd.基本算法;

import com.alibaba.druid.sql.visitor.functions.Char;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-20 19:20
 **/

public class 岛屿数量 {
    public static void main(String[] args) {
        char[][] sku = new char[][]{
                {'1','1','1'},
                {'0','1','0'},
                {'1','1','1'}
        };

        System.out.println(     numIslands(sku));
    }

    public static int numIslands(char[][] grid) {
        int sum = 0;
        List<Char> list = new ArrayList<>();
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){

                if(grid[i][j] == '1'){
                    sum++;
                    setZero(grid,i,j);
                }





            }
        }
        return sum;
    }

    private static void setZero(char[][] grid, int i, int j) {

        if(i < 0 || j < 0  || j >= grid[0].length || i >= grid.length || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';
        setZero(grid,i,j - 1);
        setZero(grid,i,j + 1);
        setZero(grid,i + 1,j );
        setZero(grid,i - 1,j  );
    }
}

