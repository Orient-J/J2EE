import java.io.Serializable;

public class Student implements Serializable{

    private String name = "";
    private int id = 0;
    private String town = "";

    public Student(String name, int id, String town){

        this.name = name;
        this.id = id;
        this.town = town;
    }

    public String getInfo() {

        return String.format("%-10d",this.id) + String.format("%-30s",this.name) + String.format("%-20s",this.town);
    }
}