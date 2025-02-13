public class StringCharacters {
    public static void main(String[] args) {
        String text = "Este autobus va muy lento, si no acelera llegare muy tarde a clases y"
        + "no podre representar el examen, el profesor no va a creerme, reprobare"
        + " y ¿Que sera de mi? Ni siquiera es mi culpa, pero todos actuaran como"
        + " or to take arms against a sea of troubles"
        + " asi fuera.";

        int spaces = 0, vowels = 0, letters = 0;

        for(int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if(character == ' ') {
                spaces++;
            }

            else if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
                    || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                vowels++;
            }

            letters++;
        }

        System.out.println("The text contained vowels: " + vowels + "\n"
        + "consonants: " + (letters - vowels - spaces) + "\n" + "spaces: " + spaces + "\n" + "letters " + letters);
    }
}