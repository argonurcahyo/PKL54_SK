package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import com.activeandroid.query.Update;

import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Blok4Model;

/**
 * Created by EKI on 24/02/2015.
 */
public class Blok4DController {
    public void saveBlok4D(String nksb1, String[] s) {
        new Update(Blok4Model.class)
                .set("b4r74 = ? ,b4r75 = ?, b4r76 = ?, b4r77 = ?, b4r78 = ?, b4r79 = ?, b4r80 = ?, b4r81 = ?, b4r82 = ?, b4r83 = ?, b4r84 = ?, b4r85 = ?, b4r86 = ?, b4r87 = ?, b4r88 = ?, b4r89 = ?, b4r90 = ?, b4r91 = ?, b4r92 = ?, b4r93 = ?, b4r94 = ?, b4r95 = ?, b4r96 = ?",
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
                        s[16],
                        s[17],
                        s[18],
                        s[19],
                        s[20],
                        s[21],
                        s[22])
                .where("nksb1 = ?", nksb1)
                .execute();
    }
}
