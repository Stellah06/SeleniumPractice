package week3.day9.assignments;

public class JavaConnection implements DatabaseConnection{
    public static void main(String[] args) {
        JavaConnection obj=new JavaConnection();
        obj.connect();
        obj.disconnect();
        obj.executeUpdate();

    }

    @Override
    public void connect() {
        System.out.println("Implementation of connect");
    }

    @Override
    public void disconnect() {
        System.out.println("Implementation of disconnect");
    }

    @Override
    public void executeUpdate() {
        System.out.println("Implementation of execute update");
    }
}
