package HQL;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT") //todo else
public class Product {
    private long id;
    private String name;
    private String description;
    private float price;

    private Category category;

    public Product(){
    }

    public Product(String name, String description, float price, Category category){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    @Id
    @Column (name = "PRODUCT_ID") //todo else
    @GeneratedValue
    public long getId(){//todo else
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID") //todo else
    public Category getCategory(){ //todo else
        return category;
    }

    public void setId(long id) {
        this.id = id;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
