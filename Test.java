public class Test {
        public static void main(String[] args) {
            Person person1 = new Person("Alice", 16,"K453145E");
            Person person2 = new Person("Anna", 25,"K5343145G");

            Mbledhje mbledhje = new Mbledhje();

            Pjesemarrje pjesemarrje1 = new Pjesemarrje(person1, mbledhje);
            Pjesemarrje pjesemarrje2 = new Pjesemarrje(person2, mbledhje);

            mbledhje.addPjesemarrje(pjesemarrje1);
            mbledhje.addPjesemarrje(pjesemarrje2);

            for (Pjesemarrje pjesemarrje : mbledhje.getPjesemarrjes()) {
                System.out.println("Pjesemarrje:");
                System.out.println("Pjesemarresi: " + pjesemarrje.getPerson().getName());
                System.out.println("Mbledhja: " + pjesemarrje.getMbledhje());
                System.out.println();
            }
        }
    }


