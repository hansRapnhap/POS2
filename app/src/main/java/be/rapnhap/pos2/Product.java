package be.rapnhap.pos2;

public class Product {
    private String product;
    private String label;
    private String price;
    private String group;
    private String sequence;

    public Product(String product, String label, String price, String group, String sequence) {
        this.product = product;
        this.label = label;
        this.price = price;
        this.group = group;
        this.sequence = sequence;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}
