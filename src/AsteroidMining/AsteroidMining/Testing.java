// package AsteroidMining.AsteroidMining;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// //A testing Class so that can run the whole game in this class and check the dialog
// public class Testing{
//     private static String tab="";
    
//     //General out put for test case calling method start
//     public static void methodStart(String m )
//     {
//         System.out.println(tab+m+" started");
//         tab=tab+" ";
//     }
//     //General out put for test case calling method end
//     public static void methodEnd(String m)
//     {
//         System.out.println(tab+m+" ended");
//         tab=tab.substring(0,tab.length()-1);
//     }
//     //All Test cases
//     public void Test() throws IOException
// {
//         Game game = new Game();
//         Robot robot = new Robot();
//         Settler s= new Settler();
//         Field f= new Field();
//         Resource r= new Resource();
//         Asteroid a= new Asteroid();
//         String enter = "26";

//         while(!enter.equals("24")){
//         BufferedReader br = new BufferedReader(new 
//         InputStreamReader(System.in));

//         System.out.println("--Please input anything to start--");
//         br.readLine();
//         //All test cases in the skeleton
//         System.out.println("Please chose the test case:");
//         System.out.println("1:StartGame");
//         System.out.println("2:MultiPlayer");
//         System.out.println("3:SinglePlayer");
//         System.out.println("4:SetPosition");
//         System.out.println("5:ControllSettler");
//         System.out.println("6:SettlerBuildGate");
//         System.out.println("7:SettlerBuildRobot");
//         System.out.println("8:SettlerBuildSpaceStation");
//         System.out.println("9:SettlerDrill");
//         System.out.println("10:SettlerHide");
//         System.out.println("11:SettlerMine");
//         System.out.println("12:SettlerPutResourceDown");
//         System.out.println("13:SettlerSetGate");
//         System.out.println("14:SettlerTravel");
//         System.out.println("15:SettlerUseGate");
//         System.out.println("16:ViewMap");
//         System.out.println("17:ControlAsteroid");
//         System.out.println("18:ControlSunStorm");
//         System.out.println("19:ControlRobot");
//         System.out.println("20:RobotTravel");
//         System.out.println("21:RobotDrill");
//         System.out.println("22:RobotHide");
//         System.out.println("23:RobotUseGate");
//         System.out.println("24:EndGame");

//         while(true)
//         {
//         //take the choose from tester
//         enter = br.readLine();
//         int num = Integer.parseInt(enter);
//         //switch for check the tester choose now
//         switch(num)
//         {
            
//             case 1:
//             game.StartGame();
//             break;

//             case 2:
//             game.MultiplePlayer();
//             break;

//             case 3:
//             game.SinglePlayer();
//             break;

//             case 4:
//             game.SetPosition(s);
//             break;

//             case 5:
//             game.ControllSettler();
//             break;

//             case 6:
//             s.BuildGate();
//             break;

//             case 7:
//             s.Constructgate(f, s);
//             break;

//             case 8:
//             s.SettlerBuildSpaceStation();
            
//             break;

//             case 9:
//             s.Drill();
//             break;

//             case 10:
//             s.Hide(f);
//             break;

//             case 11:
//             s.Mine();
//             break;

//             case 12:
//             s.AddResource(r.toString());
//             break;

//             case 13:
//             s.Constructgate(f, s);
//             break;

//             case 14:
//             s.Travel();
//             break;

//             case 15:
//             s.TP(null);
//             break;

//             //View Map Test Case
//             //Which should be presented by later version
//             case 16:
//             System.out.println("This is UI in game.");
//             System.out.println("Settler1 alive, located : A1, resources: WaterIce");
//             System.out.println("Robot1 alive, located: A2");
//             System.out.println("sunstorm is affecting c1, c2, c3, b2, b3 , next round it will");
//             System.out.println("move to c5,c6,c7,b5,b6");
//             System.out.println("A1: depth equals 0 , the resources is uranium��five rounds to");
//             System.out.println("reach perihelion");
//             System.out.println(" A2��depth equals 3 �� the resources is unknown, five rounds");
//             System.out.println(" to reach perihelion");
//             break;

//             case 17:
//             System.out.println("This is internal controller.");
//             break;

//             case 18:
//             System.out.println("This is internal controller.");
//             break;

//             case 19:
//             System.out.println("This is internal controller.");
//             break;

//             case 20:
//             robot.Travel();
//             break;

//             case 21:
//             robot.Drill();
//             break;
          
//             case 22:
//             robot.Hide();
//             break;
          
//             case 23:
//             robot.TP(null);
//             break;
           
//             case 24:
//             game.EndGame();
//             break;
//         }
//         }
        
//     }    
       
// }
//     //Main program
//     public static void main(String[] args)throws IOException{
//       Testing test = new Testing();
//         test.Test();
//     }
// }