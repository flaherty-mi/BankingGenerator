// Meghan Flaherty
// CS145
// Manager class
// contains the primary methods for the user

package AssignmentIII.src;

import java.util.Scanner;
import java.util.Stack;


public class UserBalanceManager extends BankMain { 


      
    

        public void menu() {
            Scanner input = new Scanner(System.in);

            System.out.println("FOR EMPLOYEE USE ONLY");
            System.out.println();
            System.out.println("Welcome to the banking portal");
            System.out.println("[1] Add a new user ");
            System.out.println("[2] Find a current user");
            System.out.println("[3] remove a user");
            System.out.println("[4] Deposit");
            System.out.println("[5] Withdraw");
            System.out.println("[6] quit");
            System.out.println();

            String choice = input.nextLine();

            switch(choice) {
                case "1":
                    adduser();
                    break;
                case "2":
                    finduser();
                    break;
                case "3":
                    removeUser();
                    break;
                case "4":
                    deposit();
                    break;
                case "5":
                    withdraw();
                    break;
                case "6":
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid entry or menu choice");
                    System.out.println("Please try again");
                    menu();
                    break;
            }
            System.out.println();
        } // end of menu 

        public void addUser() {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the following information of the new user");
            System.out.print("First name: ");
            String firstName = input.nextLine();
            System.out.print("Last name: ");
            String lastName = input.nextLine();
            System.out.print("ID number: ");
            int numberID = input.nextInt();
            System.out.println("Current balance: ");
            double balance = input.nextDouble();

            

        }

        public void finduser() {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter the ID number of the user");
            int findID = Integer.parseInt(in.nextLine());

    
        } // end findEmployee

        public void removeUser() {

        }


        public void deposit() {
           


        }

        public void withdraw() {

        }


        public UserObject userInformation() {

        }

    } // end of class 

