package Triton.Detection;

import Proto.MessagesRobocupSslDetection.SSL_DetectionBall;
import Triton.Shape.Vec2D;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class to store information about the ball
 */
public class BallData {

    public static final int MAX_SIZE = 10;
    private final ArrayList<SortedDetection> detections = new ArrayList<>();
    private Vec2D pos;
    private Vec2D vel;

    /**
     * Updates ArrayList of SortedDetections and calculates the current velocity of the ball
     * @param detection SSL_Detection of the ball
     * @param time time of detection
     */
    public void update(SSL_DetectionBall detection, double time) {
        SortedDetection latest = new SortedDetection(detection, time);
        detections.add(latest);
        Collections.sort(detections);

        SortedDetection newest = detections.get(0);
        pos = newest.getPos();

        // return when there is no previous data
        if (detections.size() == 1) {
            vel = new Vec2D(0, 0);
            return;
        }
        // if there are more than MAX_SIZE data, remove the oldest
        else if (detections.size() > MAX_SIZE) {
            detections.remove(0);
        }

        SortedDetection secondLatest = detections.get(detections.size() - 2); // change peek() to get(size  - 2);
        double dt = (latest.time - secondLatest.time) * 1000;
        if (dt != 0) {
            vel = latest.getPos().sub(secondLatest.getPos()).mult(1 / dt);
        }
    }

    /**
     * @return current position of the ball
     */
    public Vec2D getPos() {
        return pos;
    }

    /**
     * @return current velocity of the ball
     */
    public Vec2D getVel() {
        return vel;
    }

    /**
     * SSL_DetectionBall that can be compared based on time of detection
     */
    public class SortedDetection implements Comparable<SortedDetection> {
        public final SSL_DetectionBall detection;
        public final double time;

        public SortedDetection(SSL_DetectionBall detection, double time) {
            this.detection = detection;
            this.time = time;
        }

        @Override
        public int compareTo(SortedDetection other) {
            return (int) (other.time - time);
        }

        @Override
        public String toString() {
            return "[" +this.time+"," + this.detection +"]";
        }

        public Vec2D getPos() {
            return new Vec2D(detection.getX(), detection.getY());
        }
    }
}