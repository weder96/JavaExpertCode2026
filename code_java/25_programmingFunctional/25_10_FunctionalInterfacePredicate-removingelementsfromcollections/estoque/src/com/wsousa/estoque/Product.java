import java.math.BigDecimal;

public class Product {

    public enum Status {
        ACTIVE, INACTIVE
    }

    private String name;
    private BigDecimal price;
    private int quantity;
    private Status status = Status.ACTIVE;

    public Product(String name, BigDecimal price, int quantity) {
        super();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, BigDecimal price, int quantity, Status status) {
        this(name, price, quantity);
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Status getStatus() {
        return status;
    }

    public void deactivate() {
        status = Status.INACTIVE;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", status=" + status +
                '}';
    }

}