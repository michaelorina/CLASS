class AdminUser extends User{
//properties specific to the Admin User
String employeeId;

AdminUser(String aPayrollNumber){
    super("Salesio",1,"dirUserName","stringPass");
    employeeId=aPayrollNumber;
}

}