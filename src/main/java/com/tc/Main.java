package com.tc;
import java.util.*;
import java.io.*;

// Create Online Store App with a CLI user interface to assist users in shopping at your store

// Create "Product" class with getters setters, constructors, methods as needed
//   - ID
//   - Name
//   - Price

// Use "inventory.csv" file to load (read) store's inventory into application
// App must have a cart to track the items a customer wants to purchase:
//   - allow customers to add items to the cart
//   - if same item is added twice, simply display the item twice on cart page

// Home Screen - display a list of options to navigate storefront
//   - Show products - display everything for sale. User can enter product ID to add to cart, or type "X" to go back home
//       * When product is selected, add product to cart and go back to home screen
//   - Show cart - displays all items in customer's cart + total price + total number of items
//       * C - Check out
//       * X - go back to home screen
//   - Check Out - display total amount owed for order and prompt user for payment
//       * Assume user will pay in cash
//       * When the customer enters their payment amount, verify that it is enough to cover the cost
//           = If customer did not add enough money, return full amount back to customer
//           = If customer has enough for money, then:
//              . calculate change that is owed to customer and display
//              . print list of items sold to customer
//              . clear shopping cart
//              . go back to home screen

// Bonus:
// When a customer adds multiple items, display quantity of each item instead of repeating entries
// Remove items from cart: customer should be able to clear cart, or select specific items to remove


//   - Exit (closes app)



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}