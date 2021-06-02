package question2;

import question1.Circle;
import question1.Square;
import question1.Triangle;

/**
 * This class represents a simple picture. You can draw the picture using the
 * draw method. But wait, there's more: being an electronic picture, it can be
 * changed. You can set it to black-and-white display and back to colors (only
 * after it's been drawn, of course).
 * 
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 1.1 (24 May 2001)
 */
public class Picture {
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    
    private Circle secondSun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture() {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw() {
        
        // Erase the drawn shapes if they are found so we have a clear canvas each time we redraw
        eraseAll();
        
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        secondSun = new Circle();
        secondSun.changeColor("yellow");
        secondSun.moveVertical(-10);
        secondSun.changeSize(60);
        secondSun.makeVisible();
    }
    
    /**
     * Erase all the drawn shapes
     */
    private void eraseAll() {
        if (wall != null && window != null && roof != null && sun != null && secondSun != null) {
            wall.makeInvisible();
            window.makeInvisible();
            roof.makeInvisible();
            sun.makeInvisible();
            secondSun.makeInvisible();
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite() {
        if (wall != null) // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            secondSun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor() {
        if (wall != null) // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("blue");
            secondSun.changeColor("yellow");
        }
    }

    /**
     * Slowly make the blue sun go down
     */
    public void blueSunSet(int distance) {
        if (secondSun != null) { 
            // Check if our sun is already painted.
            sun.slowMoveVertical(distance);
        }else{
            // If the draw method wasn't called before calling the blueSunSet method call it to instantiate our variables.
            draw();
            sun.slowMoveVertical(distance);
        }
    }
}
