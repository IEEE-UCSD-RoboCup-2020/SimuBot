package Triton.Dependencies.Shape;

import Proto.RemoteAPI;

/**
 * Represents a 2D vector
 */
public class Vec2D {
    public final double x;
    public final double y;
    private String name;

    /**
     * Constructs a vector with specified x and y values
     * @param x x value of vector
     * @param y y value of vector
     */
    public Vec2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructs a deep copy of target vector
     * @param target vector to copy
     */
    public Vec2D(Vec2D target) {
        this(target.x, target.y);
        name = target.name;
    }

    /**
     * Add another vector to current vector
     * @param toAdd vector to add
     * @return a new vector after addition
     */
    public Vec2D add(Vec2D toAdd) {
        return new Vec2D(this.x + toAdd.x, this.y + toAdd.y);
    }

    /**
     * Add x and y to current vector
     * @param x x value to add
     * @param y y value to add
     * @return a new vector after addition
     */
    public Vec2D add(double x, double y) {
        return new Vec2D(this.x + x, this.y + y);
    }

    /**
     * Subtract another vector from current vector
     * @param toSubtract vector to subtract by
     * @return a new vector after subtraction
     */
    public Vec2D sub(Vec2D toSubtract) {
        return new Vec2D(this.x - toSubtract.x, this.y - toSubtract.y);
    }

    /**
     * Multiply current vector by a scalar
     * @param z value to multiply by
     * @return a new vector multiplied by the scalar
     */
    public Vec2D mult(double z) {
        return new Vec2D(this.x * z, this.y * z);
    }

    /**
     * @param name name of vector to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the name of the vector
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the angle between the vector and the x-axis
     * @return the angle between the vecotr and the x-axis
     */
    public double getAngle() {
        return Math.atan(this.y / this.x);
    }

    /**
     * Rotate vector by specified angle
     * @param angle angle to rotate by
     * @return a new vector after rotation
     */
    public Vec2D rotate(double angle) {
        double newX = Math.cos(angle) * x + -Math.sin(angle) * y;
        double newY = Math.sin(angle) * x + Math.cos(angle) * y;
        return new Vec2D(newX, newY);
    }

    /**
     * Returns the length of the vector
     * @return the length of the vector
     */
    public double mag() {
        return Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
    }

    /**
     * Returns the unit vector (vector with length 1)
     * @return the unit vector
     */
    public Vec2D norm() {
        double mag = mag();
        return new Vec2D(x / mag, y / mag);
    }

    /**
     * Returns the distance between two vectors
     * @param v1 the first vector
     * @param v2 the second vector
     * @return the distance between the two vectors
     */
    public static double dist(Vec2D v1, Vec2D v2) {
        double diffX2 = Math.pow((v2.x - v1.x), 2);
        double diffY2 = Math.pow((v2.y - v1.y), 2);
        return Math.pow(diffX2 + diffY2, 0.5);
    }

    /**
     * Returns the distance squared between the two vectors
     * @param v1 the first vector
     * @param v2 the second vector
     * @return the distance squared between the two vectors
     */
    public static double dist2(Vec2D v1, Vec2D v2) {
        double diffX2 = Math.pow((v2.x - v1.x), 2);
        double diffY2 = Math.pow((v2.y - v1.y), 2);
        return diffX2 + diffY2;
    }

    /**
     * Returns current vector as a RemoteAPI Vec2D
     * @return current vector as a RemoteAPI Vec2D
     */
    public RemoteAPI.Vec2D toProto() {
        RemoteAPI.Vec2D.Builder builder = RemoteAPI.Vec2D.newBuilder();
        builder.setX(x);
        builder.setY(y);
        return builder.build();
    }

    /**
     * @return the vector as a string representation
     */
    @Override
    public String toString() {
        String s = "";
        s += "<" + x + ", " + y + ">";
        return s;
    }
}