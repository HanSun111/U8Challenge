import java.util.Arrays;
public class DeleteDuplicates {
    private int [][] example;

    public DeleteDuplicates(int [][] n){
        example = n;
    }

    public int [][] flipRC(int [][] n) {
        int[][] flippedRC = new int[n[0].length][n.length];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                flippedRC[j][i] = j;
            }
        }
        return flippedRC;
    }
// if contains dupes, report back true. assuming each row has the same amount of coloums
    public boolean containDuplicates(int [][] n){
        return true;
    }
}
