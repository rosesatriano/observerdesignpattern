package observerdesignpattern;

public class RoundScoreDisplay implements Observer{
    Subject golfer;
    int strokesTotal;
    int parTotal;

    public RoundScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par){
        strokesTotal = strokesTotal + strokes;
        parTotal= parTotal + par;
        displayRoundScore();
    }

    public void displayRoundScore(){
        System.out.println("Round stats:");
        System.out.println("Par: " +parTotal);
        System.out.println("Strokes: " +strokesTotal);
        if(strokesTotal == parTotal){
            System.out.println("Made par");
        }else if(strokesTotal > parTotal){
            int overTotal = strokesTotal - parTotal;
            System.out.println(+overTotal " over par");
        }else{
            int underTotal = parTotal - strokesTotal;
            System.out.println(+underTotal " under par");
        }
    }
}