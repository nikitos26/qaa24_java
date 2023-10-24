package lesson6.additional;

class Patient {
    private String name;
    private TreatmentPlan treatmentPlan;

    public Patient(String name, TreatmentPlan treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public void assingDoctor() {
        if (treatmentPlan.getCode() == 1) {
            new Therapist().treat();
            System.out.println(name + ".");
        } else if (treatmentPlan.getCode() == 2) {
            new Dentist().treat();
            System.out.println(name + ".");
        } else {
            new Surgeon().treat();
            System.out.println(name + ".");
        }
    }
}
