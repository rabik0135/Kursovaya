package Task2.Equipment.DiagnosticEquipment;



public class DentalMicroscope extends DiagnosticEquipment{

    private double scope;

    public DentalMicroscope(String equipmentName, int equipmentId, double price, int warrantyPeriod, boolean isDiagnosticPerforms, double scope){
        super(equipmentName,equipmentId,price,warrantyPeriod,isDiagnosticPerforms);
        this.scope=scope;
    }

    public double getScope() {
        return scope;
    }

    public void setScope(double scope) {
        this.scope = scope;
    }

    public String viewEquipmentDetails(){
        return "Equipment name: " + getEquipmentName() + "\n" +
                "Equipment Id: " + getEquipmentId() + "\n" +
                "Price: "+ getPrice()+"\n"+
                "Warranty period: " + getWarrantyPeriod() + "\n" +
                "Scope: " + getScope() + "\n";
    }
    @Override
    public void performDiagnostic(){
        System.out.println("...");
    }



}
