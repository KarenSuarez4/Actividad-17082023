package view;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Vector;

import model.Patient;

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
	
	public short readShort(String message) {
		this.showMessage(message);
		return scanner.nextShort();
	}

	public int menuOne(){
		return this.readInt("\n-----------------------------------\n1.Añadir paciente. \n2.Tratar paciente.");
	}
	
	public void showPatients(PriorityQueue<Patient> patient) {
		for (Patient patient2 : patient) {
			System.out.println(patient2);
		}
	}

}
