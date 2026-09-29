import kareltherobot.*;

public class Driver
{
   public static void main(String[] args)
   {
       World.setVisible(true);
       World.reset();
       World.readWorld("BreadCrumbs.kwld");
       World.setDelay(10);
       World.setTrace(false);
       
       BreadCrumbFollower dan = new BreadCrumbFollower(1,1,Directions.East,0);
       dan.travel();
       dan.turnOff();
    }
}
