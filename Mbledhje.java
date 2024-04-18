import java.util.ArrayList;
import java.util.List;

public class Mbledhje {
    private List<Pjesemarrje> pjesemarrjes;

    public Mbledhje() {
        this.pjesemarrjes = new ArrayList<>();
    }

    public void addPjesemarrje(Pjesemarrje pjesemarrje) {
        pjesemarrjes.add(pjesemarrje);
    }

    public List<Pjesemarrje> getPjesemarrjes() {
        return pjesemarrjes;
    }
}