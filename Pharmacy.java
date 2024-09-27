public class Pharmacy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        Person owner = new Person("Ahmed Khan", "1234567890");
        Address address = new Address("123 Health St", "Karachi", "75000");
        PharmacyShop pharmacy = new PharmacyShop(owner, address);
        
        Date currentDate = new Date(27, 9, 2024); 
        
        while (true) {
            System.out.println("\nPharmacy Shop Management System");
            System.out.println("1. Add Medicine");
            System.out.println("2. Update Medicine");
            System.out.println("3. Remove Medicine");
            System.out.println("4. Sell Medicine");
            System.out.println("5. Display All Medicines");
            System.out.println("6. Search Medicine");
            System.out.println("7. Print Total Revenue");
            System.out.println("8. List Expired Medicines");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Medicine ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Medicine Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Manufacturer: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Enter Batch Number: ");
                    String batchNumber = scanner.nextLine();
                    System.out.print("Enter Expiry Date (day month year): ");
                    int day = scanner.nextInt();
                    int month = scanner.nextInt();
                    int year = scanner.nextInt();
                    pharmacy.addMedicine(new Medicine(id, name, price, quantity, manufacturer, batchNumber, new Date(day, month, year)));
                    break;

                case 2:
                    System.out.print("Enter Medicine ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter New Medicine Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Price: ");
                    double newPrice = scanner.nextDouble();
                    System.out.print("Enter New Quantity: ");
                    int newQuantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter New Manufacturer: ");
                    String newManufacturer = scanner.nextLine();
                    System.out.print("Enter New Batch Number: ");
                    String newBatchNumber = scanner.nextLine();
                    System.out.print("Enter New Expiry Date (day month year): ");
                    int newDay = scanner.nextInt();
                    int newMonth = scanner.nextInt();
                    int newYear = scanner.nextInt();
                    pharmacy.updateMedicine(updateId, new Medicine(updateId, newName, newPrice, newQuantity, newManufacturer, newBatchNumber, new Date(newDay, newMonth, newYear)));
                    break;

                case 3:
                    System.out.print("Enter Medicine ID to remove: ");
                    String removeId = scanner.nextLine();
                    pharmacy.removeMedicine(removeId);
                    break;

                case 4:
                    System.out.print("Enter Medicine ID to sell: ");
                    String sellId = scanner.nextLine();
                    System.out.print("Enter Quantity to sell: ");
                    int sellQuantity = scanner.nextInt();
                    pharmacy.sellMedicine(sellId, sellQuantity);
                    break;

                case 5:
                    pharmacy.displayMedicines();
                    break;

                case 6:
                    System.out.print("Enter Medicine ID or Name to search: ");
                    String searchTerm = scanner.nextLine();
                    pharmacy.searchMedicine(searchTerm);
                    break;

                case 7:
                    System.out.println("Total Revenue: " + pharmacy.getTotalRevenue());
                    break;

                case 8:
                    System.out.println("Expired Medicines:");
                    pharmacy.displayExpiredMedicines(currentDate);
                    break;

                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                                        System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
