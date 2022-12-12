import java.util.ArrayList;

public class Pond  {
    enum State {poor, normal, rich}
    static void Fish(ArrayList<Fish> String){
        ArrayList<String> capacity = new ArrayList<>();
        capacity.add("Carp");
        capacity.add("ShredFish");
        Test(capacity);
    };
    static void Test( ArrayList<String> capacity){
        for(capacity :){
            capacity.obtainFish();
        }
    }
    static void getCapacity(String ArrayList<String> capacity) {
        if (capacity.size() < 5) {
            State state = State.poor;
            System.out.println(state);
        } else if (capacity.size()  >= 5 &&  capacity.size()  < 10) {
            State state = State.normal;
            System.out.println(state);
        } else  {
            State state = State.rich;
            System.out.println(state);
        }
    }

    public void obtainFish(){
        capacity++;
        System.out.println(capacity);
    };
    public void lostFish(){
        capacity--;
        System.out.println(capacity);
    };
    public void showCapacity(){
        System.out.println(capacity.size());
    };
    public void showState(){
        System.out.println(enum State);
    };

}


