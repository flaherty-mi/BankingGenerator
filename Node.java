







package AssignmentIII.src.BankMain;


public class Node extends BankMain{

    private UserObject user;
    private Node next;

    public Node(UserObject user) {
        this.user = user;
        this.next = null;
    }

    public userObject getUser() {
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

}
