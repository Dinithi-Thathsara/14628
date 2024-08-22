public class Square implements Shape{
    //Implement concrete class for square
    private int sideLength;

    public Square (int sideLength){
        this.sideLength = sideLength;
    }

    //draw method to print the shape using star

    public void draw(){
        for (int i = 0; i < sideLength; i++){
            for (int j = 0; j < sideLength; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
