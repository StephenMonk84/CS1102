import javax.swing.JOptionPane;

public class postClass extends AbstractPost{
    postClass(String userName){
        userName = userName.toLowerCase();
        
        this.userName = userName;
        
    }    
    
    
    String promptUser(){
            String input = JOptionPane.showInputDialog("Please input your username: ");
            input = input.toLowerCase();
            super.userName = input;
            return input;
    }
    void outputUsers(){
        System.out.println("The current user is "+ compareNames());
        System.out.println("The expected user is "+ this.userName);
        System.out.println("The default user is "+ super.userName);
    }
}