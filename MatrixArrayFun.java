public class MatrixArrayFun
{

    private int[][] mat;

    // fill in mat with random integers from 0-9. mat has rowNumber rows and ColNumber columns    
    public MatrixArrayFun(int rowNumber, int colNumber)
    {   
        mat = new int [rowNumber] [colNumber];
        for(int row = 0; row < mat.length; row++)
        {
            for(int col = 0; col < mat[row].length; col++)
            {
                mat[row][col] = (int) (Math.random() * 10);
            }
        }
    }

    //write the getter for this class
    public int [][] getMat()
    {
        return mat;
    }

    // complete the method replaceAll below.    
    // replaceAll will replace all oldVal with newVal
    public void replaceAll(int oldVal, int newVal)
    {
        for(int row = 0; row < mat.length; row++)
        {
            for(int col = 0; col < mat[row].length; col++)
            {
                if (mat[row][col] == oldVal)
                    mat[row][col] = newVal;
            }
        }
    }

    // Complete method swapRows below. 
    // swapRows will swap rowOne and rowTwo
    public void swapRows(int rowOne, int rowTwo)
    {
        int [] temp = mat[rowTwo];
        mat[rowTwo] = mat[rowOne];
        mat[rowOne] = temp;
    }

    // Write the toString method below.
    public String toString()
    {
        String matStr = "";
        for(int row = 0; row < mat.length; row++)
        {
            for(int col = 0; col < mat[row].length; col++)
            {
                matStr += mat[row][col] + " ";
            }
            matStr += "\n";
        }
        return matStr;
    }
}
