package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.RatingBar;

/**
 * Created by EKI on 19/02/2015.
 */
public class Blok4DValidator {
    private String[] peringatan = new String[23];
    private Context context;
    boolean valid[] = new boolean[23];

    public Blok4DValidator(Context context) {
        this.context = context;
        valid = new boolean[23];
        peringatan = new String[23];
    }

    public boolean validateRating(RatingBar ratingBar) {
        if (ratingBar.getRating() > 0) {
            return true;
        }
        return false;
    }

    public boolean validateB4R74(RatingBar data) {
        if (validateRating(data)) {
            valid[0] = true;
            peringatan[0] = "";
        } else {
            valid[0] = false;
            peringatan[0] = "Rincian 74 belum diisi\n";
        }
        return valid[0];
    }

    public boolean validateB4R75(RatingBar data) {
        if (validateRating(data)) {
            valid[1] = true;
            peringatan[1] = "";
        } else {
            valid[1] = false;
            peringatan[1] = "Rincian 75 belum diisi\n";
        }
        return valid[1];
    }

    public boolean validateB4R76(RatingBar data) {
        if (validateRating(data)) {
            valid[2] = true;
            peringatan[2] = "";
        } else {
            valid[2] = false;
            peringatan[2] = "Rincian 76 belum diisi\n";
        }
        return valid[2];
    }

    public boolean validateB4R77(RatingBar data) {
        if (validateRating(data)) {
            valid[3] = true;
            peringatan[3] = "";
        } else {
            valid[3] = false;
            peringatan[3] = "Rincian 77 belum diisi\n";
        }
        return valid[3];
    }

    public boolean validateB4R78(RatingBar data) {
        if (validateRating(data)) {
            valid[4] = true;
            peringatan[4] = "";
        } else {
            valid[4] = false;
            peringatan[4] = "Rincian 78 belum diisi\n";
        }
        return valid[4];
    }

    public boolean validateB4R79(RatingBar data) {
        if (validateRating(data)) {
            valid[5] = true;
            peringatan[5] = "";
        } else {
            valid[5] = false;
            peringatan[5] = "Rincian 79 belum diisi\n";
        }
        return valid[5];
    }

    public boolean validateB4R80(RatingBar data) {
        if (validateRating(data)) {
            valid[6] = true;
            peringatan[6] = "";
        } else {
            valid[6] = false;
            peringatan[6] = "Rincian 80 belum diisi\n";
        }
        return valid[6];
    }

    public boolean validateB4R81(RatingBar data) {
        if (validateRating(data)) {
            valid[7] = true;
            peringatan[7] = "";
        } else {
            valid[7] = false;
            peringatan[7] = "Rincian 81 belum diisi\n";
        }
        return valid[7];
    }

    public boolean validateB4R82(RatingBar data) {
        if (validateRating(data)) {
            valid[8] = true;
            peringatan[8] = "";
        } else {
            valid[8] = false;
            peringatan[8] = "Rincian 82 belum diisi\n";
        }
        return valid[8];
    }

    public boolean validateB4R83(RatingBar data) {
        if (validateRating(data)) {
            valid[9] = true;
            peringatan[9] = "";
        } else {
            valid[9] = false;
            peringatan[9] = "Rincian 83 belum diisi\n";
        }
        return valid[9];
    }

    public boolean validateB4R84(RatingBar data) {
        if (validateRating(data)) {
            valid[10] = true;
            peringatan[10] = "";
        } else {
            valid[10] = false;
            peringatan[10] = "Rincian 84 belum diisi\n";
        }
        return valid[10];
    }

    public boolean validateB4R85(RatingBar data) {
        if (validateRating(data)) {
            valid[11] = true;
            peringatan[11] = "";
        } else {
            valid[11] = false;
            peringatan[11] = "Rincian 85 belum diisi\n";
        }
        return valid[11];
    }

    public boolean validateB4R86(RatingBar data) {
        if (validateRating(data)) {
            valid[12] = true;
            peringatan[12] = "";
        } else {
            valid[12] = false;
            peringatan[12] = "Rincian 86 belum diisi\n";
        }
        return valid[12];
    }

    public boolean validateB4R87(RatingBar data) {
        if (validateRating(data)) {
            valid[13] = true;
            peringatan[13] = "";
        } else {
            valid[13] = false;
            peringatan[13] = "Rincian 87 belum diisi\n";
        }
        return valid[13];
    }

    public boolean validateB4R88(RatingBar data) {
        if (validateRating(data)) {
            valid[14] = true;
            peringatan[14] = "";
        } else {
            valid[14] = false;
            peringatan[14] = "Rincian 88 belum diisi\n";
        }
        return valid[14];
    }

    public boolean validateB4R89(RatingBar data) {
        if (validateRating(data)) {
            valid[15] = true;
            peringatan[15] = "";
        } else {
            valid[15] = false;
            peringatan[15] = "Rincian 89 belum diisi\n";
        }
        return valid[15];
    }

    public boolean validateB4R90(RatingBar data) {
        if (validateRating(data)) {
            valid[16] = true;
            peringatan[16] = "";
        } else {
            valid[16] = false;
            peringatan[16] = "Rincian 90 belum diisi\n";
        }
        return valid[16];
    }

    public boolean validateB4R91(RatingBar data) {
        if (validateRating(data)) {
            valid[17] = true;
            peringatan[17] = "";
        } else {
            valid[17] = false;
            peringatan[17] = "Rincian 91 belum diisi\n";
        }
        return valid[17];
    }

    public boolean validateB4R92(RatingBar data) {
        if (validateRating(data)) {
            valid[18] = true;
            peringatan[18] = "";
        } else {
            valid[18] = false;
            peringatan[18] = "Rincian 92 belum diisi\n";
        }
        return valid[18];
    }

    public boolean validateB4R93(RatingBar data) {
        if (validateRating(data)) {
            valid[19] = true;
            peringatan[19] = "";
        } else {
            valid[19] = false;
            peringatan[19] = "Rincian 93 belum diisi\n";
        }
        return valid[19];
    }

    public boolean validateB4R94(RatingBar data) {
        if (validateRating(data)) {
            valid[20] = true;
            peringatan[20] = "";
        } else {
            valid[20] = false;
            peringatan[20] = "Rincian 94 belum diisi\n";
        }
        return valid[20];
    }

    public boolean validateB4R95(RatingBar data) {
        if (validateRating(data)) {
            valid[21] = true;
            peringatan[21] = "";
        } else {
            valid[21] = false;
            peringatan[21] = "Rincian 95 belum diisi\n";
        }
        return valid[21];
    }

    public boolean validateB4R96(RatingBar data) {
        if (validateRating(data)) {
            valid[22] = true;
            peringatan[22] = "";
        } else {
            valid[22] = false;
            peringatan[22] = "Rincian 96 belum diisi\n";
        }
        return valid[22];
    }


    public boolean validateAll() {
        if (valid[0] &&
                valid[1] &&
                valid[2] &&
                valid[3] &&
                valid[4] &&
                valid[5] &&
                valid[6] &&
                valid[7] &&
                valid[8] &&
                valid[9] &&
                valid[10] &&
                valid[11] &&
                valid[12] &&
                valid[13] &&
                valid[14] &&
                valid[15] &&
                valid[16] &&
                valid[17] &&
                valid[18] &&
                valid[19] &&
                valid[20] &&
                valid[21] &&
                valid[22]) {
            return true;
        } else {
            showPeringatan();
            return false;
        }

    }

    public void showPeringatan() {
        StringBuffer gabungan = new StringBuffer();
        for (int i = 0; i < peringatan.length; i++) {
            if (peringatan[i] != null) {
                gabungan.append(peringatan[i]);
            }
        }
        AlertDialog.Builder summary = new AlertDialog.Builder(context);
        summary.setMessage(gabungan);
        summary.setTitle("YANG BELUM LENGKAP :");
        summary.setCancelable(false);
        summary.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }
        );
        summary.create().show();
    }


}
