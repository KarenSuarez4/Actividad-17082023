package model;

import java.util.Comparator;
import java.util.PriorityQueue;


public class Logic {
	PriorityQueue<Patient> patientPriority;
	private Comparator<Patient> comparator;
	
	public Logic() {
		comparator = new TaskComparator();
		patientPriority = new PriorityQueue<Patient>(comparator);
	}
	
	
	public void addPatient(Patient patient) {
		patientPriority.add(patient);
	}
	
	public void treatPatient() {
		patientPriority.poll();
	}
	
	public PriorityQueue<Patient> showPatients(){
		return patientPriority;
	}
	
	
	private class TaskComparator implements Comparator<Patient> {
		@Override
		public int compare(Patient patient1, Patient patient2) {
			return patient2.getSeverity() - patient1.getSeverity();
		}
    } 
	

}
