public class Practical9 {
    public static void main(String[] args) {
        long []arr=new long [40];
        for(int i=0;i<arr.length;i++){
            arr[i]=System.nanoTime()%30;
        }
        long starttime=0;
        long endTime=0;
        long totTime1=0;
        for(int i=0;i< arr.length;i++){
            starttime=System.nanoTime();
            factR((arr[i]));
            endTime=System.nanoTime();
            totTime1+=endTime-starttime;

        }
        System.out.println("average time for factorial using recursion: "+totTime1/ arr.length);

        long totalTime2=0;
        for(int i=0;i< arr.length;i++){
            starttime=System.nanoTime();
            factL((arr[i]));
            endTime=System.nanoTime();
            totalTime2+=endTime-starttime;
        }
        System.out.println("average time for factorial using loop: "+totalTime2/arr.length);
        String[]strArr=new String[50];

        for(int i=0;i< strArr.length;i++){
            strArr[i]=String.valueOf(System.nanoTime()%10000);
        }

        starttime=System.nanoTime();
        concate(strArr);
        endTime=System.nanoTime();
        System.out.println("average time for concate using String: "+(endTime-starttime)/strArr.length);

        starttime=System.nanoTime();
        concate1(strArr);
        endTime=System.nanoTime();

        System.out.println("average time for concate using StringBuilder: " +(endTime-starttime)/strArr.length);

        starttime=System.nanoTime();
        concate2(strArr);
        endTime=System.nanoTime();
        System.out.println("average time for concate using stringBuffer: "+(endTime-starttime)/strArr.length);



    }
  public static long factR(long number){
      if(number<2){
          return 1;
      }
      return number*factR(number-1);
  }
    public static long factL(long number){
      int fact=1;
      for(int i=1;i<number;i++){
          fact=fact*i;
      }
      return fact;
    }
   public static String concate(String[]arr){
        String result="";
        for(int i=0;i<arr.length;i++){
            result+=arr[i];
        }
        return  result;
   }

    public static StringBuilder concate1(String[]arr){
        StringBuilder result=new StringBuilder("");
        for(int i=0;i<arr.length;i++){
            result.append(arr[i]);
        }
        return result;
    }
    public static StringBuffer concate2(String[]arr){
        StringBuffer result=new StringBuffer("");
        for(int i=0;i<arr.length;i++){
            result.append(arr[i]);
        }
        return result;
    }
}
