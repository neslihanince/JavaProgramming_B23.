package Day38_CustomClass.RectangleTask;

public class Rectangle {

    public double length, width;

    public void setInfo(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length * width;
    }

    public double calculatePerimeter(){
        return 2 * (length+width);
    }

    public void getInfo(){
        System.out.println("width = " + width);
        System.out.println("length = " + length);
        System.out.println("Area = " + calculateArea());
        System.out.println("Perimeter = " + calculatePerimeter());
    }

    public  String toString(){
        return "Rectangle{ " + "Width : " + width +" , length: " + length + ", area :" + calculateArea() + ", perimeter : " + calculatePerimeter() + '}';
    }



}
