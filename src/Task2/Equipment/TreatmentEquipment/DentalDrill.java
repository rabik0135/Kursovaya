package Task2.Equipment.TreatmentEquipment;
import Task2.Equipment.DentalEquipment;
public class DentalDrill extends TreatmentEquipment {
    private int rotationSpeed;

    public DentalDrill(String equipmentName, int equipmentId, double price, int warrantyPeriod, boolean isTreatmentPerforms, int rotationSpeed) {
        super(equipmentName, equipmentId, price, warrantyPeriod, isTreatmentPerforms);
        this.rotationSpeed = rotationSpeed;
    }

    public int getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public String viewEquipmentDetails(){
        return "Equipment name: " + getEquipmentName() + "\n" +
                "Equipment Id: " + getEquipmentId() + "\n" +
                "Price: "+ getPrice()+"\n"+
                "Warranty period: " + getWarrantyPeriod() + "\n" +
                "Rotation speed: " + getRotationSpeed() + "\n";
    }

    @Override
    public void performTreatment(){
        System.out.println("    ");
    }
}

