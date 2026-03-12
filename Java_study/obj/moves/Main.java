package Java_study.obj.moves;

import java.util.List;
import java.util.Scanner;

public class Main {
        // 电影信息管理模块
        // 用户可以上架电影，查询电影，下架电影，以及下架某个主演的全部电影
    public static void main(String[] args){
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        // List<Moves_id> mo = movesOperater.getMovesList();
        movesOperater operator = movesOperater.getMovesList();

        while(true){
            String choice = sc.nextLine();
            // 键盘输入
            int num = Integer.parseInt(choice);
            // 判断
            switch(num){
                case 1:
                    mo.add(new Moves_id("2020-05-05","《唐顿庄园》","唐顿·戴维","9.5","2.5","动作"));
                    mo.query();
            }
            
        }





    }
    
}
