package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import android.content.Context;

import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Blok3Model;

/**
 * Created by EKI on 23/02/2015.
 */
public class Blok3Controller{
    public void saveBlok3(String nksb1,String[] s){
        Blok3Model blok3=new Blok3Model(nksb1, nksb1,
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
                s[19]
        );
        blok3.save();
    }
}
