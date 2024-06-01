



abstract class User {
    private String nameuser;
    private String phone;


    User(){

    }
    User(String nameuser ,String phone){
        this.nameuser=nameuser;
        this.phone=phone;
    }
    public String  getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNameuser() {
        return nameuser;
    }

    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }

    public String getUserInfo(){
        return ("Name: "+ getNameuser() + "Phone :" + getPhone() );
    }
}