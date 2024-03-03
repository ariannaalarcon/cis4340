/* Rule 13. Object Deserialization (SER)
SER06-J. Do not deserialize untrusted data without a security manager present
  
Non-compliant code: */

public class Deserialize {
    public static void main(String[] args) {
        try {
            // Deserialize from user input
            ObjectInputStream ois = new ObjectInputStream(System.in);
            SomeClass obj = (SomeClass) ois.readObject();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

/* Corrected Code */

public class Deserialize {
    public static void main(String[] args) {
        try {
            // Deserialize from file
            FileInputStream fis = new FileInputStream("data.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SomeClass obj = (SomeClass) ois.readObject();
            // Perform security checks on obj if necessary
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
