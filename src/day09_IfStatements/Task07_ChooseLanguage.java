package day09_IfStatements;
public class Task07_ChooseLanguage { //same question Task03
    public static void main(String[] args) {
        int number =3;
        if(number==1){
            System.out.println("Hello, thank for your call");
        } else if (number==2) {
            System.out.println("Hola, gracias para llamar");
        } else if (number==3) {
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        } else if (number==4) {
            System.out.println("Privet, spasibo za vash zvonok");
        } else if (number==5) {
            System.out.println("Merci ,pour votre appel");
        } else {
            System.out.println("Invalid selection");
        }
    }
}
/*
3. Creat a class called ChooseLanguage, Given an integer variable named selection
   that has a number between 1~5, Write a program that can select the language based on
   the number that's given in selection and prints the following message:
		for 1: Hello, thanks for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
 */
