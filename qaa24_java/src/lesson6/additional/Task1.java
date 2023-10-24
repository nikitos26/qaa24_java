package lesson6.additional;

//  Создать программу для имитации работы клиники.
//  Пусть в клинике будет три врача: хирург, терапевт и дантист.
//  Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
//  Так же предусмотреть класс «Пациент» и класс «План лечения».
//  Создать объект класса «Пациент» и добавить пациенту план лечения.
//  Так же создать метод, который будет назначать врача пациенту согласно плану лечения.
//  Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
//  Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
//  Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить.

class Clinic {
    public static void main(String[] arg) {
        Therapist therapist = new Therapist();
        Dentist dentist = new Dentist();
        Surgeon surgeon = new Surgeon();

        TreatmentPlan treatmentPlan1 = new TreatmentPlan(1);
        TreatmentPlan treatmentPlan2 = new TreatmentPlan(2);
        TreatmentPlan treatmentPlan3 = new TreatmentPlan(3);


        Patient patient1 = new Patient("Volha", treatmentPlan1);
        Patient patient2 = new Patient("Varvara", treatmentPlan2);
        Patient patient3 = new Patient("Mikita", treatmentPlan3);

        patient1.assingDoctor(therapist);
        patient2.assingDoctor(dentist);
        patient3.assingDoctor(surgeon);
    }
}

class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void treat() {
        System.out.print(name + " лечит пациента ");
    }
}

class Surgeon extends Doctor {
    public Surgeon() {
        super("Хирург");
    }
}

class Therapist extends Doctor {
    public Therapist() {
        super("Терапевт");
    }
}

class Dentist extends Doctor {
    public Dentist() {
        super("Дантист");
    }
}

class TreatmentPlan {
    private int code;

    public int getCode() {
        return code;
    }

    public TreatmentPlan(int code) {
        this.code = code;
    }
}

class Patient {
    private String name;
    private TreatmentPlan treatmentPlan;

    public Patient(String name, TreatmentPlan treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public void assingDoctor(Doctor doctor) {
        if (treatmentPlan.getCode() == 1) {
            doctor.treat();
            System.out.println(name + ".");
        } else if (treatmentPlan.getCode() == 2) {
            doctor.treat();
            System.out.println(name + ".");
        } else {
            doctor.treat();
            System.out.println(name + ".");
        }
    }
}
