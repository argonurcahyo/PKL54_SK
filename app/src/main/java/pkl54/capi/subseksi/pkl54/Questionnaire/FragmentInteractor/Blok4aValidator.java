package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.RatingBar;

/**
 * Created by Ahmad Mustaqim on 16/02/2015.
 */

public class Blok4aValidator {

    private Context context;

    private boolean[]valid;
    String[] peringatan;

    public Blok4aValidator(Context context){
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
        if(valid[0] && valid[1] && valid[2] && valid[3] && valid[4] && valid[5] && valid[7] && valid[8] && valid[9]
                && valid[10] && valid[11] && valid[12] && valid[13] && valid[14] && valid[15] && valid[16] && valid[17] && valid[18]
                && valid[19] && valid[20] && valid[21] && valid[22] && valid[23] && valid[24] && valid[25] && valid[26] && valid[27]
                && valid[28] && valid[29] && valid[30] && valid[31] && valid[32] && valid[33] && valid[34] && valid[35] && valid[36]
                && valid[37] && valid[38] && valid[39] && valid[40] && valid[41] && valid[42] ){
            return true;
        }else{
            return false;
        }
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
