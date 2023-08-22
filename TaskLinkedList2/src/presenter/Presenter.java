public class Presenter{
    private View view;
    private Logic logic;
   
    public Presenter(){
        logic = new Logic();
        view = new View();
        this.init();
    }

    public void init(){
    	int option = 0;
    	do {
	        switch (option = view.menuOne()) {
	          case 1:
	            logic.loginUser(view.readInt("Ingrese un id: "));
	            this.menuTwo();
	            break;
	          case 2:
	            logic.addUser(new User(view.readInt("Ingrese id: "), view.readString("Ingrese usuario: ")));
	            break;
	
	          default:
	        	  view.showMessage("La opción no es valida.");
	            break;
			}
    	}while(option < 3);
    }

    public void menuTwo(){
    	int option = 0;
	    do {
	       switch (option = view.menuTwo()) {
	          case 1:
	            logic.newTask(new Task(view.readString("Descripción: "), view.readString("Fecha vencimiento: ")));
	            break;
	
	          case 2:
	            view.showTask(logic.showTasks());
	            break;
	
	          case 3:
	            this.init();
	            break;
	
	          default:
	        	  view.showMessage("La opción no es valida.");
	            break;
			}
    	}while(option < 4);
    }

    public static void main(String[] args) {
		  new Presenter();
	}
}
