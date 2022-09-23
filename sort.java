import java.util.*;
class descending {
    public static void main(String[] args) {
try{
        System.out.println("Enter the word");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String : ");
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                
                if (Character.toLowerCase(ch[j]) > Character.toLowerCase(ch[i])) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.println("String after sorting character in REVERSE order");
        System.out.println(String.valueOf(ch));
    }
catch(Exception e){
System.out.println("invalid input");
}
}
}