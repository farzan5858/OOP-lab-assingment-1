public class Pharmacyshop{
	
	private Address address;
	private Medicine[] medicines;
	private int medicinecount;
	private Person owner;

}public class PharmacyShop {
    private Person owner;
    private Address address;
    private List<Medicine> medicines;
    private double totalRevenue;

    public PharmacyShop(Person owner, Address address) {
        this.owner = owner;
        this.address = address;
        this.medicines = new ArrayList<>();
        this.totalRevenue = 0.0;
    }

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }

    public void updateMedicine(String medicineId, Medicine updatedMedicine) {
        for (int i = 0; i < medicines.size(); i++) {
            if (medicines.get(i).getMedicineId().equals(medicineId)) {
                medicines.set(i, updatedMedicine);
                return;
            }
        }
    }

    public void removeMedicine(String medicineId) {
        medicines.removeIf(medicine -> medicine.getMedicineId().equals(medicineId));
    }

    public void sellMedicine(String medicineId, int quantity) {
        for (Medicine medicine : medicines) {
            if (medicine.getMedicineId().equals(medicineId) && medicine.getQuantity() >= quantity) {
                medicine.sell(quantity);
                totalRevenue += medicine.getPrice() * quantity;
                return;
            }
        }
    }

    public void displayMedicines() {
        for (Medicine medicine : medicines) {
            medicine.displayInfo();
        }
    }

    public void searchMedicine(String searchTerm) {
        for (Medicine medicine : medicines) {
            if (medicine.getMedicineId().equals(searchTerm) || medicine.getName().equalsIgnoreCase(searchTerm)) {
                medicine.displayInfo();
                return;
            }
        }
        System.out.println("Medicine not found.");
    }

    public void displayExpiredMedicines(Date currentDate) {
        for (Medicine medicine : medicines) {
            if (medicine.isExpired(currentDate)) {
                medicine.displayInfo();
            }
        }
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }
}
