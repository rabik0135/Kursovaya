package Task2.Equipment;
public abstract class DentalEquipment {
    private String equipmentName;
    private int equipmentId;
    private double price;
    private int warrantyPeriod;

    public DentalEquipment(String equipmentName, int equipmentId, double price, int warrantyPeriod){
        this.equipmentName = equipmentName;
        this.equipmentId = equipmentId;
        this.price = price;
        this.warrantyPeriod=warrantyPeriod;
    }

    public abstract String viewEquipmentDetails();

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }


}

