package observerdesignpattern;

public class HoleScoreDisplay implements Observer{
    Subject golfer;
    int strokes;
    int par;
    int under;
    int over;

    public HoleScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

    public void displayCurrentScore(){
        System.out.println("Current Hole stats:");
        System.out.println("Par: " +par);
        System.out.println("Strokes: " +strokes);
        if(strokes == par){
            System.out.println("Made par");
        }else if(strokes > par){
            over = strokes - par;
            System.out.println(+over " over par");
        }else{
            under = par - strokes;
            System.out.println(+under " under par");
        }
    }
}
