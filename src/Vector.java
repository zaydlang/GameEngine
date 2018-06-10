public class Vector {
    private double x;
    private double y;
    private double magnitude;
    
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
        updateMagnitude();
    }
    
    public Vector normalize() {
        if (magnitude == 0) return this; // prevent a division by 0
        
        double factor = 1.0 / magnitude;
        x *= factor;
        y *= factor;
        updateMagnitude();
        
        return this;
    }
    
    public Vector multiply(double factor) {
        x *= factor;
        y *= factor;
        updateMagnitude();
        
        return this;
    }
    
    public void updateMagnitude() {
        magnitude = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    
    public double getX() { return x; }
    public double getY() { return y; }
    public double getMagnitude() { return magnitude; }
    
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setMagnitude(double newMagnitude) { 
        normalize();
        multiply(newMagnitude);
    }
    
    public void changeX(double x) { this.x += x; }
    public void changeY(double y) { this.y += y; }
}
