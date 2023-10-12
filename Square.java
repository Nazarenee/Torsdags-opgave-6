public class Square implements Shape{

    private double sidelen;

    public Square(Double sidelen) {
        this.sidelen = sidelen;
    }




    @Override
    public double getArea(){
        return sidelen*sidelen;

    }

}
