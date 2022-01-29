package company.cars;

import company.enums.CarsType;

public class Products {

    private int id;
    private String name;
    private String model;
    private int quantity;
    private int price;
    private CarsType type;

    public Products(int id, String name, String model, int quantity, int price, CarsType type){
        this.id = id;
        this.name = name;
        this.model = model;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Products product = (Products) o;

        if (id != product.id) {
            return false;
        }
        if (price != product.price) {
            return false;
        }
        if (name != null ? !name.equals(product.name) : product.name != null) {
            return false;
        }
        return type == product.type;
    }

    @Override
    public String toString() {
        return "Car " +
                "id=" + id +
                ", name=" + name + '\'' +
                ", model='" + model + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", engine=" + type +
                '}';
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getModel(){return model;}
    public void setModel(String model){this.model = model;}

    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    public CarsType getType(){return type;}
    public void setType(CarsType type){this.type = type;}

}
