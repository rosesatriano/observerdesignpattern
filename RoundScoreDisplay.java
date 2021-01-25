package observerdesignpattern;

/**
 * The class RoundScoreDisplay implements the 
 * interface Observer. In this class, we update 
 * the golfer's total score, where we display the par 
 * total and the stroke total.
 * @author @rosesatriano
 */
public class RoundScoreDisplay implements Observer{
    Subject golfer;
    int strokesTotal;
    int parTotal;
    
    /**
     *In the RoundScoreDisplay method, we introduce the golfer
     * and imply that with the registerObserver.
     * @param golfer The subject of the score.
     */
    public RoundScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * The method update takes in the total number of 
     * strokes and the total par to be met. 
     * @param strokesTotal The strokes for the current hole is added to 
     * strokesTotal.
     * @param strokes This is the number of strokes the golfer 
     * took for the current hole.
     * @param parTotal This is the number for the current par added to parTotal.
     * @param par This is the number of strokes that is set to be 
     * met for the current hole.
     */
    public void update(int strokes, int par){
        strokesTotal = strokesTotal + strokes;
        parTotal= parTotal + par;
        displayRoundScore();
    }

    /**
     * The method displayRoundScore prints out the stats for the round. 
     * This includes the total number for par and the total number of strokes
     * taken. If the strokesTotal is higher than the parTotal, it will output 
     * par. If it is lower, then it will say under par. If they are equal,
     * it will print made par.
     */
    public void displayRoundScore(){
        System.out.println("Round stats:");
        System.out.println("Par: " +parTotal);
        System.out.println("Strokes: " +strokesTotal);
        if(strokesTotal == parTotal){
            System.out.println("Made par");
        }else if(strokesTotal > parTotal){
            System.out.println("over par");
        }else{
            System.out.println("under par");
        }
    }
}