public class Main {
    public static void main(String[] args) {
       ShapeBuilder s1 = new ShapeBuilder();
        Circle c1 = new Circle(8.0);
        Circle c2 = new Circle(10.0);
        Square q1 = new Square(9.0);
            s1.addShape(c1);
            s1.addShape(c2);
            // Test getArea()-metoderne
            System.out.println("Cirkelens areal er : " + c1.getArea());
            System.out.println("Cirkelens areal er : " + c2.getArea());
            System.out.println("Kvadratets areal er : " + q1.getArea());
            
            System.out.println("begge cirklers areal er" + s1.getTotalArea());


    }



}