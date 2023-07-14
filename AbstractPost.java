import javax.swing.JOptionPane;
public abstract class AbstractPost {
    String userName = "administrator";
    
    String compareNames(){
        String name = promptUser();
        name = name.toLowerCase();
        if(name.equals(userName)){
            JOptionPane.showMessageDialog(null, "Welcome " + name);
        }
        else if(name.equals("administrator")){
            JOptionPane.showMessageDialog(null, "Welcome administrator" + name);
        }
        else{
            JOptionPane.showMessageDialog(null, "Access Denied invalid credentials!");
        }
        return name;
    }
    abstract String promptUser();
    abstract void outputUsers();
    
}
