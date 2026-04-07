package Java_study.PlusStudy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserServiesProxy {
    public static UserServies createUserServiesProxy(UserServies userServies) throws Exception {
            UserServies proxy =   
            (UserServies)Proxy.newProxyInstance(
            userServies.getClass().getClassLoader(),
            userServies.getClass().getInterfaces(),
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    long start = System.currentTimeMillis();
                    Object result = method.invoke(userServies, args);
                    long end = System.currentTimeMillis();
                    System.out.println("耗时："+(end-start)/1000.0+"秒");
                    return result;
                }
            });
            return proxy;
    }
}