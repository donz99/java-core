package homework.lesson711;

public class HeavyBox extends Box {
    private int weight;

    public HeavyBox() {
        super(new SomeClass());
    }

    public HeavyBox(double width, double height, double depth, int weight) {

        super(width, height, depth);
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int Weight){
        this.weight = weight;
    }
}
