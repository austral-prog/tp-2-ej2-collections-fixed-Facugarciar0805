package com.collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Arrays;

public class Sets {

    private static final Set<String> ALCOHOLS = new HashSet<>(Arrays.asList("whiskey", "whisky", "white rum", "dark rum", "bourbon", "rye", "scotch", "vodka",
            "tequila", "gin", "dry vermouth", "sweet vermouth", "prosecco","aperol", "brandy", "mezcal",
            "triple sec", "coffee liqueur", "almond liqueur", "champagne", "orange curacao", "rum"));
    public static String checkDrinks(String name, List<String> ingredients) {
        boolean found = false;
        for(String alcohol: ALCOHOLS) {
            for (String ingredient : ingredients) {
                if (alcohol.equals(ingredient)) {
                    found = true;
                    break;
                }
            }
        }
            if (found) {
                return name + " Cocktail";
            }
            else {
                return name + " Mocktail";
            }

    }

}
