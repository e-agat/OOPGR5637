package domen;

public class HotDrink extends Product{
    private double temperature;

    public HotDrink(long id, String name, double price, int place, double temperature) {
        super(id, name, price, place);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink [" + super.toString() +" temperature=" + temperature + "]";
    }

    
}
