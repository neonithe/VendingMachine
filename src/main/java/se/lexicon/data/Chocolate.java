package se.lexicon.data;

public class Chocolate extends Product{

        private String lightOrDark;
        private String contain;


    public Chocolate(int stock, int price, String name, int size, int calories, String lightOrDark, String contain) {
        super(stock, price, name, size, calories);
        this.lightOrDark = lightOrDark;
        this.contain = contain;
    }

    public String getLightOrDark() {
        return lightOrDark;
    }

    public void setLightOrDark(String lightOrDark) {
        this.lightOrDark = lightOrDark;
    }

    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }

    @Override
    public String examine(){
        return super.toString() +"\nChocolate: " + "Milk or dark: " + lightOrDark + ", Contains: " + contain;
    }

    @Override
    public String use(){
        return "You have now bought a chocolate, and it was delicious!";
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "lightOrDark='" + lightOrDark + '\'' +
                ", contain='" + contain + '\'' +
                '}';
    }
}
