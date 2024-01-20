/**
 * Abstract class representing a shape.
 */
abstract class CShape {
    protected static int counter = 0; // static counter for unique IDs
    protected int id; //Set the id for the shape

    //increment the counter of the number of shapes
    public CShape() {
        this.id = ++counter;
    }

    //abstract method to display the shape
    public abstract String display();
}
