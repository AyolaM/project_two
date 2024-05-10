package com.skillstorm.project_2.models;
// import jakarta.persistance.*;
// import jakarta.validation*;
//table name == SHOE
//@entity
public class Products {
    static int counter;
    private int quantity;
    private int productId;
    //notnull, @min(0)
    private double price;
    private String color;
    //not null
    private Warehouses locationId; //one to many annotate
    private String description;

    //@Enumerated(EnumType.STRING)
    private ProductType shoeType;


    public Products(){}
    
    public Products(double price, String color, ProductType shoeType, Warehouses locationId, String description){
    this.quantity = ++counter;
    this.productId = ++counter;
    this.price = price;
    this.color = color;
    this.shoeType = shoeType;
    this.description= description;
}

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Products.counter = counter;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ProductType getShoeType() {
        return shoeType;
    }

    public void setShoeType(ProductType shoeType) {
        this.shoeType = shoeType;
    }

    public Warehouses getLocationId() {
        return locationId;
    }

    public void setLocationId(Warehouses locationId) {
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return "Products [quantity=" + quantity + ", productId=" + productId + ", price=" + price + ", color=" + color
                + ", shoeType=" + shoeType + ", locationId=" + locationId + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + quantity;
        result = prime * result + productId;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((shoeType == null) ? 0 : shoeType.hashCode());
        result = prime * result + ((locationId == null) ? 0 : locationId.hashCode());
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
        Products other = (Products) obj;
        if (quantity != other.quantity)
            return false;
        if (productId != other.productId)
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (shoeType != other.shoeType)
            return false;
        if (locationId == null) {
            if (other.locationId != null)
                return false;
        } else if (!locationId.equals(other.locationId))
            return false;
        return true;
    }


    }
