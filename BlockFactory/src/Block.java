public abstract class Block {
    // Block is abstract class so it can be inherited from
    private final double weight;
    private final ResourceType type;

    public Block(ResourceType type, double weight) {
        this.type = type;
        this.weight = weight;
    }
    // Block constructor initializes type and weight
    public double getWeight() {
        return weight;
    }
    // getWeight method returns a double weight
    public ResourceType getType() {
        return type;
    }
    // getType method returns ResourceType (either type WOOD or STONE)
    @Override
    public String toString() {
        return "Block type: " + type + " Block weight: " + weight;
    }
}   // toString method to declare block type and weight