package classes.fields.methods;

public class ComputerDemo {

    public static void main(String[] args) {

        Computer asrock = new Computer();
        Computer ibm = new Computer();

        asrock.year = 2017;
        asrock.price = 2745;
        asrock.hardDiskMemory = 2000;
        asrock.freeMemory = asrock.hardDiskMemory;
        asrock.operationSystem = "Windows 10";
        asrock.isNotebook = false;



        ibm.year = 2009;
        ibm.price = 750;
        ibm.hardDiskMemory = 200;
        ibm.freeMemory = ibm.hardDiskMemory;
        ibm.operationSystem = "Mac";
        ibm.isNotebook = true;

        asrock.changeOperationSystem("Mac");
        ibm.useMemory(100);

        System.out.println("Computer asrock Fields:");
        asrock.displayComputerFields();

        System.out.println("Computer ibm Fields:");
        ibm.displayComputerFields();
    }
}
