package prak8;

public class Main {
    public static void main(String[] args) {
      // todo...
      Owner owner1 = new Owner("Aba");
      Car car1 = new Car(owner1, "Honda W-RV", 2022, 6500.0);
      car1.data();
      Owner owner2 = new Owner("Abi");
      Car car2 = new Car(owner2, "Honda C-RV", 2019, 6000.0);
      car2.data();
      Owner owner3 = new Owner("Abu");
      Car car3 = new Car(owner3, "Honda H-RV", 2022, 10500.0);
      car3.data();
      Owner owner4 = new Owner("Nau");
      Car car4 = new Car(owner4, "Toyota Innova", 2020, 5500.0);
      car4.data();
    }
  }
  
