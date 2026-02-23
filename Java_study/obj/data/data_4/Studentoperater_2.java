package Java_study.obj.data.data_4;

public class Studentoperater_2 {
    private Student s;
    public  Studentoperater_2(Student s){
        this.s = s;
    }
    public void printsome(){
        System.out.println(s.setname()+s.setage()+s.setsex());
    }
    
}
