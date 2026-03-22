package Data.data10Tread;
/**
 * 创建线程方式二：实现Runnable接口
 * 1.创建一个Runnable接口的实现类
 * 2.创建Runnable接口的实现类对象
 * 3.创建Thread类对象，构造方法中传递Runnable接口的实现类对象
 * 4.调用start()方法启动线程

 */
public class TreadRunnable {
    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        //创建线程任务
        Thread t1 = new Thread(r);
        // 线程对象接受线程任务
        t1.start();
        // 线程开始
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程："+i);
        }
    }
    
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程1："+i);
        }
    }
}
