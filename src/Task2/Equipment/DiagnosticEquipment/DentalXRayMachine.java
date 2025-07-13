package Task2.Equipment.DiagnosticEquipment;

public class DentalXRayMachine extends DiagnosticEquipment {

    private double maxVoltage;

    public DentalXRayMachine(String equipmentName, int equipmentId, double price, int warrantyPeriod, boolean isDiagnosticPerforms, double maxVoltage){
        super(equipmentName,equipmentId,price,warrantyPeriod,isDiagnosticPerforms);
        this.maxVoltage=maxVoltage;
    }

    public double getMaxVoltage() {
        return maxVoltage;
    }

    public void setMaxVoltage(double maxVoltage) {
        this.maxVoltage = maxVoltage;
    }

    public String viewEquipmentDetails(){
        return "Equipment name: " + getEquipmentName() + "\n" +
                "Equipment Id: " + getEquipmentId() + "\n" +
                "Price: "+ getPrice()+"\n"+
                "Warranty period: " + getWarrantyPeriod() + "\n" +
                "Max voltage: " + getMaxVoltage() + "\n";
    }

    @Override
    public void performDiagnostic() {
        System.out.println("  ");
    }
}
