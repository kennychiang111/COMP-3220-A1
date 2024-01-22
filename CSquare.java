/**
 * @author Kenny Chiang
 * @version 1.0
 * 
 * Class representing a square, which is a specific type of rectangle.
 */
class CSquare extends CRectangle {
    
    /** Method to make square
     *  @param side
     */
    public CSquare(int side) {
        super(side, side);
    }

    /** Method to display the square */
    @Override
    public String display() {
        return String.format("SQUARE %dx%d", length, width);
    }
}
