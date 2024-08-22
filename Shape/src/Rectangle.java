public class Rectangle implements Shape{
    //Implement concrete class for rectangle
    private int length;
    private int width;

    public Rectangle(int width, int length){
        this.length = length;
        this.width = width;
    }

    //draw method to print the shape using star

    public void draw(){
        for (int i = 0; i < width; i++){
            for(int j = 0; j < length; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
