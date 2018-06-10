import java.util.ArrayList;

public class Component {
    private ArrayList<Entity> entities;

    public Component() {
        entities = new ArrayList<Entity>();
    }
    
    public void update() {}
    
    public void addEntity(Entity entity) {
        entities.add(entity);
    }
    
    public void removeEntity(Entity entity) {
        entities.remove(entity);
    }
}
