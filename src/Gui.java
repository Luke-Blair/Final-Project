public class Gui {

    private static Gui theInstance;

    public static synchronized Gui instance(){
        if (theInstance == null){
            theInstance = new Gui();
        }
        return theInstance;
    }

    private Gui(){

    }

    public void build(){

    }

}
