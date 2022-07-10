
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object object){
        if(this==object){
            return true;
        }
        if(!(getClass() == object.getClass())){
            return false;
        }
        Item itemToCompare = (Item) object;
        if(!(this.name.equals(itemToCompare.name))){
            return false;
        }
        //if(!(this.weight == itemToCompare.weight)){
        //    return false;
        //}
        return true;

    }
    //@Override
    public int hashCode(){
        return this.name.hashCode();
    }

}
