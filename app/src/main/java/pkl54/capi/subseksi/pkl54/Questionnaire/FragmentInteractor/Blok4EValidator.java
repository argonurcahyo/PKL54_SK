package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.RatingBar;

/**
 * Created by EKI on 19/02/2015.
 */
public class Blok4EValidator {

    private Context context;
    private boolean[] valid;
    String[] peringatan;

    public Blok4EValidator(Context context) {
        this.context = context;
        valid = new boolean[17];
        peringatan = new String[17];
    }

    public void initValid() {
        for(int i=0; i<valid.length;i++) {
            valid[i] = false;
        }
    }

    public boolean validateB4R97 (RatingBar data) {
        boolean nilai = cekNilaiB4r97(data);

        if(nilai) {
            valid[0] = true;
        } else {
            valid[0] = false;
        }
        return valid[0];
    }

    public boolean validateB4R98 (RatingBar data) {
        boolean nilai = cekNilaiB4r98(data);

        if(nilai) {
            valid[1] = true;
        } else {
            valid[1] = false;
        }
        return valid[1];
    }

    public boolean validateB4R99 (RatingBar data) {
        boolean nilai = cekNilaiB4r99(data);

        if(nilai) {
            valid[2] = true;
        } else {
            valid[2] = false;
        }
        return valid[2];
    }

    public boolean validateB4R100 (RatingBar data) {
        boolean nilai = cekNilaiB4r100(data);

        if(nilai) {
            valid[3] = true;
        } else {
            valid[3] = false;
        }
        return valid[3];
    }

    public boolean validateB4R101 (RatingBar data) {
        boolean nilai = cekNilaiB4r101(data);

        if(nilai) {
            valid[4] = true;
        } else {
            valid[4] = false;
        }
        return valid[4];
    }

    public boolean validateB4R102 (RatingBar data) {
        boolean nilai = cekNilaiB4r102(data);

        if(nilai) {
            valid[5] = true;
        } else {
            valid[5] = false;
        }
        return valid[5];
    }

    public boolean validateB4R103 (RatingBar data) {
        boolean nilai = cekNilaiB4r103(data);

        if(nilai) {
            valid[6] = true;
        } else {
            valid[6] = false;
        }
        return valid[6];
    }

    public boolean validateB4R104 (RatingBar data) {
        boolean nilai = cekNilaiB4r104(data);

        if(nilai) {
            valid[7] = true;
        } else {
            valid[7] = false;
        }
        return valid[7];
    }

    public boolean validateB4R105 (RatingBar data) {
        boolean nilai = cekNilaiB4r105(data);

        if(nilai) {
            valid[8] = true;
        } else {
            valid[8] = false;
        }
        return valid[8];
    }

    public boolean validateB4R106 (RatingBar data) {
        boolean nilai = cekNilaiB4r106(data);

        if(nilai) {
            valid[9] = true;
        } else {
            valid[9] = false;
        }
        return valid[9];
    }

    public boolean validateB4R107 (RatingBar data) {
        boolean nilai = cekNilaiB4r107(data);

        if(nilai) {
            valid[10] = true;
        } else {
            valid[10] = false;
        }
        return valid[10];
    }

    public boolean validateB4R108 (RatingBar data) {
        boolean nilai = cekNilaiB4r108(data);

        if(nilai) {
            valid[11] = true;
        } else {
            valid[11] = false;
        }
        return valid[11];
    }

    public boolean validateB4R109 (RatingBar data) {
        boolean nilai = cekNilaiB4r109(data);

        if(nilai) {
            valid[12] = true;
        } else {
            valid[12] = false;
        }
        return valid[12];
    }

    public boolean validateB4R110 (RatingBar data) {
        boolean nilai = cekNilaiB4r110(data);

        if(nilai) {
            valid[13] = true;
        } else {
            valid[13] = false;
        }
        return valid[13];
    }

    public boolean validateB4R111 (RatingBar data) {
        boolean nilai = cekNilaiB4r111(data);

        if(nilai) {
            valid[14] = true;
        } else {
            valid[14] = false;
        }
        return valid[14];
    }

    public boolean validateB4R112 (RatingBar data) {
        boolean nilai = cekNilaiB4r112(data);

        if(nilai) {
            valid[15] = true;
        } else {
            valid[15] = false;
        }
        return valid[15];
    }

    public boolean validateB4R113 (RatingBar data) {
        boolean nilai = cekNilaiB4r113(data);

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


    private boolean cekNilaiB4r97(RatingBar data){
        if(!data.isEnabled()){
            peringatan[0]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[0]=null;
            return true;
        } else {
            peringatan[0]= "\nRincian 97 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r98(RatingBar data){
        if(!data.isEnabled()){
            peringatan[1]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[1]=null;
            return true;
        } else {
            peringatan[1]= "\nRincian 98 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r99(RatingBar data){
        if(!data.isEnabled()){
            peringatan[2]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[2]=null;
            return true;
        } else {
            peringatan[2]= "\nRincian 99 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r100(RatingBar data){
        if(!data.isEnabled()){
            peringatan[3]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[3]=null;
            return true;
        } else {
            peringatan[3]= "\nRincian 100 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r101(RatingBar data){
        if(!data.isEnabled()){
            peringatan[4]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[4]=null;
            return true;
        } else {
            peringatan[4]= "\nRincian 101 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r102(RatingBar data){
        if(!data.isEnabled()){
            peringatan[5]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[5]=null;
            return true;
        } else {
            peringatan[5]= "\nRincian 102 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r103(RatingBar data){
        if(!data.isEnabled()){
            peringatan[6]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[6]=null;
            return true;
        } else {
            peringatan[6]= "\nRincian 103 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r104(RatingBar data){
        if(!data.isEnabled()){
            peringatan[7]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[7]=null;
            return true;
        } else {
            peringatan[7]= "\nRincian 104 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r105(RatingBar data){
        if(!data.isEnabled()){
            peringatan[8]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[8]=null;
            return true;
        } else {
            peringatan[8]= "\nRincian 105 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r106(RatingBar data){
        if(!data.isEnabled()){
            peringatan[9]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[9]=null;
            return true;
        } else {
            peringatan[9]= "\nRincian 106 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r107(RatingBar data){
        if(!data.isEnabled()){
            peringatan[10]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[10]=null;
            return true;
        } else {
            peringatan[10]= "\nRincian 107 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r108(RatingBar data){
        if(!data.isEnabled()){
            peringatan[11]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[11]=null;
            return true;
        } else {
            peringatan[11]= "\nRincian 108 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r109(RatingBar data){
        if(!data.isEnabled()){
            peringatan[12]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[12]=null;
            return true;
        } else {
            peringatan[12]= "\nRincian 109 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r110(RatingBar data){
        if(!data.isEnabled()){
            peringatan[13]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[13]=null;
            return true;
        } else {
            peringatan[13]= "\nRincian 110 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r111(RatingBar data){
        if(!data.isEnabled()){
            peringatan[14]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[14]=null;
            return true;
        } else {
            peringatan[14]= "\nRincian 111 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r112(RatingBar data){
        if(!data.isEnabled()){
            peringatan[15]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[15]=null;
            return true;
        } else {
            peringatan[15]= "\nRincian 112 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r113(RatingBar data){
        if(!data.isEnabled()){
            peringatan[16]=null;
            return true;
        } else
        if(data.getRating()!=0){
            peringatan[16]=null;
            return true;
        } else {
            peringatan[16]= "\nRincian 113 : Belum dipilih ";
            return false;
        }
    }
}
