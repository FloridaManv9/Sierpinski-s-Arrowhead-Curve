import edu.support.AnimatedTurtle;
import edu.support.EndWorld;

public class ArrowheadCurve {
    /**
     * The width of the World.
     * DO NOT CHANGE!!!
     */
    public static final int WORLD_WIDTH = 1024;

    /**
     * The height of the World.
     * DO NOT CHANGE!!!
     */
    public static final int WORLD_HEIGHT = 768;

    /**
     * Given the character, return the appropriate production for that character;
     * or when there is no production, return the given character (as a String).
     * Implements the Sierpinski Arrowhead Curve refer to
     * https://en.wikipedia.org/wiki/L-system#Example_5:_Sierpinski_triangle
     * (make sure to scroll down to the part about the Sierpinski Arrowhead Curve).
     *
     * @param c the character to expand.
     * @return the appropriate production for the given character;
     *         or when there is no production, return the given character (as a String).
     */
    public static String getProd(char c) {
        // TODO: replace with your implementation
        return "";  // TODO: delete this line and replace with your lines of code for the implementation
    } // end getProd

    /**
     * Given the String representing the current generation, return a new
     * String that is the result of applying the getProd rules to each
     * character in the current generation.
     *
     * @param curGen a String that is the current generation.
     * @return a new String that is the result of applying the
     *         getProd rules to each character in the current generation.
     */
    public static String nextGen(String curGen) {
        // TODO: replace with your implementation
        return "";  // TODO: delete this line and replace with your lines of code for the implementation
    } // end nextGen

    /**
     * Draw the given current generation using the given turtle and amount
     * for forward steps.
     *
     * @param curGen a String representing the current generation.
     * @param t the turtle to use for drawing.
     * @param forwardPixels the number of pixels to move forward on A or B.
     */
    public static void draw(String curGen, AnimatedTurtle t, int forwardPixels) {
        // TODO: replace with your implementation
    } // end draw

    /**
     * Starting with the initial generation, "A",
     * and the specified number of reps and forwardPixels,
     * advance the initial generation by numRep times.
     * Then create an EndWorld and AnimatedTurtle and
     * draw the results using the given forwardPixels value.
     *
     * @param numReps the number of times to run nextGen on initGen
     * @param forwardPixels the number of forward steps to use when drawing.
     */
    public static void demo(int numReps, int forwardPixels) {
        // DO NOT CHANGE THE CODE FROM HERE UNTIL TODO!!!
        EndWorld world = new EndWorld(WORLD_WIDTH, WORLD_HEIGHT);
        AnimatedTurtle t = new AnimatedTurtle(world);
        t.penUp();
        t.turnLeft();
        t.forward((int) (WORLD_WIDTH / 2 * .8));
        t.turnLeft();
        t.forward((int) (WORLD_HEIGHT / 2 * .8));
        t.turnLeft();
        t.penDown();
        // DO NOT CHANGE THE CODE IN THE METHOD ABOVE THIS LINE!!!

        // TODO: replace with your implementation
    } // end demo

    public static void main(String[] args) {
        //  TODO: prompt the user using JOptionPane for the following
        //        and then call demo with the input from the user:
        //        + the value of numReps
        //        + the value of forwardPixels
    } // end main

} // end ArrowheadCurve
