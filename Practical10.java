public class Practical10 {
    public static void main(String[] args) {
      GridBOx(Integer.parseInt(args[0]));
    }
    public static void GridBOx(int size){
        int [][]ans=sudokoAnsGenerator(size);
        int [][]ansgen=quetionGenerater(ans,size);
        int i=0;

        int col=0;
        for(int row=1;row<=2*size+1;row++){
            int j=0;
            for( col=1;col<=size;col++){
                if(row%2!=0){
                    System.out.print(" ---- ");
                }
                else if (row%2==0&&col<size){
                    String l=ansgen[i][j]+"";
                    int Size=l.length();
                    if(ansgen[i][j]==0){
                        System.out.print("|" + "     ");
                    }
                    else {
                        if(Size==1){
                        System.out.print("|" + "  "+ ansgen[i][j]+"  " );
                        }
                        else if(Size==2){
                            System.out.print("|" + " "+ ansgen[i][j]+"  " );
                        }
                        else{
                            System.out.print("|" +  ansgen[i][j]+"  " );
                        }

                    }
           }
                if (col==size&&row%2==0) {
                    String l=ansgen[i][j]+"";
                    int Size=l.length();
                    if(ansgen[i][j]==0){
                        System.out.print("|" + "     " + "|");
                    }
                    else {
                        if(Size==1) {
                            System.out.print("|" + "  " + ansgen[i][j] + "  " + "|");
                        }
                        else if(Size==2){
                            System.out.print("|" + " " + ansgen[i][j] + "  " + "|");
                        }
                        else{
                            System.out.print("|" +   ansgen[i][j] + "  " + "|");
                        }
                    }
                }
                j++;

            }
            if(row%2==0){
             i++;
            }
            System.out.println();
        }
    }
    public  static int[][] sudokoAnsGenerator(int size) {
        int[][] ansBox = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                ansBox[row][col] = (row + col) % size + 1;
            }
        }
        return ansBox;
    }
    public static int[][]quetionGenerater(int [][]arr,int size){
        int [][]ans=sudokoAnsGenerator(size);
        int [][] que= setZero(arr);
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(que[i][j]==0){
                    que[i][j]=ans[i][j];
                }
                else{
                    que[i][j]=0;
                }
            }
        }
        return que;
    }

    public static int [][] setZero(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int totalElements = rows * cols;
        int elementsToZero = totalElements/3;
        while(elementsToZero>0){
            for(int i=0;i<rows;i++ ){
                for(int j=0; j<cols;j++){
                    int var1=(int)(System.nanoTime()%(rows+rows+1));
                    int var2=(int)(System.currentTimeMillis()%(rows+rows+1));
                    if(i==var1||j==var2) {
                        if(elementsToZero<=0){
                            break;
                        }
                        array[i][j] = 0;
                        elementsToZero--;
                    }
                }
            }

        }
        return array;
    }

}
