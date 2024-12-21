package cloths;

public class Hat implements Clothing {
    private String color;

    public Hat(String color) {
        this.color = color;
    }

    public Beret convertToBeret() {
        System.out.println("Converting hat to beret...");
        return new Beret(color);
    }

    @Override
    public void changeLength(int newLength) {
        // Шляпа не имеет длины
    }

    @Override
    public void changeWidth(int newWidth) {
        // Шляпа не имеет ширины
    }

    @Override
    public String toString() {
        return "cloths.Hat (color: " + color + ")";
    }
}
