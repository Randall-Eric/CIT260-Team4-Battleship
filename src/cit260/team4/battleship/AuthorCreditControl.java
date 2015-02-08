/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

/**
 *
 * @author Matthew
 */
class AuthorCreditControl {
   
    public AuthorCreditControl(){
        
    }
    
    public void displayMatthewSweeney(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                "Matthew Sweeney is a real cool guy. He helped with the AI, so if you lose you can blame him.\n"
                        + "He hails from Austin, TX.");
        displayHelpBorder();
    }
    
    public void displayEricRandall(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                "Eric Randall: coder, athelete, gentleman.\n"
                        + "Having tired of moding Minecraft, he decided to master Battleship.");
        displayHelpBorder();
    }
    
    public void displayChristianRay(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                "Christian Ray, Master Programer, is originally from Georgia, but currently lives in the icy reaches of Idaho.\n"
                        + "He is also an expert in Apple tech support.");
        displayHelpBorder();
    }
    
    public void displayTaylorWestmoreland(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                "Taylor Westmoreland is originally from Sin City - Las Vegas, NV.\n"
                        + "Taylor is also an accounting major, which is why our Battleship game also doubles as a tax writeoff.");
        displayHelpBorder();
    }
    
    public void displayJordanSmith(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                "Jordan Smith is one of the hottest new coders out of Blackfoot, ID, otherwise known as the Silicon Tundra.\n"
                        + "Jordan already had a degree in Business and a thriving pastry business when he took up coding.");
        displayHelpBorder();
    }
    
    public void displayDavidBanks(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                "David Banks, aka the Cisco Kid, currently resides in Spring, TX.\n"
                        + "He is an expert at all things networking.");
        displayHelpBorder();
    }
    
    public void displayRebeccaThayne(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                "Rebecca Thayne currently lives in Texas.\n"
                        + "I don't have much information for her because I couldn't find her getting to know you post. Sorry.");
        displayHelpBorder();
    }
    
    public void displayHelpBorder (){
        System.out.println(
        "\t******************************************************************");
    }
}
