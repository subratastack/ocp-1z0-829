package sealedclasses;

sealed class Car permits Ford, Renault, Fiat {}

// cannot be further extended
final class Ford extends Car {}

// can be extended by any class
non-sealed class Renault extends Car {}

// can be extended, but only by Uno & Punto
sealed class Fiat extends Car permits Uno, Punto {}

final class Uno extends Fiat {}
final class Punto extends Fiat {}

public class SealedClasses {
}
