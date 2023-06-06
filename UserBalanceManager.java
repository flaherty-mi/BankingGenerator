// Meghan Flaherty
// CS145
// Manager class
// contains the primary methods for the user

import java.util.Scanner;
import java.util.Stack;


public class UserBalanceManager extends BankMain { 


        private class Node {
            private UserObject user;
            private Node left;
            private Node right;

            // Set Root node
            Node root;

            // Constructor for initial empty tree
            UserBalanceManager() {
            root = null;
            } 
    
            // Constructor
            public Node(UserObject user) {
                this.user = user;
                this.left = null;
                this.right = null;
            }
    
            // Getters and Setters
            public UserObject getUser() {
                return user;
            } 
    
            public Node getLeft() {
                return left;
            } 
            
            public Node getRight() {
                return right;
            } 
            
            public void setUser(UserObject user) {
                this.user = user;
            } 
            
            public void setLeft(Node left) {
                this.left = left;
            } 
            
            public void setRight(Node right) {
                this.right = right;
            } 
            
            @Override
            public String toString() {
                return user.toString();
            } 
         } // end Node class
    

        public void menu() {
            Scanner input = new Scanner(System.in);

            System.out.println("FOR EMPLOYEE USE ONLY");
            System.out.println();
            System.out.println("Welcome to the banking portal");
            System.out.println("[1] Add a new user ");
            System.out.println("[2] Modify a current user's information or balance");
            System.out.println("[3] Find a current user");
            System.out.println("[4] remove a user");
            System.out.println("[5] display all current users");
            System.out.println("[6] quit");
            System.out.println();

            String choice = input.nextLine();

            switch(choice) {
                case "1":
                    adduser();
                    break;
                case "2":
                    modifyUserChoice();
                    break;
                case "3":
                    findUser();
                    break;
                case "4":
                    removeuser();
                    break;
                case "5":
                    displayUsers();
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

        }

        public void modifyUserChoice() {
            Scanner in = new Scanner(System.in);
            System.out.print("please enter the ID number of the user to modify: ");
            int modifyID = Integer.parseInt(input.nextLine());



        }

        public void finduser() {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter the ID number of the user");
            int findID = Integer.parseInt(input.nextLine());

            Node currentNode = root;

            while (currentNode != null) {
                if (findID < currentNode.getUser().getNumberID()) {
                    //Traverse to left child
                    currentNode = currentNode.getLeft();
                } else if (findID > currentNode.getUser().getNumberID()) {
                    // Traverse to right child
                    currentNode = currentNode.getRight();
                } else {
    
                    // employee found using ID
                    System.out.println();
                    System.out.println("Employee found!");
                    System.out.println();
                    System.out.println(currentNode.getEmployee().toString());
                    System.out.println();
    
                    menu();
                    return;
                } // end else 
            }
            System.out.println();
            System.out.println("No user was found matching this ID number");
            System.out.println("Please try again using a current ID number");
            System.out.println();
            menu();
    
        } // end findEmployee


        public void removeUser() {

        }

        public void displayUsers() {

        }


    } // end of class 

