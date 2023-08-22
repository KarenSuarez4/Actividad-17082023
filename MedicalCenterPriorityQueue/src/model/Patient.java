package model;

public class Patient {
	private String name;
	private short severity;
	
	public Patient(String name, short severity) {
		super();
		this.name = name;
		this.severity = severity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public short getSeverity() {
		return severity;
	}
	public void setSeverity(short severity) {
		this.severity = severity;
	}

	@Override
	public String toString() {
		return "Name: " + name + "Severity: " + severity + "\n";
	}
	
	
	
}
