public class CountConsonants {

    public static void main(String[] args) {

        String str = "Hello World";

        int consonants = 0;

        for(int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if(ch>='a' && ch<='z' &&
               !(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) {

                consonants++;
            }
        }

        System.out.println("Consonants = " + consonants);
    }
}