package presenter;

import model.Patient;
import model.Logic;
import view.View;

public class Presenter {
	private View view;
    private Logic logic;
   
    public Presenter(){
        logic = new Logic();
        view = new View();
        this.init();
    }

    public void init(){
    	int option;
    	do {
	        switch (option = view.menuOne()) {
	          case 1:
	        	 logic.addPatient(new Patient(view.readString("Ingrese el nombre del paciente: "), view.readShort("Ingrese prioridad: ")));
	            break;
	            
	          case 2:
	        	  view.showPatients(logic.showPatients());
	        	  logic.treatPatient();  
	            break;
	            
	          default:
	        	  view.showMessage("La opción no es valida.");
	            break;
			}
    	}while(option < 3);
    }

    public static void main(String[] args) {
		  new Presenter();
	}
}
