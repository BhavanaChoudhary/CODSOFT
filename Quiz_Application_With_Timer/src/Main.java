import javax.print.attribute.standard.NumberOfInterveningJobs;

public class Main {
    public static void main(String[] args) {
     Quiz obj1=new Quiz();
         obj1.addQuestion(new Question("What is the capital of Italy?",new String []{"Paris", "Berlin","Madrid","Rome"},3));
        obj1.addQuestion(new Question("What gas do plants breathe in that humans and animals breathe out?",new String []{"Oxygen", "Nitrogen","Carbon Dioxide","Hydrogen"},2));
        obj1.addQuestion(new Question("Which country is known as the Land of the Rising Sun?",new String []{"China", "Japan","South Korea","Thailand"},1));
        obj1.addQuestion(new Question(" Which Disney movie is Elsa from?",new String []{"Cinderella", "Frozen","Moana","Beauty and the Beast"},1));
        obj1.addQuestion(new Question("In tennis, what is a zero score called?",new String []{"Love", "Nil","Zero","Out"},0));
        obj1.addQuestion(new Question("What is 7 times 8?",new String []{"54", "56","58","60"},1));
        obj1.addQuestion(new Question("Which company developed the video game ‘Minecraft’?",new String []{"Epic Games","Electronic Arts","Mojang","Activision"},2));
        obj1.addQuestion(new Question("Who painted the Mona Lisa?",new String []{"Vincent van Gogh", "Pablo Picasso","Leonardo da Vinci","Michelangelo"},2));
        obj1.addQuestion(new Question("What is the main material used to make jeans?",new String []{"Silk", "Denim","Polyester","Cotton"},1));
        obj1.addQuestion(new Question(" In which language is the phrase ‘Bonjour’ used to say hello?",new String []{"Spanish", "French","Italian","German"},1));


        obj1.start();
    }

}