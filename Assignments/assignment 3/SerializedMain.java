import java.io.*;

class Customer implements Serializable {
    private int id;
    private String name;
    private String contactNo;
    private String address;

    // Constructor
    public Customer(int id, String name, String contactNo, String address) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
    }

    // Getters and setters (optional)

    // Serialize method
    public void serialize(String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialize method (optional)
    public static Customer deserialize(String fileName) {
        Customer customer = null;
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            customer = (Customer) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

public class SerializedMain {
    public static void main(String[] args) {
        // Create a Customer object
        Customer customer = new Customer(1, "John Doe", "1234567890", "123 Main St, City");

        // Serialize the object
        String fileName = "JavaObject.txt";
        customer.serialize(fileName);

        // Deserialize the object (optional)
        Customer deserializedCustomer = Customer.deserialize(fileName);
        if (deserializedCustomer != null) {
            System.out.println("Deserialized Customer: " + deserializedCustomer);
        }
    }
}