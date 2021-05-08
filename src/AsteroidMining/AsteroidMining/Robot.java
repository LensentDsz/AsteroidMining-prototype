package AsteroidMining.AsteroidMining;


import java.io.IOException;


//A system controled Thing and can be died
public class Robot extends Worker {
  // private String id;
  private String id;
  private int Onwhichasteroiod;
 
  Robot r = new Robot(null) {
  };
  // Test case Robot TP
  Field cf = null;// current field, just use to test
  Field nf = null;// neighboring field
  Thing t = null;
  Asteroid ca = null;

  SunStorm st = null;

  public Robot(String string) {
    super(string);
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

  public void Drill(Asteroid asteroid) throws IOException {
    // reduce the depth of asteroid and check that if ra and fulfills condition then
    // explode
    if (asteroid.getdepth() != 0) {
      int temp = asteroid.getdepth() ;
      temp-=1;
      asteroid.setdepth(temp);
      if (asteroid.getdepth()== 0 && asteroid.getresource().equals("uranium") && asteroid.getdistance()< 20) {
        this.HitbyExplode();
        cf.Remove(asteroid); // fulfills the explode condition , worker dies
      } // and this asteroid is removed from the field
    } else {
      System.out.println("The asteroid is already drilled through!");
    }
    asteroid.Move(); // asteroid and sun storm moves after worker does the action
    st.Move();
    // after sun storm moves, if sun storm touches worker then worker dies.
    for (int i = 0; i < st.GetOnWhich().size(); i++) {
      if (st.GetOnWhich().get(i).getid() == asteroid.getid()) {
        st.Touch(this);
      }
    }
  }
  // Test case Robot Hide

  // Robot be explode by Asteroid and then move to another Asteroid
  public void HitbyExplode() throws IOException {
    r.Travel(cf.a,cf.GetNeighours().get(0));
    System.out.println("Robot 1 was attacked by explode and landing a neighboring asteroid A2");
  }

  // Robot Die and only died by SunStorm
  public void Die(Field f) {
    f.Remove(this);
    System.out.println("Robot 1 was attacked by sunstorm and died.");
  }

  public String GetRobotId() {
    return id;
  }

  public void MoveHere(Asteroid a, Field nf) {
    this.ca = a;
    this.cf = nf;
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

    for (int i = 0; i < st.GetOnWhich().size(); i++) {
      if (st.GetOnWhich().get(i).getid().equals(getca().getid())) {
        st.Touch(this);
        return;
      }
    }
  }
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
  // // Settler/Robot drill Test case
  // // Worker drill the asteroid and be checked the asteroid condition and do drill
  // // and then be checked with the Explosion or Sunstorm touch condition
  // public void Drill() throws IOException {
  //   String enter;
  //   System.out.println("If depth of mantle larger than 0?(Yes or No)");
  //   BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
  //   enter = br2.readLine();
  //   if (enter.equals("Yes")) {
  //     System.out.println("Reduce asteroid's depth by 1");
  //     // Check explosion condition
  //     System.out.println("Whether the explosion conditions are met at this time?(Yes or No)");
  //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  //     enter = br.readLine();
  //     if (enter.equals("Yes")) {
  //      ca.Explode(cf);
  //       return;
  //     }
  //     // Check sunstorm condition
  //     System.out.println("Whether the sun storm conditions are met at this time?(Yes or No)");
  //     BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
  //     enter = br1.readLine();
  //     if (enter.equals("Yes")) {
  //       // for test
  //       Settler s = new Settler();
  //       st.Touch(s);
  //       return;
  //     }
  //   }
  // }

  // Settler/Robot TP Test case
  // Worker be checked the gate situition before TP and then TP by using the gate
  

  // public void Tp(Asteroid a, Map m, Field f, Field nf) {
  //   if (a.GetTPid != null) {
  //     for (int i; i < m.Getglist().size(); i++) {
  //       if (m.Getglist().get(i).id == a.GetTPid()) {
  //         m.Getglist().get(i).GetNeighbor();
  //         Asteroid na = m.Getglist().get(i).Getlocation();
  //         f.remove(this);
  //         nf.Accept(this);
  //         na.Movehere(this);
  //       }
  //     }
  //   }
  // }

 
}