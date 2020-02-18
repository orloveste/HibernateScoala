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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
