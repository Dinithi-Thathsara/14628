public class ShapeFactory {
    public  static Shape getShape (String shapeType){

        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square(5); //size
        }
        else if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle(10);//radius
        }
        else if(shapeType.equalsIgnoreCase("TRIANGLE")){
            return new Triangle(4);

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle(4,6);

        }
        else {
            System.out.println("Invalid shape type provided");
        }

        return null;


    }
}
