package Triton.ManualTests.CoreTests.RobotSkillsTests;

import Triton.Config.Config;
import Triton.CoreModules.Ball.Ball;
import Triton.CoreModules.Robot.Ally.Ally;

import static Triton.Util.delay;


public class GetBallTest extends RobotSkillsTest {
    Ally ally;
    Ball ball;

    public GetBallTest(Ally ally, Ball ball) {
        this.ally = ally;
        this.ball = ball;
    }

    @Override
    public boolean test(Config config) {
//        String line;
//        do {
//            System.out.println(">> ENTER \"start\" TO START:");
//            line = scanner.nextLine();
//        } while (!line.equals("start"));

        while (!ally.isHoldingBall()) {
            ally.getBall(ball);
            System.out.println(ball.getPos());
            delay(3);
        }

        ally.stop();
        long t0 = System.currentTimeMillis();
        while(System.currentTimeMillis() - t0 < 1000) {
            System.out.println(ball.getPos());
        }

        return true;
    }
}
