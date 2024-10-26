import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCommand Line Address Book");
            System.out.println("1. Add Entry");
            System.out.println("2. Display All Entries");
            System.out.println("3. Delete a File");
            System.out.println("4. Save to a file");
            System.out.println("5. Load from a file");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    AddressEntry entry = new AddressEntry(name, address, phoneNumber, email);
                    addressBook.addEntry(entry);
                    System.out.println("Entry added successfully!");
                    break;
                case 2:
                    System.out.println("Displaying all entries:");
                    addressBook.displayAllEntries();
                    break;
                case 3:  
                    System.out.print("Enter the name of the entry to delete: ");
                    String nameToDelete = scanner.nextLine();
                    boolean deleted = addressBook.deleteEntry(nameToDelete);
                    if (deleted) {
                    System.out.println("Entry deleted successfully.");
                    } else {
                    System.out.println("Entry not found.");
                    }
                    break;
                case 4: 
                    System.out.print("Enter filename to save to: ");
                    String saveFilename = scanner.nextLine();
                    addressBook.saveToFile(saveFilename);
                    break;

                case 5:  
                    System.out.print("Enter filename to load from: ");
                    String loadFilename = scanner.nextLine();
                    addressBook.loadFromFile(loadFilename);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                    default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }
}
