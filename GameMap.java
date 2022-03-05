package TestLearning;

public class GameMap {

    char[][] map;
    char[] digits;
    int indexer;
    int xLocation;
    int yLocation;

    public GameMap() {
        this.map = new char[5][5];
        this.digits = new char[10];
        for (int i = 0; i < 10; i++) {
            digits[i] = (char) (i + '0');
        }
        this.indexer = 1;
        this.xLocation = 2;
        this.yLocation = 2;
        setDefaultMap();
    }
    private GameMap(char[][] map,char[] digits, int indexer, int xLocation, int yLocation){
        this.map = map;
        this.digits = digits;
        this.indexer = indexer;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
    }

    private void setDefaultMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++)
                map[i][j] = '.';
        }
        map[yLocation][xLocation] = digits[indexer];
    }

    public void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }

    }


    public int getIndexer() {
        return indexer;
    }

    public int getxLocation() {
        return xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    public void incrementChar() {
        if (indexer < 9)
            map[yLocation][xLocation] = digits[++indexer];
    }

    public void decrementChar() {
        if (indexer > 0)
            map[yLocation][xLocation] = digits[--indexer];
    }

    public void MoveUp() {
        map[yLocation][xLocation] = '.';
        map[--yLocation][xLocation] = digits[indexer];
    }

    public void MoveDown() {
        map[yLocation][xLocation] = '.';
        map[++yLocation][xLocation] = digits[indexer];
    }

    public void MoveRight() {
        map[yLocation][xLocation] = '.';
        map[yLocation][++xLocation] = digits[indexer];
    }

    public void MoveLeft() {
        map[yLocation][xLocation] = '.';
        map[yLocation][--xLocation] = digits[indexer];
    }
    public GameMap cloneMap(){
        GameMap cloned = new GameMap(this.map, this.digits, this.indexer, this.xLocation, this.yLocation);
        return cloned;
    }
    public void loadMap(GameMap map){
        this.map[this.yLocation][this.xLocation] = '.';
        this.indexer = map.getIndexer();
        this.xLocation = map.getxLocation();
        this.yLocation = map.getyLocation();
        this.map[this.yLocation][this.xLocation] = digits[indexer];

    }

}
/*
                1 2 3 4 5
                1 2 3 4 5
                1 2 3 4 5
                1 2 3 4 5
                1 2 3 4 5    */



