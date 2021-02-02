package Triton.CoreModules.Robot;

import Triton.CoreModules.Ball.Ball;
import Triton.Misc.Coordinates.Vec2D;

public interface AllySkills {
    /*** primitive control methods ***/
    void autoCap();

    void stop();

    /**
     * @param loc player perspective, millimeter
     */
    void moveTo(Vec2D loc);
    // Note: (moveTo/At & spinTo/At] are mutually exclusive to [pathTo & rotateTo]

    /**
     * @param vel player perspective, vector with unit as percentage from -100 to 100
     */
    void moveAt(Vec2D vel);

    /**
     * @param angle player perspective, degrees, starting from y-axis, positive is counter clockwise
     */
    void spinTo(double angle);

    /**
     * @param angVel unit is percentage from -100 to 100, positive is counter clockwise
     */
    void spinAt(double angVel);

    // runs in the caller thread
    void kick(Vec2D kickVel);


    /*** advanced control methods with path avoiding obstacles ***/
    // Vocab Note: angle == direction

    // fixed at current / specified direction and translationally move to a position
    void strafeTo(Vec2D endPoint);
    void strafeTo(Vec2D endPoint, double angle);

    // Simutaneously rotate and translate to a position in a smooth curve
    void curveTo(Vec2D endPoint);
    void curveTo(Vec2D endPoint, double angle);

    // use explicitly for ball getting when front direction is prioritized
    void sprintFrontTo(Vec2D endPoint);
    void sprintFrontTo(Vec2D endPoint, double angle);


    // exploit on the direction with maximal velocity vector (robot speed is not evenly distributed cross various direction of translational movement)
    void sprintTo(Vec2D endPoint);
    void sprintTo(Vec2D endPoint, double angle);

    // non-primitive rotate method that give a fast-repsonsive but also smoothly approaching target direction
    void rotateTo(double angle);


    /*** Soccer Skills methods ***/
    void getBall(Ball ball);

    void passBall(Vec2D receiveLoc, double ETA); // ETA: estimated arrival time, unit: milliseconds

    // To-do later: public void chipBall(/* parabola */) ...

    /* motion preventing dropping ball on the move */
    void dribBallTo(Ball ball, Vec2D position, double direction);

    void receive(Ball ball, Vec2D receiveLoc);

    void intercept(Ball ball);


    /* getters */
    boolean isHoldingBall();

    double dispSinceHoldBall();

    boolean isMaxDispExceeded();

    boolean isPosArrived(Vec2D loc);

    boolean isDirAimed(double angle);
}
