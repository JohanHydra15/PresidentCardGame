/*Ace High Final Cpt
Programmed by Johan Sebastiampillai on June 13, 2017
This program is a based on the card game president. However, our game is different as it has special cards to allow players to be skipped, burn cards, burn the deck, or give
the next person an extra card. In order to win players must all put down cards higher than the one from before until all the cards are finished in a deck*/
import java.awt.*;
import hsa.Console;
import javax.swing.JOptionPane; //Used for JOptionPane to display errors in the users input in a seperate window and then close afterwards
public class AceHighFinalCpt
{
    static Console c = new Console (39, 176); //console for playing game
    static Color tableGreen = new Color (0, 153, 0); //color created for table
    static Color carpet = new Color (0, 51, 102); //color created for carpet beneath table
    static Font keyWords = new Font ("Times New Roman", Font.BOLD + Font.ITALIC, 40); //font for most keywords in game
    static Font instructions = new Font ("Lucida Console", Font.BOLD, 70);
    static Font instructions2 = new Font ("Lucida Console", Font.BOLD, 35);
    public static void main (String[] args)  //main method
    {
	//declaration of arrays for main deck and the decks of the four players
	int[] allCards = new int [52];
	int[] playerDeck = new int [14];
	int[] oppDeck1 = new int [14];
	int[] oppDeck2 = new int [14];
	int[] oppDeck3 = new int [14];
	//calls main menu method to start the game
	mainMenu (allCards, playerDeck, oppDeck1, oppDeck2, oppDeck3, 0);
    } //end of main method

    //method to ask user if they want to play, see rules, or exit
    public static void mainMenu (int[] cards, int[] deck1, int[] deck2, int[] deck3, int[] deck4, int counter)
    {
	int blueShade = 2, db = 1; //variable decleration and assignment
	char menuInput;
	Font menu = new Font ("Broadway", Font.BOLD, 100); //creating fonts
	Font menu2 = new Font ("Lucida Console", Font.BOLD, 100);
	Font menu3 = new Font ("Bauhaus 93", Font.PLAIN, 200);
	//creating blue spiral background for menu
	menuBackground (0, 0, blueShade, db, 1, 0);
	menuBackground (c.maxx (), 0, blueShade, db, 0, 1);
	menuBackground (c.maxx (), c.maxy (), blueShade, db, -1, 0);
	menuBackground (0, c.maxy (), blueShade, db, 0, -1);
	delay (900000000); //method to delay
	//draws mouse logo in background
	c.setColor (Color.black);
	c.fillOval (200, 130, 400, 300);
	c.setColor (Color.black);
	c.fillOval (800, 130, 400, 300);
	c.setColor (Color.black);
	c.fillOval (450, 200, 500, 500);
	c.setColor (Color.white);
	c.fillOval (480, 280, 170, 190);
	c.fillOval (750, 280, 170, 190);
	c.fillArc (500, 380, 400, 300, 180, 180);
	delay (900000000);
	//displays the options, title, and company
	c.setFont (menu3);
	c.setColor (Color.black);
	c.drawString ("ACE HIGH", 285, 145);
	c.setColor (Color.green);
	c.drawString ("ACE HIGH", 300, 150);
	c.setColor (Color.black);
	c.setFont (menu2);
	c.drawString ("Play[a]", -10, 545);
	c.drawString ("Help[b]", -10, 695);
	c.drawString ("Exit[c]", 940, 595);
	c.setColor (Color.red);
	c.drawString ("Play[a]", 5, 550);
	c.drawString ("Help[b]", 5, 700);
	c.drawString ("Exit[c]", 955, 600);
	c.setFont (menu);
	c.setColor (Color.black);
	c.drawString ("deadmau5 Inc.", 485, 765);
	c.setColor (Color.orange);
	c.drawString ("deadmau5 Inc.", 500, 770);
	//checks what the user enters
	do
	{
	    menuInput = c.getChar ();
	    if (menuInput == 'a')
	    {
		play (cards, deck1, deck2, deck3, deck4); //allow them to play the game
		counter = 1;
		break;
	    }
	    else if (menuInput == 'b')
	    {
		instructions (); //tells the user the rules
		counter = 1;
		break;
	    } //end of else if
	    else if (menuInput == 'c')
	    {
		//fills background
		c.setColor (Color.black);
		c.fillRect (0, 0, 1500, 900);
		exitScreen (0, 255, 0); //exits the game
		delay (900000000);
		exitScreen (0, 0, 0); //exits the game
		delay (900000000);
		exitScreen (0, 255, 0); //exits the game
		delay (900000000);
		exitScreen (0, 0, 0); //exits the game
		delay (900000000);
		exitScreen (0, 255, 0); //exits the game
		break;
	    } //end of else if
	} //end of do while loop
	while (menuInput != 'a' || menuInput != 'b' || menuInput != 'c'); //continue loop if none of the choices are chosen
	if (counter == 1)
	    mainMenu (cards, deck1, deck2, deck3, deck4, 0); //calls the main menu again
    } //end of mainMenu method

    public static void delay (int time)  //method called when a delay is needed
    {
	for (int h = 0 ; h < time ; h++)
	    ;
    } //end of delay method

    public static void exitScreen (int red, int green, int blue)  //if user choses exit
    {
	//prints GAME OVER
	Color gameOver = new Color (red, green, blue);
	c.setColor (gameOver);
	//G
	c.fillOval (370, 250, 20, 20);
	c.fillOval (400, 220, 20, 20);
	c.fillOval (430, 220, 20, 20);
	c.fillOval (460, 220, 20, 20);
	c.fillOval (490, 220, 20, 20);
	c.fillOval (370, 280, 20, 20);
	c.fillOval (370, 310, 20, 20);
	c.fillOval (400, 340, 20, 20);
	c.fillOval (430, 340, 20, 20);
	c.fillOval (460, 340, 20, 20);
	c.fillOval (490, 340, 20, 20);
	c.fillOval (490, 310, 20, 20);
	c.fillOval (490, 280, 20, 20);
	c.fillOval (460, 280, 20, 20);
	//A
	c.fillOval (540, 340, 20, 20);
	c.fillOval (540, 310, 20, 20);
	c.fillOval (540, 280, 20, 20);
	c.fillOval (560, 250, 20, 20);
	c.fillOval (580, 220, 20, 20);
	c.fillOval (600, 250, 20, 20);
	c.fillOval (620, 340, 20, 20);
	c.fillOval (620, 310, 20, 20);
	c.fillOval (620, 280, 20, 20);
	c.fillOval (565, 310, 20, 20);
	c.fillOval (595, 310, 20, 20);
	//M
	c.fillOval (670, 340, 20, 20);
	c.fillOval (670, 310, 20, 20);
	c.fillOval (670, 280, 20, 20);
	c.fillOval (670, 250, 20, 20);
	c.fillOval (670, 220, 20, 20);
	c.fillOval (695, 245, 20, 20);
	c.fillOval (720, 265, 20, 20);
	c.fillOval (745, 245, 20, 20);
	c.fillOval (770, 220, 20, 20);
	c.fillOval (770, 340, 20, 20);
	c.fillOval (770, 310, 20, 20);
	c.fillOval (770, 280, 20, 20);
	c.fillOval (770, 250, 20, 20);
	//E
	c.fillOval (820, 220, 20, 20);
	c.fillOval (850, 220, 20, 20);
	c.fillOval (880, 220, 20, 20);
	c.fillOval (910, 220, 20, 20);
	c.fillOval (820, 250, 20, 20);
	c.fillOval (820, 280, 20, 20);
	c.fillOval (820, 310, 20, 20);
	c.fillOval (820, 340, 20, 20);
	c.fillOval (880, 340, 20, 20);
	c.fillOval (910, 340, 20, 20);
	c.fillOval (850, 340, 20, 20);
	c.fillOval (880, 280, 20, 20);
	c.fillOval (850, 280, 20, 20);
	//O
	c.fillOval (400, 400, 20, 20);
	c.fillOval (430, 400, 20, 20);
	c.fillOval (460, 400, 20, 20);
	c.fillOval (370, 430, 20, 20);
	c.fillOval (370, 460, 20, 20);
	c.fillOval (370, 490, 20, 20);
	c.fillOval (400, 520, 20, 20);
	c.fillOval (430, 520, 20, 20);
	c.fillOval (460, 520, 20, 20);
	c.fillOval (490, 430, 20, 20);
	c.fillOval (490, 460, 20, 20);
	c.fillOval (490, 490, 20, 20);
	//V
	c.fillOval (540, 400, 20, 20);
	c.fillOval (540, 430, 20, 20);
	c.fillOval (540, 460, 20, 20);
	c.fillOval (560, 490, 20, 20);
	c.fillOval (580, 520, 20, 20);
	c.fillOval (600, 490, 20, 20);
	c.fillOval (620, 400, 20, 20);
	c.fillOval (620, 430, 20, 20);
	c.fillOval (620, 460, 20, 20);

	//E
	c.fillOval (670, 400, 20, 20);
	c.fillOval (700, 400, 20, 20);
	c.fillOval (730, 400, 20, 20);
	c.fillOval (760, 400, 20, 20);
	c.fillOval (670, 430, 20, 20);
	c.fillOval (670, 460, 20, 20);
	c.fillOval (670, 490, 20, 20);
	c.fillOval (670, 520, 20, 20);
	c.fillOval (700, 520, 20, 20);
	c.fillOval (730, 520, 20, 20);
	c.fillOval (760, 520, 20, 20);
	c.fillOval (700, 460, 20, 20);
	c.fillOval (730, 460, 20, 20);
	//R
	c.fillOval (820, 400, 20, 20);
	c.fillOval (820, 430, 20, 20);
	c.fillOval (820, 460, 20, 20);
	c.fillOval (820, 490, 20, 20);
	c.fillOval (820, 520, 20, 20);
	c.fillOval (820, 400, 20, 20);
	c.fillOval (850, 400, 20, 20);
	c.fillOval (880, 400, 20, 20);
	c.fillOval (900, 430, 20, 20);
	c.fillOval (900, 430, 20, 20);
	c.fillOval (850, 460, 20, 20);
	c.fillOval (880, 460, 20, 20);
	c.fillOval (900, 490, 20, 20);
	c.fillOval (900, 520, 20, 20);
    } //end of exitScreen method

    //called from mainMenu method to change the color and position of line to draw gradient background
    public static void menuBackground (int x2, int y2, int blue, int dblue, int dx, int dy)
    {
	int x1 = c.maxx () / 2, y1 = c.maxy () / 2;
	for (int i = 0 ; i < 1450 ; i++)
	{
	    if (blue > 254 || blue < 1)
	    {
		dblue = -dblue;
	    } //end of if
	    blue += dblue;
	    Color myColor = new Color (0, 0, blue);
	    c.setColor (myColor);
	    c.drawLine (x1, y1, x2, y2);
	    x2 += dx;
	    y2 += dy;
	} //end of for
    } //end of menuBackground method

    public static void play (int[] cardDeck, int[] deckA, int[] deckB, int[] deckC, int[] deckD)  //method to allow the players to play
    {
	//variable decleration
	int xCards = 65, yCards = 400, xPositionNumber = 0, yPositionNumber = 395; //initialized starting coordinates for drawing background and cards
	int[] check = new int [1]; //array to store value of previously entered card
	int[] passCounter = new int [1]; //array to store the number of times passed
	int[] cardsLeft = {1, 1, 1, 1}; //array to store the values of the cards left in each deck
	int[] checkSkipped = {0}; //array to store a number when Jack is entered so that the next person playing a card is skipped
	int[] burnVal = new int [1]; //array to store a number when Ace is played so that the player who placed the ace starts again
	int[] ranking = new int [4]; //array to store the ranking of the players
	//draws table, carpet, and animation of cards
	drawBackground (xPositionNumber, yPositionNumber);
	//generates cards to store in decks
	generateCards (cardDeck, deckA, deckB, deckC, deckD);
	//draws the cards in users deck
	displayCards (deckA, xCards, yCards);
	for (int b = 0 ; b < 25 ; b++)
	{
	    placeUserCards (deckA, deckB, deckC, deckD, check, passCounter, cardsLeft, checkSkipped, burnVal, ranking); //method to ask the user what card to place
	} //end of for loop
	delay (100000000); //calling method to delay
	displayScore (ranking); //method to display score after everyone is done
    } //end of play method

    public static void displayScore (int[] scoreRank)  //method to show who won the game
    {
	char intructionsInput; //variable decleration
	//prints the scores of who won
	c.setColor (Color.black);
	c.fillRect (0, 0, c.maxx (), c.maxy ());
	c.setColor (Color.white);
	c.setFont (instructions);
	c.drawString ("Score", 250, 100);
	c.setFont (instructions2);
	//score rank array is passed from the checkCardsLeft method
	c.drawString ("President: Player " + scoreRank [0], 10, 200);
	c.drawString ("Vice President: Player " + scoreRank [1], 10, 250);
	c.drawString ("Servant: Player " + scoreRank [2], 10, 300);
	c.drawString ("Scum: Player " + scoreRank [3], 10, 350);
	c.drawString ("Enter any key to return to menu.", 10, 700);
	c.setColor (Color.red);
	c.drawString ("President:", 10, 200);
	c.drawString ("Vice President:", 10, 250);
	c.drawString ("Servant:", 10, 300);
	c.drawString ("Scum:", 10, 350);
	delay (100000000); //method to delay
	intructionsInput = c.getChar (); //allows the user to enter any key to return back to the menu
    }

    public static void instructions ()  //method to print instructions if user enter b in the main menu
    {
	char intructionsInput; //variable decleration
	//graphics and explanation for the rules
	c.setColor (Color.black);
	c.fillRect (0, 0, c.maxx (), c.maxy ());
	c.setColor (Color.white);
	c.setFont (instructions);
	c.drawString ("Welcome to Ace High!", 250, 100);
	c.setFont (instructions2);
	c.drawString ("In this game, each person will be given 13 cards and must ", 10, 200);
	c.drawString ("place cards in order. Finish all cards to win.", 10, 250);
	c.drawString ("Special Cards:", 10, 300);
	c.drawString ("J: person after you gets skipped", 10, 350);
	c.drawString ("Q: give next person extra card if they have less than 13", 10, 400);
	c.drawString ("cards", 78, 450);
	c.drawString ("K: discard any card you want", 10, 500);
	c.drawString ("A: burn the deck so it starts from the lowest card", 10, 550);
	c.drawString ("Order of suits: diamonds, clubs, hearts, spades", 10, 600);
	c.drawString ("Card Order: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A", 10, 650);
	c.drawString ("Ranking: Prez, VP, servant, scum", 10, 700);
	c.drawString ("Enter any key to scroll down.", 10, 750);
	c.setColor (Color.red);
	c.drawString ("Special Cards:", 10, 300);
	c.drawString ("J:", 10, 350);
	c.drawString ("Q:", 10, 400);
	c.drawString ("K: ", 10, 500);
	c.drawString ("A:", 10, 550);
	c.drawString ("Order of suits: ", 10, 600);
	c.drawString ("Card Order:", 10, 650);
	c.drawString ("Ranking:", 10, 700);
	intructionsInput = c.getChar (); //if user enter a key, scrolls down
	c.setColor (Color.black);
	c.fillRect (0, 0, c.maxx (), c.maxy ());
	c.setColor (Color.red);
	c.drawString ("Pass Rules:", 10, 50);
	c.setColor (Color.white);
	c.drawString ("Enter p to pass.", 10, 100);
	c.drawString ("If a card is played, and all other players with cards pass,", 10, 150);
	c.drawString ("the person who played the card starts again.", 10, 200);
	c.drawString ("After a player wins, the remaining players must", 10, 250);
	c.drawString ("play a card higher than the last card the winning player", 10, 300);
	c.drawString ("played. If no one can go, the player after the winning player", 10, 350);
	c.drawString ("starts.", 10, 400);
	c.drawString ("If a player has won, and the player before him plays a Queen,", 10, 500);
	c.drawString ("the player is back in the game with the one card.", 10, 550);
	c.drawString ("Enjoy the game:)", 10, 650);
	c.drawString ("Enter any key to return to main menu.", 10, 750);
	intructionsInput = c.getChar (); //if user enter a key, return to main menu
    } //end of instructions method

    public static void drawBackground (int xPositionNum, int yPositionNum)  //method to draw the graphics of the game screen
    {
	c.setFont (keyWords); //times new roman font
	//array for printing the values under the cards
	String[] num = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"};
	//graphics for background
	c.setColor (carpet);
	c.fillRect (0, 0, 10000, 900);
	c.setColor (Color.gray);
	c.fillOval (-10, 2, 1435, 780);
	c.setColor (tableGreen);
	c.fillOval (2, 15, 1405, 750);
	c.setColor (Color.white);
	//calls  method to animate dealing of deck
	handoutCardsAnimation (537, 330);
	c.setColor (Color.white);
	//displays card positions
	for (int i = 0 ; i < 13 ; i++)
	{
	    c.drawString (num [i], xPositionNum + 90, yPositionNum + 175);
	    xPositionNum += 100;
	    if (i < 4)
	    {
		yPositionNum += 50;
	    } //end of if
	    else if (i > 7)
	    {
		yPositionNum -= 50;
	    } //end of else if
	} //end of for
	// displays opponent card decks
	c.setColor (Color.white);
	c.drawString ("Player 1", 50, 700);
	c.drawString ("(you)", 60, 750);
	c.drawString ("Player 2", 50, 100);
	c.drawString ("Player 3", 470, 100);
	c.drawString ("Player 4", 1100, 100);
	c.drawString ("[p] = pass", 1200, 750);
	//graphics for drawing the bots cards and
	c.fillRect (274, 130, 90, 130);
	c.fillRect (637, 30, 90, 130);
	c.fillRect (1000, 130, 90, 130);
	c.fillRect (537, 330, 90, 130);
	c.setColor (Color.red);
	c.fillRect (279, 135, 80, 120);
	c.fillRect (642, 35, 80, 120);
	c.fillRect (1005, 135, 80, 120);
	c.fillRect (542, 335, 80, 120);
    } //end of drawBackground method

    //animated dealing of deck
    public static void handoutCardsAnimation (int xHandoutCards, int yHandoutCards)
    {
	//decleration of variables
	int deckNumber = 0;
	for (int w = 0 ; w < 13 ; w++)
	{
	    for (int z = 0 ; z < 40 ; z++) //for user deck
	    {
		c.setColor (Color.white);
		c.fillRect (537, 330, 90, 130);
		c.fillRect (xHandoutCards, yHandoutCards, 90, 130);
		c.setColor (Color.red);
		c.fillRect (542, 335, 80, 120);
		c.fillRect (xHandoutCards + 5, yHandoutCards + 5, 80, 120);
		delay (5000000);
		c.setColor (tableGreen);
		c.fillRect (xHandoutCards, yHandoutCards, 90, 130);
		if (xHandoutCards < 665)
		    xHandoutCards += 10; //end of if
		else if (yHandoutCards < 600)
		    yHandoutCards += 10; //end of else if
	    } //end of inner for
	    c.setColor (Color.white);
	    c.fillRect (xHandoutCards, yHandoutCards, 90, 130);
	    c.setColor (Color.red);
	    c.fillRect (xHandoutCards + 5, yHandoutCards + 5, 80, 120);
	    deckNumber++;
	    xHandoutCards = 537;
	    yHandoutCards = 330;

	    for (int z = 0 ; z < 50 ; z++) //for player 2 deck
	    {
		c.setColor (Color.white);
		c.fillRect (537, 330, 90, 130);
		c.fillRect (xHandoutCards, yHandoutCards, 90, 130);
		c.setColor (Color.red);
		c.fillRect (542, 335, 80, 120);
		c.fillRect (xHandoutCards + 5, yHandoutCards + 5, 80, 120);
		delay (5000000);
		c.setColor (tableGreen);
		c.fillRect (xHandoutCards, yHandoutCards, 90, 130);
		if (xHandoutCards > 274)
		    xHandoutCards += -10; //end of if
		else if (yHandoutCards > 130)
		    yHandoutCards += -10; //end of else if
	    } //end of inner for
	    c.setColor (Color.white);
	    c.fillRect (xHandoutCards, yHandoutCards, 90, 130);
	    c.setColor (Color.red);
	    c.fillRect (xHandoutCards + 5, yHandoutCards + 5, 80, 120);
	    deckNumber++;
	    xHandoutCards = 537;
	    yHandoutCards = 330;
	    for (int z = 0 ; z < 50 ; z++) //for player 3 deck
	    {
		c.setColor (Color.white);
		c.fillRect (537, 330, 90, 130);
		c.fillRect (xHandoutCards, yHandoutCards, 90, 130);
		c.setColor (Color.red);
		c.fillRect (542, 335, 80, 120);
		c.fillRect (xHandoutCards + 5, yHandoutCards + 5, 80, 120);
		delay (5000000);
		c.setColor (tableGreen);
		c.fillRect (xHandoutCards, yHandoutCards, 90, 130);
		if (xHandoutCards < 637)
		    xHandoutCards += 10; //end of if
		else if (yHandoutCards > 30)
		    yHandoutCards += -10; //end of else if
	    } //end of inner for
	    c.setColor (Color.white);
	    c.fillRect (xHandoutCards, yHandoutCards, 90, 130);
	    c.setColor (Color.red);
	    c.fillRect (xHandoutCards + 5, yHandoutCards + 5, 80, 120);
	    deckNumber++;
	    xHandoutCards = 537;
	    yHandoutCards = 330;
	    for (int z = 0 ; z < 65 ; z++) //for player 4 deck
	    {
		c.setColor (Color.white);
		c.fillRect (537, 330, 90, 130);
		c.fillRect (xHandoutCards, yHandoutCards, 90, 130);
		c.setColor (Color.red);
		c.fillRect (542, 335, 80, 120);
		c.fillRect (xHandoutCards + 5, yHandoutCards + 5, 80, 120);
		delay (5000000);
		c.setColor (tableGreen);
		c.fillRect (xHandoutCards, yHandoutCards, 90, 130);
		if (xHandoutCards < 1000)
		    xHandoutCards += 10; //end of if
		else if (yHandoutCards > 130)
		    yHandoutCards += -10; //end of else if
	    } //end of inner for
	    c.setColor (Color.white);
	    c.fillRect (xHandoutCards, yHandoutCards, 90, 130);
	    c.setColor (Color.red);
	    c.fillRect (xHandoutCards + 5, yHandoutCards + 5, 80, 120);
	    deckNumber = 0;
	    xHandoutCards = 537;
	    yHandoutCards = 330;
	} //end of outer for
	c.setColor (tableGreen);
	c.fillRect (250, 130, 200, 230);
	c.fillRect (637, 30, 200, 230);
	c.fillRect (994, 120, 200, 230);
	c.fillRect (650, 570, 200, 170);
    } //end of handoutCardsAnimation method

    //method to fill the array for the main deck
    public static void generateCards (int[] mainDeck, int[] deckOne, int[] deckTwo, int[] deckThree, int[] deckFour)
    {
	//gives main deck nnumbers from 1 to 52
	for (int j = 1 ; j <= 52 ; j++)
	{
	    mainDeck [j - 1] = j;
	} //end of for
	//for loop to distribute and fill array for users decks
	for (int k = 0 ; k < 13 ; k++)
	{
	    distributeCards (mainDeck, deckOne, k);
	    distributeCards (mainDeck, deckTwo, k);
	    distributeCards (mainDeck, deckThree, k);
	    distributeCards (mainDeck, deckFour, k);
	} //end of for
	//assign values to the last element of the array to be able to verify which deck it is in other methods
	deckOne [13] = -2;
	deckTwo [13] = -3;
	deckThree [13] = -4;
	deckFour [13] = -5;
    } //end of generateCards method

    public static void distributeCards (int[] deckMain, int[] deck, int position)
    {
	int cardPosition; //decleration of variable
	//do while loop to distribute only one of each card to each deck
	do
	{
	    cardPosition = (int) (52 * Math.random ());
	    deck [position] = deckMain [cardPosition];
	} //end of do while loop
	while (deckMain [cardPosition] == 0);
	deckMain [cardPosition] = 0;
    } //end of distributeCards method

    //draws the cards in the users deck onto the table
    public static void displayCards (int[] firstDeck, int cardX, int cardY)
    {
	for (int l = 0 ; l < 13 ; l++)
	{
	    c.setColor (Color.white);
	    c.fillRect (cardX, cardY, 90, 130);
	    drawCards (firstDeck, cardX, cardY, l);
	    cardX += 100;
	    if (l < 4)
		cardY += 50; //end of if
	    else if (l > 7)
		cardY -= 50; //end of else if
	} //end of for
    } //end of displayCards method

    //method called upon to draw a card given the numerical value of the card
    public static void drawCards (int[] card, int drawCardX, int drawCardY, int cardLocation)
    {
	//decleration of variables
	String[] cardValue = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"}; //array for the values of the cards
	int[] xValD = {drawCardX + 45, drawCardX + 22, drawCardX + 45, drawCardX + 67}; //polygon array for diamonds
	int[] yValD = {drawCardY + 32, drawCardY + 65, drawCardY + 97, drawCardY + 65};
	int[] xValH = {drawCardX + 22, drawCardX + 45, drawCardX + 67}; //polygon array for hearts
	int[] yValH = {drawCardY + 65, drawCardY + 97, drawCardY + 65};
	int[] xValS = {drawCardX + 22, drawCardX + 45, drawCardX + 67}; //polygon array for spades
	int[] yValS = {drawCardY + 62, drawCardY + 25, drawCardY + 62};
	Font cardVal = new Font ("Times New Roman", Font.PLAIN, 30); //font
	if (card [cardLocation] != 0)
	{
	    c.setColor (Color.white);
	    c.fillRect (drawCardX, drawCardY, 90, 130); //draw the actual card
	    //conditions for value of card to see what suit it is and then to draw it in the correct position
	    if (card [cardLocation] % 4 == 1)
	    {
		c.setColor (Color.red);
		c.fillPolygon (xValD, yValD, 4);
	    } //end of if
	    else if (card [cardLocation] % 4 == 2)
	    {
		c.setColor (Color.black);
		c.fillOval (drawCardX + 27, drawCardY + 25, 38, 38);
		c.fillOval (drawCardX + 42, drawCardY + 50, 38, 38);
		c.fillOval (drawCardX + 12, drawCardY + 50, 38, 38);
		c.fillRect (drawCardX + 38, drawCardY + 71, 15, 30);
	    } //end of else if
	    else if (card [cardLocation] % 4 == 3)
	    {
		c.setColor (Color.red);
		c.fillPolygon (xValH, yValH, 3);
		c.fillOval (drawCardX + 19, drawCardY + 32, 30, 42);
		c.fillOval (drawCardX + 41, drawCardY + 32, 30, 40);
	    } //end of else if
	    else
	    {
		c.setColor (Color.black);
		c.fillPolygon (xValS, yValS, 3);
		c.fillOval (drawCardX + 20, drawCardY + 52, 30, 40);
		c.fillOval (drawCardX + 40, drawCardY + 52, 30, 40);
		c.fillRect (drawCardX + 40, drawCardY + 71, 10, 35);
	    } //end of else
	    //conditions to determine the actual number value (2,J,A...)of the card and display it
	    c.setFont (cardVal);
	    if (card [cardLocation] % 4 != 0)
	    {
		c.drawString (cardValue [(card [cardLocation] / 4)], drawCardX + 2, drawCardY + 30);
	    } //end of if
	    else
	    {
		c.drawString (cardValue [card [cardLocation] / 4 - 1], drawCardX + 2, drawCardY + 30);
	    } //end of else
	} //end of outer if
    } //end of drawCards method

    //method called upon to show the opponents deck placing a card
    public static void placeCardAnimation (int[] deckBot)
    {
	//checks which deck is placing a card
	if (deckBot [13] == -3) //player 2
	{
	    animateCards (274, 130, 10, 70);
	    c.setColor (Color.white);
	    c.fillRect (274, 130, 90, 130);
	    c.setColor (Color.red);
	    c.fillRect (279, 135, 80, 120);
	} //end of if
	else if (deckBot [13] == -4) //player 3
	{
	    animateCards (637, 30, 10, 50);
	    c.setColor (Color.white);
	    c.fillRect (637, 30, 90, 130);
	    c.setColor (Color.red);
	    c.fillRect (642, 35, 80, 120);
	} //end of else if
	else //player 4
	{
	    animateCards (1000, 130, -10, 50);
	    c.setColor (Color.white);
	    c.fillRect (1000, 130, 90, 130);
	    c.setColor (Color.red);
	    c.fillRect (1005, 135, 80, 120);
	} //end of else
    } //end of placeCardAnimation

    //called from placeCardAnimation to display the animation
    public static void animateCards (int xAnimateCard, int yAnimateCard, int changeX, int cardAnimCount)
    {
	for (int v = 0 ; v < cardAnimCount ; v++)
	{
	    //graphics to move the cards
	    c.setColor (Color.white);
	    c.fillRect (xAnimateCard, yAnimateCard, 90, 130);
	    c.setColor (Color.red);
	    c.fillRect (xAnimateCard + 5, yAnimateCard + 5, 80, 120);
	    delay (5000000);
	    c.setColor (tableGreen);
	    c.fillRect (xAnimateCard, yAnimateCard, 90, 130);
	    if (yAnimateCard < 330)
		yAnimateCard += 10; //end of if
	    else if (xAnimateCard < 737)
		xAnimateCard += 10; //end of else if
	    else
		xAnimateCard += -10; //end of else
	} //end of for
	//redraws the card at its original position
	c.setColor (Color.white);
	c.fillRect (537, 330, 90, 130);
	c.setColor (Color.red);
	c.fillRect (542, 335, 80, 120);
    } //end of animateCards method

    //converts user input into a number to access the deck arrays
    public static int convertInput (char positionInput)
    {
	int inputUsers = -1; //decleratino of variable
	if (positionInput == 'a')
	    inputUsers = 0; //end of if
	else if (positionInput == 'b')
	    inputUsers = 1; //end of else if
	else if (positionInput == 'c')
	    inputUsers = 2; //end of else if
	else if (positionInput == 'd')
	    inputUsers = 3; //end of else if
	else if (positionInput == 'e')
	    inputUsers = 4; //end of else if
	else if (positionInput == 'f')
	    inputUsers = 5; //end of else if
	else if (positionInput == 'g')
	    inputUsers = 6; //end of else if
	else if (positionInput == 'h')
	    inputUsers = 7; //end of else if
	else if (positionInput == 'i')
	    inputUsers = 8; //end of else if
	else if (positionInput == 'j')
	    inputUsers = 9; //end of else if
	else if (positionInput == 'k')
	    inputUsers = 10; //end of else if
	else if (positionInput == 'l')
	    inputUsers = 11; //end of else if
	else if (positionInput == 'm')
	    inputUsers = 12; //end of else if
	else if (positionInput == 'p')
	    inputUsers = 25; //end of else if
	return inputUsers;
    }

    //method to allow user to enter a card to place and called from play method
    public static void placeUserCards (int[] myDeck, int[] botDeck1, int[] botDeck2, int[] botDeck3, int[] checkCard, int[] numPass, int[] numCardsLeft, int[] ifSkipped, int[] burn, int[] scoreRanking)
    {
	int input = -1, checkPass = 0, ifPass = 0; //variable declerationa and assignment statement
	char cardInput;
	numCardsLeft [0] = checkCardsLeft (myDeck, numCardsLeft, scoreRanking); //method to check cards left in deck
	if (numCardsLeft [0] != 13) //if there are still cards in the deck
	{
	    if (ifSkipped [0] == 1 || checkCard [0] < 37 || checkCard [0] > 40)  //if user enters a value more or less than a j
	    {
		c.setFont (keyWords);
		c.setColor (Color.blue);
		c.drawString ("YOUR TURN", 600, 570);
		delay (2000000000);
		c.setColor (tableGreen);
		c.drawString ("YOUR TURN", 600, 570);
		cardInput = c.getChar (); //gets user input for chosen card
		input = convertInput (cardInput); //converts input into a number to access array
		checkPass = 0;
		if (input != 25)
		{
		    if (input < 0 || input > 12)
		    {
			checkPass++;
		    } //end of if
		} //end of if

		if (input != 25) // error checkinguser input for card they want to place
		{
		    while (checkPass == 1 || myDeck [input] < checkCard [0] || myDeck [input] == 0)
		    {
			JOptionPane.showMessageDialog (null, "Error! Invalid option!"); //displays error message in a new window that you can close
			cardInput = c.getChar (); //gets user input for chosen card
			input = convertInput (cardInput); //converts input into a number to access array
			checkPass = 0;
			if (input != 25)
			{
			    if (input < 0 || input > 12)
			    {
				checkPass++;
			    } //end of if
			} //end of if
			else
			    break;
		    } //end of while
		} //end of if
		if (input != 25)
		{
		    drawCards (myDeck, 737, 330, input); //calls method to drawCard
		    checkCard [0] = myDeck [input]; //assigns the array the last cards that the user placed
		    if (myDeck [input] > 36 && myDeck [input] < 41) //if user places J its skips the next person
			ifSkipped [0] = 0;
		    else if (myDeck [input] > 40 && myDeck [input] < 45) //if user places Q it gives the next player an extra card
			giveExtraCard (botDeck1);
		    else if (myDeck [input] > 44 && myDeck [input] < 49) //if user places K it allows the user to discard a card
		    {
			myDeck [input] = -1;
			clearPlacedCard (myDeck);
			discardMyCard (myDeck, numCardsLeft, scoreRanking);
		    } //end of else if
		    else if (myDeck [input] > 48 && myDeck [input] < 53) //if user enters A it burns the deck to allow them to start again
		    {
			checkCard [0] = 0; //assigns the array the last cards that the user placed
			myDeck [input] = -1;
			clearPlacedCard (myDeck);
			//graphics to say burn
			c.setFont (instructions);
			c.setColor (Color.black);
			delay (900000000);
			c.drawString ("BURN", 692, 418);
			c.setColor (Color.red);
			c.drawString ("BURN", 700, 420);
			delay (900000000);
			c.setColor (tableGreen);
			c.fillRect (690, 330, 200, 170);
			placeUserCards (myDeck, botDeck1, botDeck2, botDeck3, checkCard, numPass, numCardsLeft, ifSkipped, burn, scoreRanking);
			burn [0] = 1;
		    }
		    myDeck [input] = -1;
		    clearPlacedCard (myDeck);
		    numPass [0] = 0;
		} //end of if
		else //if user enters 25
		{
		    pass (numPass, checkCard);
		    c.setFont (keyWords);
		    c.setColor (Color.blue);
		    c.drawString ("YOU PASS", 600, 570);
		    delay (900000000);
		    c.setColor (tableGreen);
		    c.drawString ("YOU PASS", 600, 570);
		    ifSkipped [0] = 1;
		}
	    } //end of if
	    else //if users turn is skipped
	    {
		c.setFont (keyWords);
		c.setColor (Color.blue);
		c.drawString ("Turn Skipped", 550, 570);
		delay (900000000);
		c.setColor (tableGreen);
		c.drawString ("Turn Skipped", 550, 570);
		ifSkipped [0] = 1;
		pass (numPass, checkCard);
	    } //end of else
	} //end of outer if
	else //if no more cards ar left in deck
	{
	    pass (numPass, checkCard);
	} //end of else

	if (burn [0] != 1) //checks if user places an ace so that the other players dont go and user starts
	{
	    numCardsLeft [1] = checkCardsLeft (botDeck1, numCardsLeft, scoreRanking); //checks cards left in player 2 deck
	    if (numCardsLeft [1] != 13) //if there are still cards left in deck
	    {
		if (ifSkipped [0] == 1 || checkCard [0] < 37 || checkCard [0] > 40) //checks if a jack was placed previously to skip the players turn
		{
		    ifPass = placeCard (botDeck1, botDeck2, checkCard, numPass, ifSkipped, scoreRanking);
		    ifSkipped [0] = 0;
		    numCardsLeft [1] = checkCardsLeft (botDeck1, numCardsLeft, scoreRanking);
		}
		else //if users turn is skipped
		{
		    ifPass = -1;
		    c.setFont (keyWords);
		    c.setColor (Color.blue);
		    c.drawString ("Skipped", 255, 340);
		    delay (900000000);
		    c.setColor (tableGreen);
		    c.drawString ("Skipped", 255, 340);
		    ifSkipped [0] = 1;
		    pass (numPass, checkCard);
		}
		if (ifPass == 0) //if player cant go
		{
		    c.setFont (keyWords);
		    c.setColor (Color.blue);
		    c.drawString ("PASS", 265, 340);
		    delay (900000000);
		    c.setColor (tableGreen);
		    c.drawString ("PASS", 265, 340);
		    ifSkipped [0] = 1;
		}
	    }
	    else //if player deck has no cards left
	    {
		pass (numPass, checkCard);
	    }
	    numCardsLeft [2] = checkCardsLeft (botDeck2, numCardsLeft, scoreRanking); //checks how many cards are left in player 3 deck
	    if (numCardsLeft [2] != 13) //if there are still cards left in the deck
	    {
		if (ifSkipped [0] == 1 || checkCard [0] < 37 || checkCard [0] > 40) //checks if a jack was placed previously to skip the players turn
		{
		    ifPass = placeCard (botDeck2, botDeck3, checkCard, numPass, ifSkipped, scoreRanking);
		    ifSkipped [0] = 0;
		    numCardsLeft [2] = checkCardsLeft (botDeck2, numCardsLeft, scoreRanking);
		}
		else //if users turn is skipped
		{
		    ifPass = -1;
		    c.setFont (keyWords);
		    c.setColor (Color.blue);
		    c.drawString ("Skipped", 635, 240);
		    delay (900000000);
		    c.setColor (tableGreen);
		    c.drawString ("Skipped", 635, 240);
		    ifSkipped [0] = 1;
		    pass (numPass, checkCard);
		}
		if (ifPass == 0) //if player cant go
		{
		    c.setFont (keyWords);
		    c.setColor (Color.blue);
		    c.drawString ("PASS", 635, 240);
		    delay (900000000);
		    c.setColor (tableGreen);
		    c.drawString ("PASS", 635, 240);
		    ifSkipped [0] = 1;
		}
	    }
	    else //if deck has no cards left
	    {
		pass (numPass, checkCard);
	    }
	    numCardsLeft [3] = checkCardsLeft (botDeck3, numCardsLeft, scoreRanking); //checks if there are any cards left in player 4 deck
	    if (numCardsLeft [3] != 13) //if there are still cards left in the deck
	    {
		if (ifSkipped [0] == 1 || checkCard [0] < 37 || checkCard [0] > 40) //checks if a jack was placed previously to skip the players turn
		{
		    ifPass = placeCard (botDeck3, myDeck, checkCard, numPass, ifSkipped, scoreRanking);
		    ifSkipped [0] = 0;
		    numCardsLeft [3] = checkCardsLeft (botDeck3, numCardsLeft, scoreRanking);
		}
		else //if users turn is skipped
		{
		    ifPass = -1;
		    c.setFont (keyWords);
		    c.setColor (Color.blue);
		    c.drawString ("Skipped", 950, 340);
		    delay (900000000);
		    c.setColor (tableGreen);
		    c.drawString ("Skipped", 950, 340);
		    ifSkipped [0] = 1;
		    pass (numPass, checkCard);
		}
		if (ifPass == 0) //if player cant go
		{
		    c.setFont (keyWords);
		    c.setColor (Color.blue);
		    c.drawString ("PASS", 1000, 340);
		    delay (900000000);
		    c.setColor (tableGreen);
		    c.drawString ("PASS", 1000, 340);
		    ifSkipped [0] = 1;
		}
	    }
	    else //if there are no cards left in deck
	    {
		pass (numPass, checkCard);
	    }
	}
	else //makes burn array equal 0 so that when an ace is entered the other players turn is ignored only once
	    burn [0] = 0;
    }

    public static int placeCard (int[] botDeck, int[] botDeck2, int[] cardCheck, int[] passNum, int[] ifSkip, int[] finalScore)  //bot players place cards
    {
	int lowestCard = 0, lowestCardBurn = 52, cardIndex = 0;
	//for loop to find first card that is above the previously placed card
	for (int p = 0 ; p < 13 ; p++)
	{
	    if (botDeck [p] >= cardCheck [0] && botDeck [p] != 0)
	    {
		lowestCard = botDeck [p]; //intitialize lowestCard variable with this value
		break;
	    } //end of if
	} //end of for loop
	delay (900000000); //delay method
	if (lowestCard != 0) //if lowest card the bot has is not 0
	{
	    for (int m = 0 ; m < 13 ; m++) //for loop to find the lowest value that is above the previously placed card using the lowest card found above as reference
	    {
		if (botDeck [m] > cardCheck [0] && botDeck [m] <= lowestCard)
		{
		    lowestCard = botDeck [m];
		    cardIndex = m;
		} //end of if statement
	    } //end of for loop
	    //bot places the lowest value found
	    if (lowestCard >= cardCheck [0])
	    {
		placeCardAnimation (botDeck);
		drawCards (botDeck, 737, 330, cardIndex);
		cardCheck [0] = botDeck [cardIndex];
		if (botDeck [cardIndex] > 36 && botDeck [cardIndex] < 41) //if bot places a J
		    ifSkip [0] = 0;
		else if (botDeck [cardIndex] > 44 && botDeck [cardIndex] < 49) //if bot places a K
		{
		    botDeck [cardIndex] = 0;
		    discardBotCard (botDeck, ifSkip, finalScore);
		} //end of else if
		else if (botDeck [cardIndex] > 48 && botDeck [cardIndex] < 53) //if bot places an A
		{
		    cardCheck [0] = 0;
		    botDeck [cardIndex] = 0;
		    c.setFont (instructions);
		    c.setColor (Color.black);
		    delay (900000000);
		    c.drawString ("BURN", 692, 418);
		    c.setColor (Color.red);
		    c.drawString ("BURN", 700, 420);
		    delay (900000000);
		    c.setColor (tableGreen);
		    c.fillRect (690, 330, 200, 170);
		    placeCard (botDeck, botDeck2, cardCheck, passNum, ifSkip, finalScore);
		} //end of else if
		else if (botDeck [cardIndex] > 40 && botDeck [cardIndex] < 45) //if bot places a Q
		{
		    if (botDeck [13] == -5) //if the next deck is the user
			giveUserExtraCard (botDeck2);
		    else
			giveExtraCard (botDeck2);
		} //end of else if
		botDeck [cardIndex] = 0;
	    }
	    passNum [0] = 0;
	}
	else
	    pass (passNum, cardCheck);
	return lowestCard;
    } //end of placeCard method

    public static int checkCardsLeft (int[] deckCheck, int[] numberCardsLeft, int[] score)  //checks to see how many cards are left in the deck
    {
	int cardCheckPosition = 0;
	for (int q = 0 ; q < 13 ; q++)
	{
	    if (deckCheck [q] == 0)
		cardCheckPosition++; //counter for when the card is 0 (means there is no value)
	} //end of for loop
	if (cardCheckPosition == 13) //if the decks cards are all finished
	{
	    //checks which deck is the one that is finished and clears there spot
	    c.setColor (tableGreen);
	    if (deckCheck [13] == -3) //player 2
		c.fillRect (274, 130, 90, 130);
	    else if (deckCheck [13] == -4) //player 3
		c.fillRect (637, 30, 90, 130);
	    else if (deckCheck [13] == -5) //player 4
		c.fillRect (1000, 130, 90, 130);
	    if (deckCheck [13] == -2) //if player 1 lost all there cards puts them into the ranking depending on who lost their cards first
	    {
		for (int a1 = 0 ; a1 < 4 ; a1++)
		{
		    if (score [a1] == 0 && score [0] != 1 && score [1] != 1 && score [2] != 1)
		    {
			score [a1] = 1;
			break;
		    } //end of if
		} //end of for
	    } //end of if
	    else if (deckCheck [13] == -3) //if player 2 lost all there cards puts them into the ranking depending on who lost their cards first
	    {
		for (int a2 = 0 ; a2 < 4 ; a2++)
		{
		    if (score [a2] == 0 && score [0] != 2 && score [1] != 2 && score [2] != 2)
		    {
			score [a2] = 2;
			break;
		    } //end of if
		} //end of for
	    } //end of else if
	    else if (deckCheck [13] == -4) //if player 3 lost all there cards puts them into the ranking depending on who lost their cards first
	    {
		for (int a3 = 0 ; a3 < 4 ; a3++)
		{
		    if (score [a3] == 0 && score [0] != 3 && score [1] != 3 && score [2] != 3)
		    {
			score [a3] = 3;
			break;
		    } //end of if
		} //end of for
	    } //end of else if
	    else //if player 4 lost all there cards puts them into the ranking depending on who lost their cards first
	    {
		for (int a4 = 0 ; a4 < 4 ; a4++)
		{
		    if (score [a4] == 0 && score [0] != 4 && score [1] != 4 && score [2] != 4)
		    {
			score [a4] = 4;
			break;
		    } //end of if
		} //end of for
	    } //end of else
	} //end of outer if
	return cardCheckPosition;
    } //end of CheckCardsLeft

    public static void pass (int[] passNumber, int[] checkCards)  //increases number of passes by 1
    {
	passNumber [0]++;
	if (passNumber [0] == 3) //after it is 3 resets the lowest card to 0
	{
	    passNumber [0] = 0;
	    checkCards [0] = 0;
	} //end of if
    } //end of pass method

    public static void clearPlacedCard (int[] firstDeck)  //method to clear the spot where the user has chosen a card to place
    {
	int xClearCard = 65, yClearCard = 400; //variable decleration and assignment
	c.setColor (tableGreen);
	for (int h = 0 ; h < 13 ; h++)
	{
	    if (firstDeck [h] == -1) //for player 1/user
	    {
		firstDeck [h] = 0; //if the element of the array equals -1 then it clears that place and makes it equal 0 so that it clears one card at a time
		xClearCard += 100 * h; //checks what the x and y values should be
		if (h < 4)
		    yClearCard += 50 * h;
		else if (h > 8)
		    yClearCard += 50 * (12 - h);
		else
		    yClearCard += 200;
		;
		c.fillRect (xClearCard, yClearCard, 90, 130); //prints over the card that the user chose to place
		break;
	    } //end of outer if
	} //end of for loop
    } //end of clearPlaceCard method

    public static void giveExtraCard (int[] deckGettingCard)  //when a bots deck is getting an extra card
    {
	for (int f = 0 ; f < 13 ; f++)
	{
	    if (deckGettingCard [f] == 0) //finds which element in the array is equal to 0 to fill it with a random card
	    {
		if (deckGettingCard [13] == -3) //checks if it is player 2
		{
		    c.setFont (keyWords);
		    c.setColor (Color.blue);
		    c.drawString ("Player has recieved an extra card", 50, 320);
		    delay (2000000000);
		    c.setColor (tableGreen);
		    c.drawString ("Player has recieved an extra card", 50, 320);
		} //end of if
		else if (deckGettingCard [13] == -4) //checks if it is player 3
		{
		    c.setFont (keyWords);
		    c.setColor (Color.blue);
		    c.drawString ("Player has recieved an extra card", 420, 220);
		    delay (2000000000);
		    c.setColor (tableGreen);
		    c.drawString ("Player has recieved an extra card", 420, 220);
		} //end of else if
		else if (deckGettingCard [13] == -5) //checks if it is player 4
		{
		    c.setFont (keyWords);
		    c.setColor (Color.blue);
		    c.drawString ("Player has recieved an extra card", 825, 340);
		    delay (2000000000);
		    c.setColor (tableGreen);
		    c.drawString ("Player has recieved an extra card", 825, 340);
		} //end of else if
		deckGettingCard [f] = (int) (52 * Math.random ()) + 1; //assigns a random value to the arrays element
		break;
	    } //end of outer if
	} //end of for loop
    } //end of giveExtraCard method

    public static void giveUserExtraCard (int[] usersDeck)  //user getting an extra card when player 4 plays a Q
    {
	int xExtraCard = 65, yExtraCard = 400; //variable decleration and assignment
	for (int g = 0 ; g < 13 ; g++)
	{
	    if (usersDeck [g] == 0) //when the user is missing a card in the deck
	    {
		c.setFont (keyWords);
		c.setColor (Color.blue);
		c.drawString ("You have recieved an extra card", 420, 520); //tells the user they are going to get an extra card
		delay (2000000000); //delay method
		c.setColor (tableGreen);
		c.drawString ("You have recieved an extra card", 420, 520);
		usersDeck [g] = (int) (52 * Math.random ()) + 1; //gives the user a random card
		//draws card at the spot where an element in the array is equal to 0
		xExtraCard += 100 * g;
		if (g < 4)
		    yExtraCard += 50 * g;
		else if (g > 8)
		    yExtraCard += 50 * (12 - g);
		else
		    yExtraCard += 200;
		usersDeck [g] = (int) (52 * Math.random ()) + 1;
		c.setColor (Color.white);
		c.fillRect (xExtraCard, yExtraCard, 90, 130);
		drawCards (usersDeck, xExtraCard, yExtraCard, g);
		break;
	    } //end of if statement
	} //end of for loop
    } //end of giveUserExtraCard method

    public static void discardMyCard (int[] deckOfUser, int[] numCardLeft, int[] rankScore)  //if user wants to discard cards after placing a K
    {
	int xDiscardCard = 65, yDiscardCard = 400, discardInput, validCard = 0, numCards; //variable decleration and assignment
	char userCardInput;
	c.setFont (keyWords);
	c.setColor (Color.blue);
	numCards = checkCardsLeft (deckOfUser, numCardLeft, rankScore); //checks how many cards are left in the pile
	if (numCards != 13) //if there are cards in the deck, asks the user to enter what they want to discard
	{
	    c.drawString ("Enter card to discard", 550, 570); //asks user to enter a card to discard
	    userCardInput = c.getChar (); //reads input
	    discardInput = convertInput (userCardInput); //converts user input into a number to access array
	    if (discardInput < 0 || discardInput > 12) //error check
		validCard++;
	    while (validCard == 1 || deckOfUser [discardInput] < 1) //asks user to enter a different input if it is invalid
	    {
		JOptionPane.showMessageDialog (null, "Error! Invalid option!"); //displays error message in a new window that you can close
		userCardInput = c.getChar (); //reads input
		discardInput = convertInput (userCardInput); //converts user input into a number to access array
		validCard = 0; //changes value to 0 to get out of while loop
		if (discardInput < 0 || discardInput > 12) //if it is still invalid
		{
		    validCard++;
		} //end of if statement
		else
		    break; //if true break out of loop
	    } //end of while loop
	    deckOfUser [discardInput] = 0; //assigns the value of the card to 0 after discarding it
	    //finds the card the user decided to discard and gets rid of it
	    xDiscardCard += 100 * discardInput;
	    if (discardInput < 4)
		yDiscardCard += 50 * discardInput;
	    else if (discardInput > 8)
		yDiscardCard += 50 * (12 - discardInput);
	    else
		yDiscardCard += 200;
	    c.setColor (tableGreen);
	    c.fillRect (xDiscardCard, yDiscardCard, 90, 130); //cover up where the card was that the user discarded
	    c.drawString ("Enter card to discard", 550, 570);
	} //end of outer if statement
    } //end of discardMyCard method

    public static void discardBotCard (int[] botDiscard, int[] cardsDeckRem, int[] rankingScore)  //if bot enters a king
    {
	int cardToDiscard = 0, cardsRemaining; //variable decleration and assignment
	cardsRemaining = checkCardsLeft (botDiscard, cardsDeckRem, rankingScore);
	if (cardsRemaining != 13) //if there are still cards in the deck
	{
	    while (cardToDiscard == 0)
	    {
		cardToDiscard = (int) (13 * Math.random ()); //chooses random card in the deck
		if (botDiscard [cardToDiscard] != 0) //if the random card is not 0 then the bot chooses to discard it
		{
		    botDiscard [cardToDiscard] = 0; //changes the value to 0 after it was discarded
		    break;
		}
		else //if the card is 0 then it does the loop again
		    cardToDiscard = 0;
	    } //end of while loop
	    if (botDiscard [13] == -3) //if player 2 discards a card then it prints that they have done so
	    {
		c.setFont (keyWords);
		c.setColor (Color.blue);
		c.drawString ("Player discarded a card", 125, 320);
		delay (2000000000);
		c.setColor (tableGreen);
		c.drawString ("Player discarded a card", 125, 320);
	    } //end of if statemnt
	    else if (botDiscard [13] == -4) //if player 3 discards a card then it prints that they have done so
	    {
		c.setFont (keyWords);
		c.setColor (Color.blue);
		c.drawString ("Player discarded a card", 490, 220);
		delay (2000000000);
		c.setColor (tableGreen);
		c.drawString ("Player discarded a card", 490, 220);
	    } //end of if statemnt
	    else if (botDiscard [13] == -5) //if player 4 discards a card then it prints that they have done so
	    {
		c.setFont (keyWords);
		c.setColor (Color.blue);
		c.drawString ("Player discarded a card", 825, 320);
		delay (2000000000);
		c.setColor (tableGreen);
		c.drawString ("Player discarded a card", 825, 320);
	    } //end of if statemnt
	} //end of outer if statment
    } //end of discardBotCard method
} //end of class




