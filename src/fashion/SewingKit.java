package fashion;

import cloths.Clothing;
import exceptions.ClothingException;

public class SewingKit {

    public void sewClothing(Fashionista fashionista, Clothing clothingItem) {
        try {
            System.out.println(fashionista.name + " is sewing clothing...");
            fashionista.wear(clothingItem);
        } catch (ClothingException e) {
            System.err.println("exceptions.ClothingException: " + e.getMessage());
        }
    }
}
