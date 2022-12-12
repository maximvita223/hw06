
public class notebooks {

    private String brand;
    private int memory;
    private int cache;
    private String os;
    private String color;
    private int price;
    public notebooks(String brand, int memory, int cache, String os, String color, int price) {
        this.brand = brand;
        this.memory = memory;
        this.cache = cache;
        this.os = os;
        this.color = color;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public int getCache() {
        return cache;
    }
    public void setCache(int cache) {
        this.cache = cache;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "notebooks [brand=" + brand + ", memory=" + memory + ", cache=" + cache + ", os=" + os + ", color="
                + color + ", price=" + price + "]";
    }
}