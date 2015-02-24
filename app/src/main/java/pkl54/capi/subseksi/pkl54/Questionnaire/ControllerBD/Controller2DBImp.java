package pkl54.capi.subseksi.pkl54.Questionnaire.ControllerBD;

import java.util.List;

import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.b1;
import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.b2;

/**
 * Created by EKI on 19/02/2015.
 */
public class Controller2DBImp implements Controller2DB {
    @Override
    public void saveBlok2(String data1, String data2, String data3) {
        b2 blok2 = new b2(getNURT(), data1, data2, data3);
        blok2.save();
    }

    @Override
    public String getNURT() {
        b1 blok1 = new b1();
        List<b1> cad = blok1.getLastNURT();
        b1 blok = cad.get(cad.size()-1);
        return blok.nks;
    }
}
