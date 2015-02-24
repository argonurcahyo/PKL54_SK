package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Spinner;

/**
 * Created by EKI on 20/02/2015.
 */
public class Blok4BValidator {

    private Context context;
    private boolean[] valid;
    String[] peringatan;

    public Blok4BValidator(Context context) {
        this.context = context;
        valid = new boolean[13];
        peringatan = new String[13];
    }

    public void initValid() {
        for(int i=0; i<valid.length;i++) {
            valid[i] = false;
        }
    }

    public boolean validateB4R44 (Spinner data) {
        boolean nilai = cekNilaiB4r44(data);

        if(nilai) {
            valid[0] = true;
        } else {
            valid[0] = false;
        }
        return valid[0];
    }

    public boolean validateB4R45 (Spinner data) {
        boolean nilai = cekNilaiB4r45(data);

        if(nilai) {
            valid[1] = true;
        } else {
            valid[1] = false;
        }
        return valid[1];
    }

    public boolean validateB4R46 (Spinner data) {
        boolean nilai = cekNilaiB4r46(data);

        if(nilai) {
            valid[2] = true;
        } else {
            valid[2] = false;
        }
        return valid[2];
    }

    public boolean validateB4R47 (Spinner data) {
        boolean nilai = cekNilaiB4r47(data);

        if(nilai) {
            valid[3] = true;
        } else {
            valid[3] = false;
        }
        return valid[3];
    }

    public boolean validateB4R48 (Spinner data) {
        boolean nilai = cekNilaiB4r48(data);

        if(nilai) {
            valid[4] = true;
        } else {
            valid[4] = false;
        }
        return valid[4];
    }

    public boolean validateB4R49 (Spinner data) {
        boolean nilai = cekNilaiB4r49(data);

        if(nilai) {
            valid[5] = true;
        } else {
            valid[5] = false;
        }
        return valid[5];
    }

    public boolean validateB4R50 (Spinner data) {
        boolean nilai = cekNilaiB4r50(data);

        if(nilai) {
            valid[6] = true;
        } else {
            valid[6] = false;
        }
        return valid[6];
    }

    public boolean validateB4R51 (Spinner data) {
        boolean nilai = cekNilaiB4r51(data);

        if(nilai) {
            valid[7] = true;
        } else {
            valid[7] = false;
        }
        return valid[7];
    }

    public boolean validateB4R52 (Spinner data) {
        boolean nilai = cekNilaiB4r52(data);

        if(nilai) {
            valid[8] = true;
        } else {
            valid[8] = false;
        }
        return valid[8];
    }

    public boolean validateB4R53 (Spinner data) {
        boolean nilai = cekNilaiB4r53(data);

        if(nilai) {
            valid[9] = true;
        } else {
            valid[9] = false;
        }
        return valid[9];
    }

    public boolean validateB4R54 (Spinner data) {
        boolean nilai = cekNilaiB4r54(data);

        if(nilai) {
            valid[10] = true;
        } else {
            valid[10] = false;
        }
        return valid[10];
    }

    public boolean validateB4R55 (Spinner data) {
        boolean nilai = cekNilaiB4r55(data);

        if(nilai) {
            valid[11] = true;
        } else {
            valid[11] = false;
        }
        return valid[11];
    }

    public boolean validateB4R56 (Spinner data) {
        boolean nilai = cekNilaiB4r56(data);

        if(nilai) {
            valid[12] = true;
        } else {
            valid[12] = false;
        }
        return valid[12];
    }

    public boolean validateAll(){
        if(valid[0]&&valid[1]&&valid[2]&&valid[3]&&valid[4]&&valid[5]&&valid[6]&&valid[7]&&valid[8]&&valid[9]&&valid[10]&&valid[11]&&valid[12]) {
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

    private boolean cekNilaiB4r44(Spinner data){
        if(!data.isEnabled()){
            peringatan[0]=null;
            return true;
        } else
        if(data.getSelectedItemPosition()!=0){
            peringatan[0]=null;
            return true;
        } else {
            peringatan[0]= "\nRincian 44 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r45(Spinner data){
        if(!data.isEnabled()){
            peringatan[1]=null;
            return true;
        } else
        if(data.getSelectedItemPosition()!=0){
            peringatan[1]=null;
            return true;
        } else {
            peringatan[1]= "\nRincian 45 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r46(Spinner data){
        if(!data.isEnabled()){
            peringatan[2]=null;
            return true;
        } else
        if(data.getSelectedItemPosition()!=0){
            peringatan[2]=null;
            return true;
        } else {
            peringatan[2]= "\nRincian 46 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r47(Spinner data){
        if(!data.isEnabled()){
            peringatan[3]=null;
            return true;
        } else
        if(data.getSelectedItemPosition()!=0){
            peringatan[3]=null;
            return true;
        } else {
            peringatan[3]= "\nRincian 47 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r48(Spinner data){
        if(!data.isEnabled()){
            peringatan[4]=null;
            return true;
        } else
        if(data.getSelectedItemPosition()!=0){
            peringatan[4]=null;
            return true;
        } else {
            peringatan[4]= "\nRincian 48 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r49(Spinner data){
        if(!data.isEnabled()){
            peringatan[5]=null;
            return true;
        } else
        if(data.getSelectedItemPosition()!=0){
            peringatan[5]=null;
            return true;
        } else {
            peringatan[5]= "\nRincian 49 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r50(Spinner data){
        if(!data.isEnabled()){
            peringatan[6]=null;
            return true;
        } else
        if(data.getSelectedItemPosition()!=0){
            peringatan[6]=null;
            return true;
        } else {
            peringatan[6]= "\nRincian 50 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r51(Spinner data){
        if(!data.isEnabled()){
            peringatan[7]=null;
            return true;
        } else
        if(data.getSelectedItemPosition()!=0){
            peringatan[7]=null;
            return true;
        } else {
            peringatan[7]= "\nRincian 51 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r52(Spinner data){
        if(!data.isEnabled()){
            peringatan[8]=null;
            return true;
        } else
        if(data.getSelectedItemPosition()!=0){
            peringatan[8]=null;
            return true;
        } else {
            peringatan[8]= "\nRincian 52 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r53(Spinner data){
        if(!data.isEnabled()){
            peringatan[9]=null;
            return true;
        } else
        if(data.getSelectedItemPosition()!=0){
            peringatan[9]=null;
            return true;
        } else {
            peringatan[9]= "\nRincian 53 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r54(Spinner data){
        if(!data.isEnabled()){
            peringatan[10]=null;
            return true;
        } else
        if(data.getSelectedItemPosition()!=0){
            peringatan[10]=null;
            return true;
        } else {
            peringatan[10]= "\nRincian 54 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r55(Spinner data){
        if(!data.isEnabled()){
            peringatan[11]=null;
            return true;
        } else
        if(data.getSelectedItemPosition()!=0){
            peringatan[11]=null;
            return true;
        } else {
            peringatan[11]= "\nRincian 55 : Belum dipilih ";
            return false;
        }
    }

    private boolean cekNilaiB4r56(Spinner data){
        if(!data.isEnabled()){
            peringatan[12]=null;
            return true;
        } else
        if(data.getSelectedItemPosition()!=0){
            peringatan[12]=null;
            return true;
        } else {
            peringatan[12]= "\nRincian 56 : Belum dipilih ";
            return false;
        }
    }
}
