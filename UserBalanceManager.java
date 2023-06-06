// Meghan Flaherty
// CS145
// Manager class
// contains the primary methods for the user



import java.util.Scanner;

import java.util.*;


public class UserBalanceManager extends BankMain { 

    private Node head;
      
    public void start() {
        System.out.println("============Welcome to the Banking Portal===============");
        menu();
    }

        // displays menu and directs user to appropriate method
        public void menu() {
            Scanner input = new Scanner(System.in);

            System.out.println();
            System.out.println("----FOR EMPLOYEE USE ONLY----");
            System.out.println();
            System.out.println("[1] Add a new user ");
            System.out.println("[2] Find a current user");
            System.out.println("[3] remove a user");
            System.out.println("[4] Deposit");
            System.out.println("[5] Withdraw");
            System.out.println("[6] quit");
            System.out.println();

            String choice = input.nextLine();

            // switch case for directing to specific method
            switch(choice) {
                case "1":
                    addUser();
                    break;
                case "2":
                    findUser();
                    break;
                case "3":
                    removeUser();
                    break;
                case "4":
                    startDeposit();
                    break;
                case "5":
                    startWithdraw();
                    break;
                case "6":
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid entry or menu choice");
                    System.out.println("Please try again");
                    System.out.println();
                    menu();
                    break;
            }
            System.out.println();
            
        } // end of menu 

        // method for adding a new user
        public void addUser() {
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("Please enter the following information of the new user");
            System.out.println();
            System.out.print("First name: ");
            String firstName = input.nextLine();
            System.out.print("Last name: ");
            String lastName = input.nextLine();
            System.out.print("ID number: ");
            int numberID = input.nextInt();
            System.out.println("Current balance: ");
            double balance = input.nextDouble();

            UserObject user = new UserObject(firstName, lastName, numberID, balance);
            Node newNode = new Node(user);

            // if the head is null -> make it the new node
            if (head == null) {
                head = newNode;
            }

            // if the node following the head is not null, traverse until null + add new node
            else {
                Node current = head;
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(newNode);
            }

            // notify user of success
            System.out.println("New user has been added");
            menu();
            
        } // end addUser

        // finds a user by ID number
        public void findUser() {
            Scanner in = new Scanner(System.in);
            System.out.println();
            System.out.println("Please enter the ID number of the user you wish to find");
            int findID = Integer.parseInt(in.nextLine());

            Node current = head;

            // find matching ID number 
            while (current != null) {
                if (current.getUserObject().getNumberID() == findID) {
                    // print user info that has the input ID
                    System.out.println(current.getUserObject().toString());
                    break;
                }
                current = current.getNext();
            }

            // if it traverses and cannot find user w/ ID, notify user
            if (current == null) {
                System.out.println();
                System.out.println("No user found with input ID number");
                System.out.println("Please try again");

                // user may try again with a different ID number
                findUser();
            }

            // go back to menu for more options
            menu();
           
        } // end findUser

        // remove user by ID number
        public void removeUser() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the ID number of the user to delete: ");
            int deleteID = input.nextInt();
            
            // if directory is empty -> notify user
            if (head == null) {
                System.out.println();
                System.out.println("There are no current users at this time");
                return;
            }

            // if ID's match a current user, remove user
            if (head.getUserObject().getNumberID() == deleteID) {
                head = head.getNext();
                System.out.println();
                System.out.println("User has been deleted");
                return;
            } 

            Node previous = head;
            Node current = head.getNext();

            // adjust for removing a user from the linked list
            while (current != null) {
                if (deleteID < current.getUserObject().getNumberID()) {
                    previous.setNext(current.getNext());
                    return;
                }
                previous = current;
                current = current.getNext();
            }

            // if no matching ID was found after searching through linked list: 
            if (current == null) {
            System.out.println();
            System.out.println("There is no current user with the input ID number");
            System.out.println("Please try again");
            removeUser();
            }

            // back to menu for other options
            menu();
        } // end removeuser

        // find the user by ID number for deposit
        public void startDeposit() {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter the ID number of the user of which to make a deposit");
            int depositID = Integer.parseInt(in.nextLine());

            Node current = head;
            while (current != null) {
                if (current.getUserObject().getNumberID() == depositID) {
                    System.out.println();
                    System.out.println("The users current information and balance is:");
                    System.out.println(current.getUserObject().toString());
                    current.getUserObject().getBalance();

                    // go to deposit method to execute a deposit
                    deposit(current);
                    break;
                }
                current = current.getNext();
            }

            // try again if ID does not match current users
            if (current == null) {
                System.out.println();
                System.out.println("No user found with input ID number");
                System.out.println("Please try again");
                startDeposit();
            }

            menu();
           
        } // end startDeposit

        // deposits set amount in a users account
        public void deposit(Node current) {
            Scanner input = new Scanner(System.in);
            System.out.println("how much would you like to deposit: ");
            double depAmount = input.nextDouble();
            
            // set new balance for user by adding deposit amount
            current.getUserObject().setBalance(current.getUserObject().getBalance() + depAmount);
            
            System.out.println();
            System.out.println("deposit has been made");
            menu();
        } // end deposit

            public void startWithdraw() {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter the ID number of the user of which to make a withdrawl");
            int depositID = Integer.parseInt(in.nextLine());

            
            Node current = head;
            while (current != null) {
                if (current.getUserObject().getNumberID() == depositID) {
                    System.out.println();
                    System.out.println("The users current information and balance is:");
                    System.out.println(current.getUserObject().toString());
                    withdraw(current);
                    break;
                }
                current = current.getNext();
            }

            if (current == null) {
                System.out.println("No user found with input ID number");
                System.out.println("Please try again");
                startWithdraw();
            }

            menu();
            
        } // end start withdrawl

        // withdrawl method
        public void withdraw(Node current) {
            Scanner input = new Scanner(System.in);
            System.out.println("how much would you like to withdraw: ");
            double withAmount = input.nextDouble();

            // set new balance by subtracting withdrawl amount
            current.getUserObject().setBalance(current.getUserObject().getBalance() - withAmount);
            
            System.out.println();
            System.out.println("withdrawl has been made");
            menu();
        } // end of withdrawl

    } // end of class 

