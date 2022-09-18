

public class InvalidEmployeeID extends RuntimeException {

    public InvalidEmployeeID() {
    }

    public InvalidEmployeeID(String message) {
        super(message);
    }
}
