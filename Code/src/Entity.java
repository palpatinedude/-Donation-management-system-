
// αντιπροσωπεύει ένα είδος δωρεάς
abstract class Entity {
    private String name;
    private String description;
    private int id;

    Entity(){

    }

    Entity(Entity entity) {

    }


    Entity(String name, String description, int id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }


    public String getEntityInfo() {
        return toString();
    }

     public  String toString( ){return "The product is: " + getName() + " ,the id is: " +getId() + " and the description is: " + getDescription();}

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract int getLevel();
}