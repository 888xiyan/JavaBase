package Java_study.PlusStudy;

public interface UserServies {
    void login(String username,String password) throws Exception;
    void deleteUser(String username) throws Exception;

    String[] selectUsers() throws Exception;

}
