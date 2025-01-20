public class Practical05 {
    static  int i=0;
    public int getFactorial1(int number){
        if(number>=0){
            if(number<2){
                return 1;
            }
            int fact=2;
            for(;number>=3;){
                fact=fact*number--;
            }
            return fact;
        }
        return number;
    }

    public int getFactorial2(int number){
        if(number>=0){
            if(number<2){
                return 1;
            }
            int fact=2;
            while(number>2){
                fact=fact*number--;
            }
            return fact;
        }
        return number;
    }

    public int getFactorial3(int number){
        if(number>=0){
            if(number<2){
                return 1;
            }
            return number*getFactorial1(number-1);
        }
        return number;
    }

   public int getSum(int []number){
         if(number.length-1==i){
             return number[i];
         }
         return number[i++]+getSum(number);
   }
}
