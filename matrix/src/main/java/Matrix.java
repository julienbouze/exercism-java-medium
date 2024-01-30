
class Matrix {
    String[] matrix;

    Matrix(String matrixAsString) {
        this.matrix = matrixAsString.split("\n");
    }

    int[] getRow(int rowNumber) {
        rowNumber--;
        String[] theRow = this.matrix[rowNumber].split(" ");
        int[] res = new int[theRow.length];
        for (int i = 0; i< theRow.length;i++){
            res[i]=Integer.parseInt(theRow[i]);
        }
        return res;
    }

    int[] getColumn(int columnNumber) {
        columnNumber--;
        int i = 0;
        int[] res = new int[this.matrix.length];
        for (String number : this.matrix){
            res[i]=Integer.parseInt(number.split(" ")[columnNumber]);
            i++;
        }
        return res;
    }
}
