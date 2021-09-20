import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;

public class BackgroundProvider {
    PApplet p;
    PGraphics pg;

    public BackgroundProvider(PApplet p) {
        this.p = p;
        pg = p.createGraphics(p.width, p.height);
    }

    PGraphics getBackground(){
        pg.beginDraw();
        pg.background(0,0,120);
        pg.endDraw();
        return pg;
    }
}
