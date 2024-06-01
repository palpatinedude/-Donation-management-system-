import java.util.ArrayList;

import java.util.Scanner;


public class Main extends Menu {
    public static void main(String[] args) throws ExceptionO, ExceptionR {
        ArrayList<Material> MaterialList = new ArrayList<>();
        ArrayList<Service> ServiceList = new ArrayList<>();
        ArrayList<RequestDonationList> Alltogether = new ArrayList<>();
        ArrayList<Offers> Donate=new ArrayList<>();

        Admin Marianthi = new Admin("Marianthi", "6946930521", true);

        Organization Donations = new Organization("Donations", Marianthi);
        Donations.setAdmin(Marianthi);
        Donations.listofphones("6946930521");

        Material spaghetti=new Material("spaghetti" , "eat" ,15);
        Donations.addEntity(spaghetti);

        Beneficiary ben1 = new Beneficiary("Olga", "6948063296", 4);
        Donations.insertBeneficiary(ben1);
        Donations.listofphones("6948063296");

        Beneficiary ben2 = new Beneficiary("Marina", "6948063297", 5);
        Donations.listofphones("6948063297");
        Donations.insertBeneficiary(ben2);

        Material milk = new Material("milk ", "drink", 1);
        RequestDonationList milk1 = new RequestDonationList(milk, 10);
        MaterialList.add(milk);
        Alltogether.add(milk1);
        milk1.setName("milk");
        milk1.setId(1);
        ben1.add(milk1);
        milk1.setDescription("  Milk is a nutrient mixture of various organic substances and consists of water, fat, proteins, carbohydrates, enzymes, salts and vitamins.");
        Material rice = new Material("rice", "eat ", 2);

        RequestDonationList rice1 = new RequestDonationList(rice, 10);
        MaterialList.add(rice);
        Alltogether.add(rice1);
        rice1.setName("rice");
        rice1.setId(2);
        ben2.add(rice1);
        rice1.setDescription(" Rice is one of the staple foods of mankind");
        Material sugar = new Material("sugar", "eat ", 3);

        RequestDonationList sugar1 = new RequestDonationList(milk, 10);
        MaterialList.add(sugar);
        Alltogether.add(sugar1);
        sugar1.setName("sugar");
        sugar1.setDescription(" Τo make delicious sweets!");
        sugar1.setId(3);

        Service medicalSupport = new Service("MedicalSupport", "service ", 4);
        RequestDonationList medicalSupport1 = new RequestDonationList(medicalSupport, 10);
        ServiceList.add(medicalSupport);
        Alltogether.add(medicalSupport1);
        medicalSupport.setDescription(" Medical support provides either cash medical support or health insurance.");
        medicalSupport1.setName("medical Support");
        medicalSupport1.setId(4);

        Service nurseySupport = new Service(" NurserySupport", "service ", 5);
        RequestDonationList nurseySupport1 = new RequestDonationList(nurseySupport, 10);
        ServiceList.add(nurseySupport);
        Alltogether.add(nurseySupport1);
        nurseySupport1.setId(5);
        nurseySupport1.setName(" Nursey Support");
        nurseySupport1.setDescription(" Provides specialized hospitals");

        Service babySitting = new Service("BabySitting", "service ", 6);
        RequestDonationList babysitting1 = new RequestDonationList(babySitting, 10);
        ServiceList.add(babySitting);
        Alltogether.add(babysitting1);
        babysitting1.setName("baby sitting");
        babysitting1.setDescription(" Provides nannies who love little human creatures!");
        babysitting1.setId(6);

        Donator nikol=new Donator("Nikol Papagiannakopoulou" , "6981753467");
        nikol.setNameuser("Nikol Papagiannakopoulou");
        Donations.insertDonator(nikol);

        Donations.addEntity( milk1);
        Donations.addEntity( sugar1);
        Donations.addEntity( nurseySupport1);
        Donations.addEntity( medicalSupport1);
        Donations.addEntity( babysitting1);
        Donations.addEntity( rice1);






        String name1;
        int atoma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give your phone:");
        String phone = sc.next(); //διαβαζει το τηλεφωνο του χρηστη

        if (Marianthi.getPhone().equals(phone)) {
            System.out.println("You are the admin!");
            itsAdmin(Marianthi);
            ItsMenuForAdmin();
            System.out.println("Select  by writing the number of your choice:");
            Scanner cc = new Scanner(System.in);
            int c = cc.nextInt();
            if (c == 1) {
                babysitting1.print(Alltogether);
                System.out.println("Choose a product that you want to learn more about: ");
                Scanner cc1 = new Scanner(System.in);
                int b = cc1.nextInt();
                System.out.println(Alltogether.get(b).getEntityInfo());

            }
            if (c == 2) {
                ItsMenuforAdminMO();
                System.out.println("Choose  that you want to learn more about: ");
                Scanner cc1 = new Scanner(System.in);
                int b = cc1.nextInt();
                if (b == 1) {
                    listBeneficiary();
                    System.out.println("Select a beneficiary: ");
                    Scanner cc2 = new Scanner(System.in);
                    String d = cc2.next();
                    Beneficiary a = searchforBeneficiary(d);
                    System.out.println("1. Clear  its benefits.");
                    System.out.println("2. Remove the beneficiary.");
                    System.out.println("Choose:");// με αριθμους πχ:γραφετε 1,2,3..
                    Scanner cc3 = new Scanner(System.in);
                    int p = cc2.nextInt();
                    if (p == 1) {
                        a.reset();
                    }
                    if (p == 2) {
                        Donations.removeBeneficiary(a);
                    }

                }else if(b==2){
                    listDonator();
                    System.out.println("Select a Donator: "); //επιλεγετε με ονονα πχ. γραφετε το ονομα που θελετε να δειτε περαιτερεσ info
                    Scanner cc2 = new Scanner(System.in);
                    String d = cc2.next();
                    Donator a = searchforDonator(d);
                    System.out.println("1.The current status of the benefits it intends to  offers the Donator.");
                    System.out.println("2.Delete the donator");
                    System.out.println("Choose 1 or 2: " );
                    Scanner cc4 = new Scanner(System.in);
                    int z = cc4.nextInt();
                    if(z==1) {

                        a.printOfferlist();
                    }
                    if (z == 2) {
                        Donations.removeDonator(a);
                    }

                }else if(b==3){

                }



            } else if (!(Donations.searchForPhone(phone))) {
                System.out.println("Do you want to join? If yes write 1 else 2: ");
                int a = sc.nextInt();
                if (a == 1) {
                    System.out.println("Do you want to be a Beneficiary or a Donator?If you want the first write 1 else write 2:");
                    int b = sc.nextInt();
                    if (b == 1) {

                        System.out.println("give me the number of people in your family:");
                        atoma = sc.nextInt();//αριθμος ατομων που εχει η οικογενεια του
                        System.out.println("Give me your name:");
                        name1 = sc.next();
                        Beneficiary ben3 = new Beneficiary(name1, phone, atoma);
                        ben3.setnoPerson(atoma);
                        Donations.insertBeneficiary(ben3);
                        itsBeneficiary(ben3);

                    } else if (b == 2) {
                        System.out.println("Give me your name:");
                        name1 = sc.next();
                        Donator ben3 = new Donator(name1, phone);
                        Donations.insertDonator(ben3);
                        itsDonator(ben3);

                    }
                } else if (a == 2) {
                    System.exit(0);
                }
            }

        }
    }
}





