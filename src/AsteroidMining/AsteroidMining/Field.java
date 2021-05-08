package AsteroidMining.AsteroidMining;

import java.util.ArrayList;

//import jdk.internal.loader.Resource;

//A class which contains some Thing in a field
public class Field {
   Boolean hide=false;
   Boolean gate=false;
   // neigbour Fields
   public ArrayList<Field> neighbors = new ArrayList<Field>();
   public ArrayList<Robot> robot = new ArrayList<Robot>();
   public ArrayList<Settler> settler = new ArrayList<Settler>();
   public Resource r;
   public ArrayList<Teleportaion_Gate> gates = new ArrayList<Teleportaion_Gate>();
   public ArrayList<SunStorm> sunstorm = new ArrayList<SunStorm>();
   public Asteroid a;
   //Accept Thing into this Field
   public void Accept(Settler s){
     settler.add(s);
   }
   public void Accept(Robot r)
   {
      robot.add(r);
   }
   public void Accept(Resource re)
   {
      this.r=re;
   }
   public void Accept(Teleportaion_Gate g)
   {
      gates.add(g);
   }
   public void Accept(SunStorm s)
   {
      sunstorm.add(s);
   }
   //Remove Thing from this Field
   public void Remove(Settler s){
      
      for(int i=0;i<settler.size();i++){
         Settler tmps = settler.get(i); 
         if(tmps==s){
            settler.remove(i);
            break;
         }
      }
    
   }
   public void Remove(Robot r){
     
      for(int i=0;i<robot.size();i++){
         Robot tmpr = robot.get(i); 
         if(tmpr==r){
            robot.remove(i);
            break;
         }
      }
     
   }
   public void Remove(Resource re){
      this.r=null;
   }
   public void Remove(Asteroid a){
     this.a=null;
   }
   public void Remove(Teleportaion_Gate g){
     
      for(int i=0;i<gates.size();i++){
         Teleportaion_Gate tmpg = gates.get(i); 
         if(tmpg==g){
            gates.remove(i);
            break;
         }
      }
      
   }
   public void Remove(SunStorm sun){
    
      for(int i=0;i<sunstorm.size();i++){
         SunStorm tmps = sunstorm.get(i); 
         if(tmps==sun){
            sunstorm.remove(i);
            break;
         }
      }
    
   }
   //Return Neighbour fields
   public ArrayList<Field> GetNeighours(){
      ArrayList<Field> f = new ArrayList<Field>();
     
      return f;

   }

}
