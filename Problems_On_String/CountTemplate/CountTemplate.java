public class CountTemplate {

    public static void main(String[] args) {

        String str = "Hello World 123!";
        //key logic for count based on condition

        int count = 0;


        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // condition here
            if(condition) {
                count++;
            }
        }

        System.out.println(count);
    }
}