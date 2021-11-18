
import java.util.ArrayList;

public class Drawer {

    DrawerType drawerType;
    private int price;
    private ArrayList<Product> product;

    public Drawer(DrawerType drawerType) {
        this.drawerType = drawerType;
        this.price = 0;
        this.product = new ArrayList<>();
    }

    public DrawerType getDrawerType() {
        return drawerType;
    }

    public int getPrice() {
        return price;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }
}
