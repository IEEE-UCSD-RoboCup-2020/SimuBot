package Triton.CoreModules.AI.AI_Skills;

import Triton.Config.ObjectConfig;
import Triton.CoreModules.Robot.Ally;
import Triton.CoreModules.Robot.AllyState;
import Triton.CoreModules.Robot.RobotList;
import Triton.Misc.Coordinates.Vec2D;
import Triton.Misc.Geometry.Line2D;

import java.util.ArrayList;
import java.util.Vector;

public class SwarmMoves extends Skills{

    /* Command a group of robots from the input botList
     * to go to each ones' nearest locations & designated directions(angles)
     *
     * Size of the the botList doesn't have to be numRobots for sometimes
     * we only want some of the robots to go to certain locations while
     * leaving others controlled by other methods.
     *
     * @contract: botList.size() == locList.size() == angList.size()
     * @return true when all bots from botList have arrived their corresponding locations
     * */
    public static boolean groupTo(RobotList<Ally> botList, ArrayList<Vec2D> locList, ArrayList<Double> angList) {
        if(botList.size() > ObjectConfig.ROBOT_COUNT - 1
                || botList.size() != locList.size()
                || locList.size() != angList.size()) {
            System.out.println("Inputs have invalid size(s)");
        }

        @SuppressWarnings("unchecked")
        RobotList<Ally> bots = (RobotList<Ally>) botList.clone(); // shallow copy
        boolean rtn = true;

        for(int i = 0; i < locList.size(); i++) {
            Vec2D loc = locList.get(i);
            Double ang = angList.get(i);
            Ally nearestBot = null;
            double dist = Double.MAX_VALUE;

            /* find nearest bot */
            for(Ally bot : bots) {
                double newDist = loc.sub(bot.getLoc()).mag();
                if(newDist < dist) {
                    dist = newDist;
                    nearestBot = bot;
                }
            }
            if(nearestBot != null) {
                bots.remove(nearestBot);

                /* command nearest bot to the corresponding location */
                nearestBot.sprintToAngle(loc, ang);

                if(!nearestBot.isLocArrived(loc) || !nearestBot.isAngleAimed(ang)) {
                    rtn = false;
                }
            }
        }

        return rtn;
    }

    /* similar as above */
    public static boolean groupTo(RobotList<Ally> botList, ArrayList<Vec2D> locList) {
        if(botList.size() > ObjectConfig.ROBOT_COUNT - 1 || botList.size() != locList.size()) {
            System.out.println("Inputs have invalid size(s)");
        }

        @SuppressWarnings("unchecked")
        RobotList<Ally> bots = (RobotList<Ally>) botList.clone(); // shallow copy
        boolean rtn = true;

        for(Vec2D loc : locList) {
            Ally nearestBot = null;
            double dist = Double.MAX_VALUE;

            /* find nearest bot */
            for(Ally bot : bots) {
                double newDist = loc.sub(bot.getLoc()).mag();
                if(newDist < dist) {
                    dist = newDist;
                    nearestBot = bot;
                }
            }
            if(nearestBot != null) {
                bots.remove(nearestBot);

                /* command nearest bot to the corresponding location */
                nearestBot.sprintTo(loc);

                if(!nearestBot.isLocArrived(loc)) {
                    rtn = false;
                }
            }
        }
        return rtn;
    }


    public static void lineUp(RobotList<Ally> botList, Line2D line) {
        if(botList.size() > ObjectConfig.ROBOT_COUNT - 1) {
            System.out.println("botList has invalid size");
        }

    }

    // To-do: make Curve2D
    public static void CurveUp(RobotList<Ally> botList /*...*/) {
        if(botList.size() > ObjectConfig.ROBOT_COUNT - 1) {
            System.out.println("botList has invalid size");
        }

    }

}
