package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Blok4Model;

/**
 * Created by EKI on 23/02/2015.
 */
public class Blok4A1Controller {
    public void saveBlok4A1(String nksb1, String[] s) {
        Blok4Model blok4Model = new Blok4Model(nksb1, nksb1,
                s[0],
                s[1],
                s[2],
                s[3],
                s[4],
                s[5],
                s[6],
                s[7],
                s[8],
                s[9],
                s[10],
                s[11],
                s[12],
                s[13]);
        blok4Model.save();
    }
}
