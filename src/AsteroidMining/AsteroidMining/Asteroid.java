package AsteroidMining.AsteroidMining;

//A class named Asteroid which can contain Resources or workers in the core
public class Asteroid extends Thing {
      private String resource;
      private int depth;

      private int distancetosun;
      private int period =10;
      private String id;
      private String TPid;
      // private ArrayList<String> Workersonit = new ArrayList<String>();
      private int Movedirection;

      public String getresource() {
            return resource;
      }

      public void setresource(String a) {
            resource = a;
      }

      public int getdepth() {
            return depth;
      }

      public void setdepth(int a) {
            depth = a;
      }

      public int getdistance() {
            return distancetosun;
      }

      public void setdistance(int a) {
            distancetosun = a;
      }

      public String getTPid() {
            return TPid;
      }

      public void setTPid(String a) {
            TPid = a;
      }

      public String getid() {
            return id;
      }

      public void setid(String a) {
            id = a;
      }

      public Asteroid(String string) {
            super(string);
      };

      // Decide Sun move dircetion to the asteroid and Move Sun Distance by one
      public void Move() {
            if (distancetosun < period) {
                  Movedirection = 1;
                  Step();
            }
            if (distancetosun == period) {
                  Movedirection = -1;
                  Step();
            }
            if (distancetosun == 0) {
                  Movedirection = 1;
                  Step();
            }
      }

      // Asteroid RemoveResource form core
      public void Removeresource() {
            resource = "empty";
      }

      // Step Asteroid to move sun peroid
      public void Step() {
            distancetosun += Movedirection;
            System.out.println("The current distance to sun is:" + distancetosun);
      }

      public void Protect(Worker w) {
          w.SetProtected();
      }
     
      public void Explode(Field f) {
            Removeresource();
            f.Remove(this);
            System.out.println("The radioactive asteroid is in the perihelion and exploded");
      }
      /*
       * public void Movehere(Worker w){ w.Onwhichasteroiod = this.id;
       * this.Workersonit.add(Integer.toString(w.id));
       */


  
  
}