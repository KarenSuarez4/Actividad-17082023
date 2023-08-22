package presenter;

import model.Item;
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
	        	  logic.addItem(new Item(view.readString("Ingrese el nombre: "), view.readDouble("Ingrese el precio: ")));
	            break;
	            
	          case 2:
	        	  view.showItems(logic.showItems());
	            break;
	            
	          case 3:
	        	  view.showMessage(Double.toString(logic.price()));
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
