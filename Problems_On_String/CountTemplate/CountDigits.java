public class CountDigits {

    public static void main(String[] args) {

        String str = "abc123";

        int digits = 0;

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch >= '0' && ch <= '9'){
                digits++;
            }
        }

        System.out.println("Digits = " + digits);
    }
}