public interface Factory {
    // The Factory interface takes a resource, produces a block, and displays inventory
    // The methods are void because the interface is only the contract
    // Once implemented, these methods will be enforced within the classes that are created
    void takeResource(Resource resource);
    Block produce();
    void displayInventory();
}
