public class Carp extends Fish{
    string color;

    public Carp(String fish, int weight, string color) {
        super(fish, weight);
        this.color = color;
    }

    public string getColor() {
        return color;
    }

    public void setColor(string color) {
        this.color = color;
    }
}
