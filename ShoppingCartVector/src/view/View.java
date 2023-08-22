package view;

import java.util.Scanner;
import java.util.Vector;

import model.Item;

public class View {
private Scanner scanner;
	
	public View() {
		scanner = new Scanner(System.in);
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}

	public String readString(String message) {
		this.showMessage(message);
		scanner.nextLine();
		return scanner.nextLine();
	}
	
	public int readInt(String message) {
		this.showMessage(message);
		return scanner.nextInt();
	}
	
	public double readDouble(String message) {
		this.showMessage(message);
		return scanner.nextDouble();
	}

	public int menuOne(){
		return this.readInt("\n-----------------------------------\n1.Ingresar producto. \n2.Mostrar contenido \n3.Precio total.");
	}
	
	public void showItems(Vector<Item> item) {
		for (Item item2 : item) {
			System.out.println(item2);
		}
	}

}
