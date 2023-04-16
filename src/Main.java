public class Main {
    public static void main(String[] args){

        //Creates Singleton Gui
        Gui gui = Gui.instance();
        //Constructs JFrame, then packs with JObjects
        gui.build();
    }
}


