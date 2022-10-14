package com.naidiuk;

import java.math.BigDecimal;
import java.util.Currency;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Elon");
        client.setSurname("Mask");

        Product product = new Product();
        product.setName("Tesla Model S Plaid");
        product.setPrice(BigDecimal.valueOf(4_861_502.82));
        product.setCurrency(Currency.getInstance("UAH"));

        ClientService clientService = new ClientService();
        clientService.addProductToClientCart(client, product);

        System.out.println(client);
    }
}