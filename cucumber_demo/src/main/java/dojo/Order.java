package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String owner; // La personne qui veut acheter un verre
    private String target; // La personne pour qui on commande
    private List<String> cocktails; // Liste des cocktails dans la commande
    private String message; // Message ajouté à la commande

    // Constructeur
    public Order() {
        this.cocktails = new ArrayList<>();
    }

    // Déclare le propriétaire de la commande
    public void declareOwner(String owner) {
        this.owner = owner;
    }

    // Déclare la cible de la commande
    public void declareTarget(String target) {
        this.target = target;
    }

    // Ajoute un certain nombre de cocktails à la commande
    public void addCocktails(int count) {
        for (int i = 0; i < count; i++) {
            cocktails.add("Cocktail " + (i + 1)); // Ajouter un cocktail à la liste
        }
    }

    // Retourne la liste des cocktails
    public List<String> getCocktails() {
        return cocktails;
    }

    // Ajoute un message à la commande
    public void addMessage(String message) {
        this.message = "From " + this.owner + " to " + this.target + ": " + message; // Formate le message
    }

    // Retourne le message du ticket
    public String getMessage() {
        return message;
    }
}
