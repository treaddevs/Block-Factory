public class WoodBlock extends Block {
    // The WoodBlock class inherits from its parent class Block using the extends keyword
    // The super keyword calls the constructor of the parent class and passes in the parameters for WoodBlock
    // Therefore, a WoodBlock consists of the created enum ResourceType WOOD
    // And requires the constant WOOD_WEIGHT parameter
    public WoodBlock() {
        super(ResourceType.WOOD, Const.WOOD_WEIGHT);
    }
}
