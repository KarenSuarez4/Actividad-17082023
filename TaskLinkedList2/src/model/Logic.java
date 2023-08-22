import java.util.LinkedList;
import java.util.Optional;

public class Logic {
    private LinkedList<User> userList;
    private User user;

    public Logic() {
        userList = new LinkedList<>();
    }

    public void loginUser(int id){
        user = userList.get(this.searchUser(id));
    }

    public int searchUser(int id){
        Optional<User> userAux = userList.stream().filter(u -> u.getId() == id).findFirst();
        int index = userList.stream().filter(u -> u.equals(userAux.get())).mapToInt(u -> userList.indexOf(u)).findFirst().orElse(-1);
        return index;
    }

    public void addUser(User user){
        userList.add(user);
    }

    public void newTask(Task task){
        user.getTaskList().add(task);
    }

    public LinkedList<Task> showTasks(){
        return user.getTaskList(); 
    }
}
