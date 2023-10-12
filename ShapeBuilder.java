import java.util.ArrayList;

public class ShapeBuilder{

    ArrayList<Shape> shapes = new ArrayList<>();




    public void addShape(Shape s){
        shapes.add(s);
    }


    public double getTotalArea(){
        double totalareal = 0;
        for(Shape s : shapes){
            totalareal += s.getArea();
        }
        return totalareal;

    }


}
