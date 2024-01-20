import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class representing a canvas, which has a list of 10 random shapes.
 */
class CCanvas {
    private List<CShape> shapes; //Initialize a list of shapes

    public CCanvas() {
        this.shapes = new ArrayList<>(); //Assign an array list to the shapes
        generateRandomShapes(); //generate random shapes
    }

    //random shape generator method
    private void generateRandomShapes() {
        Random random = new Random();

        while (shapes.size() < 10) {
            int shapeType = random.nextInt(4); // 0: oval, 1: circle, 2: rectangle, 3: square
            CShape shape;

            switch (shapeType) {
                case 0: //if oval
                    shape = new COval(random.nextInt(50) + 1, random.nextInt(50) + 1);
                    break;
                case 1: //if circle
                    shape = new CCircle(random.nextInt(50) + 1);
                    break;
                case 2: //if rectangle
                    shape = new CRectangle(random.nextInt(10) + 1, random.nextInt(10) + 1);
                    break;
                case 3: //if square
                    shape = new CSquare(random.nextInt(10) + 1);
                    break;
                default: //in case of error
                    throw new IllegalStateException("Unexpected value: " + shapeType);
            }

            //loop to add different shape to list
            if (!shapes.contains(shape)) {
                shapes.add(shape);
            }
        }
    }

    //method to print the shapes
    public void displayShapes() {
        System.out.println("Canvas has the following random shapes:\n");

        for (int i = 0; i < shapes.size(); i++) {
            System.out.println("Shape " + (i + 1) + ": " + shapes.get(i).display());
        }
    }
}
