/**
 * @author Kenny Chiang
 * @version 1.0
 * 
 * Class representing a circle, which is a specific type of oval.
 */
class CCircle extends COval {
    /** Method to make the circle
     *  @param radius
     */
    public CCircle(int radius) {
        super(radius, radius);
    }

    /** Method to display the circle*/
    @Override
    public String display() {
        return String.format("CIRCLE %d", horizontalRadius);
    }
}
