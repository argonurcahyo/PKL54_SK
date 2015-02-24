package pkl54.capi.subseksi.pkl54.Questionnaire;

import android.widget.RatingBar;

/**
 * Created by EKI on 19/02/2015.
 */
public class Blok4DValidator {
    public Blok4DValidator(){

    }

    public boolean validateRating(RatingBar ratingBar){
        if(ratingBar.getRating()>0){
            return true;
        }return false;
    }
}
