package pkl54.capi.subseksi.pkl54.Questionnaire;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.RatingBar;

/**
 * Created by EKI on 19/02/2015.
 */
public class Blok4CValidator {

    private Context context;
    private boolean[] valid;
    String[] peringatan;

    public Blok4CValidator(Context context) {
        this.context = context;
        valid = new boolean[17];
        peringatan = new String[17];
    }

    public void initValid() {
        for(int i=0; i<valid.length;i++) {
            valid[i] = false;
        }
    }

    public boolean validateB4R57 (RatingBar data) {
        boolean nilai = cekNilaiB4r57(data);

        if(nilai) {
            valid[0] = true;
        } else {
            valid[0] = false;
        }
        return valid[0];
    }

    public boolean validateB4R58 (RatingBar data) {
        boolean nilai = cekNilaiB4r58(data);

        if(nilai) {
            valid[1] = true;
        } else {
            valid[1] = false;
        }
        return valid[1];
    }

    public boolean validateB4R59 (RatingBar data) {
        boolean nilai = cekNilaiB4r59(data);

        if(nilai) {
            valid[2] = true;
        } else {
            valid[2] = false;
        }
        return valid[2];
    }

    public boolean validateB4R60 (RatingBar data) {
        boolean nilai = cekNilaiB4r60(data);

        if(nilai) {
            valid[3] = true;
        } else {
            valid[3] = false;
        }
        return valid[3];
    }

    public boolean validateB4R61 (RatingBar data) {
        boolean nilai = cekNilaiB4r61(data);

        if(nilai) {
            valid[4] = true;
        } else {
            valid[4] = false;
        }
        return valid[4];
    }

    public boolean validateB4R62 (RatingBar data) {
        boolean nilai = cekNilaiB4r62(data);

        if(nilai) {
            valid[5] = true;
        } else {
            valid[5] = false;
        }
        return valid[5];
    }

    public boolean validateB4R63 (RatingBar data) {
        boolean nilai = cekNilaiB4r63(data);

        if(nilai) {
            valid[6] = true;
        } else {
            valid[6] = false;
        }
        return valid[6];
    }

    public boolean validateB4R64 (RatingBar data) {
        boolean nilai = cekNilaiB4r64(data);

        if(nilai) {
            valid[7] = true;
        } else {
            valid[7] = false;
        }
        return valid[7];
    }

    public boolean validateB4R65 (RatingBar data) {
        boolean nilai = cekNilaiB4r65(data);

        if(nilai) {
            valid[8] = true;
        } else {
            valid[8] = false;
        }
        return valid[8];
    }

    public boolean validateB4R66 (RatingBar data) {
        boolean nilai = cekNilaiB4r66(data);

        if(nilai) {
            valid[9] = true;
        } else {
            valid[9] = false;
        }
        return valid[9];
    }

    public boolean validateB4R67 (RatingBar data) {
        boolean nilai = cekNilaiB4r67(data);

        if(nilai) {
            valid[10] = true;
        } else {
            valid[10] = false;
        }
        return valid[10];
    }

    public boolean validateB4R68 (RatingBar data) {
        boolean nilai = cekNilaiB4r68(data);

        if(nilai) {
            valid[11] = true;
        } else {
            valid[11] = false;
        }
        return valid[11];
    }

    public boolean validateB4R69 (RatingBar data) {
        boolean nilai = cekNilaiB4r69(data);

        if(nilai) {
            valid[12] = true;
        } else {
            valid[12] = false;
        }
        return valid[12];
    }

    public boolean validateB4R70 (RatingBar data) {
        boolean nilai = cekNilaiB4r70(data);

        if(nilai) {
            valid[13] = true;
        } else {
            valid[13] = false;
        }
        return valid[13];
    }

    public boolean validateB4R71 (RatingBar data) {
        boolean nilai = cekNilaiB4r71(data);

        if(nilai) {
            valid[14] = true;
        } else {
            valid[14] = false;
        }
        return valid[14];
    }

    public boolean validateB4R72 (RatingBar data) {
        boolean nilai = cekNilaiB4r72(data);

        if(nilai) {
            valid[15] = true;
        } else {
            valid[15] = false;
        }
        return valid[15];
    }

    public boolean validateB4R73 (RatingBar data) {
        boolean nilai = cekNilaiB4r73(data);

        if(nilai) {
            valid[16] = true;
        } else {
            valid[16] = false;
        }
        return valid[16];
    }



    public boolean validateAll(){
        if(valid[0]&&valid[1]&&valid[2]&&valid[3]&&valid[4]&&valid[5]&&valid[6]&&valid[7]&&valid[8]&&valid[9]&&valid[10]&&valid[11]&&valid[12]&&valid[13]&&valid[14]&&valid[15]&&valid[16]) {
            return true;
        } else {
            showPeringatan();
            return false;
        }
    }

    public void showPeringatan(){
        StringBuffer gabungan=new StringBuffer();
        for (int i=0; i<peringatan.length; i++){
            if(peringatan[i]!=null){
                gabungan.append(peringatan[i]);
            }
        }
        AlertDialog.Builder summary= new AlertDialog.Builder(context);
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


    private boolean cekNilaiB4r57(RatingBar data){
        if(!data.isEnabled()){
            peringatan[0]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[0]=null;
            return true;
        } else {
            peringatan[0]= "\nRincian 57 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r58(RatingBar data){
        if(!data.isEnabled()){
            peringatan[1]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[1]=null;
            return true;
        } else {
            peringatan[1]= "\nRincian 58 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r59(RatingBar data){
        if(!data.isEnabled()){
            peringatan[2]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[2]=null;
            return true;
        } else {
            peringatan[2]= "\nRincian 59 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r60(RatingBar data){
        if(!data.isEnabled()){
            peringatan[3]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[3]=null;
            return true;
        } else {
            peringatan[3]= "\nRincian 60 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r61(RatingBar data){
        if(!data.isEnabled()){
            peringatan[4]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[4]=null;
            return true;
        } else {
            peringatan[4]= "\nRincian 61 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r62(RatingBar data){
        if(!data.isEnabled()){
            peringatan[5]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[5]=null;
            return true;
        } else {
            peringatan[5]= "\nRincian 62 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r63(RatingBar data){
        if(!data.isEnabled()){
            peringatan[6]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[6]=null;
            return true;
        } else {
            peringatan[6]= "\nRincian 63 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r64(RatingBar data){
        if(!data.isEnabled()){
            peringatan[7]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[7]=null;
            return true;
        } else {
            peringatan[7]= "\nRincian 64 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r65(RatingBar data){
        if(!data.isEnabled()){
            peringatan[8]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[8]=null;
            return true;
        } else {
            peringatan[8]= "\nRincian 65 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r66(RatingBar data){
        if(!data.isEnabled()){
            peringatan[9]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[9]=null;
            return true;
        } else {
            peringatan[9]= "\nRincian 66 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r67(RatingBar data){
        if(!data.isEnabled()){
            peringatan[10]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[10]=null;
            return true;
        } else {
            peringatan[10]= "\nRincian 67 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r68(RatingBar data){
        if(!data.isEnabled()){
            peringatan[11]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[11]=null;
            return true;
        } else {
            peringatan[11]= "\nRincian 68 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r69(RatingBar data){
        if(!data.isEnabled()){
            peringatan[12]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[12]=null;
            return true;
        } else {
            peringatan[12]= "\nRincian 69 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r70(RatingBar data){
        if(!data.isEnabled()){
            peringatan[13]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[13]=null;
            return true;
        } else {
            peringatan[13]= "\nRincian 70 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r71(RatingBar data){
        if(!data.isEnabled()){
            peringatan[14]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[14]=null;
            return true;
        } else {
            peringatan[14]= "\nRincian 71 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r72(RatingBar data){
        if(!data.isEnabled()){
            peringatan[15]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[15]=null;
            return true;
        } else {
            peringatan[15]= "\nRincian 72 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r73(RatingBar data){
        if(!data.isEnabled()){
            peringatan[16]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[16]=null;
            return true;
        } else {
            peringatan[16]= "\nRincian 73 : Belum dipilih ";
            return false;
        }
    }
}
