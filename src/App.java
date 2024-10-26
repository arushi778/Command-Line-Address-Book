import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCommand Line Address Book");
            System.out.println("1. Add Entry");
            System.out.println("2. Display All Entries");
            System.out.println("3. Exit");
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
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }
}
