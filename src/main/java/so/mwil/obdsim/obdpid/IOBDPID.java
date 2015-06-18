package so.mwil.obdsim.obdpid;

/**
 *  <h1>OBDPID Interface</h1>
 *
 *  Created by matthew on 01/11/14.
 */
public interface IOBDPID {

    String getCode();

    String generateResponse(String mode);

    String getUnit();

    String getMinValue();

    String getMaxValue();
}
