# abstract-factory-pattern

- **Github**: https://github.com/HoneyHanny/abstract-factory-pattern
- **Simplified Version**: https://github.com/HoneyHanny/simple-abstract-factory

## Group: Oni Fans - Factory and Abstract Factory

***

An example project to demonstrate the **Abstract Factory Design Pattern**

This project uses different kinds of stores ***Modern Store***, ***Victorian Store*** ***ArtDeco Store*** to use different kinds of Factories ***Modern Furniture Factory***, ***Victorian Furniture Factory*** or ***ArtDeco Furniture Factory***
which creates different kinds of furniture with different styles ***Modern Chair***, ***Modern Sofa***, ***Modern Coffee Table***, ***Modern Shelf***, ***Victorian Chair***, ***Victorian Sofa***, ***Victorian Coffee Table***, ***Victorian Shelf***,
***Art Deco Chair***, ***Art Deco Sofa***, ***Art Deco Coffee Table*** and ***Art Deco Shelf***.

***

### Abstract products:
- Chair
- Sofa
- CoffeeTable
- Shelf

### Concrete products:
- **Modern**
  - ModernChair
  - ModernSofa
  - ModernCoffeeTable
  - ModernShelf
- **Victorian**
  - VictorianChair
  - VictorianSofa
  - VictorianCoffeeTable
  - VictorianShelf
- **ArtDeco**
  - ArtDecoChair
  - ArtDecoSofa
  - ArtDecoCoffeeTable
  - ArtDecoShelf

### Abstract factory:
- FurnitureFactory

### Concrete factories:
- ModernFurnitureFactory
- VictorianFurnitureFactory
- ArtDecoFurnitureFactory

***
Example based on **Refactoring Guru's** example
<br>
https://refactoring.guru/design-patterns/abstract-factory
