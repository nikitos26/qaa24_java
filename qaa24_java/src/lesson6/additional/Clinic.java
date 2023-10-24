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
        TreatmentPlan treatmentPlan1 = new TreatmentPlan(1);
        TreatmentPlan treatmentPlan2 = new TreatmentPlan(2);
        TreatmentPlan treatmentPlan3 = new TreatmentPlan(3);

        Patient patient1 = new Patient("Volha", treatmentPlan1);
        Patient patient2 = new Patient("Varvara", treatmentPlan2);
        Patient patient3 = new Patient("Mikita", treatmentPlan3);

        patient1.assingDoctor();
        patient2.assingDoctor();
        patient3.assingDoctor();
    }
}