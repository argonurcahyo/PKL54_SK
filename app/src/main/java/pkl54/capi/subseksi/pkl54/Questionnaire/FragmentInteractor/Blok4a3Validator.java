package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.RatingBar;

/**
 * Created by EKI on 20/02/2015.
 */
public class Blok4a3Validator {
    private Context context;

    private boolean[]valid;
    String[] peringatan;

    public Blok4a3Validator(Context context){
        this.context = context;
        valid=new boolean[43];
        peringatan=new String[43];
    }

    public void initValid(){
        for(int i=0;i<valid.length;i++){
            valid[i]=false;
        }
    }

    public boolean validateB4R29(RatingBar rBar){
        boolean nilai=cekNilaiB4R29(rBar);

        if(!rBar.isEnabled()){
            valid[28]=true;
        } else
        if(nilai){
            valid[28]=true;
        } else {
            valid[28]=false;
        }
        return valid[28];
    }

    public boolean validateB4R30(RatingBar rBar){
        boolean nilai=cekNilaiB4R30(rBar);

        if(!rBar.isEnabled()){
            valid[29]=true;
        } else
        if(nilai){
            valid[29]=true;
        } else {
            valid[29]=false;
        }
        return valid[29];
    }

    public boolean validateB4R31(RatingBar rBar){
        boolean nilai=cekNilaiB4R31(rBar);

        if(!rBar.isEnabled()){
            valid[30]=true;
        } else
        if(nilai){
            valid[30]=true;
        } else {
            valid[30]=false;
        }
        return valid[30];
    }

    public boolean validateB4R32(RatingBar rBar){
        boolean nilai=cekNilaiB4R32(rBar);

        if(!rBar.isEnabled()){
            valid[31]=true;
        } else
        if(nilai){
            valid[31]=true;
        } else {
            valid[31]=false;
        }
        return valid[31];
    }

    public boolean validateB4R33(RatingBar rBar){
        boolean nilai=cekNilaiB4R33(rBar);

        if(!rBar.isEnabled()){
            valid[32]=true;
        } else
        if(nilai){
            valid[32]=true;
        } else {
            valid[32]=false;
        }
        return valid[32];
    }

    public boolean validateB4R34(RatingBar rBar){
        boolean nilai=cekNilaiB4R34(rBar);

        if(!rBar.isEnabled()){
            valid[33]=true;
        } else
        if(nilai){
            valid[33]=true;
        } else {
            valid[33]=false;
        }
        return valid[33];
    }

    public boolean validateB4R35(RatingBar rBar){
        boolean nilai=cekNilaiB4R35(rBar);

        if(!rBar.isEnabled()){
            valid[34]=true;
        } else
        if(nilai){
            valid[34]=true;
        } else {
            valid[34]=false;
        }
        return valid[34];
    }

    public boolean validateB4R36(RatingBar rBar){
        boolean nilai=cekNilaiB4R36(rBar);
        if(!rBar.isEnabled()){
            valid[35]=true;
        } else
        if(nilai){
            valid[35]=true;
        } else {
            valid[35]=false;
        }
        return valid[35];
    }

    public boolean validateB4R37(RatingBar rBar){
        boolean nilai=cekNilaiB4R37(rBar);

        if(!rBar.isEnabled()){
            valid[36]=true;
        } else
        if(nilai){
            valid[36]=true;
        } else {
            valid[36]=false;
        }
        return valid[36];
    }

    public boolean validateB4R38(RatingBar rBar){
        boolean nilai=cekNilaiB4R38(rBar);

        if(!rBar.isEnabled()){
            valid[37]=true;
        } else
        if(nilai){
            valid[37]=true;
        } else {
            valid[37]=false;
        }
        return valid[37];
    }

    public boolean validateB4R39(RatingBar rBar){
        boolean nilai=cekNilaiB4R39(rBar);

        if(!rBar.isEnabled()){
            valid[38]=true;
        } else
        if(nilai){
            valid[38]=true;
        } else {
            valid[38]=false;
        }
        return valid[38];
    }

    public boolean validateB4R40(RatingBar rBar){
        boolean nilai=cekNilaiB4R40(rBar);

        if(!rBar.isEnabled()){
            valid[39]=true;
        } else
        if(nilai){
            valid[39]=true;
        } else {
            valid[39]=false;
        }
        return valid[39];
    }

    public boolean validateB4R41(RatingBar rBar){
        boolean nilai=cekNilaiB4R41(rBar);

        if(!rBar.isEnabled()){
            valid[40]=true;
        } else
        if(nilai){
            valid[40]=true;
        } else {
            valid[40]=false;
        }
        return valid[40];
    }

    public boolean validateB4R42(RatingBar rBar){
        boolean nilai=cekNilaiB4R42(rBar);

        if(!rBar.isEnabled()){
            valid[41]=true;
        } else
        if(nilai){
            valid[41]=true;
        } else {
            valid[41]=false;
        }
        return valid[41];
    }

    public boolean validateB4R43(RatingBar rBar){
        boolean nilai=cekNilaiB4R43(rBar);

        if(!rBar.isEnabled()){
            valid[42]=true;
        } else
        if(nilai){
            valid[42]=true;
        } else {
            valid[42]=false;
        }
        return valid[42];
    }

    public boolean validateAll(){
        if(valid[28] && valid[29] && valid[30] && valid[31] && valid[32] && valid[33] && valid[34] && valid[35] && valid[36]
                && valid[37] && valid[38] && valid[39] && valid[40] && valid[41] && valid[42] ){

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

    private boolean cekNilaiB4R29(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[28]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[28]=null;
            return true;
        } else {
            peringatan[28]= "\nRincian 29 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R30(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[29]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[29]=null;
            return true;
        } else {
            peringatan[29]= "\nRincian 30 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R31(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[30]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[30]=null;
            return true;
        } else {
            peringatan[30]= "\nRincian 31 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R32(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[31]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[31]=null;
            return true;
        } else {
            peringatan[31]= "\nRincian 32 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R33(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[32]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[32]=null;
            return true;
        } else {
            peringatan[32]= "\nRincian 33 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R34(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[33]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[33]=null;
            return true;
        } else {
            peringatan[33]= "\nRincian 34 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R35(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[34]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[34]=null;
            return true;
        } else {
            peringatan[34]= "\nRincian 35 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R36(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[35]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[35]=null;
            return true;
        } else {
            peringatan[35]= "\nRincian 36 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R37(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[36]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[36]=null;
            return true;
        } else {
            peringatan[36]= "\nRincian 37 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R38(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[37]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[37]=null;
            return true;
        } else {
            peringatan[37]= "\nRincian 38 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R39(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[38]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[38]=null;
            return true;
        } else {
            peringatan[38]= "\nRincian 39 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R40(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[39]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[39]=null;
            return true;
        } else {
            peringatan[39]= "\nRincian 40 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R41(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[40]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[40]=null;
            return true;
        } else {
            peringatan[40]= "\nRincian 41 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R42(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[41]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[41]=null;
            return true;
        } else {
            peringatan[41]= "\nRincian 42 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4R43(RatingBar rBar){
        if(!rBar.isEnabled()){
            peringatan[42]=null;
            return true;
        } else
        if(rBar.getRating()!=0){
            peringatan[42]=null;
            return true;
        } else {
            peringatan[42]= "\nRincian 43 : Belum dipilih ";
            return false;
        }
    }
}
