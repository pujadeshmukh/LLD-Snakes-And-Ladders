public abstract class Move {
    private int startPostion;
    private int endPosition;


    public Move(int startPostion, int endPosition) {
        this.startPostion = startPostion;
        this.endPosition = endPosition;
    }

    public abstract String getEncounterMessage();
    public abstract String getString();

    public int getEndPosition() {
        return endPosition;
    }
}
