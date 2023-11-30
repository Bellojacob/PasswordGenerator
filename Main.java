import java.util.Random;

public class Main {
    public static void main(String[] args) {
    System.out.println("Welcome To Password Generator 1.0");
    System.out.println("Generating Password...");
    Random random = new Random();
    

    StringBuilder password = new StringBuilder();
    String symbols = "!@#$%^&*_-+=;:'<>/?";
    String ints = "1234567890";
    String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
    String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    for(int i = 0; i < 12; i++) {
        int numberRandom = random.nextInt(1000);
        //System.out.println(numberRandom);
        if (numberRandom < 250) {
          // Add a random symbol to the password
    int symbolIndex = random.nextInt(symbols.length());
    char randoSymbo = symbols.charAt(symbolIndex);
    password.append(randoSymbo);  
            
        } else if (numberRandom < 500) {
            // Add a random integer to the password
    int intIndex = random.nextInt(ints.length());
    char randoInt = ints.charAt(intIndex);
    password.append(randoInt);
        } else if (numberRandom < 750) {
            // Add a random lowercase character to the password
    int lowerIndex = random.nextInt(lowercaseChars.length());
    char randoLower = lowercaseChars.charAt(lowerIndex);
    password.append(randoLower);
        } else if (numberRandom > 749) {
            // Add a random uppercase character to the password
    int upperIndex = random.nextInt(uppercaseChars.length());
    char randoUpper = uppercaseChars.charAt(upperIndex);
    password.append(randoUpper);
        }
    }

    

    

    

    

    System.out.println("Generated Password: " + password.toString());
}
}