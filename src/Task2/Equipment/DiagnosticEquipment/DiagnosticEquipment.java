package Task2.Equipment.DiagnosticEquipment;



import Task2.Equipment.DentalEquipment;


public abstract class DiagnosticEquipment extends DentalEquipment {
    private boolean isDiagnosticPerforms;
    public DiagnosticEquipment(String equipmentName, int equipmentId, double price, int warrantyPeriod, boolean isDiagnosticPerforms){
        super(equipmentName,equipmentId,price,warrantyPeriod);
        this.isDiagnosticPerforms = isDiagnosticPerforms;
    }


    public abstract void performDiagnostic();


}
