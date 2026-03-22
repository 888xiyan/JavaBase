package Java_study.obj.data.data_7;

public class Operate_2 implements InnerOperate {
        private Student_data[] students;
    // students 作为数组传入方法
    public Operate_2(Student_data[] students){
        this.students  = students;
    }
    @Override
    public void printstudents_date(){
        System.out.println("打印学生数据");
        int m_number=0;
        for (int i=0;i<students.length;i++){
            Student_data s = students[i];
            System.out.println(s.getname()+"\t"+s.getsex()+"\t"+s.getscore());
            if(s.getsex() =='m'){
                m_number+=1;
            }
        }
        System.out.println("男生人数："+m_number+"\n"+"女生人数："+(students.length-m_number));
    }
    @Override
    public void printstudents_score_ave(){
        double sum = students[0].getscore();
        double max = students[0].getscore();
        double min = students[0].getscore();
        for (int i=1;i<students.length;i++){
            Student_data s = students[i];
            sum += s.getscore();
            if(s.getscore()>max){
                max = s.getscore();
            }
            if(s.getscore()<min){
                min = s.getscore();
            }

        }
        System.out.println((sum-max-min)/(students.length-2));
        System.out.println("最高分："+max+"\n"+"最低分："+min);
    }
    
}
