package src.Restaurant;

import java.util.Objects;

public class MenuItem {


        private String name;
        private String description;
        private Double price;
        private String category;
        private Boolean isNew;

        public MenuItem(String name, String description, Double price) {
            this.name = name;
            this.description = description;
            this.price = price;
            this.category = "Not Categorized";
            this.isNew = isNew;
        }


        public MenuItem(String name, String description, Double price, String category, Boolean isNew) {
            this.name = name;
            this.description = description;
            this.price = price;
            this.category = category;
            this.isNew = isNew;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public Boolean isNew()
        {
            return this.isNew;
        }

        public void setNew(Boolean aNew) {
            isNew = aNew;
        }


    @Override
    public boolean equals(Object obj) {
        // this first condition mean
        // does the object coming into the parameter and whatever instance
        //of the class that I'm in have the same memory address
        if (obj == this) return true;
        // if menuItem is not a MenuItem return false
        if(!(obj instanceof MenuItem)) {
            return false;
        }
        MenuItem menuItem = (MenuItem) obj;
        return Objects.equals(name, menuItem.name)
                && Objects.equals(description, menuItem.description)
                && Objects.equals(price, menuItem.price)
                && Objects.equals(category, menuItem.category)
                && Objects.equals(isNew, menuItem.isNew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, category, isNew);
    }

    // toString methode convert any object to an String
    @Override
    public String toString() {
        return "MenuItem\n" +
                "\name: " + name + '\'' +
                "\ndescription: " + description + '\'' +
                "\nprice=" + price +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}


