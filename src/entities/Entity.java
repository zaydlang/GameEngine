import java.awt.Image;

import java.util.ArrayList;

public class Entity {
    private Image image;
    
    private double x;
    private double y;
    private double width;
    private double height;
    private Vector velocity;
    private double mass;
    
    private double dt;
    
    public Entity(Image image, double x, double y, double width, double height, double mass) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.mass = mass;
        
        dt = System.currentTimeMillis();
    }
    
    public void update() {
        dt = System.currentTimeMillis() - dt;
    }
    
    public void updatePosition() {
        x += velocity.getX();
        y += velocity.getY();
        dt = System.currentTimeMillis();
    }
    
    // Getters
    public Image getImage() { return image; }
    public double getX() { return x; }
    public double getY() { return y; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public double getMass() { return mass; }
    
    // Setters
    public void setImage(Image image) { this.image = image; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }
    public void setMass(double mass) { this.mass = mass; }
    
    public void applyForce(Vector force, double magnitude) {
        double acceleration = magnitude / mass;
        force.normalize()
             .multiply(acceleration);
        velocity.changeX(force.getX() * dt);
        velocity.changeY(force.getY() * dt);
    }
}
