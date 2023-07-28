
public class Quiz{
     public static void main(String[] args){
        Question question = new MultipleChoiceQuestion("What is the largest mammal?", "Elephant", "Whale Shark", "Blue Whale", "Hippopotamus", "Polar Bear", "C");
        question.check();
            
        question = new MultipleChoiceQuestion("What is the largest land based animal?", "Hippopotamus", "Lion", "Tiger", "Asian Elephant", "African Elephant", "e");
        question.check(); 

        question = new MultipleChoiceQuestion("What is the most intelligent animal besides humans?", "Parrot", "Dolphin", "Octopus", "Orangutan", "Chimpanzee", "b");
        question.check();

        question = new MultipleChoiceQuestion("What is the most dangerous animal to humans?", "Great White Shark", "Crocodile", "Lion", "Hippopotamus", "Tiger", "d");
        question.check();

        question = new MultipleChoiceQuestion("What animal is the largest land based carnivore?", "Polar Bear", "Lion", "Tiger", "Crocodile", "Grizzly Bear", "A");
        question.check();

        question = new TrueFalseQuestion("Are Lions native to Africa?", "TRUE");
        question.check();

        question = new TrueFalseQuestion("Are Orcas (Killer Whales) actually dolphins?", "TRUE");
        question.check();

        question = new TrueFalseQuestion("Are whales fish?", "FALSE");
        question.check();

        question = new TrueFalseQuestion("Are snakes reptiles?", "TRUE");
        question.check(); 

        question = new TrueFalseQuestion("Are tortoises the same as turtles?", "FALSE");
        question.check();

        Question.showResults();
        
    }
         
            
    }



