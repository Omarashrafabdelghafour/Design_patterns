public class Factory {

 Employee get_employee_name(String name ){
     if (name.equalsIgnoreCase("manger")){

         return  new Manger();
     } else if (name.equalsIgnoreCase("Engineer")) {
         return  new Employee();
     }
   return null;
 }


}
