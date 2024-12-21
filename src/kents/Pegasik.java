package kents;

import cloths.Clothing;
import exceptions.ClothingException;
import fashion.Fashionista;

public class Pegasik extends Fashionista {

    public Pegasik(String name) {
        super(name);
    }

    @Override
    public void wear(Clothing clothingItem) throws ClothingException {
        if (clothing.size() >= 5) { // Проверяем, не превышает ли количество одежды 5
            throw new ClothingException("Cannot wear more than 5 clothing items!");
        }
        clothing.add(clothingItem);
        System.out.println(name + " wore " + clothingItem);
    }
}
