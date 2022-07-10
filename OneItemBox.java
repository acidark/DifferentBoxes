import java.util.ArrayList;
public class OneItemBox extends Box {
    private ArrayList<Item> newBox;
    public OneItemBox(){
        //super(new ArrayList<>());
        this.newBox = new ArrayList<>();
    }
    public void add(Item item){
        if(this.newBox.size() >= 1){
            return;
            //this.newBox.add(item);
        }
        this.newBox.add(item);
        //return;
    }
    public boolean isInBox(Item item){
        return this.newBox.contains(item);
    }
}
