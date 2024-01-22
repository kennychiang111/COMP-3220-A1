/**
 * Class representing a circle, which is a specific type of oval.
 */
class CCircle extends COval {
    //make the circle
    public CCircle(int radius) {
        super(radius, radius);
    }

    //display the circle
    @Override
    public String display() {
        return String.format("CIRCLE %d", horizontalRadius);
    }
}
