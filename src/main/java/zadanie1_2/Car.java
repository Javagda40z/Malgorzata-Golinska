package zadanie1_2;

public class Car {

    private String brand;
    private String model;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String brand, String model) {
        this.model = model;
        this.brand = brand;
    }



    public String description() {
        return "car [" + brand + " " + model + "]";
    }
}
