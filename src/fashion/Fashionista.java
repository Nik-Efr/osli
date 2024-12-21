package fashion;

import cloths.Clothing;
import exceptions.ClothingException;

import java.util.ArrayList;
import java.util.List;

public abstract class Fashionista {
    protected String name;
    protected List<Clothing> clothing;

    public Fashionista(String name) {
        this.name = name;
        this.clothing = new ArrayList<>();
    }

    public abstract void wear(Clothing clothing) throws ClothingException;

    public void lookInMirror() {
        System.out.println(name + " is looking in the mirror.");
    }

    @Override
    public String toString() {
        return "fashion.Fashionista: " + name;
    }
}
