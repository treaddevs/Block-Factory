// This class represents StoneBlockFactory
// It defines all methods mandated by the Factory interface contract
public class StoneBlockFactory implements Factory {
    private final Resource resourceBin; // This is the inventory
    public StoneBlockFactory() {
        this.resourceBin = new Resource(0.0, ResourceType.STONE);
    }
    // StoneBlockFactory constructor instantiates new empty resourceBin for STONE
    @Override
    public void takeResource(Resource resource) {
        if (resource.getType() == ResourceType.STONE) {
            resourceBin.addResource(resource.getWeight());
        }
    }
    // This method takes a resource of the correct type (type stone) and adds it to the resourceBin
    // Alternatively:
    // double weight = resource.getWeight();
    // resourceBin.addResource(weight);

    @Override
    public Block produce() {
        try {
            resourceBin.subtractResource(Const.STONE_WEIGHT);
        } catch (IllegalArgumentException e) {
            return null;
        }
        return new StoneBlock();
    }
    // Required:
    // -Account for situations where your factory attempts to produce a block but has insufficient weight
    // -Make sure to use a try catch statement in this method
    // -System will return null if there is insufficient weight in the bin, otherwise it will return a stone block object
    /*
    @Override
    public Block produce() {
        if (resourceBin.getWeight() < Const.STONE_WEIGHT) {
            return null;
        }
        resourceBin.subtractResource(Const.STONE_WEIGHT);
        return new StoneBlock();
    }
     */

    @Override
    public void displayInventory() {
        System.out.println(resourceBin.getWeight());
        // This method prints the weight of the resource in the resourceBin
    }
}