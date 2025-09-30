/*
 * Class: CMSC203 CRN 22172
 * Instructor: Farnaz Eivazi
 * Description: Driver class for the Patient and Procedure classes. Reads input from the user for one patient and three procedures,
 * displays all information, and calculates total charges.
 * Due: 09/29/2025
 * Platform/compiler: Java
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.  
 * Eashaan Ranjith
 */

import java.util.Scanner;

public class PatientDriverApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// Create Patient with user input
		System.out.println("Enter patient's first name:");
		String firstName = keyboard.nextLine();
		System.out.println("Enter patient's middle name:");
		String middleName = keyboard.nextLine();
		System.out.println("Enter patient's last name:");
		String lastName = keyboard.nextLine();
		System.out.println("Enter street address:");
		String streetAddress = keyboard.nextLine();
		System.out.println("Enter city:");
		String city = keyboard.nextLine();
		System.out.println("Enter state:");
		String state = keyboard.nextLine();
		System.out.println("Enter ZIP code:");
		String zip = keyboard.nextLine();
		System.out.println("Enter phone number (xxx-xxx-xxxx):");
		String phone = keyboard.nextLine();
		System.out.println("Enter emergency contact name:");
		String emergencyName = keyboard.nextLine();
		System.out.println("Enter emergency contact phone number:");
		String emergencyPhone = keyboard.nextLine();

		Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zip, phone,
				emergencyName, emergencyPhone);

		// Create 3 Procedure objects individually
		Procedure p1 = new Procedure();
		System.out.println("\nEnter first procedure name:");
		p1.setProcedureName(keyboard.nextLine());
		System.out.println("Enter first procedure date (MM/DD/YYYY):");
		p1.setProcedureDate(keyboard.nextLine());
		System.out.println("Enter practitioner name:");
		p1.setPractitionerName(keyboard.nextLine());
		System.out.println("Enter charges:");
		p1.setCharges(keyboard.nextDouble());
		keyboard.nextLine(); // Clear newline

		Procedure p2 = new Procedure();
		System.out.println("\nEnter second procedure name:");
		p2.setProcedureName(keyboard.nextLine());
		System.out.println("Enter second procedure date (MM/DD/YYYY):");
		p2.setProcedureDate(keyboard.nextLine());
		System.out.println("Enter practitioner name:");
		p2.setPractitionerName(keyboard.nextLine());
		System.out.println("Enter charges:");
		p2.setCharges(keyboard.nextDouble());
		keyboard.nextLine(); // Clear newline

		Procedure p3 = new Procedure();
		System.out.println("\nEnter third procedure name:");
		p3.setProcedureName(keyboard.nextLine());
		System.out.println("Enter third procedure date (MM/DD/YYYY):");
		p3.setProcedureDate(keyboard.nextLine());
		System.out.println("Enter practitioner name:");
		p3.setPractitionerName(keyboard.nextLine());
		System.out.println("Enter charges:");
		p3.setCharges(keyboard.nextDouble());

		// Display Patient information
		System.out.println("\nPatient info:");
		System.out.println("    Name: " + patient.buildFullName());
		System.out.println("    Address: " + patient.buildAddress());
		System.out.println("    Emergency Contact: " + patient.buildEmergencyContact());

		// Display Procedures individually
		System.out.println("\nProcedure 1:");
		System.out.println("    Name: " + p1.getProcedureName());
		System.out.println("    Date: " + p1.getProcedureDate());
		System.out.println("    Practitioner: " + p1.getPractitionerName());
		System.out.println("    Charge: $" + String.format("%.2f", p1.getCharges()));

		System.out.println("\nProcedure 2:");
		System.out.println("    Name: " + p2.getProcedureName());
		System.out.println("    Date: " + p2.getProcedureDate());
		System.out.println("    Practitioner: " + p2.getPractitionerName());
		System.out.println("    Charge: $" + String.format("%.2f", p2.getCharges()));

		System.out.println("\nProcedure 3:");
		System.out.println("    Name: " + p3.getProcedureName());
		System.out.println("    Date: " + p3.getProcedureDate());
		System.out.println("    Practitioner: " + p3.getPractitionerName());
		System.out.println("    Charge: $" + String.format("%.2f", p3.getCharges()));

		// Display total charges
		double total = calculateTotalCharges(p1, p2, p3);
		System.out.printf("\nTotal Charges: $%,.2f\n", total);

		// Display student info
		System.out.println("\nStudent Name: Eashaan Ranjith");
		System.out.println("MC#: MC21138769");
		System.out.println("Due Date: 09/29/2025");

		keyboard.close();
	}

	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
		return p1.getCharges() + p2.getCharges() + p3.getCharges();
	}
}
