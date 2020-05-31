package observer;

public class Magazine {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Magazine(String name){
        this.name = name;
    }
}
