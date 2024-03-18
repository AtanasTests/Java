package classes.fields.methods;

public class Computer {
    int year;
    double price;
    boolean isNotebook;
    int hardDiskMemory;
    double freeMemory;
    String operationSystem;


    void changeOperationSystem(String newOperationSystem){
        operationSystem = newOperationSystem;
        System.out.println("The operation system is " + newOperationSystem);
    }

    void useMemory(double memory) {
        if (memory > freeMemory) {
            System.out.println("Not enough memory!");
        } else {
            freeMemory = freeMemory - memory;
            System.out.println("Using memory is " + memory);
        }
    }

    void displayComputerFields(){
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Hard Disk Memory: " + hardDiskMemory);
        System.out.println("Free Memory: " + freeMemory);
        System.out.println("Operation System: " + operationSystem);
        System.out.println("Is Notebook: " + isNotebook);
        System.out.println();
    }
}
