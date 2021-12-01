public class Main {
    public static void main(String[] args) {
        Fighter marc=new Fighter("Marc", 15, 100, 90, 15);
        Fighter alex=new Fighter("Alex", 10, 95, 100, 24);
        Ring r = new Ring(marc,alex,100,90);
        r.run();
    }
}
