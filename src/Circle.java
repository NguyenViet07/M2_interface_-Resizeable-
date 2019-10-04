public class Circle extends Shape {
    public double radius = 10.0;

    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean fill){
        super(color, fill);
        this.radius= radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return Math.PI*2*this.radius;
    }

    public double setArea(){
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public String toString(){
        return "I am Circle have " +this.radius+ " " + super.toString();
    }
}
