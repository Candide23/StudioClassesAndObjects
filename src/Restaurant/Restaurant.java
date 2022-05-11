package src.Restaurant;

public class Restaurant {

    public static  void main (String[] args) {
        MenuItem items1 = new MenuItem("salad", "Delicious Green", 7.50, "Healthy", true);
        MenuItem items2 = new MenuItem("salad", "Delicious Green", 7.50, "Healthy", true);
        MenuItem items3 = new MenuItem("salad", "Delicious Green", 3.50, "Healthy", true);

        //System.out.println(items1.toString());
        //System.out.println(items1.equals(items2));
        //System.out.println(items1.equals(items3));

        Menu myMenu = new Menu();

        myMenu.addMenuItem(items1);
        myMenu.addMenuItem(items2);
        myMenu.addMenuItem(items3);

        //myMenu.removeMenuItem(items1);

        //System.out.println(myMenu);

       // myMenu.removeMenuItem(items1);

        //System.out.println(myMenu);
        System.out.println(myMenu.toString());


    }
}
