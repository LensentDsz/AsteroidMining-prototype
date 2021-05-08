package AsteroidMining.AsteroidMining;

import java.util.ArrayList;

//A class which used for creation and containing Field
public class Map {
    public ArrayList<Field>fields = new ArrayList<Field>();
    public ArrayList<Asteroid> AliveAsteroid = new ArrayList<Asteroid>();
    public ArrayList<Settler> Alivesettler = new ArrayList<Settler>();
    public ArrayList<Robot> Aliverobot = new ArrayList<Robot>();
    int RobotIdNum =0;
    public ArrayList<Teleportaion_Gate> gates= new ArrayList<Teleportaion_Gate>();
    int GateIdNum =0;
    public ArrayList<SunStorm> Alivesunstorm = new ArrayList<SunStorm>();
    int SunStormIdNum =0;
    public int Round = 0;

   
    //Test case of CreateAsteroid
        //create 30 asteroid with format(A01-A30)
    public void CreateAsteroid(){
        //create 30 asteroid with format(A01-A30)
        for(int i =1;i<31;i++){
            //要在Asteroid 的构造函数更改,构造要添加id的参数 要生成resource
           if(i<10) AliveAsteroid.add(new Asteroid("A"+"0"+Integer.toString(i)));
           if(i>=10) AliveAsteroid.add(new Asteroid("A"+Integer.toString(i)));
        }
       
    }
    //Test case of CreateSettler
    public void CreateSettler()
    {
        
        //create 1 settler with format(settler1-settler2) use Aliveset.size to have the ID
            //要在settler 的构造函数更改,构造要添加id的参数
        int set=Alivesettler.size()+1;
        Alivesettler.add(new Settler("settler"+Integer.toString(set)));
    
    }
    //Test case of CreateRobot
        //create 1 robot with format(robot1-robot9) use Aliverobot.size to have the ID
        //implicit requirement(number of robot can have at most 9)
    public void CreateRobot()
    {  
            //要在robot 的构造函数更改,构造要添加id的参数
        RobotIdNum += 1;
        Aliverobot.add(new Robot("Robot"+Integer.toString(RobotIdNum)));
     
    }
    //Test case of CreateSunstorm
        //create 1 sunstorm with format(sunstorm1-sunstorm9) use Alivesunstorm.size to have the ID
        //implicit requirement(number of sunstorm can have at most 9)
    public void CreateSunstorm()
    {
         //要在sunstorm 的构造函数更改,构造要添加id的参数
        SunStormIdNum += 1;
        Alivesunstorm.add(new SunStorm("SunStorm"+Integer.toString(SunStormIdNum)));  
    }

    //Test case of CreateGate
    public void CreateGate()
    {
        GateIdNum+=1;
        //a pair of gates
        gates.add(new Teleportaion_Gate("G"+Integer.toString(GateIdNum)+"1"));
        gates.add(new Teleportaion_Gate("G"+Integer.toString(GateIdNum)+"2"));
       
    }
    //Test case of Step
    public void Step()
    {
        ++Round;
      
    }
}
