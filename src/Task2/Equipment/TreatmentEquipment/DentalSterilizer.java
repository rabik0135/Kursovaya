package Task2.Equipment.TreatmentEquipment;
public class DentalSterilizer extends TreatmentEquipment {

    public int maxPressure;

    public DentalSterilizer(String equipmentName, int equipmentId, double price, int warrantyPeriod, boolean isTreatmentPerforms, int maxPressure) {
        super(equipmentName, equipmentId, price, warrantyPeriod, isTreatmentPerforms);
        this.maxPressure = maxPressure;
    }

    public int getMaxPressure() {
        return maxPressure;
    }

    public void setMaxPressure(int maxPressure) {
        this.maxPressure = maxPressure;
    }

    public String viewEquipmentDetails(){
        return "Equipment name: " + getEquipmentName() + "\n" +
                "Equipment Id: " + getEquipmentId() + "\n" +
                "Price: "+ getPrice()+"\n"+
                "Warranty period: " + getWarrantyPeriod() + "\n" +
                "Max pressure: " + getMaxPressure() + "\n";
    }

    @Override
    public void performTreatment(){
        System.out.println("    ");
    }
}
