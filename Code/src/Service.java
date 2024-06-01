public class Service extends Entity {
    Service(String name, String description, int id) {
        super(name, description, id);
    }
    String getDetails(){
         return toString();
     }



    @Override
    public String toString() {
        return "the item is Service";
    }

    @Override
    protected int getLevel() {
        return 0;
    }
}
