package Cloning;

class Store implements Cloneable{

    private String storeName;

    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Store(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public String toString() {
        return "Store{" +
                "store_name='" + storeName + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Shop implements Cloneable{

    private int shopId;
    private Store  store;

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Shop(int shopId, Store store) {
        this.shopId = shopId;
        this.store = store;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shop_id='" + shopId + '\'' +
                "store_name='" + store + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Shop shop = (Shop) super.clone();
        shop.store = (Store) store.clone();
        return shop;
    }
}

public class DeepCloning {

    public static void main(String[] args) throws CloneNotSupportedException {

        Store store = new Store("ABC");
        Shop shop = new Shop(1, store);

        System.out.println("Original Object Of Shop:: "+shop.getShopId()+" "+shop.getStore());

        Shop shop2 = (Shop) shop.clone();

        System.out.println("Cloneable Object Of Shop:: "+shop2.getShopId()+" "+shop2.getStore());

        shop2.getStore().setStoreName("KOK");

        System.out.println("Original Object Of Shop:: "+shop.getShopId()+" "+shop.getStore());
        System.out.println("Cloneable Object Of Shop:: "+shop2.getShopId()+" "+shop2.getStore());

    }


}
