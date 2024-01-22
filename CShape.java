/**
 * @author Kenny Chiang
 * @version 1.0
 * Abstract class representing a shape.
 */
abstract class CShape {
    protected static int counter = 0; /** static counter for unique IDs */
    protected int id; /** Set the id for the shape */

    /** Method to increment the counter of the number of shapes*/
    public CShape() {
        this.id = ++counter;
    }

    /**abstract method to display the shape*/
    public abstract String display();
}
