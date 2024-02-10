// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        String str = "Man";
//        String rev = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        if (rev.toLowerCase().equals(str.toLowerCase()))
//            System.out.println("palindrome");
//        else
//            System.out.println("not");

//
//            String name="mallikarjun";
//            String rev="";
//            for(int i=0;i<name.length();i++)
//            {
//                if(name.charAt(i)=='a' ||name.charAt(i)=='e'||name.charAt(i)=='i'||
//                        name.charAt(i)=='o' || name.charAt(i)=='u')
//                {
//                    char x=name.charAt(i);
//                    x++;
//                    rev+=x;
//                }
//                else {
//                    rev=rev+name.charAt(i);
//                }
//            }
//            System.out.println(rev);



            int x=121;
                int rem=0,rev=0;
                int temp=x;
                if(x<0){
                    System.out.println("-ve number");
                }
                else{
                    while(temp>0){
                        rem=temp%10;
                        rev=(rev*10)+rem;
                        temp/=10;
                    }
                    if(rev==x)
                        System.out.println("palindrome");
                    else
                        System.out.println("not palindrome");
                }
            }
        }


