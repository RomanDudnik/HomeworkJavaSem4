package org.example.Task2;

import org.example.Task2.Exceptions.NonExistentCustomerException;
import org.example.Task2.Exceptions.NonExistentProductException;
import org.example.Task2.Exceptions.NegativeQuantityException;
import org.example.Task2.iShop.Customer;
import org.example.Task2.iShop.Product;
import org.example.Task2.iShop.Shop;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();

        Customer customer1 = new Customer("Mike");
        Customer customer2 = new Customer("Anna");

        shop.addCustomer(customer1);
        shop.addCustomer(customer2);

        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Phone", 500);

        shop.addProduct(product1);
        shop.addProduct(product2);

        try {
            shop.placeOrder(customer1, "Laptop", 2);
            shop.placeOrder(customer2, "Phone", 3);
            shop.placeOrder(customer1, "Tv", 1); // NonExistentProductException
            shop.placeOrder(new Customer("Alex"), "Laptop", 1); // NonExistentCustomerException
            shop.placeOrder(customer2, "Phone", -1); // NegativeQuantityException
        } catch (NonExistentCustomerException e) {
            System.out.println("Non-existent customer: " + e.getMessage());
        } catch (NonExistentProductException e) {
            System.out.println("Non-existent product: " + e.getMessage());
        } catch (NegativeQuantityException e) {
            System.out.println("Invalid quantity: " + e.getMessage());
        }
        System.out.println("Total orders: " + shop.getTotalOrders());
    }
}
