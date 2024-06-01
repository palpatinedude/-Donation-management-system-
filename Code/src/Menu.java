public class Menu extends Organization {

    public static void itsDonator(Donator a) {
        System.out.println("Hello  member , we are the Donations!");
        System.out.println(a.getUserInfo());

    }

    public static void itsBeneficiary(Beneficiary a) {
        System.out.println("Hello  member, we are the Donations!");
        System.out.println(a.getUserInfo());

    }

    public static void itsAdmin(Admin a) {
        System.out.println("Hello  member, we are the Donations!");
        System.out.println(a.getUserInfo());

    }

    public static void ItsMenuForAdmin() {
        System.out.println("MENU:");
        System.out.println("1.View" + '\n' + "2.Monitor Organization" + '\n' + "3.Back" + '\n' + "4.Logout" + '\n' + "5.Exit");

    }


    public static void ItsMenuforAdminMO() {
        System.out.println("Monitor Organization!");
        System.out.println("1.List Beneficiaries " + '\n' + "2.List Donators " + '\n' + "3.Reset Beneficiaries Lists ");

    }


    public static Beneficiary searchforBeneficiary(String s)
    {
        for (int i = 0; i < getBeneficiaryList().size(); i++)
            if (s.equals(getBeneficiaryList().get(i).getNameuser())){
                return getBeneficiaryList().get(i);
              }
        return null;
    }

    public static Donator searchforDonator(String s)
    {
        for (int i = 0; i < getDonatorList().size(); i++)
            if (s.equals(getDonatorList().get(i).getNameuser())){
                return getDonatorList().get(i);
            }
        return null;


    }
}

            






