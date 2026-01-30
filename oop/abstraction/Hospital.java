package oop.abstraction;

public interface Hospital {
    public abstract void patientQueue();

    public abstract void patientDetailsModify();
}

class Secret implements Hospital {
    public void patientQueue() {
        System.out.println("Patients are Wating!");
    }

    public void patientDetailsModify() {
        System.out.println("We are modifying the details of the patients.");
    }

    public static void main(String[] args) {
        Secret s = new Secret();
        s.patientDetailsModify();
        s.patientQueue();
    }
}
