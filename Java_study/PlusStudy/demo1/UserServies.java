package Java_study.PlusStudy.demo1;

public interface UserServies {
    void login(String username,String password) throws Exception;
    void deleteUser(String username) throws Exception;

    String[] selectUsers() throws Exception;

}
