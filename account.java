//superclass for general account info

public class account{
    String username;
    String password;

    public account(){
        username=null;
        password=null;
    }

    public account(String username, String password){
        this.username=username;
        this.password=password;
    }
}