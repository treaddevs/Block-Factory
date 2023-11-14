public class StoneBlock extends Block {
    // The StoneBlock class inherits from its parent class Block using the extends keyword
    // The super keyword calls the constructor of the parent class and passes in the parameters for StoneBlock
    // Therefore, a StoneBlock consists of the created enum ResourceType STONE
    // And requires the constant STONE_WEIGHT parameter
    public StoneBlock() {
        super(ResourceType.STONE, Const.STONE_WEIGHT);
    }
}
