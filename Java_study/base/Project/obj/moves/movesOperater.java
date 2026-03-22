package Java_study.obj.moves;

import java.util.ArrayList;
import java.util.List;

public class movesOperater implements Operater {
    private static List<Moves_id> MovesList = new ArrayList<>();
    
    private movesOperater(){}
    public static List<Moves_id> getMovesList(){
        return MovesList;
    }
    
    // 将集合传入方法中
    public void add(Moves_id m) {
        MovesList.add(m);
        System.out.println("添加电影成功！");
    }

    public void delete(Moves_id m) {
        // 不存在异常
        if(!MovesList.contains(m)){
            System.out.println("该电影不存在！");
            return;
        }
        else{
        MovesList.remove(m);}
        System.out.println("删除电影成功！");
    }

    public void update(Moves_id m) {
        System.out.println("更新电影成功！");
    }

    public static void query(){
        // 遍历所有的电影
        for(Moves_id m1:MovesList){
            System.out.println(m1);
        }
        
        System.out.println("查询电影成功！");
    }
    
}
