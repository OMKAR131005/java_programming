public class IT2023bit043 {
    public static void main(String[] args) {
        System.out.println(reverse("omkar "));
        System.out.println(isPalindrome("1233212"));
        System.out.println(sumOfDigits(123456789));
    }
    public static String reverse(String Str){
        return reverse1(Str,Str.length()-1,"");
    }
    public static String reverse1(String str,int index,String ans){
        if(index==-1){
            return ans;
        }
        ans=ans+str.charAt(index);
      return  reverse1(str,index-1,ans);
    }
    public static  int sumOfDigits(int number){
        int sum=0;
        return sumOfDigit1(number,sum);
    }
   public static int sumOfDigit1 (int number,int sum){
        if(number==0){
            return sum;
        }
        sum=sum+number%10;
      return   sumOfDigit1(number/10,sum);
    }
   public static boolean isPalindrome(String str){
        return str.equals(reverse1(str,str.length()-1,""));
    }
}
