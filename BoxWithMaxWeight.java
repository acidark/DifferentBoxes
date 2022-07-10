import java.util.ArrayList;
public class BoxWithMaxWeight extends Box {
    private int maxCap;
    //private int sum;
    private ArrayList<Item> inBox;
    public BoxWithMaxWeight(int capacity){
        this.maxCap = capacity;
        this.inBox = new ArrayList<>();
    }
    public void add(Item item){
        //this.sum+= item.getWeight();
        int sum = 0;
        for(Item itemWeight : this.inBox){
            sum+=itemWeight.getWeight();
        }
        if(!((sum+item.getWeight()) > this.maxCap)){
            this.inBox.add(item);
            sum+=item.getWeight();
        }

    }
    public boolean isInBox(Item item){
        return this.inBox.contains(item);
    }
}
