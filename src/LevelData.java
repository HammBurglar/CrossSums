class LevelData {

    private final int levelNumber;
    private final int rows;
    private final int cols;
    private final int[][] gridNumbers;
    private final int[] rowSums;
    private final int[] colSums;

    public LevelData(int levelNumber, int rows, int cols, int[][] gridNumbers,
                     int[] rowSums, int[] colSums) {
        this.levelNumber = levelNumber;
        this.rows = rows;
        this.cols = cols;
        this.gridNumbers = gridNumbers;
        this.rowSums = rowSums;
        this.colSums = colSums;
    }

    public int getLevelNumber() {
        return levelNumber;
    }
    public int getRows() {
        return rows;
    }
    public int getCols() {
        return cols;
    }
    public int[][] getGridNumbers() {
        return gridNumbers;
    }
    public int[] getRowSums() {
        return rowSums;
    }
    public int[] getColSums() {
        return colSums;
    }
}

