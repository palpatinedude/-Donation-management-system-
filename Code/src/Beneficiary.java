;

import java.util.ArrayList;

public  class Beneficiary extends  User{
     private   int noPerson ;
     private static  ArrayList<RequestDonation> receivedList = new ArrayList<>();//υ αναπαριστά τη λίστα των ειδών και των ποσοτήτων που έχει ήδη λάβει.
     private static  ArrayList <Request> requestsList = new ArrayList<>();// που αναπαριστά την τρέχουσα λίστα των ειδών και των ποσοτήτων που ζητά να του δοθούν.


     Beneficiary(String nameuser ,String phone , int noPerson){
          super(nameuser ,phone);
          setnoPerson(noPerson);
     }



     public  int getnoPerson() {
          return this.noPerson;
     }


     public void setnoPerson(int noPerson) {
          this.noPerson = noPerson;
     }

     public static int Checkingforquantity(Beneficiary a) {
          if (a.getnoPerson() >= 2 && a.getnoPerson() <= 4) {
               System.out.println("You are at level2");
               return 2;
          } else if (a.getnoPerson() == 1) {
               System.out.println("You are at level1");
               return 1;
          } else if (a.getnoPerson() == 5) {
               System.out.println("You are at level3");
               return 3;
          }

          return 0;
     }

     public static ArrayList<Request> getRequestsList() {
          return requestsList;
     }

     public static void setRequestsList(ArrayList<Request> requestsList) {
          Beneficiary.requestsList = requestsList;
     }

     public static ArrayList<RequestDonation> getReceivedList() {
          return receivedList;
     }

     public  void setReceivedList(ArrayList<RequestDonation> receivedList) {
          Beneficiary.receivedList = receivedList;
     }


     public void add(RequestDonation a ){
          getReceivedList().add( a);
     }

     public void remove(RequestDonation a){
          getReceivedList().remove(a);
     }

     public void reset(){
          getReceivedList().clear();
     }





     public void modify(RequestDonation r , double quantity){
          int a=getReceivedList().indexOf(r);
          quantity=r.getQuantity();
          getReceivedList().set(a , (RequestDonationList) r);

     }

     public static void  printReceivedlist(){
          for(int i=0; i<getReceivedList().size(); i++){
               System.out.println( (i+1)+"." +" Entity: " + getReceivedList().get(i).getName());
               System.out.println("Quantity: " + getReceivedList().get(i).getQuantity());}

     }

}


