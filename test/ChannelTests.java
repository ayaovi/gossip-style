package test;
import src.*;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChannelTests {
    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        // Arrange && Act
        Channel channel = new Channel(new Host("h1"), new Host("h2"), 1, 0.01f);

        // Assert
        Assert.assertEquals("h1", channel.getSource().getId());
        Assert.assertEquals("h2", channel.getDestination().getId());
        Assert.assertEquals(1, channel.getSpeed());
        Assert.assertEquals(0.01f, channel.getMessageLossRate(), 0.001);
    }
}
