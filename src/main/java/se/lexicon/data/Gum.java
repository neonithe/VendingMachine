package se.lexicon.data;

public class Gum extends Product{

        private String lightOrNot;
        private String packaging;

    public Gum(int stock, int price, String name, int size, int calories, String lightOrNot, String packaging) {
        super(stock, price, name, size, calories);
        this.lightOrNot = lightOrNot;
        this.packaging = packaging;
    }

    public String getLightOrNot() {
        return lightOrNot;
    }

    public void setLightOrNot(String lightOrNot) {
        this.lightOrNot = lightOrNot;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    @Override
    public String examine(){
        return super.toString() + "Gum: " + "Light or regular: " + lightOrNot + '\'' + ", Packaging: " + packaging;
    }

    @Override
    public String use(){
        return "You have now bought a gum, keep on chewing!";
    }

    @Override
    public String toString() {
        return "Gum{" +
                "lightOrNot='" + lightOrNot + '\'' +
                ", packaging='" + packaging + '\'' +
                '}';
    }
}
