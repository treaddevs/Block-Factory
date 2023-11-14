public final class Const {
    // Class Const (short for constant) declares the static variables STONE_WEIGHT and WOOD_WEIGHT
    // Both variables are of primitive type double and declared with the non-access modifier final
    // The final keyword ensures their values cannot be modified
    // Their respective weight values are set to STONE_WEIGHT = 20.0 and WOOD_WEIGHT = 10.0
    // These values represents the weight required to make a block of type STONE or WOOD (which never changes)
    public static final double STONE_WEIGHT = 20.0; // static means I can say Const.STONE_WEIGHT from a different class
    public static final double WOOD_WEIGHT = 10.0; // static means I can say Const.WOOD_WEIGHT from a different class
}
