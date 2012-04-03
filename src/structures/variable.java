/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package structures;

import geometric.shape;

import java.util.ArrayList;

public class variable {

    private String id;
    private ArrayList<component> instances;

    public variable(String variableName) {
        id = variableName;
        instances = new ArrayList();
    }

    public String getId() {
        return id;
    }
    public void addInstance(component c) {
        if(!instances.contains(c))
            instances.add(c);
    }
    public component getShape(int i) {
        return instances.get(i);
    }
    public int getinstancesSize() {
        return instances.size();
    }
    public void removeComponent(component c) {
        for(int i=0; i<instances.size(); i++) {
            if(c.equals(instances.get(i))) {
                // remove component
                instances.remove(i);
            }
        }
    }
    public void removeComponent(int i) {
        instances.remove(instances.get(i));
    }
    public void print() {
        System.out.println(id);
        for(int i=0; i<instances.size(); i++) {
            instances.get(i).print();
        }
    }
    public void clear() {
        instances.clear();
    }
}
