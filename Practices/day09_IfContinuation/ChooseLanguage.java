package day09_IfContinuation;

public class ChooseLanguage
{
    public static void main(String[] args) {
int lang = 5;
if (lang==1){
    System.out.println("Hello, thank for your call");
}else if (lang==2) {
    System.out.println("Hola, gracias para llamar");
        }else if (lang==3) {
    System.out.println(" Merhaba, aradiginiz icin tesekkurler");
} else if (lang==4){
    System.out.println("Privet, spasibo za vash zvonok");
} else {
    System.out.println("Bonjour. Merci pour votre appel");
}

    }
}

/*
for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

 */