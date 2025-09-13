public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        CarBuilder builder = new ConcreteCarBuilder();
        Car car = director.constructBMW(builder);
        System.out.println("Constructed Car: " + car);
}}