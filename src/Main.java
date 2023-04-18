public class Main {
    public static void main(String[] args){

        //Reads the file and saves it as the Library
        Library library = Library.instance();
        library.readFile("Books");

        //Creates Singleton Gui
        Gui gui = Gui.instance();
        //Constructs JFrame, then packs with JObjects
        gui.build();

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


