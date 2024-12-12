package dojo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CocktailSteps {
    private Order order;

    // Paramétrer le nom de la personne qui veut acheter un verre
    @Given("{string} who wants to buy a drink")
    public void declareOwner(String owner) {
        order = new Order();
        order.declareOwner(owner); // Le nom de la personne qui veut acheter un verre est paramétré
    }

    // Paramétrer la personne pour qui l'on commande le verre
    @When("an order is declared for {string}")
    public void declareTarget(String target) {
        order.declareTarget(target); // Le nom de la personne pour qui la commande est faite est paramétré
    }

    // Ajouter des cocktails à la commande
    @When("{string} adds {int} cocktail(s) to the order")
    public void addCocktails(String owner, Integer count) {
        order.declareOwner(owner); // Déclare le propriétaire de la commande, même si ce n'est pas nécessaire dans
                                   // le contexte.
        order.addCocktails(count); // Ajoute les cocktails à la commande
    }

    // Vérifier qu'il n'y a pas de cocktails dans la commande
    @Then("there is {int} cocktail(s) in the order")
    public void verifyCocktails(int expectedCount) {
        List<String> cocktails = order.getCocktails(); // Récupère la liste des cocktails dans la commande
        assertEquals(expectedCount, cocktails.size()); // Vérifie que la taille de la liste correspond au nombre attendu
    }

}
