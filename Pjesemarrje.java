public class Pjesemarrje {
    private Person person;
    private Mbledhje mbledhje;

    public Pjesemarrje(Person person, Mbledhje mbledhje) {
        this.person = person;
        this.mbledhje = mbledhje;
    }

    public Person getPerson() {
        return person;
    }

    public Mbledhje getMbledhje() {
        return mbledhje;
    }
}