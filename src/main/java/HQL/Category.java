package HQL;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CATEGORY")//todo else
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
    @Column(name = "CATEGORY_ID")//todo else
    @GeneratedValue
    public  long getId(){//todo else
        return id;
    }

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)//todo else
    public Set<Product> getProducts(){//todo else
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
