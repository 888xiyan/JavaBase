package Java_study.obj.data.data_7;

public class Operate_1 implements InnerOperate {
    private Student_data[] students;
    // students 作为数组传入方法
    public Operate_1(Student_data[] students){
        this.students  = students;
    }
    @Override
    public void printstudents_date(){
        System.out.println("打印学生数据");
        for (int i=0;i<students.length;i++){
            Student_data s = students[i];
            System.out.println(s.getname()+"\t"+s.getsex()+"\t"+s.getscore());
        }
    }
    @Override
    public void printstudents_score_ave(){
        double sum = 0;
        for (int i=0;i<students.length;i++){
            Student_data s = students[i];
            sum += s.getscore();
        }
        System.out.println(sum/students.length);
    }
    
}
