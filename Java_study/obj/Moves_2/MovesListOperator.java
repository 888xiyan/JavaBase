package Java_study.obj.Moves_2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class MovesListOperator {
    // 储存全部电影对象
    private static final List<Moves> MovesList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    // 添加电影对象
    public static void add() {
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
        System.out.println("查询电影名称");
        String name = sc.nextLine();
        Moves m = queryMovie(name);
        if(m != null){
            System.out.println(m.getID()+" "+m.getName() + " " + m.getactor());
        }
        else{
            System.out.println("没有该电影");
        }
    }
    // 查询某位演员，并删除他的全部电影
    public static void deleteActor() {
        System.out.println("删除演员名称");
        String actor = sc.nextLine();
        // 判断演员是否存在
        boolean flag = false;
        for(Moves m:MovesList){
            if(m.getactor().equals(actor)){
                flag = true;
                break;
            }
        }
        /**
         *         for(Moves m:MovesList){
            if(m.getactor().equals(actor){
                flag = true;
                break;
            }
        }
         */
        if(flag == false)
            {System.out.println("没有该演员");}
        else{
        for (int i = 0; i < MovesList.size(); i++) {
            Moves m = MovesList.get(i);
            if (m.getactor().equals(actor)) {
                MovesList.remove(i);
                i--;//并发修改删除
                System.out.println("删除成功");
            }
        }
    }
    }
    // 遍历所有电影
    public static void showAll() {
        for (Moves m:MovesList) {
            System.out.println(m.getID()+" "+m.getName() + " " + m.getactor());
        }
    }
    // 查询方法
    public static Moves queryMovie(String name){
        for(Moves m:MovesList){
            if(m.getName().equals(name)){
                return m;
            }
        }
        return null;
    }



}
