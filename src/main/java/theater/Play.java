package theater;

/**
 * Represents a play with a name and type.
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Gets the name of the play.
     *
     * @return the play name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the type of the play.
     *
     * @return the play type
     */
    public String getType() {
        return type;
    }
}
