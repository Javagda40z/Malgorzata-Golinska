package obiekty;

public class Vet {
    public void sayHello(Cat cat) {
       System.out.println("Hej " + cat.getImie());
    }

    public void sayHello(Dog dog) {
        System.out.println("Hejka " + dog.getImie());
    }

    public static void main(String[] args) {
        Cat kot = new Cat("Horus");
        Dog pies = new Dog("Maksi");

        Vet weterynarz = new Vet();

        weterynarz.sayHello(kot);
        weterynarz.sayHello(pies);
    }

}
