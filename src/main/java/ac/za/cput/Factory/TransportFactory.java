package ac.za.cput.Factory;

import ac.za.cput.Domain.Transport;
import ac.za.cput.Util.Misc;

public class TransportFactory {

    public static Transport getTransport(String transDestination){
        return new Transport.Builder().transDestination(Misc.generateId()).transDestination(transDestination).build();
    }
}
