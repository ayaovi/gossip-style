package src;

public class Channel
{
    private final Host source;
    private final Host destination;
    private final int speed;
    private final float messageLossRate;

    public Channel(Host source, Host destination, int speed, float messageLossRate)
    {
        this.source = source;
        this.destination = destination;
        this.speed = speed;
        this.messageLossRate = messageLossRate;
    }

    public int getSpeed() { return speed; }
    public float getMessageLossRate() { return messageLossRate; }
    public Host getSource() { return source; }
    public Host getDestination() { return destination; }
}