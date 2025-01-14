public class Circle extends  Shape {

Circle(color color){
super(color);
}

    @Override
    public void colorIt() {
        System.out.println("circle filled");
        color.fillcolor();
    }
}
