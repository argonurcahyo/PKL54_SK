package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.RatingBar;

import java.util.HashMap;

import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityView.QuestionnaireActivityImp;

/**
 * Created by EKI on 20/02/2015.
 */
public class Blok4a1Validator {
    private Context context;

    private boolean[]valid;
    String[] peringatan;

    public Blok4a1Validator(Context context){
        this.context = context;
        valid=new boolean[43];
        peringatan=new String[43];
    }

    public void initValid(){
        for(int i=0;i<valid.length;i++){
            valid[i]=false;
        }
    }

    public boolean validateB4R1(RatingBar rBar){
        boolean nilai=cekNilaiB4R1(rBar);

        if(!rBar.isEnabled()){
            valid[0]=true;
        } else
        if(nilai){
            valid[0]=true;
        } else {
            valid[0]=false;
        }
        return valid[0];
    }

    public boolean validateB4R2(RatingBar rBar){
        boolean nilai=cekNilaiB4R2(rBar);

        if(!rBar.isEnabled()){
            valid[1]=true;
        } else
        if(nilai){
            valid[1]=true;
        } else {
            valid[1]=false;
        }
        return valid[1];
    }

    public boolean validateB4R3(RatingBar rBar){
        boolean nilai=cekNilaiB4R3(rBar);

        if(!rBar.isEnabled()){
            valid[2]=true;
        } else
        if(nilai){
            valid[2]=true;
        } else {
            valid[2]=false;
        }
        return valid[2];
    }

    public boolean validateB4R4(RatingBar rBar){
        boolean nilai=cekNilaiB4R4(rBar);

        if(!rBar.isEnabled()){
            valid[3]=true;
        } else
        if(nilai){
            valid[3]=true;
        } else {
            valid[3]=false;
        }
        return valid[3];
    }

    public boolean validateB4R5(RatingBar rBar){
        boolean nilai=cekNilaiB4R5(rBar);

        if(!rBar.isEnabled()){
            valid[4]=true;
        } else
        if(nilai){
            valid[4]=true;
        } else {
            valid[4]=false;
        }
        return valid[4];
    }

    public boolean validateB4R6(RatingBar rBar){
        boolean nilai=cekNilaiB4R6(rBar);
        if(!rBar.isEnabled()){
            valid[5]=true;
        } else
        if(nilai){
            valid[5]=true;
        } else {
            valid[5]=false;
        }
        return valid[5];
    }

    public boolean validateB4R7(RatingBar rBar){
        boolean nilai=cekNilaiB4R7(rBar);

        if(!rBar.isEnabled()){
            valid[6]=true;
        } else
        if(nilai){
            valid[6]=true;
        } else {
            valid[6]=false;
        }
        return valid[6];
    }

    public boolean validateB4R8(RatingBar rBar){
        boolean nilai=cekNilaiB4R8(rBar);

        if(!rBar.isEnabled()){
            valid[7]=true;
        } else
        if(nilai){
            valid[7]=true;
        } else {
            valid[7]=false;
        }
        return valid[7];
    }

    public boolean validateB4R9(RatingBar rBar){
        boolean nilai=cekNilaiB4R9(rBar);

        if(!rBar.isEnabled()){
            valid[8]=true;
        } else
        if(nilai){
            valid[8]=true;
        } else {
            valid[8]=false;
        }
        return valid[8];
    }

    public boolean validateB4R10(RatingBar rBar){
        boolean nilai=cekNilaiB4R10(rBar);

        if(!rBar.isEnabled()){
            valid[9]=true;
        } else
        if(nilai){
            valid[9]=true;
        } else {
            valid[9]=false;
        }
        return valid[9];
    }

    public boolean validateB4R11(RatingBar rBar){
        boolean nilai=cekNilaiB4R11(rBar);

        if(!rBar.isEnabled()){
            valid[10]=true;
        } else
        if(nilai){
            valid[10]=true;
        } else {
            valid[10]=false;
        }
        return valid[10];
    }

    public boolean validateB4R12(RatingBar rBar){
        boolean nilai=cekNilaiB4R12(rBar);

        if(!rBar.isEnabled()){
            valid[11]=true;
        } else
        if(nilai){
            valid[11]=true;
        } else {
            valid[11]=false;
        }
        return valid[11];
    }

    public boolean validateB4R13(RatingBar rBar){
        boolean nilai=cekNilaiB4R13(rBar);

        if(!rBar.isEnabled()){
            valid[12]=true;
        } else
        if(nilai){
            valid[12]=true;
        } else {
            valid[12]=false;
        }
        return valid[12];
    }

    public boolean validateB4R14(RatingBar rBar){
        boolean nilai=cekNilaiB4R14(rBar);

        if(!rBar.isEnabled()){
            valid[13]=true;
        } else
        if(nilai){
            valid[13]=true;
        } else {
            valid[13]=false;
        }
        return valid[13];
    }


    private boolean cekNilaiB4R1(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[0]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[0]=null;
            return true;
        } else {
            peringatan[0]= "\nRincian 1 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R2(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[1]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[1]=null;
            return true;
        } else {
            peringatan[1]= "\nRincian 2 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R3(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[2]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[2]=null;
            return true;
        } else {
            peringatan[2]= "\nRincian 3 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R4(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[3]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[3]=null;
            return true;
        } else {
            peringatan[3]= "\nRincian 4 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R5(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[4]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[4]=null;
            return true;
        } else {
            peringatan[4]= "\nRincian 5 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R6(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[5]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[5]=null;
            return true;
        } else {
            peringatan[5]= "\nRincian 6 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R7(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[6]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[6]=null;
            return true;
        } else {
            peringatan[6]= "\nRincian 7 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R8(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[7]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[7]=null;
            return true;
        } else {
            peringatan[7]= "\nRincian 8 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R9(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[8]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[8]=null;
            return true;
        } else {
            peringatan[8]= "\nRincian 9 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R10(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[9]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[9]=null;
            return true;
        } else {
            peringatan[9]= "\nRincian 10 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R11(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[10]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[10]=null;
            return true;
        } else {
            peringatan[10]= "\nRincian 11 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R12(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[11]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[11]=null;
            return true;
        } else {
            peringatan[11]= "\nRincian 12 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R13(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[12]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[12]=null;
            return true;
        } else {
            peringatan[12]= "\nRincian 13 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R14(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[13]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[13]=null;
            return true;
        } else {
            peringatan[13]= "\nRincian 14 : Belum dipilih ";
            return false;
        }
    }

    public boolean validateAll(){
        if(valid[0] && valid[1] && valid[2] && valid[3] && valid[4] && valid[5] && valid[7] && valid[8] && valid[9]
                && valid[10] && valid[11] && valid[12] && valid[13]){
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
