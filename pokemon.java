/* 
This is the pokemon class which is mainly used to retrieve the information for the main file it is also for changing the health for the pokemon and to show the user the stats of all their pokemons
@author Parmin Patel
*/
public class pokemon {
  private String name;
  private String type;
  private int healthleft;
  private int healthtotal;
  private int attack;
  private int heal;

  /*
   * this initializes the pokemon attributes using parameters
   * 
   * @param n- Name of the pokemon, t- the type of the pokemon, healthL- the
   * pokemon's health left, healthT- the total health of the pokemon, a- the
   * attack a pokemon does to the opponent, h- the healing ability of the pokemon
   */
  public pokemon(String n, String t, int healthL, int healthT, int a, int h) {
    this.name = n;
    this.type = t;
    this.healthleft = healthL;
    this.healthtotal = healthT;
    this.attack = a;
    this.heal = h;

  }

  /*
   * this method is for the pokemons name
   * 
   * @return returns the name of the pokemon
   */
  public String getName() {
    return this.name;

  }

  /*
   * this method is for the type of the pokemon
   * 
   * @return it returns the type of the pokemon
   * 
   */
  public String getType() {
    return this.type;
  }

  /*
   * shows the remaining health of the pokemon
   * 
   * @return the health left of the pokemon
   * 
   */
  public int gethealthLeft() {
    return this.healthleft;
  }

  /*
   * this method is for the total health of the pokemon
   * 
   * @return returns the total health of the pokemon
   * 
   */
  public int gethealthTotal() {
    return this.healthtotal;
  }

  /*
   * this is for the attack a pokemon can do
   * 
   * @return it returns the attack a pokemon could do to another pokemon
   * 
   */
  public int getAttack() {
    return this.attack;
  }

  /*
   * this is to heal the pokemon
   * 
   * @return it returns the hp a pokemon can heal by
   * 
   */
  public int getHeal() {
    return this.heal;
  }

  /*
   * this method is to change the pokemons health depending on the attack of the
   * opposing pokemon this method also includes the heal ability
   * 
   * @param the attack done by the other players pokemon
   * 
   * @return the health remaining after the opposing pokemon has attacked the
   * pokemon
   */
  public int changeHealth(int damage) {
    // if the attack value is less then the health left in the pokemon then the
    // pokemon will be allowed to heal
    if (this.attack > this.healthleft) {
      this.healthleft = (this.healthleft + this.heal) - damage;
    }
    // if the statement above is false then the pokemon will lose health normally
    else {
      this.healthleft = this.healthleft - damage;
    }
    return this.healthleft;
  }

  /*
   * this method is to show the user the stats of the pokemon so they can decide
   * which pokemon to select for battle
   * 
   * @return the stats of the pokemon is shown to the players
   */
  public String toString() {
    String toReturn = " ";
    toReturn += "Name: " + this.name + "|";
    toReturn += " ";
    toReturn += "Type: " + this.type + "|";
    toReturn += " ";
    toReturn += " | Health Total: " + this.healthtotal + "|";
    toReturn += " ";
    toReturn += " | Health Left: " + this.healthleft + "|";
    toReturn += " ";
    toReturn += "| Attack: " + this.attack + "|";
    toReturn += " ";
    toReturn += "|Heal: " + this.heal + "|";

    return toReturn;

  }

}