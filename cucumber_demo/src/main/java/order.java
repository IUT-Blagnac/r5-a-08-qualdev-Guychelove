package main.java;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> cocktails;

    public Order() {
        this.cocktails = new ArrayList<>();
    }

    public List<String> getCocktails() {
        return cocktails;
    }

    public void addCocktail(String cocktail) {
        cocktails.add(cocktail);
    }
}
