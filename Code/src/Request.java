import java.util.Scanner;
public class Request extends RequestDonationList {
    Request(Entity entity, int quantity) {
        super(entity, quantity);
    } //Αναπαριστά το σύνολο των ειδών

    public Request(Material entity) {
    }
    // (Material ή Services) που ζητά ο Beneficiary //

    @Override
    public void modify(RequestDonation r, int quantity) {
        super.modify(r, quantity);
    }

    @Override
    public void add(RequestDonation r) throws ExceptionR {
        super.add(r);
    }


}
