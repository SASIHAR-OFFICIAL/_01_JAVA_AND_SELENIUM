package _00_Java_IT_ST_Bringed_Encapsulation;

public class Encap {

    // Private fields (encapsulation)
    private String name;
    private int age;
    private String idNum;

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 0) { // simple validation
            this.age = newAge;
        }
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String newId) {
        this.idNum = newId;
    }

    // Main method
    public static void main(String args[]) {
        Encap encap = new Encap();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name : " + encap.getName() + 
                         " Age : " + encap.getAge() + 
                         " IDNUM : " + encap.getIdNum());
    }
}

