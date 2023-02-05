public class Trapezoid implements   Quadrilateral {

int width2;
int width;
int length;


    public void setWidth2(int width2) {
        this.width2 = width2;
    }

    public void setWidth(int width2) {
        this.width2 = width2;
    }



    @Override
    public void area() {
        System.out.println("the area of  the trapezoid is: "+((width+width2)/2)*length);
        System.out.println("-----------------------------------");

    }

    @Override
    public void perimeter() {

    }
}
