public class Medicine {
    
    private String medicineID;
    private String name;
    private double price;
    private int quantity;
    private String manufacturer; 
    private String batchNumber; 
    private Date expiryDate; 

    public Medicine(String medicineID, String name, double price, int quantity, String manufacturer, String batchNumber, Date expiryDate) {
        this.medicineID = medicineID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.batchNumber = batchNumber;
        this.expiryDate = expiryDate;}

    public void setMedicineID(String medicineID) {
        this.medicineID = medicineID; }

    public String getMedicineID() {
        return this.medicineID; }

    public void setName(String name) {
        this.name = name; }

    public String getName() {
        return this.name; }

    public void setPrice(double price) {
        this.price = price;}

    public double getPrice() {
        return this.price;}

    public void setQuantity(int quantity) {
        this.quantity = quantity;}

    public int getQuantity() {
        return this.quantity;}

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;}

    public String getManufacturer() {
        return this.manufacturer; }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber; }

    public String getBatchNumber() {
        return this.batchNumber; }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;}

    public Date getExpiryDate() {
        return this.expiryDate; }
		
	//public void displayinformation()
}
