public class Practical07 {
    public static void main (String[] args) {
        Practical07 om = new Practical07();
        System.out.println( om.display(7));

    }

    String display(int size){
        String omkarLine="";
        size=size(size);
        for (int row = 1; row <= size; row++) {
            omkarLine+=displayORow(row, size);
            omkarLine+="  ";
            omkarLine+= displayMRow(row, size);
            omkarLine+="  ";
            omkarLine+=  displayKRow(row, size);
            omkarLine+="  ";
            omkarLine+= displayARow(row, size);
            omkarLine+="  ";
            omkarLine+= displayRRow(row, size);
            omkarLine+="\n";
        }
        return omkarLine;
    }

    String displayORow(int row, int size) {
        String oLine="";
        for (int col = 1; col <= size; col++) {
            if ((row == 1 && col == 1) || (row == size && col == size) || (row == 1 && col == size) || (row == size && col == 1)) {
                oLine=oLine+"  ";
            } else if (row == 1 || row == size) {
                oLine=oLine+" #";
            } else {
                if (col == 1 || col == size) {
                    oLine=oLine+" #";
                } else {
                    oLine=oLine+"  ";
                }
            }
        }
        return oLine;
    }

    String displayMRow(int row, int size) {
        String mLine="";
        for (int col = 1; col <= size; col++) {

            if ((row <= size && col == 1) || (row <= size && col == size)) {
                mLine=mLine+" #";
            } else if ((row == col) || (row + col == size + 1)) {
                if (row <= size / 2 + 1) {
                    mLine=mLine+" #";
                } else {
                    mLine=mLine+"  ";
                }
            } else {
                mLine=mLine+"  ";
            }
        }
        return mLine;
    }

    String displayKRow(int row, int size) {
        String kLine="";
        for (int col = 1; col <= size; col++) {
            if (col == 1 || row == size / 2 + 1 && col < size / 2 - 1) {
                kLine=kLine+" #";
            } else if (row + col == size && row <= size / 2 + 1 || col == row && row > size / 2) {
                kLine=kLine+" #";
            } else {
                kLine=kLine+"  ";
            }
        }
        return kLine;
    }

    String displayARow(int row, int size) {
       String aLine="";
        for (int col = 1; col <= size; col++) {
            if (col >= size / 2 && col <= size / 2 + 2 && row == 1) {
                aLine=aLine+" #";
            } else if (row + col == size / 2 + 1) {
                aLine=aLine+" #";
            } else if (row == size / 2 + 1) {
                aLine=aLine+" #";
            } else if ((col == 1 || col == size) && row >= size / 2) {
                aLine=aLine+" #";
            } else if (row < size / 2 && row > 1 && col - row == size / 2 + 1) {
                aLine=aLine+" #";
            } else {
                aLine=aLine+"  ";
            }
        }
        return aLine;
    }

    String displayRRow(int row, int size) {
        String rLine="";
        for (int col = 1; col <= size; col++) {
            if (col == 1) {
                rLine=rLine+" #";
            } else if (col < size && col > 1 && row == 1) {
                rLine=rLine+" #";
            } else if (col == size && row < size / 2 && row > 1) {
                rLine=rLine+" #";
            } else if (row == size / 2 && col < size) {
                rLine=rLine+" #";
            } else if (row >= size / 2 && row - col == 0) {
                rLine=rLine+" #";
            } else {
                rLine=rLine+"  ";
            }
        }
        return rLine;
    }
    int size(int size){
        if(size==1){
            return 7;
        }
        if(size%2!=0){
            size++;
        }
         size=size+7;
        return size;
    }
}
