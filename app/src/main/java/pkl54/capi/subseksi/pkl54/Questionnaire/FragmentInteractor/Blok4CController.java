package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import com.activeandroid.query.Update;

import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Blok4Model;

/**
 * Created by EKI on 24/02/2015.
 */
public class Blok4CController {
    public void saveBlok4C(String nksb1, String[] s) {
        new Update(Blok4Model.class)
                .set("b4r57 = ?, b4r58 = ?, b4r59 = ?, b4r60 = ?, b4r61 = ?, b4r62 = ?, b4r63 = ?, b4r64 = ?, b4r65 = ?, b4r66 = ?, b4r67 = ?, b4r68 = ?, b4r69 = ?, b4r70 = ?, b4r71 = ?, b4r72 = ?, b4r73 = ?",
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
                        s[14],
                        s[15],
                        s[16]
                )
                .where("nksb1 = ?",nksb1)
                .execute();
    }
}
