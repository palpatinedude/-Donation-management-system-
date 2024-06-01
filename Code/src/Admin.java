public class Admin extends User{
    boolean isAdmin=true;

    Admin(){

    }



    Admin( String nameuser , String phone, boolean isAdmin ){
         super(nameuser ,phone);
         this.isAdmin=isAdmin;
     }

    public boolean isAdmin() {
        return isAdmin;
    }
    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
