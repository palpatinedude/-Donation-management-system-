public class Material extends  Entity {
    static protected int level;
    static protected int human;


    Material(String name, String description, int id) {
        super(name, description, id);
    }

    @Override
    public String toString() {
        return null;
    }


    Material() {
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }












}
