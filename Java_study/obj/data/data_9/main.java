package Java_study.obj.data.data_9;
//匿名内部

public class main {
    public static void main(String[] args) {
        operater(new SMING(){
            @Override
            public void sming(){
                System.out.println("你好");
            }
        });
    }
    
interface SMING{
    void sming();

}
public static void operater(SMING s){

        System.out.println("名字：");
        s.sming();
        System.out.println("结束");
    }   
}

