import java.util.Scanner;
public class User {
//properties
    String name;
    String userName,password;
    int id;
//CONSTRUCTOR
User(String aName,int anId,String aUserName,String aPassword){
    name = aName;
    userName = aUserName; password =aPassword;id=anId;
}

//Methods or Behaviors
//login to the system
boolean login(){
//we add logic to collect user username and password
    System.out.print("Enter Username:");
    Scanner keyBoard = new Scanner(System.in);
    String enteredUserName = keyBoard.nextLine();
    System.out.print("Enter Password:");
    String enteredPassword = keyBoard.nextLine();
//we check  the validity of enteredValues
return false;
}
//write out the details of the User
void printUserDetails(){
    System.out.println("Name: "+name);
    System.out.println("UserName: "+userName);
    System.out.println("Identification: "+id);
}
  
}