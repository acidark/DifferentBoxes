

public class Main {

    public static void main(String[] args) {
        // You can test your program here
        BoxWithMaxWeight coffeebox = new BoxWithMaxWeight(10);
        //Item para = new Item("para", 5);
        //Item milka = new Item("milka",5 );
        //Item chocolatina = new Item("chocolatina", 5);
        //coffeebox.add(para);
        //coffeebox.add(milka);
        //coffeebox.add(chocolatina);
        
        coffeebox.add(new Item("Saludo", 5));
        coffeebox.add(new Item("Pirkka", 5));
        coffeebox.add(new Item("Kopi luwak", 5));
        
        //System.out.println(coffeebox.isInBox(para));
        //System.out.println(coffeebox.isInBox(milka));
        //System.out.println(coffeebox.isInBox(chocolatina));
        System.out.println(coffeebox.isInBox(new Item("Saludo")));
        System.out.println(coffeebox.isInBox(new Item("Pirkka")));
        System.out.println(coffeebox.isInBox(new Item("KOpi luwak")));
        
        Item first = new Item("Rock", 5);
        Item second = new Item("Rock", 1);
        System.out.println(first.hashCode());
        System.out.println(second.hashCode());
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));
        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));

        MisplacingBox niubox = new MisplacingBox();
        niubox.add(new Item("Saludo", 5));
        niubox.add(new Item("pirkka", 5));
        System.out.println(niubox.isInBox(new Item("Saludo")));
        System.out.println(niubox.isInBox(new Item("pirkka")));
    }
}
