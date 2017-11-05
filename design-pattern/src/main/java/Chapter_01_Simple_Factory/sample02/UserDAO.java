package Chapter_01_Simple_Factory.sample02;

public class UserDAO {
    public int findPermission(String userName, String userPassword) {
        if ("zhangsan".equals(userName) && "123456".equals(userPassword)) {
            return 2;
        } else {
            return -1;
        }
    }
}
