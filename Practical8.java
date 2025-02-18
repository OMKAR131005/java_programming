public class Practical8 {
    void printstar(int size){
        if(size==0){
            return;
        }
        System.out.print("*");
        printstar(size-1);
    }
    void printslash(int size){
        if(size==0){
            return;
        }
        System.out.print("/");
        printslash(size-1);
    }
    void printplus(int size){
        if(size==0){
            return;
        }
        System.out.print("+");
        printplus(size-1);
    }
    void spacestar(int size){
        if(size==0){
            return;
        }
        System.out.print(" ");
        spacestar(size-1);
    }

    void pattern3(int size){
        pattern3x(size,1);
    }
    void pattern3x(int size,int row){
        if(size==row){
            printstar(row*2-1);
            System.out.println();
            return;
        }
        spacestar(size-row);
        printstar(row*2-1);
        System.out.println();
        pattern3x(size,row+1);
        spacestar(size-row);
        printstar(row*2-1);
        System.out.println();
 }
    void pattern1(int size){
        pattern1x(size,1);
}
    void pattern1x(int size,int row){
        if(size==row-1){
            printstar(size+1);
            System.out.println();
            return;
        }
        printstar(row);
     System.out.println();
        pattern1x(size,row+1);
        printstar(row);
     System.out.println();
 }
        void pattern2 (int size){
         pattern2x(size,1);
         }
        void pattern2x(int size,int row){
        if(size==row-1){
            printplus(size+1);
            System.out.println();
            return;
        }
        printstar(row);
        System.out.println();
        pattern2x(size,row+1);
        printslash(row);
        System.out.println();
        }


}
