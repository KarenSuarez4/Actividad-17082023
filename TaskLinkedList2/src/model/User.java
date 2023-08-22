import java.util.LinkedList;

public class User {
    private int id;
    private String nameUser;
    private LinkedList<Task> taskList;

    public User() {
    }

    public User(int id, String nameUser) {
        this.id = id;
        this.nameUser = nameUser;
        taskList = new LinkedList<>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNameUser() {
        return nameUser;
    }
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
    public LinkedList<Task> getTaskList() {
        return taskList;
    }
    public void setTaskList(LinkedList<Task> taskList) {
        this.taskList = taskList;
    }    
}
