import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;

        do {
            System.out.println("Choose your option: ");
            System.out.println("1. Add Item");
            System.out.println("2. Borrow Item");
            System.out.println("3. Return Item");
            System.out.println("4. Display Items");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.println("Add a book or a DVD?");
                    String choice1 = sc.nextLine();
                    if (choice1.equalsIgnoreCase("book")) {
                        System.out.println("Enter ID: ");
                        String id = sc.nextLine();
                        System.out.println("Enter title: ");
                        String title = sc.nextLine();
                        System.out.println("Enter year: ");
                        int year = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        System.out.println("Enter author: ");
                        String author = sc.nextLine();
                        library.addItem(new Book(id, title, year, author));
                    } else if (choice1.equalsIgnoreCase("dvd")) {
                        System.out.println("Enter ID: ");
                        String id = sc.nextLine();
                        System.out.println("Enter title: ");
                        String title = sc.nextLine();
                        System.out.println("Enter year: ");
                        int year = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        System.out.println("Enter director: ");
                        String director = sc.nextLine();
                        library.addItem(new DVD(id, title, year, director));
                    } else {
                        System.out.println("Invalid item type. Please choose either 'book' or 'dvd'.");
                    }
                    break;
                case 2:
                    System.out.println("Enter ID of the item to borrow: ");
                    String borrowId = sc.nextLine();
                    library.borrowItem(borrowId);
                    break;
                case 3:
                    System.out.println("Enter ID of the item to return: ");
                    String returnId = sc.nextLine();
                    library.returnItem(returnId);
                    break;
                case 4:
                    library.displayItems();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}

