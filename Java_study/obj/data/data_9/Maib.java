package Java_study.obj.data.data_9;
//Lamdba表达式
public class Maib {
        public static void main(String[] args) {
        Inneranimal cat = new Inneranimal() {
            //匿名内部类
            @Override
            public void claw(){
                System.out.println("喵喵");
            }
        }; 
        cat.claw();
        Inneranimal dog = () -> {
            System.out.println("汪汪");
        };
        dog.claw();
        
    }
    //函数式接口
    @FunctionalInterface
    public interface Inneranimal {
        void claw();
        
    }
    
}
