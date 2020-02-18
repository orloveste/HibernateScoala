package HQL;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CATEGORY")
public class Category {
    private long id;
    private String name;

    private Set<Product>products;

    public Category(){

    }

    public Category(String name){
        this.name = name;
    }

    @Id
    @Column(name = "CATEGORY_ID")
    @GeneratedValue
    public  long getId(){
        return id;
    }

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    public Set<Product> getProducts(){
        return products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
