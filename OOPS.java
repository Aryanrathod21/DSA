class Pen {

    String color;
    String type;

    public void printPen(){
        System.out.println("pen color is : "+this.color);
        System.out.println("pen type is : "+this.type);
        System.out.println(" ");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();

        pen1.color = "Black";
        pen1.type = "Gel";

        pen2.color = "Blue";
        pen2.type = "BallPoint";

        pen1.printPen();
        pen2.printPen();
    }
}
