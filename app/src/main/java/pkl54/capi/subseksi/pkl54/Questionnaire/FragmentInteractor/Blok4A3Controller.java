package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import com.activeandroid.query.Update;

import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Blok4Model;

/**
 * Created by EKI on 23/02/2015.
 */
public class Blok4A3Controller {
    public void saveBlok4A3(String nksb1, String[] s) {
        new Update(Blok4Model.class)
                .set("b4r29 = ?, b4r30 = ?, b4r31 = ?, b4r32 = ?, b4r33 = ?, b4r34 = ?, b4r35 = ?, b4r36 = ?, b4r37 = ?, b4r38 = ?, b4r39 = ?, b4r40 = ?, b4r41 = ?, b4r42 = ?, b4r43 = ?",
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
                        s[13],
                        s[14])
                .where("nksb1 = ?", nksb1)
                .execute();
    }
}
