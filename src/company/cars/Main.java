package company.cars;

import company.enums.CarsType;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Products product = new Products(1, "Audi", "A4", 2, 14000, CarsType.Diesel);
        Products product1 = new Products(2, "Audi", "Q7", 5, 30000, CarsType.Gasoline);
        Products product2 = new Products(3, "Audi", "E-tron", 1, 60000, CarsType.Electric);
        Products product3 = new Products(4, "BMW", "320", 10, 15000, CarsType.Diesel);
        Products product4 = new Products(5, "BMW", "x5", 3, 70000, CarsType.Gasoline);
        Products product5 = new Products(6, "BMW", "i3", 15, 12000, CarsType.Electric);
        Products product6 = new Products(7, "Mercedes", "E-class", 20, 90000, CarsType.Gasoline);
        Products product7 = new Products(8, "Mercedes", "Vito", 2, 19000, CarsType.Diesel);
        Products product8 = new Products(9, "Mercedes", "EQC", 1, 100000, CarsType.Electric);

        Products [] products = {product,product1,product2,product3, product4, product5, product6, product7, product8};
        Products [] quantitymore10 = new Products[products.length];
        Products [] electric = new Products[products.length];
        Products [] audi = new Products[products.length];

        int lessThan20kPrice = 0;
        int withMercedesName = 0;

        for (int i = 0; i< products.length; i++){
            if (products[i].getType().equals(CarsType.Electric)){
                electric[i] = products[i];
            }
            if (products[i].getName().equals("Audi")) {
                audi[i] = products[i];
            }
            if (products[i].getQuantity() > 10){
                quantitymore10[i] = products[i];
            }
            if (products[i].getPrice() < 20000){
                lessThan20kPrice = lessThan20kPrice + 1;
            }
            if (products[i].getName().matches("(.*)Merc(.*)")){
                withMercedesName = withMercedesName + 1;
            }


        }
        System.out.println(" ");
        System.out.println("Electric cars = " + Arrays.toString(electric));
        System.out.println(" ");
        System.out.println("Audi cars = " + Arrays.toString(audi));
        System.out.println(" ");
        System.out.println("Cars with count more than 10 = " + Arrays.toString(audi));
        System.out.println(" ");
        System.out.println("How much cars with price less than 20k = " + lessThan20kPrice);
        System.out.println(" ");
        System.out.println("How much cars with 'Merc' words = " + withMercedesName);
        System.out.println(" ");







    }
}

