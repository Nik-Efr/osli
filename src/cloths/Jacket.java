package cloths;

public class Jacket implements Clothing {
    private int sleeveLength;

    public Jacket(int sleeveLength) {
        this.sleeveLength = sleeveLength;
    }


    @Override
    public void changeLength(int newLength) {
        this.sleeveLength = newLength;
        System.out.println("Sleeve length changed to " + newLength);
    }

    @Override
    public void changeWidth(int newWidth) {
        // For jacket, width does not change in this context.
        System.out.println("cloths.Jacket width does not change.");
    }

    @Override
    public String toString() {
        return "cloths.Jacket (sleeve length: " + sleeveLength + ")";
    }
}
