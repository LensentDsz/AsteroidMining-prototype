package AsteroidMining.AsteroidMining;
//A gate can be connected together so that workers can move from this side to other side
public class Teleportaion_Gate extends Thing{
    private String id;
    private Asteroid location;
    private Field flocation;
    private Asteroid neighbor;
    private Field fneighbor;
    public Teleportaion_Gate(String ID){
        super(ID);
    }

    public void setid(String a) {
    	id = a;
    }
    public String getid() {
    	return id;
    }
    public void setlocation(Asteroid a) {
    	location = a;
    }
    public Field getflocation() {
    	return flocation;
    }
    public void setflocation(Field a) {
    	flocation = a;
    }
    public Asteroid getlocation() {
    	return location;
    }
    public void setneighbor(Asteroid a) {
    	neighbor = a;
    }
    public Asteroid getneighbor() {
    	return neighbor;
    }
    public void setfneighbor(Field a) {
    	fneighbor = a;
    }
    public Field getfneighbor() {
    	return fneighbor;
    }
}
