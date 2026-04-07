package Java_study.PlusStudy;
/**
 * 目的：使用代理模式优化服务类代码，体现并理解AOP思想
 * 步骤：
 */

import Data.Test;

@Test
public class Main {
    public static void main(String[] args) throws Exception {
        UserServies userService = UserServiesProxy.createUserServiesProxy(new UserServiceImpl());
        userService.login("张三","123456");
        userService.deleteUser("张三");
        String[] users = userService.selectUsers();
        for (String user : users) {
            System.out.println(user);
        }
    }

}
