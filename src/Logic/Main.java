package Logic;

import Logic.Library.Library;

import javax.swing.*;

public class Main {
    public static void main(String[] args){

        Library library = Library.instance();

        try {

            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }


        try{
            library.readFile("src/Books.txt");
            //Creates Singleton Logic.Gui
            Gui gui = Gui.instance();
            //Constructs JFrame, then packs with JObjects
            gui.build();
        }catch(Exception e){
            System.out.println("Build Failed");
            e.printStackTrace();
        }


        //need to set up GUI
        //maybe 5 buttons at a time with their own book objects
        //next page, back page, and current page components
        //big label displaying book button that was clicked on
        //search component at top
        //2 menus: add book and filter
        //add book could bring up dialog box to put in book info?
        //filter could be a drop-down with genres and ratings
        //genres could sort all available genres
        //ratings could sort most liked to least liked
    }
}


