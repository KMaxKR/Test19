import service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        //First Ex
        service.getText("Hello", "world!!!");


        //Second Ex
        service.addToList(1);
        service.addToList(2);
        service.addToList(9);
        service.addToList(3);
        service.foldInt();

        service.addToList("Hello");
        service.addToList("World!!!");
        service.addToList("This");
        service.addToList("is");
        service.addToList("Java");
        service.foldString();

    }
}