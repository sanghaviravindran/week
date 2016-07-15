public class vowel {
    public static void main(String[] args) {
        String s1,s2,str;
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=new StringBuffer(s1).reverse().toString();
        System.out.println("reverse  string is\t"+s2);
        str = s2.replaceAll("[aeiouAEIOU]", "");
        System.out.println("all vowel are removed\t"+str);
    }
}