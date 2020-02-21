package HQL;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "ORDERS") //toDo else
public class Orders {
    private int id;
    private String customerName;
    private Date purchaseDate;
    private float amount;
    private Product product;

    @Id
    @Column(name = "ORDER_ID") //toDo else
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "CUSTOMER_NAME") //toDo else
    public String getCustomerName() { //toDo else
        return customerName;
    }

    @Column(name = "PURCHASE_DATE") //toDo else
    @Temporal(TemporalType.DATE)
    public Date getPurchaseDate() { //toDo else
        return purchaseDate;
    }


    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID") //toDo else
    public Product getProduct() { //toDo else
        return product;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
