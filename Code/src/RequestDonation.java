import java.util.ArrayList;
import java.util.Comparator;
public class RequestDonation  extends Entity implements Comparator<Entity>  {

        private Entity entity;
        private int quantity;

        RequestDonation(Entity entity, int quantity){
        super(entity);
        this.quantity=quantity;
    }


    RequestDonation(){

    }


    public int compare (Entity ob1, Entity ob2){
        int idCompare1 = ob1.getId();
        int idCompare2 = ob2.getId();
        if (idCompare1 == idCompare2)
            System.out.println("Its the same item");
        else
            System.out.println("Its different item");
        return 0;

    }


    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public int getQuantity () {
        return quantity;
    }

        public void setQuantity ( int quantity){
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected int getLevel() {
        return getLevel();
    }


    @Override
    public String toString() {
        return ("The product is: " + getName() + " ,the id is: " +getId() + " and the description is: " + getDescription());
    }

    public  String print(ArrayList<RequestDonationList> str){
        RequestDonation[] arr=new RequestDonation[str.size()];
        System.out.println("list of donor names and existing quantities"); str.toArray(arr);
        for (int i=0; i< arr.length; i++){
            System.out.println("Name of entity : " +arr[i].getName());
            System.out.println("Quantity of entity :" + arr[i].getQuantity());

        }
        return  null;

    }


}
