package fashion;

import java.util.ArrayList;
import java.util.List;

public class FashionSociety {
    private List<Fashionista> members;

    public FashionSociety() {
        members = new ArrayList<>();
    }

    public void addMember(Fashionista fashionista) {
        members.add(fashionista);
        System.out.println(fashionista.name + " joined the fashion society.");
    }

    public void organizeMeeting() {
        System.out.println("Organizing a meeting for the fashion society.");
        for (Fashionista member : members) {
            member.lookInMirror();
        }
    }
}
