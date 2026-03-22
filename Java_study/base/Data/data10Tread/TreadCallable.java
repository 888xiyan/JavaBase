package Data.data10Tread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的第三种方式：实现Callable接口
 * 1.创建一个实现Callable的实现类
 * 2.实现call方法，将此线程需要执行的任务，封装到call方法中
 * 3.创建Callable接口实现类的对象
 * 4.创建FutureTask类，构造方法中传递Callable接口实现类的对象
 * 5.创建Thread类对象，构造方法中传递FutureTask对象
 * 6.调用Thread类的start方法，启动线程
 * 7.FutureTask类对象调用get方法，返回结果

 */

public class TreadCallable {
    public static void main(String[] args) throws Exception {
        //创建Callable接口实现类的对象
        Callable<String> c1 = new MC(100);
        //创建FutureTask类对象，构造方法中传递Callable接口实现类对象
        FutureTask<String> ft = new FutureTask<>(c1);
        //创建Thread类对象，构造方法中传递FutureTask对象
        Thread t = new Thread(ft);
        //调用Thread类的start方法，启动线程
        t.start();
        System.out.println(ft.get());
        Callable<String> c2 = new MC(200);
        //创建FutureTask类对象，构造方法中传递Callable接口实现类对象
        FutureTask<String> ft2 = new FutureTask<>(c2);
        //创建Thread类对象，构造方法中传递FutureTask对象
        Thread t2 = new Thread(ft2);
        //调用Thread类的start方法，启动线程
        t2.start();
        System.out.println(ft2.get());
    }
    
}
class MC implements Callable<String>{
    private int a;
    public MC(int a) {
        this.a = a;
    }
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= a; i++) {
                sum += i;
        }
        return a+"的和：" + sum;
    }

    
}