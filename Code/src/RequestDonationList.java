import java.util.ArrayList;
import java.util.Scanner;

public class RequestDonationList extends  RequestDonation{
    //Αναπαριστά μια συλλογή από αντικείμενα RequestDonation και δίνει μεθόδους για την ενημέρωση της λίστας αυτής
    private ArrayList <RequestDonation> rdEntities;

    RequestDonationList(){

    }

    RequestDonationList(Entity entity, int quantity) {
        super(entity, quantity);
    }




    public ArrayList<RequestDonation> getRdEntities() {
        return rdEntities;
    }

    public void setRdEntities(ArrayList<RequestDonation> rdEntities) {
        this.rdEntities = rdEntities;
    }



    public void add(RequestDonation r) throws ExceptionR {
        if (rdEntities.contains(r)) {
            int thesi = rdEntities.indexOf(r);
            System.out.println("Give the quantity that you will be donate:");
            Scanner sc = new Scanner(System.in);
            int quantity = sc.nextInt();
            modify(r, quantity);
        } else {
            System.out.println("Do you want to add it?Yes or no");
            Scanner sc1 = new Scanner(System.in);
            String answer = sc1.next();
            if (answer.equals("yes")) {
                try {
                    rdEntities.add(r);
                } catch (Exception e) {
                    throw new ExceptionR(e.toString());
                }
            }else{}
        }
    }


    public void remove(RequestDonation r){
         rdEntities.remove(r);
    }

    public void modify(RequestDonation r , int quantity){
        int a=getRdEntities().indexOf(r);
        r.setQuantity(r.getQuantity()+quantity);
        getRdEntities().set(a , r);

    }

    public String monitor(){
        RequestDonation[] arr=new RequestDonation[rdEntities.size()];
        System.out.println("list of donor names and existing quantities"); rdEntities.toArray(arr);
        for (int i=0; i< arr.length; i++){
            System.out.println("Name of entity : " +arr[i].getName());
            System.out.println("Quantity of entity :" + arr[i].getQuantity());

        }
        return null;
    }





    public  boolean itsMaterialorService(RequestDonation r){
        if(r.getLevel() == Integer.parseInt(null))
            return true;
        else return false;
    }

    public void validRequestDonation(Beneficiary a , Request b) {
        if(itsMaterialorService(b))
            System.out.println("Its Service item");
        else {
            System.out.println("Its Material Item");
            int m=a.Checkingforquantity(a);
            Scanner sc=new Scanner(System.in);
            if(m==1)
            {
                System.out.println("Give the quantity that you want:");
                int quantity=sc.nextInt();
                if(quantity>getQuantity()){
                    System.out.println("Your request has been rejected");
                }
                else
                    quantity=getQuantity();
            }
            if(m==2)
            {
                System.out.println("Give the quantity that you want:");
                int quantity=sc.nextInt();
                if(quantity>getQuantity())
                    System.out.println("Your request has been rejected");
                else
                    quantity=getQuantity();
            }
            if(m==3)
            {
                System.out.println("You are at a level3");
                System.out.println("Give the quantity that you want:");
                int quantity=sc.nextInt();
                if(quantity>getQuantity())
                    System.out.println("Your request has been rejected");
                else
                    quantity=getQuantity();
            }
        }

    }


}
