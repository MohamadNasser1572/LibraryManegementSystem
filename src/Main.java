import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
//        Book book1 = new Book("b1","Pennywise",2019,"Mohammad Nasser");
//        DVD dvd1 = new DVD("d2","IT",2018,"Mohammad Nasser");
//
//        //add items
//        library.addItem(book1);
//        library.addItem(dvd1);
//        //display all items
//        library.displayItems();
//        //borrow items
//        library.borrowItem(book1);
//        //display after borrow items
//        library.displayItems();
//        //return items
//        library.returnItem(book1);
//        //display after return items
//        library.displayItems();

        int choice;

        do {
            System.out.println("Choose your option: ");
            System.out.println("1. Add Item");
            System.out.println("2. Borrow Item");
            System.out.println("3. Return Item");
            System.out.println("4. Display Items");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Add Item
                    System.out.println("Add a book or a DVD?");
                    String choice1 = sc.nextLine();
                    sc.nextLine();
                    if (choice1.equalsIgnoreCase("book")) {
                        System.out.println("Enter ID: ");
                        String id = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Enter title: ");
                        String title = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Enter year: ");
                        int year = sc.nextInt();
                        System.out.println("Enter author: ");
                        String author = sc.nextLine();
                        sc.nextLine();
                        library.addItem(new Book(id, title, year, author));
                    } else
                        System.out.println("Enter ID: ");
                    String id = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter title: ");
                    String title = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter year: ");
                    int year = sc.nextInt();
                    System.out.println("Enter director: ");
                    String director = sc.nextLine();
                    sc.nextLine();
                    library.addItem(new DVD(id, title, year, director));

                    break;
                case 2:
                    // Borrow Item
                    System.out.println("You chose to Borrow Item.");
                    // Add your code here
                    break;
                case 3:
                    // Return Item
                    System.out.println("You chose to Return Item.");
                    // Add your code here
                    break;
                case 4:
                    // Display Items
                    System.out.println("You chose to Display Items.");
                    // Add your code here
                    break;
                case 5:
                    // Exit
                    System.out.println("Exiting the program.");
                    break;
                default:
                    // Invalid choice
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);
    }
}