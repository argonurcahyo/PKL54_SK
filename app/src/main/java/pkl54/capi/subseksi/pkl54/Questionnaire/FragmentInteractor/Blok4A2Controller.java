package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import com.activeandroid.query.Update;

import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Blok4Model;

/**
 * Created by EKI on 23/02/2015.
 */
public class Blok4A2Controller {
    public void saveBlok4A2(String nksb1, String[] s) {
        new Update(Blok4Model.class)
                .set("b4r15 = ?, b4r16 = ?, b4r17 = ?, b4r18 = ?, b4r19 = ?, b4r20 = ?, b4r21 = ?, b4r22 = ?, b4r23 = ?, b4r24 = ?, b4r25 = ?, b4r26 = ?, b4r27 = ?, b4r28 = ?",
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
                        s[13])
                .where("nksb1 = ?", nksb1)
                .execute();
    }
}
