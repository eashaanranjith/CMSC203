/*
 * Class: CMSC203 CRN 22172
 * Instructor: Farnaz Eivazi
 * Description: Represents a medical Procedure performed on a patient, including name, date, practitioner, and charges.
 * Due: 09/29/2025
 * Platform/compiler: Java
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.  
 * Eashaan Ranjith
 */

public class Procedure {
	private String procedureName;
	private String procedureDate;
	private String practitionerName;
	private double charges;

	// No-arg constructor
	public Procedure() {
		procedureName = procedureDate = practitionerName = "";
		charges = 0.0;
	}

	// Constructor with procedure name and date
	public Procedure(String procedureName, String procedureDate) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		practitionerName = "";
		charges = 0.0;
	}

	// Constructor with all fields
	public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practitionerName = practitionerName;
		this.charges = charges;
	}

	// Accessors and mutators
	public String getProcedureName() {
		return procedureName;
	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public String getProcedureDate() {
		return procedureDate;
	}

	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}

	public String getPractitionerName() {
		return practitionerName;
	}

	public void setPractitionerName(String practitionerName) {
		this.practitionerName = practitionerName;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	// toString method
	public String toString() {
		return procedureName + "\t" + procedureDate + "\t" + practitionerName + "\t$" + String.format("%.2f", charges);
	}
}
