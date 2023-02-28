public class Main {
    public static void main(String[] args){

        Nurse nurse1 = new Nurse();
        nurse1.register();

        Nurse nurse2 = new Nurse();
        nurse2.register();

        Patient patient1 = new Patient();
        patient1.display();
    }
}
