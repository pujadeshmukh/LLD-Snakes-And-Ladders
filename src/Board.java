import java.util.HashMap;

public class Board {
    HashMap<Integer,Move> cells;
    int cellCount;
    Board(int dimensions){
        this.cellCount = dimensions * dimensions;
        cells = new HashMap<Integer,Move>();
        //Randomly generate Snakes and Ladders
        for(int i=0;i<dimensions;i++){
            int min = 2;
            int max = cellCount -1;
            int start = (int)Math.floor(Math.random()*(max-min+1)+min);
            max = start -1;
            int end = (int)Math.floor(Math.random()*(max-min+1)+min);
            if(!hasSnakeOrLadder(start)){
                setEntity(start,new Snake(start,end));
            }
            max = cellCount - 1;
            end = (int)Math.floor(Math.random()*(max-min+1)+min);
            max = end-1;
            start = (int)Math.floor(Math.random()*(max-min+1)+min);
            if(!hasSnakeOrLadder(start)){
                setEntity(start,new Ladder(start,end));
            }

        }
    }

    private void setEntity(int start, Move move) {
        cells.put(start,move);
    }

    public Move getEnity(int start){
        return cells.get(start);
    }
    boolean hasSnakeOrLadder(int start) {
        return cells.containsKey(start);
    }
    public void printBoard(){
        for(int i=cellCount-1;i>0;i--){
            System.out.print(i+ " ");
            if(hasSnakeOrLadder(i)){
                System.out.print(cells.get(i).getString());
            }else{
                System.out.print("      ");
            }
            if(i % 10 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
