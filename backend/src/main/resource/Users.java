public class Users {
    private int id;
    private String name;
    private String email;
    private String passWord;

    public String getRole(){
        return "";
    }
    
    public boolean coQuyen(String quyen){
        return true;
    }

    public boolean changePassword(String oldpw, String newpw){
        if(newpw == oldpw)
            return false;
        else{
            this.passWord = newpw;
            return true;
        }
    }
}
