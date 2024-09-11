package nl.han.aim.oose.dea;

import nl.han.aim.oose.dea.helpers.Product;

import java.util.List;

public class StreamsCalculateTotalCost {
    int calculateTotalCostOfAllProducts(List<Product> products) {
        // TODO: implement
        return products.stream().reduce(0, (product1, product2) -> product1 + product2 );
    }

    int calculateTotalCostOfAllGadgets(List<Product> products) {
        // TODO: implement

        return 0;
    }
}
