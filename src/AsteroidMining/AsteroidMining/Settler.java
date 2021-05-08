package AsteroidMining.AsteroidMining;

import java.io.IOException;
import java.util.ArrayList;


//to the teacher for some reasons, the functions code is too long 
//because we was not able to put all SunStorm Touch and Radio explosion condition into one single function
//Sorry for making read


//A user control Thing which can be died
public class Settler extends Worker {

    //settler current field
    Field f = new Field();
    //settler current asteroid
    Asteroid a = null;
    //resources in the settler bag
    ArrayList<String> resourcesList = new ArrayList<String>();
    
    //teleport gate ID
    int teleportaion_Gate;
    
    //teleport gate
    ArrayList<Teleportaion_Gate> gates= new ArrayList<Teleportaion_Gate>();
    //resources be carried by settler
    public Settler(String string) {
       super(string);
   }
    //Mine
    //Settler get resource from Asteroid
    // and at same time Asteroid remove it by core
    public void Mine() throws IOException{
    	if(getca().getdepth()!=0) {
    		return;
    	}
    	String temp = getca().getresource();
    	if(temp.equals("Hollow")) {
    		return;
    	}
    	if(temp.equals("Uranium")&&getca().getdistance()<=2)
    	{
    		getca().Explode(getcf());
    		return;
    	}
    	if(temp.equals("WaterIce")&&getca().getdistance()<=2)
    	{
    		WaterIce waterice = new WaterIce();
    		waterice.sublime(getcf());
    		return;
    	}
    	// for(int i=0;i<st.GetOnWhich().size();i++)
    	// {
    	// if(st.GetOnWhich().get(i).getid().equals(getca().getid())){
    	// 	st.Touch(this);
    	// 	return;
    	// }	
    	// }
        //Settler get resource from current asteroid
        GetResource().add(getca().getresource());
        //current asteroid remove resource
        getca().Removeresource();
      }

    //Add resource to the Asteroid
    //Settler add resource into Asteroid
    //And check wheather the resource is waterice which will be sublime in the perihelion
    public void AddResource(String resource) throws IOException{
    	if(getca().getdepth()!=0) {
    		return;
    	}
    	String temp = getca().getresource();
    	if(temp.equals("Hollow")==false) {
    		return;
    	}
    	if(temp.equals("Uranium")&&getca().getdistance()<=2)
    	{
    		getca().Explode(getcf());
    		return;
    	}
    	if(temp.equals("WaterIce")&&getca().getdistance()<=2)
    	{
    		WaterIce waterice = new WaterIce();
    		waterice.sublime(getcf());
    		return;
    	}
    	// for(int i=0;i<st.GetOnWhich().size();i++)
    	// {
    	// if(st.GetOnWhich().get(i).getid().equals(getca().getid())){
    	// 	st.Touch(this);
    	// 	return;
    	// }	
    	// }
        //Settler get resource from current asteroid
    	Removeresources(resource);
    	getca().setresource(resource);
}

    // return the resources in the Settler
    //Not in the Test case
       //get the settler's resources
       public ArrayList<String> GetResource(){
        return resourcesList;
    }


    //Settler Remove its own resources
    //not in the testcase
    public void Removeresources(String resource){
        for(int i=0;i<resourcesList.size();i++)
        {
            if(resourcesList.get(i)==resource.toString())
            {
                this.resourcesList.remove(i);
                System.out.println("Success remove resource.");
            }
            else
            System.out.println("You dont have such resource.");
        }
      
    }

    //Settler Hide Test case
    //Settler hide into an asteroid
    public void Hide(){
        
        ca.Protect(this);
       
    }

    //Settler construct Robot Test case
    //Settler create a robot and spend resources and then put into the field
    public void Constructrobot(Field f){
        //settler create robot
        int iron=0;
        int carbon=0;
        int uranium=0;
        for(int i=0;i<resourcesList.size();i++)
        {
           if(resourcesList.get(i).equals("Iron"))
            iron++;
           else if(resourcesList.get(i).equals("Carbon"))
            carbon++;
            else if(resourcesList.get(i).equals("Uranium"))
            uranium++;
            
        }
        if(iron>=1&&carbon>=1&&uranium>=1)
        {
            Robot robot = new Robot(null);
             f.Accept(robot);
             for(int i=0;i<resourcesList.size();i++)
                {
                    if(resourcesList.get(i).equals("Carbon"))
                    {
                        this.resourcesList.remove(i);
                        break;
                    }
                   
                }
                for(int i=0;i<resourcesList.size();i++)
                {
                    if(resourcesList.get(i).equals("Carbon"))
                    {
                        this.resourcesList.remove(i);
                        break;
                    }
                    
                }
                for(int i=0;i<resourcesList.size();i++)
                {
                    if(resourcesList.get(i).equals("Carbon"))
                    {
                        this.resourcesList.remove(i);
                        break;
                    }
                   
                }
            System.out.println("Success construct.");
        }
        else
        System.out.println("Not enough resources.");
       
       
       
    }

    //Settler constructgate Test case
    //Settler create gate by spending resources
    public void Constructgate(Field f,Settler s){
        int iron=0;
        int waterice=0;
        int uranium=0;
        for(int i=0;i<resourcesList.size();i++)
        {
           if(resourcesList.get(i)=="Iron")
            iron++;
            if(resourcesList.get(i)=="WaterIce")
            waterice++;
            if(resourcesList.get(i)=="Uranium")
            uranium++;
        }
        if(iron>=2&&waterice>=1&&uranium>=1)
        {
            Teleportaion_Gate g1 = new Teleportaion_Gate(null);
            Teleportaion_Gate g2 = new Teleportaion_Gate(null);
            gates.add(g1);
            gates.add(g2);
            int count=0;
             for(int i=0;i<resourcesList.size();i++)
                {
                    if(resourcesList.get(i)=="Carbon")
                    resourcesList.remove(i);
                    break;
                }
                for(int j=0;j<resourcesList.size();j++)
                {
        
                    if(resourcesList.get(j)=="WaterIce")
                    resourcesList.remove(j);
                    count++;
                    if(count==2)
                    break;
                }
                for(int k=0;k<resourcesList.size();k++)
                {
                    if(resourcesList.get(k)=="Uranium")
                    resourcesList.remove(k);
                    break;
                }
            System.out.println("Success construct.");
        }
        else
        System.out.println("Not enough resources.");
       
    }

    //Settler BuildGate Test case
    //Settler build gate in the field and field will accept it
    //Check the sunstorm and perihelion explosion condition same time
    public void BuildGate() {
        if(f.gate==false&&this.gates!=null)
        {
            for(int i=0;i<= gates.size();i++) {
               if(gates.get(i)!=null)
               {
                 f.Accept(gates.get(i));
                 gates.remove(gates.get(i));
                 f.gate =true;
                 System.out.println("Success build gate.");
               }
             }
        }
        else
        System.out.println("No gate in package.");
    }
    //SettlerBuildSpaceStation Test case
    //Settler Check the resources and the asteroid. 
    //then Build Space Station
    public void SettlerBuildSpaceStation() throws IOException{
        
    }

}