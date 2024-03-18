package methods.constructors;

public class Computer {

    String model;
    int year;
    double price;
    boolean isNoteBook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    void changeOperationSystem(String newOperationSystem) {

        operationSystem = newOperationSystem;
        System.out.println(this.model + " new operation system is " + newOperationSystem);
    }

    void useMemory(double memory) {
        if (memory > freeMemory) {
            System.out.println("Not enough free memory!");
        } else {
            freeMemory = freeMemory - memory;
        }
    }

    Computer() {
        this.isNoteBook = false;
        this.operationSystem = "Win XP";
    }


    Computer(String model, int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        this.model = model;
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    Computer(String model, int year, double price, boolean isNoteBook, double hardDiskMemory, double freeMemory, String operationSystem) {
        this(model, year, price, hardDiskMemory, freeMemory);
        this.isNoteBook = isNoteBook;
        this.operationSystem = operationSystem;
    }

    int comparePrice(Computer otherComp) {
        if (this.price > otherComp.price) {
            return -1;
        }
        if (this.price < otherComp.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
