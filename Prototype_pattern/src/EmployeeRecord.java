public class EmployeeRecord implements Prototype {
    int id; String name; String addres; double salary;
    EmployeeRecord(){System.out.println("welcome to our class ");}

    EmployeeRecord(int id , String name, String addres, double salary){
        this.id=id;
        this.name=name;
        this.addres= addres;
        this.salary =salary;
    }
public void Showrecord() {

    System.out.println(this.id + "\t" + this.name + "\t" + this.addres + "\t" + this.salary + "\t");

}

    @Override
    public Prototype getclone() {
        return new EmployeeRecord(this.id ,   this.name ,  this.addres ,   this.salary );
    }
}
