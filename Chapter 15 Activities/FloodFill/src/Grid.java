import java.util.*;
public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    Stack<Pair> z = new Stack<>();
    int count = 1;

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        z.push(new Pair(row, column));
        while(!z.isEmpty()){
            Pair p = z.pop();
            int row2 = p.getRow();
            int col2 = p.getColumn();

            if(ins (row2,col2) && pixels[row2][col2]==0){
                pixels[row2][col2] = count++;
                coordinates(row2,col2);
            }
        }
    }
    private boolean ins (int row, int col){
        if(row >= 0 && row < 10 && col >= 0 && col < 10){
            return true;
        }
        return false;
    }

    private void coordinates(int row, int col){
        if (ins(row, col - 1) && pixels[row][col - 1] == 0) z.push(new Pair(row, col - 1)); // Left
        if (ins(row - 1, col) && pixels[row - 1][col] == 0) z.push(new Pair(row - 1, col)); // Up 
        if (ins(row + 1, col) && pixels[row + 1][col] == 0) z.push(new Pair(row + 1, col)); // Down 
        if (ins(row, col + 1) && pixels[row][col + 1] == 0) z.push(new Pair(row, col + 1)); // Right 
    }
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
