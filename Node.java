// Meghan Flaherty
// CS145
// class to create Node





public class Node extends BankMain{

    // initializing object node
    private UserObject user;
    private Node next;

    public Node(UserObject user) {
        this.user = user;
        this.next = null;
    }

    // getters + setters for iterating through linked list

    public UserObject getUserObject() {
        return user;
    }
    
    public void setUser(UserObject user) {
        this.user = user;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

} // end Node class
