import cloths.Beret;
import cloths.Hat;
import cloths.Jacket;
import cloths.Pants;
import exceptions.ClothingException;
import exceptions.InvalidStyleException;
import fashion.FashionSociety;
import fashion.SewingKit;
import kents.Brykun;
import kents.Kaligula;
import kents.Pegasik;

public class Main {

    public static void main(String[] args) {
        try {
            Kaligula kaligula = new Kaligula("kents.Kaligula");
            Brykun brykun = new Brykun("kents.Brykun");
            Pegasik pegasik = new Pegasik("kents.Pegasik");

            SewingKit sewingKit = new SewingKit();
            Pants pants1 = new Pants(100, 50);
            Jacket jacket = new Jacket(60);
            Hat hat = new Hat("green-yellow");

            kaligula.wear(pants1);
            kaligula.wear(jacket);

            // Преобразование шляпы в берет
            Beret beret = hat.convertToBeret();
            pegasik.wear(beret);
            beret.addDecoration("feather");

            // Создание общества моды
            FashionSociety fashionSociety = new FashionSociety();
            fashionSociety.addMember(kaligula);
            fashionSociety.addMember(brykun);
            fashionSociety.addMember(pegasik);

            // Организация встречи общества моды
            fashionSociety.organizeMeeting();

        } catch (ClothingException e) {
            System.err.println("Checked Exception: " + e.getMessage());
        } catch (InvalidStyleException e) {
            System.err.println("Unchecked Exception: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
