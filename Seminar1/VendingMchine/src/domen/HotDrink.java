package domen;

/**
 * @apiNote Добавлен класс горячие напитки
 */

public class HotDrink extends Product{
    private int temperature;

    public HotDrink(long id, String name, double price, int place, int temperature) {
        super(id, name, price, place);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink [" + super.toString() +" temperature=" + temperature + "]";
    }

    
}
