import org.geolatte.geom.Features;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Karel Maesen, Geovise BVBA on 04/12/16.
 */
public class TestFeatures {

    @Test
    public void testFeaturesUseSdoPointDefault(){
        assertFalse(Features.useSdoPointType());
    }

    @Test
    public void testFeaturesSdoPointSettoTrue(){
        System.setProperty(Features.USE_SDO_POINT, "true");
        assertTrue(Features.useSdoPointType());
        System.setProperty(Features.USE_SDO_POINT, "1");
        assertTrue(Features.useSdoPointType());
    }

    @Test
    public void testFeaturesSdoPointSettoFalse(){
        System.setProperty(Features.USE_SDO_POINT, "false");
        assertFalse(Features.useSdoPointType());
        System.setProperty(Features.USE_SDO_POINT, "0");
        assertFalse(Features.useSdoPointType());
    }


}
