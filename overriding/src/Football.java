/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class Football extends Sports {
    private final String name = "Football";
    private final int numberOfPlayers = 11;

    @Override
    String getName() {
        return this.name;
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has "+numberOfPlayers+" players in " + getName());
    }
}

