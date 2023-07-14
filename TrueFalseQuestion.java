import javax.swing.JOptionPane;
public class TrueFalseQuestion extends Question {
    
    TrueFalseQuestion(String question, String answer){
        this.question = "TRUE or FALSE: " + question;
        correctAnswer = answer;
        correctAnswer = correctAnswer.toUpperCase();
    }
    String ask(){
        while(true){
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if(answer.equals("F") ||answer.equals("NO") || answer.equals("N")){
                answer = "FALSE";
            }
           if(answer.equals("T") || answer.equals("Y") || answer.equals("YES") ){
            answer = "TRUE";
           }
           if( answer.equals("FALSE") || answer.equals("TRUE")  ){
                return answer;
           }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Input! Please use only TRUE or FALSE.");
            }
        } 
    }
}
