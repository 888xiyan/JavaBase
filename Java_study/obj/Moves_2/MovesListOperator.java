package Java_study.obj.Moves_2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class MovesListOperator {
    // 储存全部电影对象
    private static final List<Moves> MovesList = new ArrayList<>();
    // 添加电影对象
    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("添加电影名称");
        String name = sc.nextLine();
        System.out.println("添加演员名称");
        String actor = sc.nextLine();
        Moves m = new Moves(name,actor);
        MovesList.add(m);
    }
    // 删除电影对象
    public static void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("删除电影名称");
        String name = sc.nextLine();
        for (int i = 0; i < MovesList.size(); i++) {
            Moves m = MovesList.get(i);
            if (m.getName().equals(name)) {
                MovesList.remove(i);
                break;
            }
            else {
                System.out.println("没有该电影");
            }
        }
    }
    // 查询电影对象
    public static void query() {
        Scanner sc = new Scanner(System.in);
        System.out.println("查询电影名称");
        String name = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < MovesList.size(); i++) {
            Moves m = MovesList.get(i);
            if (m.getName().equals(name)) // 找到该电影
            {
                System.out.println(m.getID()+" "+m.getName() + " " + m.getactor());
                System.out.println("该电影存在");
                found = true;
            }
            if (!found) {
                System.out.println("没有该电影");
            }
        }
    }
    // 查询某位演员，并删除他的全部电影
    public static void deleteActor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("删除演员名称");
        String actor = sc.nextLine();
        // 判断演员是否存在
        boolean flag = false;
        for (int i = 0; i < MovesList.size(); i++) {
            Moves m = MovesList.get(i);
            if (m.getactor().equals(actor)) {
                flag = true;
                break;
            }
        }
        if(flag == false)
            {System.out.println("没有该演员");}
        else{
        for (int i = 0; i < MovesList.size(); i++) {
            Moves m = MovesList.get(i);
            if (m.getactor().equals(actor)) {
                MovesList.remove(i);
                System.out.println("删除成功");
            }
        }
    }
    }
    // 遍历所有电影
    public static void showAll() {
        for (int i = 0; i < MovesList.size(); i++) {
            Moves m = MovesList.get(i);
            System.out.println(m.getID()+" "+m.getName() + " " + m.getactor());
        }
    }
}
