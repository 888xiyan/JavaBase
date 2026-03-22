package Java_study.obj.data.data_2;

public class test {
    public static void main(String[] args) {
       Student s_1 = new Student();
       Student s_2 = new Student();
       double avg;
       s_1.name = "xixx";
       s_1.YW_score = 56;
       s_1.math_score = 100;
       s_2.name = "yy";
       s_2.YW_score = 100;
       s_2.math_score = 100;
        s_1.printsum();
        s_1.printsvg();
        s_2.printsum();
        s_2.printsvg(); 
    }
    
}
