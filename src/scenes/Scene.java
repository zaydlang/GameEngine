import java.util.ArrayList;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Image;

public class Scene extends JComponent {
    ArrayList<Entity> entities;
    ArrayList<Component> components;
    
    Graphics g;
    
    public Scene() {
        entities = new ArrayList<Entity>();
    }
        
    public void draw(Graphics g) {
        for (int i = 0; i < entities.size(); i++) {
            Entity entity = entities.get(i);
            g.drawImage(entity.getImage(), 
                        (int)entity.getX(), 
                        (int)entity.getY(), 
                        (int)entity.getWidth(), 
                        (int)entity.getHeight(), 
                        null);
        }
    }
        
    public void update() {
        for (int i = 0; i < entities.size(); i++) {
            entities.get(i).update();
        }
        
        for (int i = 0; i < components.size(); i++) {
            components.get(i).update();
        }
        
        for (int i = 0; i < entities.size(); i++) {
            entities.get(i).updatePosition();
        }
    }
    
    public void addEntity(Entity e) {
        entities.add(e);
    }
    
    public void removeEntity(Entity e) {
        entities.remove(e);
    }
    
    public void addComponent(Component c) {
        components.add(c);
    }
    
    public void removeComponent(Component c) {
        components.remove(c);
    }
    
    public void clearEntities(Entity e) {
        entities = new ArrayList<Entity>();
    }
    
    public ArrayList<Entity> getEntities() {
        return entities;
    }
}
