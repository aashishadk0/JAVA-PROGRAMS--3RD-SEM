package This;

public class InstanceVariable {
    String name;
    int id;

    public InstanceVariable(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Hello " + name + ". Your roll no. is: " + id);
    }

    public static void main(String[] args) {
        new InstanceVariable("Aashish", 1);
    }
}
