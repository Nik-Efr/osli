package cloths;

public class Beret implements Clothing {
    private String color;
    private boolean hasDecoration;

    public Beret(String color) {
        this.color = color;
        this.hasDecoration = false;
    }

    public void addDecoration(String decoration) {
        hasDecoration = true;
        System.out.println("Added " + decoration + " to the beret.");
    }

    @Override
    public void changeLength(int newLength) {
        // Берет не имеет длины
    }

    @Override
    public void changeWidth(int newWidth) {
        // Берет не имеет ширины
    }

    @Override
    public String toString() {
        return "cloths.Beret (color: " + color + ", decorated: " + hasDecoration + ")";
    }
}
