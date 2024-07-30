public class MethodOverloading {
    
public static void main(String[] args) {
    int x = 10;
    int y = 20;

    int r = 5;

    MethodOverloading obj = new MethodOverloading();

    float area_circle = obj.area(r);
    int area_rectangle = obj.area(x,y);

System.out.println("Area of the circle is:" + area_circle);
System.out.println("Area of the rectangle is:" + area_rectangle);

}

// can have same name but different return types and/ or parameters

public static int area(int n1, int n2) {
    int result = n1 * n2;
    return result;

}


public static float area(int n) {
    float result = 3.14f*n*n;
    return result;

}


}
