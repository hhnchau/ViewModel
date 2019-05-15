package info.kingpes.fragment2fragment.sample2;

public class MyModel {
    private String name;
    private int ege;

    public MyModel(String name, int ege) {
        this.name = name;
        this.ege = ege;
    }

    public MyModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }
}
