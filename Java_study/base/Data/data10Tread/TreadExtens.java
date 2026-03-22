package Data.data10Tread;

public class TreadExtens {
/**
 * 多线程学习,继承
 * @param args
 */
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();
        run2();

    }
    public static void run2(){
    for (int i = 0; i < 10; i++) {
        System.out.println("main线程："+i);
    }

}

}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程1："+i);
        }
    }
}