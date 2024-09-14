class Rectangle{

double width;
double height;
Rectangle(double w, double h)
{

 width= w;
 height= h;

}
void area()
{
    System.out.println(width * height);
}




}



public class Example {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle(1, 2);
        rectangle.area();
        
        
    }


    
}
