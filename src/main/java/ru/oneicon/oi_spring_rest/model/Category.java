package ru.oneicon.oi_spring_rest.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private Collection<Icon> icon;

    public Category() {
    }

    public Category(Long id, String name, String description, Collection<Icon> icon) {
        this.name = name;
        this.description = description;
        this.icon = icon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Collection<Icon> getIcon() {
        return icon;
    }

    public void setIcon(Collection<Icon> icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
