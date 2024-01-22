/**
 * Class representing a square, which is a specific type of rectangle.
 */
class CSquare extends CRectangle {
    public CSquare(int side) {
        super(side, side);
    }

    //To dispaly the square
    @Override
    public String display() {
        return String.format("SQUARE %dx%d", length, width);
    }
}
