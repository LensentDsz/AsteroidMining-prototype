package AsteroidMining.AsteroidMining;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//A class which can let player start game and set Settler
public class Game {
    //Settler to be setted
   private Settler s;
   Map map = new Map();
   //Test case of StartGame
   //Ask player in which game type want to be started and set settler
    public void StartGame()throws IOException
    {
        String enter;
       
        BufferedReader br = new BufferedReader(new 
        InputStreamReader(System.in));
        enter = br.readLine();
        int num = Integer.parseInt(enter);
        if(num==1)
        {
            SinglePlayer();
        }
        else if(num==2){
            MultiplePlayer();
        }
        else 
        System.out.println("Wrong input");
    }
    //Test case of EndGame
    //Check the alive Player now and decide wheather to win a game (some settler alive)or loose a game(all settler die)
    public void EndGame()
    {
      
    }
    //Test case of SinglePlayer
    //Construct map, robot and SunStorm and Set the create position of the settler
    public void SinglePlayer(){
      
        Map map = new Map();
        map.CreateAsteroid();
        map.CreateRobot();
        map.CreateSunstorm();
        SetPosition(s);
        
        
    }
    //Test case of MultiplePlayer
    //Construct map, robot and SunStorm and Set the create position of two settlers
    public void MultiplePlayer(){
       
        Map map = new Map();
        map.CreateAsteroid();
        map.CreateRobot();
        map.CreateSunstorm();
        SetPosition(s);
        SetPosition(s);
     
    }
    //Test case of Set Position
    //Set settler in a field
    public void SetPosition(Settler s)
    {
        Map map = new Map();
        Field field=new Field();
       
        this.s = s;
        map.CreateSettler();
        field.Accept(s);
       
    }
    //Test case of ControllSettler
    // ControllSettler
    public void ControllSettler(){
      
    }

}
