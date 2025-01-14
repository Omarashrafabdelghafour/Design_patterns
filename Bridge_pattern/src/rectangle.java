public class rectangle extends Shape {
    rectangle(color color){
        super(color);
    }

    @Override
    public void colorIt() {
        System.out.println("rectangle filled with");
        color.fillcolor();
    }

}