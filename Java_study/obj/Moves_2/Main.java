package Java_study.obj.Moves_2;
import java.util.Scanner;
// 电影信息管理模块
// 功能：添加、删除、查询。，以及删除某个主演下的全部电影
// 电影对象
// 操作电影类
// 操作类中定义集合储存全部电影对象
public class Main {
    // 主函数
    public static void main(String[] args) {
        // 键盘输入数字
        Scanner sc = new Scanner(System.in);
        // 匹配数字，执行操作
        while(true) {
            System.out.println("请输入数字：");
            int num = sc.nextInt();
            switch(num) {
                case 1:
                    // 添加电影
                    System.out.println("添加电影");
                    MovesListOperator.add();
                    break;
                case 2:
                    // 删除电影1
                    System.out.println("删除电影");
                    MovesListOperator.delete();
                    break;
                case 3:
                    // 查询电影
                    System.out.println("查询电影");
                    MovesListOperator.query();
                    break;
                case 4:
                // 删除主演下的全部电影
                    System.out.println("删除主演下的全部电影");
                    MovesListOperator.deleteActor();
                    break;
                // 显示全部电影
                case 5:
                        System.out.println("显示全部电影");
                        MovesListOperator.showAll();
                        break;
                case 6:
                    System.out.println("退出");
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }
    
}
