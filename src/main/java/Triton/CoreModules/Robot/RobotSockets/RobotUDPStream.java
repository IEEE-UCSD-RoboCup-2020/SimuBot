package Triton.CoreModules.Robot.RobotSockets;

import Triton.Misc.ModulePubSubSystem.Module;

import java.net.DatagramSocket;

/**
 * Implementation of UDP Stream
 */
public abstract class RobotUDPStream implements Module {

    protected int port;
    protected int ID;

    protected DatagramSocket socket;

    /**
     * Constructs a UDP stream
     *
     * @param port port of UDP stream
     * @param ID   ID of robot
     */
    public RobotUDPStream(int port, int ID) {
        this.port = port;
    }

    @Override
    public void run() {
    }
}
