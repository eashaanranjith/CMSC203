/*
 * Class: CMSC203
 * Instructor: Professor Farnaz Eivazi
 * Description: ESPGame tests a user's extrasensory perception by guessing colors from a file.
 * Due: 09/15/2025
 * Platform/compiler: Java
 * I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Eashaan Ranjith
*/

import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class ESPGame {
    public static void main(String[] args) throws java.io.IOException{
    	//all the constants for colors
        final String COLOR1 = "black";
        final String COLOR2 = "white";
        final String COLOR3 = "gray";
        final String COLOR4 = "silver";
        final String COLOR5 = "maroon";
        final String COLOR6 = "red";
        final String COLOR7 = "purple";
        final String COLOR8 = "fuchsia";
        final String COLOR9 = "green";
        final String COLOR10 = "lime";
        final String COLOR11 = "olive";
        final String COLOR12 = "yellow";
        final String COLOR13 = "navy";
        final String COLOR14 = "blue";
        final String COLOR15 = "teal";
        final String COLOR16 = "aqua";

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String userName = "";
        String userDesc = "";
        String dueDate = "";
        int correctGuesses = 0;
        boolean continueGame = true;

        System.out.println("Welcome to ESP - extrasensory perception!");

        while (continueGame) {
            //reset correct guesses for each game
            correctGuesses = 0;

        	//menu shown while also in loop till you say no
            System.out.println("Would you please choose one of the 4 options from the menu:");
            System.out.println("1- read and display first 16 names of colors");
            System.out.println("2- read and display first 10 names of colors");
            System.out.println("3- read and display first 5 names of colors");
            System.out.println("4- Exit from program");
            System.out.print("Enter the option: ");

            int option = sc.nextInt();
            sc.nextLine();

            if (option == 4) {
                break;
            }

            System.out.print("Enter the filename: ");
            sc.nextLine(); 

            System.out.println("There are " + ((option == 1) ? 16 : (option == 2) ? 10 : 5) + " colors from a file:");

            //display colors based on option
            if (option == 1 || option == 2 || option == 3) {
            	if (option == 3) {
            	    System.out.println("1 " + COLOR1);
            	    System.out.println("2 " + COLOR2);
            	    System.out.println("3 " + COLOR3);
            	    System.out.println("4 " + COLOR4);
            	    System.out.println("5 " + COLOR5);
            	} else if (option == 2) {
            	    System.out.println("1 " + COLOR1);
            	    System.out.println("2 " + COLOR2);
            	    System.out.println("3 " + COLOR3);
            	    System.out.println("4 " + COLOR4);
            	    System.out.println("5 " + COLOR5);
            	    System.out.println("6 " + COLOR6);
            	    System.out.println("7 " + COLOR7);
            	    System.out.println("8 " + COLOR8);
            	    System.out.println("9 " + COLOR9);
            	    System.out.println("10 " + COLOR10);
            	} else if (option == 1) {
            	    System.out.println("1 " + COLOR1);
            	    System.out.println("2 " + COLOR2);
            	    System.out.println("3 " + COLOR3);
            	    System.out.println("4 " + COLOR4);
            	    System.out.println("5 " + COLOR5);
            	    System.out.println("6 " + COLOR6);
            	    System.out.println("7 " + COLOR7);
            	    System.out.println("8 " + COLOR8);
            	    System.out.println("9 " + COLOR9);
            	    System.out.println("10 " + COLOR10);
            	    System.out.println("11 " + COLOR11);
            	    System.out.println("12 " + COLOR12);
            	    System.out.println("13 " + COLOR13);
            	    System.out.println("14 " + COLOR14);
            	    System.out.println("15 " + COLOR15);
            	    System.out.println("16 " + COLOR16);
            	}
            }
            for (int round = 1; round <= 3; round++) {
                System.out.println("\nRound " + round);
                System.out.println("I am thinking of a color.\nIs it one of the list above?");

                String guess = "";
                boolean validInput = true;
                while (validInput) {
                    System.out.print("Enter your guess: ");
                    guess = sc.nextLine().toLowerCase();

                    //validate input against displayed colors
                    if (guess.equals(COLOR1) || guess.equals(COLOR2) || guess.equals(COLOR3) || 
                    	guess.equals(COLOR4) || guess.equals(COLOR5) || guess.equals(COLOR6) ||
                        guess.equals(COLOR7) || guess.equals(COLOR8) || guess.equals(COLOR9) ||
                        guess.equals(COLOR10) || guess.equals(COLOR11) || guess.equals(COLOR12) ||
                        guess.equals(COLOR13) || guess.equals(COLOR14) || guess.equals(COLOR15) ||
                        guess.equals(COLOR16)) {
                        validInput = false;
                    } else {
                        System.out.println("Invalid color. Please enter one from the list.");
                    }
                }

                //randomly select a color from the menu option using switch
                int randomNum = random.nextInt((option == 1) ? 16 : (option == 2) ? 10 : 5) + 1;
                String selectedColor = "";

                switch (randomNum) {
                    case 1: selectedColor = COLOR1; break;
                    case 2: selectedColor = COLOR2; break;
                    case 3: selectedColor = COLOR3; break;
                    case 4: selectedColor = COLOR4; break;
                    case 5: selectedColor = COLOR5; break;
                    case 6: selectedColor = COLOR6; break;
                    case 7: selectedColor = COLOR7; break;
                    case 8: selectedColor = COLOR8; break;
                    case 9: selectedColor = COLOR9; break;
                    case 10: selectedColor = COLOR10; break;
                    case 11: selectedColor = COLOR11; break;
                    case 12: selectedColor = COLOR12; break;
                    case 13: selectedColor = COLOR13; break;
                    case 14: selectedColor = COLOR14; break;
                    case 15: selectedColor = COLOR15; break;
                    case 16: selectedColor = COLOR16; break;
                }

                if (guess.equals(selectedColor)) {
                    correctGuesses++;
                }
                System.out.println("I was thinking of " + selectedColor + ".");
            }

            System.out.println("\nGame Over");
            System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");
            System.out.print("Would you like to continue a Game? Type Yes/No: ");
            String answer = sc.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                continueGame = false;
            }
        }

        //get user info at the end (p.s. the due date and other date thing are the same since the assignment doesnt ask for another input option)
        System.out.print("Enter your name: ");
        userName = sc.nextLine();
        System.out.print("Describe yourself: ");
        userDesc = sc.nextLine();
        System.out.print("Due Date (MM/DD): ");
        dueDate = sc.nextLine();

        System.out.println("Username: " + userName);
        System.out.println("User Description: " + userDesc);
        System.out.println("Date: " + dueDate);

        //write to file works with the throw exception up top
        PrintWriter writer = new PrintWriter("EspGameResults.txt");
        writer.println("Game Over");
        writer.println("You guessed " + correctGuesses + " out of 3 colors correctly.");
        writer.println("Due Date: " + dueDate);
        writer.println("Username: " + userName);
        writer.println("User Description: " + userDesc);
        writer.println("Date: " + dueDate);
        writer.close();
        sc.close();
    }
}
