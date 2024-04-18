import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;
    private String id;
    private List<String> pjesemarrjeList;

    public Person(String name, int age,String id) {
        this.name = name;
        this.age = age;
        this.id=id;
        this.pjesemarrjeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getId() {
        return id;
    }
    public void setName(){
        this.name=name;
    }
    public void setAge(){
        this.age=age;
    }
    public void setId(){
        this.id=id;
    }

    public void addPjesemarrje(String pjesemarrje) {
        pjesemarrjeList.add(pjesemarrje);
    }

    public void removePjesemarrje(String pjesemarrje) {
        pjesemarrjeList.remove(pjesemarrje);
    }

    public List<String> getPjesemarrjeList() {
        return pjesemarrjeList;
    }
}
