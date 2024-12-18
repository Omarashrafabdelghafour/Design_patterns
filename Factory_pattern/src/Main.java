//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Factory f1 = new Factory();

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
     Employee emp1 = f1.get_employee_name("manger");

        System.out.println(emp1.getname());
        Employee emp2= f1.get_employee_name("Engineer");
        System.out.println(emp2.getname());

    }
}