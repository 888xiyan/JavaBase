package Java_study.obj.data.data_8_train;

public class operater_JD {
    private static final operater_JD operater = new operater_JD();
    private operater_JD(){}
    public static operater_JD get_operater(){return operater;}
    public void print_state(JD jd){
        System.out.println(jd.getname()+"，当前状态："+jd.getstate());
    }
    public  void operater(JD jd){
        System.out.println(jd.getname()+"，当前状态："+jd.getstate());
        System.out.println("按下按钮");
        jd.press();
        System.out.println(jd.getname()+"，当前状态："+jd.getstate());
    }
    
}
