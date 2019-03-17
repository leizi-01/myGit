package platform.git.model;

/**
 * Created by hc on 2019-03-17.
 */
public class Employee {
    private String id;
    private String userName;

    public Employee() {
    }

    public Employee(String id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
