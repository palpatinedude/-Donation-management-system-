import java.util.ArrayList;

public class Offers extends RequestDonationList { // Αναπαριστά το σύνολο των ειδών που προτίθεται να συνεισφέρει ο Donator.

    Offers(Entity entity , int quantity , int quantity1){
        super(entity , quantity );

    }


    public void commit( ArrayList<RequestDonation> rdEntities){
      rdEntities=super.getRdEntities();

    }

    @Override
    public void modify(RequestDonation r, int quantity) {
        super.modify(r,  quantity);
    }

    @Override
    public void add(RequestDonation r) throws ExceptionR {
        super.add(r);
    }

    @Override
    public String monitor() {
        return super.monitor();
    }
}





