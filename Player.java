
/* This class is for the player obejcts which are referenced 
to the same ArrayList and are able to access through the player object.

The players are eqquiped with 3 pokemons each which then are used to battle against each other

@author Parmin Patel
*/
import java.util.ArrayList;

public class Player {
  private ArrayList<pokemon> pokemons;

  /*
   * This is the constructor for the Player class which gives the ArrayList its
   * name It is also used to initialize the Player objects
   * 
   */
  public Player() {
    this.pokemons = new ArrayList<pokemon>();

  }

  /*
   * Adds the pokemon to the ArrayList which later on is used for battle between
   * the players pokemons
   * 
   * @param name of the pokemon, the type of the pokemon, the health left within
   * the pokemon, the total health a pokemon has, the attack a pokemon does to the
   * opposing pokemon, the healing ability the pokemon has.
   * 
   */
  public void pokemonadd(String n, String t, int healthL, int healthT, int a, int h) {

    pokemon toAdd = new pokemon(n, t, healthL, healthT, a, h);

    pokemons.add(toAdd);
  }
  /*
   * This method allows the players to access the pokemons within the ArrayList
   * 
   * @param the index at which the pokemon is stored in
   * 
   * @return the pokemon at a certain index based on user input
   */

  public pokemon selectPokemon(int index) {
    return pokemons.get(index);

  }
  /*
   * this toString is to show the 2 players the stats of each pokemon
   * 
   * @return the pokemon stats for both players
   */

  public String toString() {
    String toReturn = " ";

    for (pokemon i : pokemons) {
      toReturn += i.toString() + "\n ";
    }
    return toReturn;

  }

}