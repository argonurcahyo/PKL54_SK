package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import com.activeandroid.query.Update;

import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Blok4Model;

/**
 * Created by EKI on 23/02/2015.
 */
public class Blok4BController {
    public void saveBlok4B(String nksb1, String[] s) {

        new Update(Blok4Model.class)
                .set("b4r44 = ?, b4r45 = ?, b4r46 = ?, b4r47 = ?, b4r48 = ?, b4r49 = ?, b4r50 = ?, b4r51 = ?, b4r52 = ?, b4r53 = ?, b4r54 = ?, b4r55 = ?, b4r56 = ?",
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
                        s[12]
                        )
                .where("nksb1 = ?", nksb1)
                .execute();
    }
}
