class Triangle implements Shape{
    //Implement concrete class for triangle
    private int base;

    public Triangle(int base){
        this.base = base;
    }

    //draw method to print the shape using star

    public  void draw(){
        for (int i = 1; i <= base; i++){
            for (int j = 1; j <= base - i; j++){
                System.out.print(" ");
            }
            for (int j =1; j <= 2 * i - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
