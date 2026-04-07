package Java_study.PlusStudy;


public class UserServiceImpl implements UserServies {
    @Override
    public void login(String username, String password) throws Exception {
        // long start = System.currentTimeMillis();
        System.out.println(username+"用户登录成功！");
        Thread.sleep(1000);
        // long end = System.currentTimeMillis();
        // System.out.println("耗时："+(end-start)/1000.0+"秒");
    }
    @Override
    public void deleteUser(String username) throws Exception {
        // long start = System.currentTimeMillis();
        System.out.println("用户删除成功！");
        Thread.sleep(1000);
        // long end = System.currentTimeMillis();
        // System.out.println("耗时："+(end-start)/1000.0+"秒");
    }
    @Override
    public String[] selectUsers() throws Exception {
        // long start = System.currentTimeMillis();
        String[] users = {"张三","李四","王五"};
        Thread.sleep(1500);
        // long end = System.currentTimeMillis();
        // System.out.println("耗时："+(end-start)/1000.0+"秒");
        return users;
    }



}
