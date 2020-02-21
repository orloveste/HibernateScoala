package HQL;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CATEGORY")//todo else
public class Category {
    private long id;
    private String name;

    private Set<Product> products;

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

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
