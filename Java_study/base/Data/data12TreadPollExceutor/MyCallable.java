package Data.data12TreadPollExceutor;

import java.util.concurrent.Callable;

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

public class MyCallable implements Callable<String>{
        private int a;
        public MyCallable(int a) {
            this.a = a;
        }
        @Override
        public String call() throws Exception {
            int sum = 0;
            for (int i = 0; i <= a; i++) {
                    sum += i;
            }
            return Thread.currentThread().getName()+"的和：" + sum;
    }

    
}