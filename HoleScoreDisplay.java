package observerdesignpattern;

/**
 * The class HolesScoreDisplay implements the 
 * interface Observer. In this class, we update 
 * the golfer's score, where we display the par
 * and the strokes.
 * @author @rosesatriano
 */
public class HoleScoreDisplay implements Observer{
    Subject golfer;
    int strokes;
    int par;
    int under;
    int over;

    /**
     * In the HoleScoreDisplay method, we introduce the golfer
     * and imply that with the registerObserver.
     * @param golfer The subject of the score.
     */
    public HoleScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * The method update takes in the number of strokes
     * and the par to be met for this current hole.
     * @param strokes This is the number of strokes the golfer 
     * took for the current hole.
     * @param par This is the number of strokes that is set to be 
     * met for the current hole.
     */
    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

    /**
     * The method displayCurrentScore prints out the stats for the current 
     * hole. This includes the number for par and the number of strokes
     * taken. If the strokes is higher than the par, it will output over par.
     * If it is lower, then it will say under par. If they are equal,
     * it will print made par.
     */
    public void displayCurrentScore(){
        System.out.println("Current Hole stats:");
        System.out.println("Par: " +par);
        System.out.println("Strokes: " +strokes);
        if(strokes == par){
            System.out.println("Made par");
        }else if(strokes > par){
            System.out.println("over par");
        }else{
            System.out.println("under par");
        }
    }
}
