package se.lexicon.data;

public class Soda extends Product{

        private String lightOrNot;
        private String carbonated;


    public Soda(int stock, int price, String name, int size, int calories, String lightOrNot, String carbonated) {
        super(stock, price, name, size, calories);
        setLightOrNot(lightOrNot);
        setCarbonated(carbonated);

    }

    public String getLightOrNot() {
        return lightOrNot;
    }

    public void setLightOrNot(String lightOrNot) {
        this.lightOrNot = lightOrNot;
    }

    public String getCarbonated() {
        return carbonated;
    }

    public void setCarbonated(String carbonated) {
        this.carbonated = carbonated;
    }



    @Override
    public String examine(){
        return super.toString() + "\nSoda: " + "Light or regular: " + lightOrNot + ", Carbonated: " + carbonated;
    }

    @Override
    public String use(){
        return "You have now bought a soda, and it was delicious!";
    }

    @Override
    public String toString() {
        return super.toString() + "\nSoda: " + "Light or regular: " + lightOrNot + ", Carbonated: " + carbonated;
    }
}
