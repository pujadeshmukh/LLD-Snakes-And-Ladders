public class Snake extends Move{
    public Snake(int startPostion, int endPosition) {
        super(startPostion, endPosition);
    }

    @Override
    public String getEncounterMessage() {
        return "Oops you encountered a SNAKE";
    }

    @Override
    public String getString() {
        return "S("+this.getEndPosition()+") "  ;
    }
}
