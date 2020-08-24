
/* This is a pokemon battle game between 2 players each equip with 3 pokemons each and they both get the select which pokemon they will like to battle with. Then the winner of that battle will recieve a point and in total there are 3 battles so the player with the most points after the 3 battles will be declared the winner. This is a strategy game because the the total health and the attacking ability of the pokemon have a major imapct on deciding the winner. The health of the pokemons are constant however the attack of a pokemon is random so no player has advantage from the start its all based on luck. 

@author Parmin Patel

*/
// import all the packages/classes required for this game
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // This is to display the game wallpaper
    JFrame frame = new JFrame();
    ImageIcon pokemonimage = new ImageIcon("pokemon.jpg");
    JLabel pokemonlabel = new JLabel(pokemonimage);
    frame.add(pokemonlabel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);

    Scanner input = new Scanner(System.in);

    // players objects
    Player player1 = new Player();
    Player player2 = new Player();

    // pokemon objects
    // player 1 pokemons are being added to the arraylist in the Player class
    player1.pokemonadd("Pikachu", "Electric", 200, 200, (int) (Math.random() * 40 + 1), 15);
    player1.pokemonadd("Squirtle", "Water", 220, 220, (int) (Math.random() * 40 + 1), 10);
    player1.pokemonadd("ButterFree", "Bug", 250, 250, (int) (Math.random() * 40 + 1), 5);
    // player 2 pokemons are being added to the arraylist in the Player class
    player2.pokemonadd("Charmander", "Fire", 250, 250, (int) (Math.random() * 40 + 1), 5);
    player2.pokemonadd("Bulbasaur", "Leaf", 200, 200, (int) (Math.random() * 40 + 1), 15);
    player2.pokemonadd("Snorlax", "Normal", 200, 200, (int) (Math.random() * 40 + 1), 10);

    System.out.print("WELCOME TO ");
    System.out.print((char) 80);
    System.out.print((char) 79);
    System.out.print((char) 75);
    System.out.print((char) 69);
    System.out.print((char) 77);
    System.out.print((char) 79);
    System.out.print((char) 78);
    System.out.print(" ");
    System.out.print("WARRIOR ");
    System.out.println(" ");
    System.out.println("________________________");
    // prints out the instructions so user know how to play the game
    System.out.println(
        "INSTRUCTIONS: This is a 2 player game. Both players have 3 pokemons so you will be asked to select a pokemon by typing in the numbers 1, 2 or 3 and then pressing Enter.");
    System.out.println(
        "Player 1 will get to choose first and Player 2 will choose second then the choosen pokemons from both sides will battle automatically. ");
    System.out.println(
        "There are going to be 3 battles and the player that wins the most battles won in the end will WIN the game. HAVE FUN PLAYERS GOOD LUCK!! ");
    // prints out the pokemon stats so users know which pokemon to select
    System.out.println("________________________");
    System.out.println("Player 1 Pokemons: ");
    System.out.println(player1);
    System.out.println("Player 2 Pokemons: ");
    System.out.println(player2);
    // variable that are needed for the game
    int p1score = 0;
    int p2score = 0;
    int p1healthLeft = 0;
    int p2healthLeft = 0;
    int p1select;
    int p2select;
    // This loop alllows the players to battle 3 times
    for (int i = 0; i < 3; i++) {

      int round = 0;
      System.out.println(" ");
      System.out.println("________________________");
      // asks the first player which pokemon he wants to battle with
      System.out.println("Player 1 Pokemons are: |1.Pikachu | 2. Squirtle | 3. ButterFree | ");
      System.out.println("Player 1 please choose the Pokemon you like to battle with(1-3)");
      p1select = input.nextInt();
      // if the user enters a number besides 1,2 or 3 then he picks again
      while (p1select > 3 || p1select < 1) {

        System.out.println("________________________");
        System.out.println("Please enter a valid number to select the Pokemon(1-3)");

        System.out.println("Player 1 Pokemons are: |1.Pikachu | 2. Squirtle | 3. ButterFree | ");
        System.out.println("Player 1 please choose the Pokemon you like to battle with(1-3)");
        p1select = input.nextInt();
      }
      // if user selects a fainted pokemon then he can pick another pokemon
      while (player1.selectPokemon(p1select - 1).gethealthLeft() <= 0) {
        System.out.println("________________________");
        System.out.println("POKEMON HAS FAINTED! Please select another Pokemon. ");
        System.out.println("Player 1 Pokemons are: |1.Pikachu | 2. Squirtle | 3. ButterFree | ");
        System.out.println("Player 1 please choose the Pokemon you like to battle with(1-3)");
        p1select = input.nextInt();
        System.out.println("________________________");
      }
      // asks the first player which pokemon he wants to battle with
      System.out.println("________________________");
      System.out.println("Player 2 Pokemons are: |1.Charmander | 2. Bulbasaur | 3.Snorlax | ");
      System.out.println("Player 2 please choose the Pokemon you like to battle with(1-3)");
      p2select = input.nextInt();
      // asks player 2 to enter the number again if it is not between 1 and 3
      while (p2select > 3 || p2select < 1) {
        System.out.println("________________________");
        System.out.println("Please enter a valid number to select the Pokemon(1-3)");
        System.out.println("Player 2 Pokemons are: |1.Charmander | 2. Bulbasaur | 3.Snorlax | ");
        System.out.println("Player 2 please choose the Pokemon you like to battle with(1-3)");
        p2select = input.nextInt();
      }
      // if player 2 selects a fainted pokemon he will be asked to select another
      // pokemon
      while (player2.selectPokemon(p2select - 1).gethealthLeft() <= 0) {
        System.out.println(" ");
        System.out.println("________________________");
        System.out.println("POKEMON HAS FAINTED! Please select another Pokemon. ");
        System.out.println("Player 2 Pokemons are: |1.Charmander | 2. Bulbasaur | 3.Snorlax | ");
        System.out.println("Player 2 please choose the Pokemon you like to battle with(1-3)");
        p2select = input.nextInt();
      }
      // this loop only runs if the health of player 1 and pokemon are above 0
      while (player1.selectPokemon(p1select - 1).gethealthLeft() > 0
          && player2.selectPokemon(p2select - 1).gethealthLeft() > 0) {
        round += 1;
        System.out.println(" ");
        System.out.println("Round: " + round);
        System.out.println("________________________");
        // player 1 attacks player 2 and pokemon loses health
        p2healthLeft = player2.selectPokemon(p2select - 1)
            .changeHealth(player1.selectPokemon(p1select - 1).getAttack());
        // player 2 attacks player 1 and pokemon loses health
        p1healthLeft = player1.selectPokemon(p1select - 1)
            .changeHealth(player2.selectPokemon(p2select - 1).getAttack());
        // a varaible for the total health of player 1
        int p1totalhealth = player1.selectPokemon(p1select - 1).gethealthTotal();
        // a variable for the total health of player 2
        int p2totalhealth = player2.selectPokemon(p2select - 1).gethealthTotal();
        // if the health goes below 0 it sets the health to 0
        if (p1healthLeft < 0) {
          p1healthLeft = 0;
        }

        if (p2healthLeft < 0) {
          p2healthLeft = 0;
        }
        // if player 2 health is 0 or less than 0 it prints out stats for each pokemon
        // and player 1 wins that battle and recieves the point
        if (p2healthLeft <= 0) {
          System.out.println(" ");
          System.out.print("Player 1: ");
          System.out
              .print(player1.selectPokemon(p1select - 1).getName() + "(" + player1.selectPokemon(p1select - 1).getType()
                  + "):" + (player1.selectPokemon(p1select - 1).gethealthLeft()
                      + (player2.selectPokemon(p2select - 1).getAttack()) + "/" + p1totalhealth));

          System.out.println(" ");
          System.out.print("Player 2: ");
          System.out.print(player2.selectPokemon(p2select - 1).getName() + "("
              + player2.selectPokemon(p2select - 1).getType() + ")" + p2healthLeft + "/" + p2totalhealth);

          System.out.println(" ");
          p1score += 1;
          System.out.println(" ");
          System.out.println("Player 1 WINS this BATTLE! ");
          System.out.println(" ");
        }
        // if player 1 doesn't win then the stats just get printed for each players
        // pokemon
        else {
          System.out.println(" ");
          System.out.print("Player 1: ");
          System.out.print(player1.selectPokemon(p1select - 1).getName() + "("
              + player1.selectPokemon(p1select - 1).getType() + "):" + p1healthLeft + "/" + p1totalhealth);

          System.out.println(" ");
          System.out.print("Player 2: ");
          System.out.print(player2.selectPokemon(p2select - 1).getName() + "("
              + player2.selectPokemon(p2select - 1).getType() + ")" + p2healthLeft + "/" + p2totalhealth);
          System.out.println(" ");

        }
      }
      // if player 2 health is more than player 1 then player 2 wins the battle and
      // recieves a point
      if (p2healthLeft > p1healthLeft) {
        p2score += 1;
        System.out.println("________________________");
        System.out.println(" ");
        System.out.println("Player 2 WINS this BATTLE!");
        System.out.println(" ");
      }

    }
    // shows the both player the total point after the battles have ended
    System.out.println(" ");
    System.out.println("Player 1 Score: " + p1score);
    System.out.println("Player 2 Score: " + p2score);
    // decides which player wins the entire game depending on the point they have
    // recieved
    if (p1score > p2score) {
      System.out.println("PLAYER 1 is VICTORIOUS! ");
      System.exit(0);
    } else {
      System.out.println("PLAYER 2 is VICTORIOUS! ");
      System.exit(0);
    }

  }
}