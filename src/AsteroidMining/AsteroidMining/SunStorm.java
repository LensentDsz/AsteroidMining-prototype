package AsteroidMining.AsteroidMining;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//A system controlled Thing which can attack Settler and Robot
public class SunStorm extends Thing implements Stepable{

    Field f = new Field();
    private ArrayList<Asteroid> onwhichasteroid = new ArrayList<Asteroid>();
    public ArrayList<Asteroid> GetOnWhich() {
    	return onwhichasteroid;
    }
    public SunStorm(String string){
        super(string);
    }
 
    //When robot be touched by Sunstorm 
    //Not be showned in the dialog
    public void Touch(Robot r){}
    //Control Sunstorm to move
    public void Step(){
        Move();
    }

    //Move in the map
    public void Move(){}
    //Disappear when time is there
    public void Disappear(){}
}
