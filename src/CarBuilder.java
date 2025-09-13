public interface CarBuilder {
    CarBuilder setModel(String model);
    CarBuilder setYear(int year);
    CarBuilder setColor(String color);
    Car build();
}