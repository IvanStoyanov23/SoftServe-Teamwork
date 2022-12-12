public class ShredFish extends Fish{
  double whiskerLength;

  public ShredFish(String fish, int weight, double whiskerLength) {
    super(fish, weight);
    this.whiskerLength = whiskerLength;
  }

  public double getWhiskerLength() {
    return whiskerLength;
  }

  public void setWhiskerLength(double whiskerLength) {
    this.whiskerLength = whiskerLength;
  }
}
