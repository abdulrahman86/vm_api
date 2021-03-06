package org.aion.interfaces.vm;

import java.math.BigInteger;
import org.aion.types.ByteArrayWrapper;

public interface DataWord {

    byte[] getData();

    byte[] getNoLeadZeroesData();

    BigInteger value();

    DataWord copy();

    boolean isZero();

    ByteArrayWrapper toWrapper();
}
