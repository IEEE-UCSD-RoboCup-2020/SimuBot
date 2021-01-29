package Triton.CoreModules.AI.Estimators;


import Triton.Config.AIConfig;
import Triton.CoreModules.Ball.Ball;
import Triton.CoreModules.Robot.Ally;
import Triton.CoreModules.Robot.Foe;
import Triton.CoreModules.Robot.Robot;
import Triton.CoreModules.Robot.RobotList;
import Triton.Misc.Coordinates.PerspectiveConverter;
import Triton.Misc.Coordinates.Vec2D;
import Triton.PeriphModules.Detection.RobotData;


/* provide misc estimations methods to give AI
 * situation awareness of everything happening
 * on the game field
 * */
public class Estimator {
    private final RobotList<Ally> allies;
    private final RobotList<Foe> foes;
    private final Ball ball;
    private final Ally goalKeeper;

    public Estimator(RobotList<Ally> allies, Ally goalKeeper, RobotList<Foe> foes, Ball ball) {
        this.allies = allies;
        this.foes = foes;
        this.ball = ball;
        this.goalKeeper = goalKeeper;
    }

    /*
     * under the premises a robot is holding the ball,
     * return the trajectory of its currently aiming
     */
    public Vec2D getAimTrajectory() {
        Robot bot = getBallHolder();
        if (bot == null)
            return new Vec2D(0.00, 0.00);

        return new Vec2D(bot.getData().getAngle());
    }

    /*
     * return the reference of the robot currently holding/dribbling the ball,
     * if no robot is currently holding the ball, return null
     */
    public Robot getBallHolder() {
        Vec2D ballPos = ball.getData().getPos();

        RobotList<Robot> bots = new RobotList<Robot>();
        bots.addAll(allies);
        bots.addAll(foes);
        bots.add(goalKeeper);

        for (Robot bot : bots) {
            RobotData botData = bot.getData();
            Vec2D botPos = botData.getPos();
            double botAngle = botData.getAngle();
            double dist = Vec2D.dist(ballPos, botPos);
            double ballFaceAngle = ballPos.sub(botPos).toPlayerAngle();
            double angleDiff = PerspectiveConverter.calcAngDiff(ballFaceAngle, botAngle);
            double absAngleDiff = Math.abs(angleDiff);

            if (dist <= AIConfig.BALL_HOLD_DIST_THRESH && absAngleDiff <= AIConfig.BALL_HOLD_ANGLE_THRESH) {
                return bot;
            }
        }

        return null;
    }

    /*
     * under the premises of no robots is holding the ball,
     * evaluate if Ally robots have a chance to get and hold
     * the ball at the current timestamp
     */
    public boolean hasHoldBallChance() {
        return true;
    }


}