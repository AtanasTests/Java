package methods.constructors;

public class ComputerDemo {

    public static void main(String[] args) {

        Computer Asrocok = new Computer("Asrocok", 2015, 1500, 516, 2200);


        Computer Ibm = new Computer("Ibm", 2010, 800, true, 126, 1100, "Linux");

        Computer Lenovo = new Computer();
        Lenovo.model = "Lenovo";
        Lenovo.price = 1100;
        Lenovo.freeMemory = 150;


        String newOperationSystemIsChange = "Windows";
        double usedmemory = 100;

        Ibm.changeOperationSystem(newOperationSystemIsChange);
        Asrocok.useMemory(usedmemory);
        System.out.println(Asrocok.model + " 's free memory is " + Asrocok.freeMemory);

        System.out.println(Asrocok.comparePrice(Ibm));
        System.out.println("The price of Asrocok is higher then Ibm!");

        System.out.println(Ibm.comparePrice(Lenovo));
        System.out.println("The price of Ibm is lower then Lenovo!");

        System.out.println(Lenovo.comparePrice(Asrocok));
        System.out.println("The price of Lenovo is lower then Asrocok!");

    }
}
