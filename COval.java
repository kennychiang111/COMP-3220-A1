/**
 * @author Kenny Chiang
 * @version 1.0
 * 
 * Class representing an oval, which is a shape.
 */
class COval extends CShape {

    /** Initialize varaibles*/
    protected int horizontalRadius;
    private int verticalRadius;

    /** Method to set the variables to the wanted ones
     *  @param horzintalRadius
     *  @param verticalRadius
     */
    public COval(int horizontalRadius, int verticalRadius) {
        super();
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;
    }

    /** Method to display the oval 
     * @return String
     */
    @Override
    public String display() {
        return String.format("OVAL %dx%d", horizontalRadius, verticalRadius);
    }
    
}
