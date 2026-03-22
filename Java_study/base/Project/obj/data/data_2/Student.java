package Java_study.obj.data.data_2;

public class Student {
    String name;
    double YW_score;
    double math_score;
    public void printsum(){
    System.out.println("总成绩："+(YW_score+math_score));
}
    public void printsvg(){
             System.out.println("平均成绩成绩："+(YW_score+math_score)/2);
    }
}
