class Patient extends Person{
    String[] input;

public void display(){

        Person patient = new Person();
        patient.myName(name);
        System.out.print(name);

        Nurse seirial = new Nurse();
        seirial.register();
        System.out.print(serialization);

        Person age1 = new Person();
        age1.myAge(age);
        System.out.print(age);

        Nurse conti = new Nurse();
        conti.register();
        System.out.print(county);
    }
}
