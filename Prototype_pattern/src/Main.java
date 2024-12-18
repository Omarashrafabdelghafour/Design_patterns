//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome prof Omar!"+"\n");

int empid=10;
String empname ="Omar";
String empaddress="Cairo";
Double empsalary= 20000.0;

EmployeeRecord emp =new EmployeeRecord(empid,empname,empaddress,empsalary);
emp.Showrecord();
System.out.println("\n");
EmployeeRecord emp2= (EmployeeRecord) emp.getclone();
emp2.Showrecord();;
        }

}