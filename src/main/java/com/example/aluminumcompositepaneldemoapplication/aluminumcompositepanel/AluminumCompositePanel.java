package com.example.aluminumcompositepaneldemoapplication.aluminumcompositepanel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table ()
public class AluminumCompositePanel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long itemId;
    private String name;
    private String Description;
    private double price;

    public AluminumCompositePanel() {
    }

    public Long getItemId() {
        return itemId;
    }
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AluminumCompositePanel{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                ", price=" + price +
                '}';
    }
}
