public class Practical04 {
    public static int getShort(int number){
        if(number<=32767&&number>=-32768){
            return number;
        }
      while(number>32767){
          number=number-65536;
      }
      while (number<-32768){
          number=number+65536;
      }
      return number;
    }
    public static int getByte(int number){
        if(number<=127&&number>=-128){
            return number;
        }
        while(number>127){
            number=number-256;
        }
        while (number<-129){
            number=number+256;
        }
        return number;
    }
    private static String decimalToBinary(String number){
        long numb=Long.parseLong(number);
        StringBuilder ans=new StringBuilder();
         while(numb>0){
             Long rem=numb%2;
             ans.append(rem);
             numb=numb/2;
         }
         ans.append("B0");
        return ans.reverse().toString();
    }
    private static String decimalToOctal(String number){
        long numb=Long.parseLong(number);
        StringBuilder ans=new StringBuilder();
        while(numb>0){
            Long rem=numb%8;
            ans.append(rem);
            numb=numb/8;
        }
        ans.append("0");
        return ans.reverse().toString();
    }
    private static String decimalToHexadecimal(String number){
        int numb=Integer.parseInt(number);
        StringBuilder ans=new StringBuilder();
        char c='0';
        while(numb>0){
            int rem=numb%16;
            if(rem>9) {
                switch (rem) {
                    case 10: c='A';
                         break;
                    case 11: c='B';
                      break;
                    case 12:c='C';
                      break;
                    case 13:c='D';
                       break;
                    case 14:c='E';
                       break;
                    case 15: c='F';
                        break;
                }
                ans.append(c);
                numb=numb/16;
                continue;
            }
            ans.append(rem);
            numb=numb/16;
        }
        ans.append("X0");
        return ans.reverse().toString();
    }
    private static String binaryToDecimal(String number){
        long numb=Long.parseLong(number);
        int sum=0;
        int count=0;
        while(numb>0){
            sum=(int)(sum+numb%10*Math.pow(2,count));
            count++;
            numb=numb/10;

        }
        return ""+sum;
    }
    private static String octalToDecimal(String number){
        int numb=Integer.parseInt(number);
        int sum=0;
        int count=0;
        while(numb>0){
            sum=(int)(sum+numb%10*Math.pow(8,count));
            count++;
            numb=numb/10;

        }
        return ""+sum;
    }
    private static String hexadecimalToDecimal(String number){
        int count=0;
        int sum=0;
        int i=number.length()-1;
        while(i>=0){
            char c=number.charAt(i);
            int decimal=hexaHelper(c);
            sum=(int)(sum+(decimal* Math.pow(16,count)));
            count++;
            i--;
        }
        return ""+sum;
    }
    private static int hexaHelper(char c){
        if(c<64){
            return (int)c;
        }

        switch (c){
            case 'A': return 10;
            case 'B':return 11;
            case 'C': return 12;
            case 'D':return 13;
            case 'E':return 14;
            case 'F':return 15;
            case 'a': return 10;
            case 'b':return 11;
            case 'c': return 12;
            case 'd':return 13;
            case 'e':return 14;
            case 'f':return 15;
        }
        return 0;
    }
    private static String hexaToBinary(String number){
       number= hexadecimalToDecimal(number);
        return decimalToBinary(number);
    }
    private static String hexaToOctal(String number){
        number=hexadecimalToDecimal(number);
        return decimalToOctal(number);
    }
    private static String octalToHexa(String number){
        number=octalToDecimal(number);
        return decimalToHexadecimal(number);
    }
    private static String octalToBinary(String number){
        number=octalToDecimal(number);
        return decimalToBinary(number);
    }
    private static String binaryToHexa(String number){
        number=binaryToDecimal(number);
        return decimalToHexadecimal(number);
    }
    private static String binaryToOctal(String number){
        number=binaryToDecimal(number);
        return decimalToOctal(number);
    }
  public static String toXXString(String num ,String XX){
              String sb=num.substring(0,2);
              num=num.substring(2);
              // binary to xx;
      if(XX.equalsIgnoreCase("decimal")&&sb.equalsIgnoreCase("0b")){
            return binaryToDecimal(num);
        }
      if(XX.equalsIgnoreCase("octal")&&sb.equalsIgnoreCase("0b")){
          return  binaryToOctal(num);
      }
      if(XX.equalsIgnoreCase("hexadecimal")&&sb.equalsIgnoreCase("0b")){
          return hexadecimalToDecimal(num);
      }
      if(XX.equalsIgnoreCase("binary")&&sb.equalsIgnoreCase("0b")){
          return sb+num;
      }
      // hexadecimal to xx
      if(XX.equalsIgnoreCase("decimal")&&sb.equalsIgnoreCase("0x")){
          return hexadecimalToDecimal(num);
      }
      if(XX.equalsIgnoreCase("binary")&&sb.equalsIgnoreCase("0x")){
          return hexaToBinary(num);
      }
      if(XX.equalsIgnoreCase("octal")&&sb.equalsIgnoreCase("0x")){
          return hexaToOctal(num);
      }
      if(XX.equalsIgnoreCase("hexadecimal")&&sb.equalsIgnoreCase("0x")){
          return sb+num;
      }
      num=sb+num;
      // octal to xx
      sb= num.substring(0,1);
      num=num.substring(1);
      if(XX.equalsIgnoreCase("decimal")&&sb.equalsIgnoreCase("0")) {
          return octalToDecimal(num);
      }
      if(XX.equalsIgnoreCase("binary")&&sb.equalsIgnoreCase("0")){
          return octalToBinary(num);
      }
      if(XX.equalsIgnoreCase("hexadecimal")&&sb.equalsIgnoreCase("0")){
          return octalToBinary(num);
      }
      if(XX.equalsIgnoreCase("octal")&&sb.equalsIgnoreCase("0")){
          return sb+num;
      }
      // decimal to xx
       num=sb+num;
      if(XX.equalsIgnoreCase("binary")){
          return decimalToBinary(num);
      }
      if(XX.equalsIgnoreCase("hexadecimal")){
          return decimalToHexadecimal(num);
      }
      if(XX.equalsIgnoreCase("octal")){
          return decimalToOctal(num);
      }
      if(XX.equalsIgnoreCase("decimal")){
          return num;
      }
      return "xyz";
  }
  public static int getNumber(int number,String type){

        if(type.equalsIgnoreCase("byte")){
            return getByte(number);
        }
        if(type.equalsIgnoreCase("short")){
            return getShort(number);
        }
        return 13102005;
  }
}
