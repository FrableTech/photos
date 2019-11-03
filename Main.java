import java.util.*;
import java.text.*;

import java.awt.*;

//nextline methoud



public class Main
{
  public static void main (String[]args)
  {
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_BLACK = "\u001B[30m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_YELLOW = "\u001B[33m";
    final String ANSI_BLUE = "\u001B[34m";
    final String ANSI_PURPLE = "\u001B[35m";
    final String ANSI_CYAN = "\u001B[36m";
    final String ANSI_WHITE = "\u001B[37m";


      System.out.println ("By: " + ANSI_BLUE + "Jf" + ANSI_RESET);
      System.out.println ("Welcome to Jf's shoes closet");
      System.out.println ("                             ");


      System.out.println ("My list of shoes I own: ");
    // overloaded constructors below
      System.out.println ("    AllStar");
    Shoe AllStar = new Shoe ("Converse", "All Star", 10.5);
//         System.out.println( AllStar.getBrand() + ", "+ AllStar.getModel() + ", " + 
    //                                  AllStar.getSize());
      System.out.println ("    UltraBoost");
    Shoe ultraBoost = new Shoe ("Adidas", "Ultra Boost", 10.0);
//        System.out.println( ultraBoost.getBrand() + ", "+ ultraBoost.getModel() + ", " + 
    //                                   ultraBoost.getSize());

      System.out.println ("    Air Jordan 1");
    Shoe airJordan1 = new Shoe ("Nike ", "Air Jordan 1", 11.5);
    //       System.out.println(airJordan1.getBrand() + ", "+ airJordan1.getModel() + ", " + 
    //                                 airJordan1.getSize());
      System.out.println ("    Sanuks");
    Shoe sanuks = new Shoe ("Sanuk", " Gray Woven Slips", 11.5);
      System.out.println ("    Free Rn");
    Shoe grayFreeRn = new Shoe (" Nike ", " Free Run", 11.5);
      System.out.println ("    Asics ");
    Shoe asics = new Shoe ("Asics", "Gel Trainers", 11.5);
    Shoe sporty = new Shoe ("  ", "   ", 0.0);
      sporty.setBrand ("Adidas").setModel ("Yeesy").setSize (12.0);
    //       System.out.println(sporty.getBrand() + ", " + sporty.getModel() + ", " +
    //                                 sporty.getSize());




    // Shoe sporty2 = new Shoe ("Ghosts", 0, 0.0);
    //  System.out.println(sporty2.toString());


      System.out.println ("             ");
      System.out.println (ANSI_RED + "My default constructor:" + ANSI_RESET);
    Shoe flipFlop = new Shoe ();	//default constructor
      System.out.println (flipFlop);

      System.out.println (ANSI_RED + "\nUsing my overloaded constructor:" +
			  ANSI_RESET);

      System.out.println (AllStar);
      System.out.println ("      ");
      System.out.println (grayFreeRn);
      System.out.println (ANSI_RED +
			  "\n2 Other Methods My Shoe Class May Need" +
			  ANSI_RESET);
      System.out.println ("My Converse: All Stars size in Japan sizes: " +
			  AllStar.sizeInJapan ());
      System.out.println ("My Converse: All Stars size in UK sizes: " +
			  AllStar.sizeInUk ());




    //System.out.print(asics);












    Scanner scan = new Scanner (System.in);
      System.out.println (" \nEnter a shoe from the list: " + ANSI_GREEN);

    String input = scan.nextLine ();

    if (input.equalsIgnoreCase ("AllStar"))
      {

	System.out.println (ANSI_GREEN + AllStar.getBrand () + ", " + AllStar.getModel () +
			    ", " + AllStar.getSize ());


      }
    else if (input.equalsIgnoreCase ("Sanuks"))
      {
	System.out.println (sanuks.getBrand () + ", " + sanuks.getModel () +
			    ", " + sanuks.getSize ());
      }
    else if (input.equalsIgnoreCase ("air Jordan 1"))
      {
	System.out.println (airJordan1.getBrand () + ", " +
			    airJordan1.getModel () + ", " +
			    airJordan1.getSize ());
      }
    else if (input.equalsIgnoreCase ("UltraBoost"))
      {
	System.out.println (ultraBoost.getBrand () + ", " +
			    ultraBoost.getModel () + ", " +
			    ultraBoost.getSize ());
      }
    else if (input.equalsIgnoreCase ("Free Rn"))
      {
	System.out.println (grayFreeRn.getBrand () + ", " +
			    grayFreeRn.getModel () + ", " +
			    grayFreeRn.getSize ());
      }
    else if (input.equalsIgnoreCase ("asics"))
      {
	System.out.println (asics.getBrand () + ", " + asics.getModel () +
			    ", " + asics.getSize ());
      }
    else if (input.equalsIgnoreCase ("Sporty"))
      {
	System.out.println (sporty);
      }
    else
      {
	System.out.println (ANSI_RED + flipFlop + ANSI_RESET);
      }

    System.out.println ( ANSI_RESET + "\nIn SPORTY  I used the toString to Override");

    System.out.println (sporty);



    System.out.println (ANSI_GREEN +
			"\n                          Thank you, JF");



  }
}
