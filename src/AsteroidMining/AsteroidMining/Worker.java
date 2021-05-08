package AsteroidMining.AsteroidMining;

import java.io.IOException;

//Worker which is a father class of Robot and Settler
//Can do move, drill, Usegate Test case
public class Worker extends Thing {
	public Worker(String string) {
		super(string);
	}

	private int Onwhichasteroiod;
	private String id;
	Field cf = null;// current field, just use to test
	Field nf = null;// neighboring field
	Asteroid ca = null;
	private String status;

	public void SetProtected() {
		status = "Protected";
	}

	public void SetUnProtected() {
		status = "UnProtected";
	}

	public Field getcf() {
		return cf;
	}

	public void setcf(Field a) {
		cf = a;
	}

	public Asteroid getca() {
		return ca;
	}

	public void setca(Asteroid a) {
		ca = a;
	}

	// Settler/Robot travel Test case
	// Worker travel to another field
	// and then be checked with the Explosion or Sunstorm touch condition
	public void Travel(Asteroid a, Field f) throws IOException {
		movehere(a, f);

		if (ca.getresource().equals("Uranium") && getca().getdistance() <= 2) {
			ca.Explode(cf);
			return;
		}
	}

	// Settler/Robot drill Test case
	// Worker drill the asteroid and be checked the asteroid condition and do drill
	// and then be checked with the Explosion or Sunstorm touch condition

	public void movehere(Asteroid a, Field f) {
		ca = a;
		cf = f;
	}

	// Settler/Robot TP Test case
	// Worker be checked the gate situition before TP and then TP by using the gate
	public void TP(Teleportaion_Gate tp) throws IOException {
		if (ca.getTPid().equals(tp.getid()) && tp.getneighbor().getTPid() != null) {
			movehere(tp.getneighbor(), tp.getfneighbor());
		}
	}

	public void die() {

	}

	public int GetOnwhichasteroid() {
		return Onwhichasteroiod;
	}

	public String GetId() {
		return id;
	}
}
