import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public class Fish {
    String fish;
    int weight;

    public Fish(String fish, int weight) {
        this.fish = fish;
        this.weight = weight;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fish='" + fish + '\'' +
                ", weight=" + weight +
                '}';
    }

}
