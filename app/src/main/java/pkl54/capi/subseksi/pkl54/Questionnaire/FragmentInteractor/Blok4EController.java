package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import com.activeandroid.query.Update;

import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Blok1Model;
import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Blok4Model;

/**
 * Created by EKI on 24/02/2015.
 */
public class Blok4EController {
    public void saveBlok4E(String nksb1, long getTime, String[] s) {
        new Update(Blok4Model.class)
                .set("b4r97 = ? ,b4r98 = ?, b4r99 = ?, b4r100 = ?, b4r101 = ?, b4r102 = ?, b4r103 = ?, b4r104 = ?, b4r105 = ?, b4r106 = ?, b4r107 = ?, b4r108 = ?, b4r109 = ?, b4r110 = ?, b4r111 = ?, b4r112 = ?, b4r113 = ?",
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
                        s[16])
                .where("nksb1 = ?", nksb1)
                .execute();

        new Update(Blok1Model.class)
                .set("hasCompleted = ?, timestamp = ?", "true", getTime)
                .where("nks = ?", nksb1)
                .execute();
    }
}
