package Java_study.PlusStudy.demo1;

public class Main {
    public static void main(String[] args) throws Exception {
        UserServiceImpl userService = new UserServiceImpl();
        userService.login("张三","123456");
        userService.deleteUser("张三");
        String[] users = userService.selectUsers();
        for (String user : users) {
            System.out.println(user);
        }
    }

}
