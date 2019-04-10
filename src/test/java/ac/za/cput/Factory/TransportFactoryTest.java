package ac.za.cput.Factory;

import ac.za.cput.Domain.Transport;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransportFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getTransport() {
        String name = "Cape Town";
        Transport c = TransportFactory.getTransport(name);
        System.out.println(c);
        Assert.assertNotNull(c.getTransDestination());
    }
}