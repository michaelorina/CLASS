import java.util.*;

class Nurse extends Person{
    
    String[] input;

    public void register(){
        for(int i=0; i<3; i++){
            
            Scanner input = new Scanner(System.in);

            System.out.print("Enter county of Residence: ");
            String county = input.nextLine();

            System.out.print("Serialization number: ");
            String serial= input.nextLine();

            System.out.print("Enter day of month: ");
            String day= input.nextLine();

            System.out.print("Enter month: ");
            String month= input.nextLine();

            System.out.print("Enter year: ");
            String year= input.nextLine();

            String serialization = county + "/" + serial + "/" + day + "/" + month + "/" + year ;
        }
        }
    
}
