package section3;

public abstract class Player {
    protected String name;
    protected String teamName;
    protected int noOfMatches;

    public Player(String name, String teamName, int noOfMatches) {
        super();
        this.name = name;
        this.teamName = teamName;
        this.noOfMatches = noOfMatches;
    }
}
