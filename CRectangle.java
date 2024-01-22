/**
 * @author Kenny Chiang
 * @version 1.0
 * 
 * Class representing a rectangle, which is a shape.
 */
class CRectangle extends CShape {
    
    /**Initialize the variables for the rectangle */
    protected int length;
    protected int width;

    /**Set the variable to the desided variables
     * @param length
     * @param width
     */
    public CRectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    /** Method to display the rectangle
     *  @return String
     */
    @Override
    public String display() {
        return String.format("RECTANGLE %dx%d", length, width);
    }
}
