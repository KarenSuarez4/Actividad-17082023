import java.util.LinkedList;
import java.util.Scanner;

public class View {
	private Scanner scanner;
	
	public View() {
		scanner = new Scanner(System.in);
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}

	public String readString(String message) {
		scanner.nextLine();
		this.showMessage(message);
		return scanner.nextLine();
	}
	
	public int readInt(String message) {
		this.showMessage(message);
		return scanner.nextInt();
	}
	
	public char readChar(String message) {
		this.showMessage(message);
		return scanner.next().charAt(0);
	}

	public int menuOne(){
		return this.readInt("1.Ingresar. \n2.Nuevo usuario.");
	}

	public int menuTwo(){
		return this.readInt("1.Crear tarea. \n2.Mirar tareas. \n3.Salir.");
	}

	public void showTask(LinkedList<Task> taskList){
		for (Task task : taskList) {
			System.out.println(task);
		}
	}


}
