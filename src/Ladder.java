public class Ladder extends Move{
    public Ladder(int startPostion, int endPosition) {
        super(startPostion, endPosition);
    }

    @Override
    public String getEncounterMessage() {
        return "Wohoo!! You got a laddder";
    }

    @Override
    public String getString() {
        return "L("+this.getEndPosition()+") ";
    }
}
