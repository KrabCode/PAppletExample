import processing.core.PApplet;

public class MySketch extends PApplet {
    BackgroundProvider backgroundProvider;

    public static void main(String... args){
        PApplet.main("MySketch");
    }

    public void settings(){
        size(200, 200);
    }

    public void setup(){
        backgroundProvider = new BackgroundProvider(this);
    }

    public void draw(){
        image(backgroundProvider.getBackground(), 0, 0);
        ellipse(mouseX, mouseY, 20, 20);
    }

}
