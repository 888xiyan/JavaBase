package Data.data12TreadPollExceutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池的学习和初步使用
 * 线程池的创建
 * 线程池的参数设置和说明
 * 
 * @author 54060
 *

 */
public class Main {
    public static void main(String[] args) {
        try (// TODO Auto-generated method stub
                //使用实现类创建线程池
        ThreadPoolExecutor myThreadPoolExecutor =
        new ThreadPoolExecutor(
            3,//核心线程数
            5,//最大线程数
            10,//临时工存在时间
            TimeUnit.SECONDS,//keepAliveTime的单位
            new ArrayBlockingQueue<>(3),//任务队列
            Executors.defaultThreadFactory(),//线程工厂
            new ThreadPoolExecutor.DiscardOldestPolicy()//拒绝策略
        )) {
            // //Runnable接口实现类对象
            // Runnable r = new MyRunnable();
            // myThreadPoolExecutor.execute(r);//提交第一个任务
            // myThreadPoolExecutor.execute(r);
            // myThreadPoolExecutor.execute(r);
            // myThreadPoolExecutor.execute(r);
            // myThreadPoolExecutor.execute(r);
            // Callable接口实现类对象
            Future<String>f1 =  myThreadPoolExecutor.submit(new MyCallable(100));
            Future<String>f2 = myThreadPoolExecutor.submit(new MyCallable(200));
            Future<String>f3 = myThreadPoolExecutor.submit(new MyCallable(300));
            try{
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        }catch(Exception e){}
            
        }
    }
    
}
