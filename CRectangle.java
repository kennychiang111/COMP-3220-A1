/**
 * Class representing a rectangle, which is a shape.
 */
class CRectangle extends CShape {
    
    //Initialize the private variables for the rectangle
    protected int length;
    protected int width;

    //Set the private variable to the desided variables
    public CRectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    //Display the rectangle
    @Override
    public String display() {
        return String.format("RECTANGLE %dx%d", length, width);
    }
}
