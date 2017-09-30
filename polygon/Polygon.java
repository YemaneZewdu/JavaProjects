
package polygon;

/**
 *
 * @author yemane
 */
public class Polygon {


    public static void main(String[] args) {
        RegularPolygon obj1 = new RegularPolygon();
        RegularPolygon obj2 = new RegularPolygon(6, 4);
        RegularPolygon obj3 = new RegularPolygon(10, 4, 5.6, 7.8);      
         obj1.getSideLenght();
        obj1.getXCOrdinate();
        obj1.getYCOrdinate();
        obj2.getSideLenght();
        obj2.getXCOrdinate();
        obj2.getYCOrdinate();
        obj3.getSideLenght();
        obj3.getXCOrdinate();
        obj3.getYCOrdinate();
       System.out.println("The Perimeter of " + obj1.getSideNum() + " sided polygon is " + obj1.getPerimeter());
       System.out.println("The area of this polygon is " + obj1.getArea());
       System.out.println("\n\nThe Perimeter of " + obj2.getSideNum() + " sided polygon is "+ obj2.getPerimeter());
       System.out.println("The area of this polygon is " + obj2.getArea());
       System.out.println("\n\nThe Perimeter of " + obj3.getSideNum() + " sided polygon is " + obj3.getPerimeter());
       System.out.println("The area of this polygon is " + obj3.getArea());
    }    
}
class RegularPolygon{
private int n = 3;
private double side = 1;
private double x = 0.0;
private double y = 0.0;
public RegularPolygon(){
    n = 5;
    side = 5;
    x = 2.5;
    y = 2.5;    
}
public RegularPolygon(int sideNo, int sideLength){ // Parametrized Constructor
    n = sideNo;
    side = sideLength;
}
public RegularPolygon(int sideNo, int sideLength, double xCo, double yCo){ // Parametrized Constructor
    n = sideNo;
    side = sideLength;
    x = xCo;
    y = yCo;    
}
void setSideNum(){
}
int getSideNum(){
    return n;
}
void setSideLenght(){
}

double getSideLenght(){
return side;
}
void setXCOrdinate(){
}

double getXCOrdinate(){
return x;
}
void setYCOrdinate(){
}
double getYCOrdinate(){
  return y;
}
int getPerimeter(){
    int perimeter=0;
    for (int i=0; i< n; i++){
     perimeter += n;          
    }
    return perimeter;
}
double getArea(){
double Area;
final double Pi= 3.14;
Area = (n * side * side)/ (4 * Math.tan(Pi/n));
return Area;
}
}
