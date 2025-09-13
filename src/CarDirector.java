public class CarDirector {
    public Car constructBMW(CarBuilder builder) {
        return builder.setModel("BMW M5")
                      .setYear(2017)
                      .setColor("Black")
                      .build();
    }

    public Car constructMers(CarBuilder builder) {
        return builder.setModel("Mercedes-Benz")
                        .setYear(2019)
                        .setColor("White")
                        .build();

    }



}
