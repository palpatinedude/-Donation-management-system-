
import java.util.ArrayList;

 class Donator extends User{
   private static ArrayList <Offers> offerlist=new ArrayList<>(); // το οποίο αναπαριστά τη λίστα ειδών που επιθυμεί να προσφέρει

     Donator(String nameuser ,String phone ){
         super(nameuser, phone);
     }

     public ArrayList<Offers> getOfferlist() {
         return offerlist;
     }

     public void setOfferlist(ArrayList<Offers> offerlist) {
         Donator.offerlist = offerlist;
     }

     public  void add1(Offers a ){
         getOfferlist().add(a);

     }

     public  void  printOfferlist(){
         for(int i=0; i<getOfferlist().size(); i++){
             System.out.println( (i+1)+"." +" Entity: " + getOfferlist().get(i).getName());
             System.out.println("Quantity: " + getOfferlist().get(i).getQuantity());}
         }


     public void modify(Offers r , double quantity){
         int a=getOfferlist().indexOf(r);
         quantity=r.getQuantity();
         getOfferlist().set(a , (Offers) r);

     }
}