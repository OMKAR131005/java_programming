public class Practical06 {
    public static void main(String[] args) {
        Practical06 p=new Practical06();
//        p.displayPattern2(5);
        p.displayPattern1(5);
    }
    public void displayPattern2(int size){
        for(int row=1;row<=size;row++){
            for(int space=1;space<=size-row;space++){
                System.out.print (" ");
            }
            for(int plus=1;plus<=(2*row-1);plus++){
                System.out.print("+");
            }
            System.out.println();
        }
        for(int row=1;row<size;row++){
            for(int space=1;space<=row;space++){
                System.out.print(" ");
            }
            for(int star=((2*(size-1))-1);star>=2*row-1;star--){
                System.out.print("+");
            }
            System.out.println();
        }
    }
    public void displayPattern1(int size ){
        for(int row=1;row<=size;row++){
            for(int space=1;space<=size-row;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=((2*row)-1);star++){
                if(star%2==0){
                    System.out.print(" ");
                }
                else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
        for(int row=1;row<size;row++){
            for(int space=1;space<=row;space++){
                System.out.print(" ");
            }
            for(int star=((size-1)*2-1);star>=((row*2)-1);star--){
                if(star%2==0){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
    public void displayPattern3(int size){
        for(int row=1; row<=size;row++){
            for(int space=1;space<=size-row;space++){
                System.out.print(" ");
            }
            for(int starplus=1;starplus<=2*row-1;starplus++){
                if(((row+starplus)%2==0)){
                    System.out.print("+");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int row=1;row<=size;row++){
            for(int space=1;space<row;space++){
                System.out.print(" ");
            }
            for(int starplus=((size*2)-1);starplus>=((row*2)-1);starplus--){
                if(starplus%2==0){
                    System.out.print("+");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
