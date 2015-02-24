package pkl54.capi.subseksi.pkl54.Questionnaire.ControllerBD;

import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.b1;

/**
 * Created by EKI on 19/02/2015.
 */
public class Controller1DBImp implements Controller1DB {
    @Override
    public void saveBlok1(String data1, String data2, String data3, String data4, String data5, String data6, String data7, String data8, String data9, String data10) {
        b1 blok1 = new b1(data1, data2, data3, data4, data5, data6, data7, data8, data9, data10, "false");
        blok1.save();
    }
}
