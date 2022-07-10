import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> newBox;
    public MisplacingBox(){
        this.newBox= new ArrayList<>();
    }
    public void add(Item item){
        this.newBox.add(item);
    }
    public boolean isInBox(Item item){
        return false;
    }
}
