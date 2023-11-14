// This class represents WoodBlockFactory
// It defines all methods mandated by the Factory interface contract
public class WoodBlockFactory implements Factory {
    private final Resource resourceBin; // This is the inventory
    public WoodBlockFactory() {
        this.resourceBin = new Resource(0.0, ResourceType.WOOD);
    }
    // WoodBlockFactory constructor instantiates new empty resourceBin for WOOD
    @Override
    public void takeResource(Resource resource) {
        if (resource.getType() == ResourceType.WOOD) {
            resourceBin.addResource(resource.getWeight());
        }
    }
    // This method takes a resource of the correct type (type wood) and adds it to the resourceBin
    // Alternatively:
    // double weight = resource.getWeight();
    // resourceBin.addResource(weight);

    @Override
    public Block produce() {
        try {
            resourceBin.subtractResource(Const.WOOD_WEIGHT);
        } catch (IllegalArgumentException e) {
            return null;
        }
        return new WoodBlock();
    }
    // Required:
    // -Account for situations where your factory attempts to produce a block but has insufficient weight
    // -Make sure to use a try catch statement in this method
    // -System will return null if there is insufficient weight in the bin, otherwise it will return a wood block object
    /*
    @Override
    public Block produce() {
        if (resourceBin.getWeight() < Const.WOOD_WEIGHT) {
            return null;
        }
        resourceBin.subtractResource(Const.WOOD_WEIGHT);
        return new WoodBlock();
    }
     */
    @Override
    public void displayInventory() {
        System.out.println(resourceBin.getWeight());
        // This method prints the weight of the resource in the resourceBin
    }
}