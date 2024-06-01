
import java.util.*;

public class Organization {
    // Αντιστοιχεί στον οργανισμό που υποστηρίζει το σύστημα donation.
    private String name;
    private Admin admin;
    private static ArrayList <Entity> entityList=new ArrayList<>();//με τα είδη  που μπορούν να διανεμηθούν
    private static ArrayList <RequestDonationList> currentDonations=new ArrayList<>();//διαθέσιμες προσφορές και τις ποσότητές τους
    private static ArrayList<String> phones=new ArrayList<>();
    private static ArrayList<Beneficiary> beneficiaryList= new ArrayList<>(); //μια λίστα με τους επωφελούμενους beneficiaryList
    private static ArrayList<Donator> donatorList= new ArrayList<>(); //μια λίστα με τους δωρητές


    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getName() {
        return name;
    }


    Organization(){

    }

    Organization(String name , Admin admin)
    {
        this.name=name;
        this.admin=admin;
    }


    public void addEntity(Entity k)  {
            entityList.add(k);
    }


    public void removeEntity(Entity ob) {
            entityList.remove(ob);
    }

    public void insertDonator(Donator d) throws ExceptionO
    {
          donatorList.add(d);

    }

    public void removeDonator(Donator a){
        donatorList.remove(a);
    }

    public  void insertBeneficiary(Beneficiary a){
       beneficiaryList.add(a);

    }

    public void removeBeneficiary(Beneficiary a){
        beneficiaryList.remove(a);
    }


    public static ArrayList<Entity> getEntityList() {
        return entityList;
    }

    public static void setEntityList(ArrayList<Entity> entityList) {
        Organization.entityList = entityList;
    }

    public  static void listEntities(){
        for(int i=0; i<entityList.size(); i++)
            System.out.println ((i+1)+"."+getEntityList().get(i).toString());
    }

     public static void listDonator(){
        System.out.println("List of Donators:");
        for(int i=0; i<donatorList.size(); i++ ){
            System.out.println( (i+1)+ "." +donatorList.get(i).getNameuser());
        }

    }

    public static void listBeneficiary(){
        System.out.println("List of Beneficiaries:");
        for(int i=0; i<beneficiaryList.size(); i++ ){
            System.out.println((i+1)+ "." +beneficiaryList.get(i).getNameuser());
        }
    }

    public static boolean searchForPhone(String phone ) {
        for(int i=0;i<getPhones().size(); i++){
        if(getPhones().get(i).equals(phone))
            return true;}

        return false;
    }

    public void  listofphones(String phone){
        phones.add(phone);
    }

    public static ArrayList<String> getPhones() {
        return phones;
    }



    public static ArrayList<Beneficiary> getBeneficiaryList()  {
        return beneficiaryList;
    }

    public static ArrayList<Donator> getDonatorList() {
        return donatorList;
    }

    public static ArrayList<RequestDonationList> getCurrentDonations() {
        return currentDonations;
    }
}

