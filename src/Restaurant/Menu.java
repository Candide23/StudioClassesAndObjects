package src.Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList <MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdate;

    public Menu() {
        this.lastUpdate = lastUpdate;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void addMenuItem( MenuItem item) {
        this.menuItems.add(item);
        this.lastUpdate = lastUpdate;
    }

    public void removeMenuItem( MenuItem item) {
        this.menuItems.remove(item);
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
