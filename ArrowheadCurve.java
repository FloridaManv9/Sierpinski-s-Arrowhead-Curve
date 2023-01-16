import edu.support.AnimatedTurtle;
import edu.support.EndWorld;

import javax.swing.*;

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
    private static String ProdVariable;
    private static String EndProd;
    private static int initlength;
    private static String NextGen;
    private static String finalvariable;

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
        String Prod = null;

        if (c == 'A'){
            Prod = "+B-A-B+";
        }
        if (c == 'B'){
            Prod = "-A+B+A-";
        }
        if (c == '+'){
            Prod = "+";
        }
        if (c == '-'){
            Prod = "-";
        }
        System.out.println(Prod);
        EndProd = Prod;
        return EndProd;
         // TODO: delete this line and replace with your lines of code for the implementation
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
        int y;
        initlength = curGen.length();
        for (y = 0; y < initlength; y ++){
            char c = curGen.charAt(y);
           // System.out.println("Curgen " + curGen);
            getProd(c);
            NextGen = NextGen + EndProd;
            // System.out.println("NextGen is: " + NextGen);

        }



        return NextGen;  // TODO: delete this line and replace with your lines of code for the implementation
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
        int x;
        for (x = 0; x < curGen.length(); x++) {
            boolean foundA = false;
            char ch = '?';
            ch = curGen.charAt(x);
            if (ch == 'A') {
                foundA = true;
            }

            boolean foundB = false;
            char cha = '!';
            cha = curGen.charAt(x);
            if (cha == 'B') {
                foundB = true;
            }

            boolean foundplus = false;
            char chaa = '!';
            chaa = curGen.charAt(x);
            if (chaa == '+') {
                foundplus = true;
            }

            boolean foundminus = false;
            char chaaa = '!';
            chaaa = curGen.charAt(x);
            if (chaaa == '-') {
                foundminus = true;
            }

// Turtle Movements
            if (foundA == true) {
                t.forward(forwardPixels);
            }

            if (foundB == true) {
                t.forward(forwardPixels);
            }
            if (foundplus == true) {
                t.turn(-60);
            }

            if (foundminus == true) {
                t.turn(60);
            }
        }


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
        int x;

       ProdVariable = "A";
       // rep loops
        for (x = 0; x < numReps; x ++) {
            nextGen(ProdVariable);
            ProdVariable = NextGen;
            finalvariable = NextGen;
            NextGen = "";
        };
        // final pass through
        String Final2Variable = finalvariable.replace("null","");
        System.out.println("final: " + Final2Variable);
        draw(Final2Variable, t, forwardPixels);



    } // end demo

    public static void main(String[] args) {
        //  TODO: prompt the user using JOptionPane for the following
        //        and then call demo with the input from the user:
        //        + the value of numReps
        //        + the value of forwardPixels

        // ForwardPixel Panel
        String ForwardPixels;
        ForwardPixels = JOptionPane.showInputDialog ("Number of Pixels to move Forward: ");
        int forwardPixels = Integer.parseInt(ForwardPixels);

        // numReps Panel
        String Degrees;
        Degrees = JOptionPane.showInputDialog ("Number of Reps: ");
        int numReps = Integer.parseInt(Degrees);
        demo(numReps, forwardPixels);
    } // end main

} // end ArrowheadCurve
