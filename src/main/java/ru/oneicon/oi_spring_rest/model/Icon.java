package ru.oneicon.oi_spring_rest.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Icon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String description;
    private String size;
    private String gilding;
    private Integer isArk;
    private Double price;
    private String imageUrl;
    private String style;
    private String age;


    @Column(nullable = false, updatable = false)
    private String iconCode;


    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "icon_id")
    private Category category;

    public Icon() {
    }

    public Icon(String name, String description, String size, String gilding, Integer isArk,
                Double price, String imageUrl, String style, String age, Category category, String iconCode ) {
        this.name = name;
        this.description = description;
        this.size = size;
        this.gilding = gilding;
        this.isArk = isArk;
        this.price = price;
        this.imageUrl = imageUrl;
        this.style = style;
        this.age = age;
        this.category = category;
        this.iconCode = iconCode;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGilding() {
        return gilding;
    }

    public void setGilding(String gilding) {
        this.gilding = gilding;
    }

    public Integer getIsArk() {
        return isArk;
    }

    public void setIsArk(Integer isArk) {
        this.isArk = isArk;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getIconCode() {
        return iconCode;
    }

    public void setIconCode(String iconCode) {
        this.iconCode = iconCode;
    }

    @Override
    public String toString() {
        return "Icon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", size='" + size + '\'' +
                ", gilding='" + gilding + '\'' +
                ", isArk=" + isArk +
                ", price=" + price +
                ", imageUrl='" + imageUrl + '\'' +
                ", style='" + style + '\'' +
                ", age='" + age + '\'' +
                ", category=" + category +
                '}';
    }
}
