package Java_study.obj.data.data_7;

public class TEST {
    // 储存学生信息，姓名，性别，成绩
    // 方案1，打印全班同学信息，班级平均分
    // 方案2，打印全班同学信息，包含男女人数，打印平均分去掉最高分，最低分
    public static void main(String[] args) {
        // 数组储存对像
        Student_data[]students = new Student_data[5];
        students[0] = new Student_data("1", 'm', 101);
        students[1] = new Student_data("2", 'w', 91);
        students[2] = new Student_data("3", 'm', 90);
        students[3] = new Student_data("4", 'w', 100);
        students[4] = new Student_data("5", 'w', 100);
        Operate_1 operate = new Operate_1(students);
        operate.printstudents_date();
        operate.printstudents_score_ave(); 
        System.out.println("\n");
        Operate_2 operate_2 = new Operate_2(students);
        operate_2.printstudents_date();
        operate_2.printstudents_score_ave();
    }
    
}
