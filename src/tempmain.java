import javax.swing.*;

public class tempmain {

    public static void main(String[] args) {
        int[][] gridNumbers = {
                {2, 4, 9, 5, 2},
                {17, 3, 7, 7, 5},
                {5, 2, 2, 1, 7},
                {1, 3, 8, 2, 4},
                {5, 7, 1, 7, 7}
        };
        int[] rowSums = {12, 4, 10, 3, 7};
        int[] colSums = {6, 9, 7, 7, 3};
        LevelData testLevel = new LevelData(11, 5, 5, gridNumbers, rowSums, colSums);

        SwingUtilities.invokeLater(() -> new UserInterface(testLevel).setVisible(true));
    }
}
