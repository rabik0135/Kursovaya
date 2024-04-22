package Task2.Equipment.TreatmentEquipment;

import Task2.Equipment.DentalEquipment;

public abstract class TreatmentEquipment extends DentalEquipment {

    private boolean isTreatmentPerforms;
    public TreatmentEquipment(String equipmentName, int equipmentId, double price, int warrantyPeriod, boolean isTreatmentPerforms){
        super(equipmentName,equipmentId,price,warrantyPeriod);
        this.isTreatmentPerforms = isTreatmentPerforms;
    }

    public abstract void performTreatment();



}
