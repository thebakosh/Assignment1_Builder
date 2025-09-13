public class ConcreteCarBuilder implements CarBuilder {
    private String model;
    private int year;
    private String color;

    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Car build() {
        return new Car(model, year, color);
    }
}
