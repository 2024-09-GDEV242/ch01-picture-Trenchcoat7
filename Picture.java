/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Katie Strong
 * @version 2016.02.29
 */
public class Picture
{
    private Square crust;
    private Circle pepOne;
    private Circle pepTwo;
    private Triangle cheese;
    private Person mark;
    private Person markButPink;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        crust = new Square();
        pepOne = new Circle();
        pepTwo = new Circle();
        cheese = new Triangle();
        mark = new Person();
        markButPink = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            crust.moveHorizontal(-140);
            crust.moveVertical(20);
            crust.changeSize(120);
            crust.makeVisible();
            
            cheese.changeColor("yellow");
            cheese.moveHorizontal(20);
            cheese.moveVertical(-65);
            cheese.changeSize(160,120);
            cheese.makeVisible();
    
            pepOne.changeColor("red");
            pepOne.moveHorizontal(-10);
            pepOne.moveVertical(40);
            pepOne.changeSize(30);
            pepOne.makeVisible();
            
            pepTwo.changeColor("red");
            pepTwo.moveHorizontal(-30);
            pepTwo.moveVertical(100);
            pepTwo.changeSize(30);
            pepTwo.makeVisible();
            
            mark.moveHorizontal(140);
            mark.moveVertical(20);
            mark.changeSize(200,20);
            mark.makeVisible();
            
            markButPink.changeColor("magenta");
            markButPink.moveHorizontal(160);
            markButPink.moveVertical(20);
            markButPink.changeSize(200,20);
            markButPink.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        crust.changeColor("black");
        cheese.changeColor("white");
        pepOne.changeColor("black");
        pepTwo.changeColor("black");
        mark.changeColor("black");
        markButPink.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        crust.changeColor("red");
        cheese.changeColor("yellow");
        pepOne.changeColor("red");
        pepTwo.changeColor("red");
        mark.changeColor("black");
        markButPink.changeColor("magenta");
    }
}
