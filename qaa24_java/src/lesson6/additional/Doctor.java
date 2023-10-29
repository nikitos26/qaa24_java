package lesson6.additional;

class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }
    public void treat() {
        System.out.print(name + " лечит пациента ");
    }
}
