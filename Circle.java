public class Circle implements Shape{

private double radius;
Circle(double radius){
this.radius = radius;

}




@Override
public double getArea(){
    return 3.14*(this.radius*this.radius);

}
}
