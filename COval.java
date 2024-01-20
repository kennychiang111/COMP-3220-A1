/**
 * Class representing an oval, which is a shape.
 */
class COval extends CShape {

    //Initialize private varaibles
    protected int horizontalRadius;
    private int verticalRadius;

    //Set the private variables to the wanted ones
    public COval(int horizontalRadius, int verticalRadius) {
        super();
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;
    }

    //display the oval
    @Override
    public String display() {
        return String.format("OVAL %dx%d", horizontalRadius, verticalRadius);
    }
    
}
