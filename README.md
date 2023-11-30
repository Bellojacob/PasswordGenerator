# Password Generator
This Java program is designed to generate a password for our user that is 12 characters long.
The program initializes by welcoming the user and then tells the user that the program is starting to generate a password.
The program generates a password by doing the following: 
Firstly there are four different strings that contain symbols, numbers, uppercase characters, and lowercase characters.
Then we for loop 12 times, in each loop, we are generating a random int ranging from 0-1000, using the Java Random package.
If the random int is under 250, then include a symbol, if the int is less than 500 then append a random int.
If the int is less than 750 then append a random lowercase letter, and if the int is greater than 749 then append a random uppercase char.

Each time we are appending a random character to the password string, we are taking the string that contains all the characters and we are
selecting a random character index from the string and appending it to our password string. 

Finally we are telling the user, This is your generated password, and then displaying the password as a string.
