public class Circle implements Shape{
    //Implement concrete class for circle
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    //draw method to print the shape using star

    public void draw(){
        int r = radius;
        int diameter = 2 * r + 1;
        for (int i = 0; i < diameter; i++){
            for (int j = 0; j < diameter; j++){
                int x = i - r;
                int y = j - r;
                if (x * x + y * y <= r * r+ r* 0.8){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
