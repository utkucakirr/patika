public class Palindrom {
    public static void isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println(str + " palindrom degildir");
                return;
            }
            i++;
            j--;
        }
        System.out.println(str + " palindromdur.");
    }
    public static void main(String[] args) {
        isPalindrome("abba");
    }
}
