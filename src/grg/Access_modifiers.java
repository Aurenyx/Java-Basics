package grg;
// To access the variables with are private by nature we use methods
public class Access_modifiers {
   private int ID;
   private String name;
    void setID(int i){
        ID=i;
    }
    int getID(){
        return ID;
    }
    void setname(String n){
        name=n;
    }
    String getname(){
        return name;
    }
    public static void main(String[] args) {
        Access_modifiers A=new Access_modifiers();
        A.setID(43);
        System.out.println(A.getID());
        A.setname("Govind");
        System.out.println(A.getname());
    }
}
