package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.RatingBar;

/**
 * Created by EKI on 20/02/2015.
 */
public class Blok4a2Validator {
    private Context context;

    private boolean[]valid;
    String[] peringatan;

    public Blok4a2Validator(Context context){
        this.context = context;
        valid=new boolean[43];
        peringatan=new String[43];
    }

    public void initValid(){
        for(int i=0;i<valid.length;i++){
            valid[i]=false;
        }
    }
    public boolean validateB4R15(RatingBar rBar){
        boolean nilai=cekNilaiB4R15(rBar);

        if(!rBar.isEnabled()){
            valid[14]=true;
        } else
        if(nilai){
            valid[14]=true;
        } else {
            valid[14]=false;
        }
        return valid[14];
    }

    public boolean validateB4R16(RatingBar rBar){
        boolean nilai=cekNilaiB4R16(rBar);
        if(!rBar.isEnabled()){
            valid[15]=true;
        } else
        if(nilai){
            valid[15]=true;
        } else {
            valid[15]=false;
        }
        return valid[15];
    }

    public boolean validateB4R17(RatingBar rBar){
        boolean nilai=cekNilaiB4R17(rBar);

        if(!rBar.isEnabled()){
            valid[16]=true;
        } else
        if(nilai){
            valid[16]=true;
        } else {
            valid[16]=false;
        }
        return valid[16];
    }

    public boolean validateB4R18(RatingBar rBar){
        boolean nilai=cekNilaiB4R18(rBar);

        if(!rBar.isEnabled()){
            valid[17]=true;
        } else
        if(nilai){
            valid[17]=true;
        } else {
            valid[17]=false;
        }
        return valid[17];
    }

    public boolean validateB4R19(RatingBar rBar){
        boolean nilai=cekNilaiB4R19(rBar);

        if(!rBar.isEnabled()){
            valid[18]=true;
        } else
        if(nilai){
            valid[18]=true;
        } else {
            valid[18]=false;
        }
        return valid[18];
    }

    public boolean validateB4R20(RatingBar rBar){
        boolean nilai=cekNilaiB4R20(rBar);

        if(!rBar.isEnabled()){
            valid[19]=true;
        } else
        if(nilai){
            valid[19]=true;
        } else {
            valid[19]=false;
        }
        return valid[19];
    }

    public boolean validateB4R21(RatingBar rBar){
        boolean nilai=cekNilaiB4R21(rBar);

        if(!rBar.isEnabled()){
            valid[20]=true;
        } else
        if(nilai){
            valid[20]=true;
        } else {
            valid[20]=false;
        }
        return valid[20];
    }

    public boolean validateB4R22(RatingBar rBar){
        boolean nilai=cekNilaiB4R22(rBar);

        if(!rBar.isEnabled()){
            valid[21]=true;
        } else
        if(nilai){
            valid[21]=true;
        } else {
            valid[21]=false;
        }
        return valid[21];
    }

    public boolean validateB4R23(RatingBar rBar){
        boolean nilai=cekNilaiB4R23(rBar);

        if(!rBar.isEnabled()){
            valid[22]=true;
        } else
        if(nilai){
            valid[22]=true;
        } else {
            valid[22]=false;
        }
        return valid[22];
    }

    public boolean validateB4R24(RatingBar rBar){
        boolean nilai=cekNilaiB4R24(rBar);

        if(!rBar.isEnabled()){
            valid[23]=true;
        } else
        if(nilai){
            valid[23]=true;
        } else {
            valid[23]=false;
        }
        return valid[23];
    }

    public boolean validateB4R25(RatingBar rBar){
        boolean nilai=cekNilaiB4R25(rBar);

        if(!rBar.isEnabled()){
            valid[24]=true;
        } else
        if(nilai){
            valid[24]=true;
        } else {
            valid[24]=false;
        }
        return valid[24];
    }

    public boolean validateB4R26(RatingBar rBar){
        boolean nilai=cekNilaiB4R26(rBar);
        if(!rBar.isEnabled()){
            valid[25]=true;
        } else
        if(nilai){
            valid[25]=true;
        } else {
            valid[25]=false;
        }
        return valid[25];
    }

    public boolean validateB4R27(RatingBar rBar){
        boolean nilai=cekNilaiB4R27(rBar);

        if(!rBar.isEnabled()){
            valid[26]=true;
        } else
        if(nilai){
            valid[26]=true;
        } else {
            valid[26]=false;
        }
        return valid[26];
    }

    public boolean validateB4R28(RatingBar rBar){
        boolean nilai=cekNilaiB4R28(rBar);

        if(!rBar.isEnabled()){
            valid[27]=true;
        } else
        if(nilai){
            valid[27]=true;
        } else {
            valid[27]=false;
        }
        return valid[27];
    }

    private boolean cekNilaiB4R15(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[14]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[14]=null;
            return true;
        } else {
            peringatan[14]= "\nRincian 15 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R16(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[15]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[15]=null;
            return true;
        } else {
            peringatan[15]= "\nRincian 16 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R17(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[16]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[16]=null;
            return true;
        } else {
            peringatan[16]= "\nRincian 17 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R18(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[17]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[17]=null;
            return true;
        } else {
            peringatan[17]= "\nRincian 18 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R19(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[18]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[18]=null;
            return true;
        } else {
            peringatan[18]= "\nRincian 19 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R20(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[19]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[19]=null;
            return true;
        } else {
            peringatan[19]= "\nRincian 20 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R21(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[20]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[20]=null;
            return true;
        } else {
            peringatan[20]= "\nRincian 21 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R22(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[21]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[21]=null;
            return true;
        } else {
            peringatan[21]= "\nRincian 22 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R23(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[22]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[22]=null;
            return true;
        } else {
            peringatan[22]= "\nRincian 23 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R24(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[23]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[23]=null;
            return true;
        } else {
            peringatan[23]= "\nRincian 24 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R25(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[24]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[24]=null;
            return true;
        } else {
            peringatan[24]= "\nRincian 25 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R26(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[25]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[25]=null;
            return true;
        } else {
            peringatan[25]= "\nRincian 26 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R27(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[26]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[26]=null;
            return true;
        } else {
            peringatan[26]= "\nRincian 27 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R28(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[27]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[27]=null;
            return true;
        } else {
            peringatan[27]= "\nRincian 28 : Belum dipilih ";
            return false;
        }
    }

    public boolean validateAll(){
        if(valid[14] && valid[15] && valid[16] && valid[17] && valid[18]
                && valid[19] && valid[20] && valid[21] && valid[22] && valid[23] && valid[24] && valid[25] && valid[26] && valid[27] ){
            return true;
        }else{
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
}
