package org.example.Task2.iShop;

import java.util.ArrayList;
import java.util.List;
import org.example.Task2.Exceptions.NonExistentCustomerException;
import org.example.Task2.Exceptions.NonExistentProductException;
import org.example.Task2.Exceptions.NegativeQuantityException;

public class Shop {
    private List<Customer> customers;
    private List<Product> products;
    private List<Order> orders;

    public Shop() {
        customers = new ArrayList<>();
        products = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void placeOrder(Customer customer, String productName, int quantity)
        throws NonExistentCustomerException, NonExistentProductException, NegativeQuantityException {

        if (!customers.contains(customer)) {
            throw new NonExistentCustomerException("Customer does not exist");
        }

        Product product = getProductByName(productName);

        if (product == null) {
            throw new NonExistentProductException("Product does not exist");
        }
        if (quantity <= 0) {
            throw new NegativeQuantityException("Quantity should be a positive number");
        }

        Order order = new Order(customer, product, quantity);
        orders.add(order);
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public int getTotalOrders() {
        return orders.size();
    }

}
