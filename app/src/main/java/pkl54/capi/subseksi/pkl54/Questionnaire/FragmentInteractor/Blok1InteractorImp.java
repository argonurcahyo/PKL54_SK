package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Blok1Model;
import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Blok2Model;
import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Kabupaten;
import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Kecamatan;
import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Kelurahan;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter.OnDataSavedBlok1;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter.OnFinishCheckSpinnerBlok1;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter.OnFinishValidateBlok1;
import pkl54.capi.subseksi.pkl54.R;

/**
 * Created by EKI on 17/02/2015.
 */
public class Blok1InteractorImp implements Blok1Interactor {

    private final String NULL_SPINNER = "-- Pilih item --";
    private boolean[] valid = new boolean[10];
    private String b1r1, b1r2, b1r3, b1r4, b1r5, b1r6, b1r7, b1r8, b1r9, b1r10;
    private Blok1Model blok1Model;
    private Blok2Model blok2Model;

    @Override
    public void validateB1R1(String data, OnFinishValidateBlok1 onFinishValidateBlok1) {
        if (!data.equals(NULL_SPINNER)) {
            checkValueB1R1(data);
            onFinishValidateBlok1.setVisibleCheckB1R1();
            valid[0] = true;
        } else {
            b1r1 = null;
            onFinishValidateBlok1.setInvisibleCheckB1R1();
            onFinishValidateBlok1.setInvisibleCheckB1R2();
            onFinishValidateBlok1.setInvisibleCheckB1R3();
            valid[0] = false;
        }
    }

    @Override
    public void setAdapterB1R2(String data, OnFinishCheckSpinnerBlok1 onFinishCheckSpinnerBlok1) {
        if (data.equals("Bandung")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R2(R.array.kota_bandung);
        } else if (data.equals("Indramayu")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R2(R.array.kabupaten_indramayu);
        } else {
            onFinishCheckSpinnerBlok1.unpopulateB1R2();
            onFinishCheckSpinnerBlok1.unpopulateB1R3();
        }
    }

    @Override
    public void validateB1R2(String data, OnFinishValidateBlok1 onFinishValidateBlok1) {
        if (!data.equals(NULL_SPINNER)) {
            checkValueB1R2(data);
            onFinishValidateBlok1.setVisibleCheckB1R2();
            valid[1] = true;
        } else {
            b1r2 = null;
            onFinishValidateBlok1.setInvisibleCheckB1R2();
            onFinishValidateBlok1.setInvisibleCheckB1R3();
            valid[1] = false;
        }
    }

    @Override
    public void setAdapterB1R3(String data, OnFinishCheckSpinnerBlok1 onFinishCheckSpinnerBlok1) {
        if (data.equals("Andir")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_andir);
        } else if (data.equals("Antapani")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_antapani);
        } else if (data.equals("Arcamanik")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_arcamanik);
        } else if (data.equals("Astanaanyar")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_astanaanyar);
        } else if (data.equals("Babakanciparay")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_babakanciparay);
        } else if (data.equals("Bandung Kidul")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_bandungkidul);
        } else if (data.equals("Bandung Kulon")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_bandungkulon);
        } else if (data.equals("Bandung Wetan")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_bandungwetan);
        } else if (data.equals("Batununggal")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_batununggal);
        } else if (data.equals("Bojongloa Kaler")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_bojongloakaler);
        } else if (data.equals("Bojongloa Kidul")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_bojongloakidul);
        } else if (data.equals("Buahbatu")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_buahbatu);
        } else if (data.equals("Cibeunying Kaler")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_cibeunyingkaler);
        } else if (data.equals("Cibeunying Kidul")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_cibeunyingkidul);
        } else if (data.equals("Cibiru")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_cibiru);
        } else if (data.equals("Cicendo")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_cicendo);
        } else if (data.equals("Cidadap")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_cidadap);
        } else if (data.equals("Cinambo")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_cinambo);
        } else if (data.equals("Coblong")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_coblong);
        } else if (data.equals("Gedebage")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_gedebage);
        } else if (data.equals("Kiaracondong")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_kiaracondong);
        } else if (data.equals("Lengkong")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_lengkong);
        } else if (data.equals("Mandalajati")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_mandalajati);
        } else if (data.equals("Panyileukan")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_panyileukan);
        } else if (data.equals("Rancasari")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_rancasari);
        } else if (data.equals("Regol")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_regol);
        } else if (data.equals("Sukajadi")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_sukajadi);
        } else if (data.equals("Sukasari")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_sukasari);
        } else if (data.equals("Sumurbandung")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_sumurbandung);
        } else if (data.equals("Ujungberung")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_ujungberung);
        } else if (data.equals("Anjatan")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_anjatan);
        } else if (data.equals("Arahan")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_arahan);
        } else if (data.equals("Balongan")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_balongan);
        } else if (data.equals("Bangodua")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_bangodua);
        } else if (data.equals("Bongas")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_bongas);
        } else if (data.equals("Cantigi")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_cantigi);
        } else if (data.equals("Cikedung")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_cikedung);
        } else if (data.equals("Gabuswetan")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_gabuswetan);
        } else if (data.equals("Gantar")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_gantar);
        } else if (data.equals("Hausgeulis")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_hausgeulis);
        } else if (data.equals("Indramayu")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_indramayu);
        } else if (data.equals("Jatibarang")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_jatibarang);
        } else if (data.equals("Juntinyuat")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_juntinyuat);
        } else if (data.equals("Kandanghaur")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_kandanghaur);
        } else if (data.equals("Karangampel")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_karangampel);
        } else if (data.equals("Kedokan Bunder")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_kedokanbunder);
        } else if (data.equals("Kertasemaya")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_kertasemaya);
        } else if (data.equals("Krangkeng")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_krangkeng);
        } else if (data.equals("Kroya")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_kroya);
        } else if (data.equals("Lelea")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_lelea);
        } else if (data.equals("Lohbener")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_lohbener);
        } else if (data.equals("Losarang")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_losarang);
        } else if (data.equals("Pasekan")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_pasekan);
        } else if (data.equals("Patrol")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_patrol);
        } else if (data.equals("Sindang")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_sindang);
        } else if (data.equals("Sliyeg")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_sliyeg);
        } else if (data.equals("Sukagumiwang")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_sukagumiwang);
        } else if (data.equals("Sukra")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_sukra);
        } else if (data.equals("Terisi")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_terisi);
        } else if (data.equals("Tukdana")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_tukdana);
        } else if (data.equals("Widasari")) {
            onFinishCheckSpinnerBlok1.setSpinnerB1R3(R.array.kecamatan_widasari);
        } else {
            onFinishCheckSpinnerBlok1.unpopulateB1R3();
        }
    }

    @Override
    public void validateB1R3(String data, OnFinishValidateBlok1 onFinishValidateBlok1) {
        if (!data.equals(NULL_SPINNER)) {
            checkValueB1R3(data);
            onFinishValidateBlok1.setVisibleCheckB1R3();
            valid[2] = true;
        } else {
            b1r3 = null;
            onFinishValidateBlok1.setInvisibleCheckB1R3();
            valid[2] = false;
        }
    }

    @Override
    public void validateB1R4(int data, OnFinishValidateBlok1 onFinishValidateBlok1) {
        if (data == 0 || data == 1) {
            checkValueB1R4(data);
            onFinishValidateBlok1.setVisibleCheckB1R4();
            valid[3] = true;
        } else {
            b1r4 = null;
            onFinishValidateBlok1.setInvisibleCheckB1R4();
            valid[3] = false;
        }
    }

    @Override
    public void validateB1R5(String data, OnFinishValidateBlok1 onFinishValidateBlok1) {
        if (data.length() > 0 && data.length() < 6) {
            b1r5 = data;
            onFinishValidateBlok1.setVisibleCheckB1R5();
            valid[4] = true;
        } else {
            b1r5 = null;
            onFinishValidateBlok1.setInvisibleCheckB1R5();
            valid[4] = false;
        }
    }

    @Override
    public void validateB1R6(String data, OnFinishValidateBlok1 onFinishValidateBlok1) {
        if (data.length() > 0 && data.length() < 8) {
            b1r6 = data;
            onFinishValidateBlok1.setVisibleCheckB1R6();
            valid[5] = true;
        } else {
            b1r6 = null;
            onFinishValidateBlok1.setInvisibleCheckB1R6();
            valid[5] = false;
        }
    }


    @Override
    public void validateB1R7(String data, OnFinishValidateBlok1 onFinishValidateBlok1) {
        if (data.length() > 0) {
            b1r7 = data;
            onFinishValidateBlok1.setVisibleCheckB1R7();
            valid[6] = true;
        } else {
            b1r7 = null;
            onFinishValidateBlok1.setInvisibleCheckB1R7();
            valid[6] = false;
        }
    }

    @Override
    public void validateB1R8(String data, OnFinishValidateBlok1 onFinishValidateBlok1) {
        if (data.length() > 0) {
            b1r8 = data;
            onFinishValidateBlok1.setVisibleCheckB1R8();
            valid[7] = true;
        } else {
            b1r8 = null;
            onFinishValidateBlok1.setInvisibleCheckB1R8();
            valid[7] = false;
        }
    }

    @Override
    public void validateB1R9(String data, OnFinishValidateBlok1 onFinishValidateBlok1) {
        if (data.length() > 0) {
            b1r9 = data;
            onFinishValidateBlok1.setVisibleCheckB1R9();
            valid[8] = true;
        } else {
            b1r9 = null;
            onFinishValidateBlok1.setInvisibleCheckB1R9();
            valid[8] = false;
        }
    }

    @Override
    public void validateB1R10(String data, OnFinishValidateBlok1 onFinishValidateBlok1) {
        if (!data.equals(NULL_SPINNER)) {
            checkValueB1R10(data);
            onFinishValidateBlok1.setVisibleCheckB1R10();
            valid[9] = true;
        } else {
            b1r10 = null;
            onFinishValidateBlok1.setInvisibleCheckB1R10();
            valid[9] = false;
        }
    }

    @Override
    public void validateAll(OnFinishValidateBlok1 onFinishValidateBlok1) {
        if(b1r10.equals("1")){
            if (valid[0] && valid[1] && valid[2] && valid[3] && valid[4] && valid[5] && valid[6] && valid[7] && valid[8] && valid[9]) {
                onFinishValidateBlok1.showNextDialog();
            }
        }else{
            onFinishValidateBlok1.finishSurvey();
        }

    }

    @Override
    public void saveData(String nksb1, String nim, String name, String nimKortimm, String namaKortim, OnDataSavedBlok1 onDataSavedBlok1) {
        blok1Model = new Blok1Model(nksb1, b1r1, b1r2, b1r3, b1r4, b1r5, b1r6, b1r7, b1r8, b1r9, b1r10, nim, "CAPI", 0, "false", "false");
        blok1Model.save();
        Calendar c = Calendar.getInstance();
        String month = String.valueOf(c.get(Calendar.MONTH)+1);
        String date = String.valueOf(c.get(Calendar.DATE));
        blok2Model = new Blok2Model(nksb1, nksb1, nim, name, nimKortimm, namaKortim, date, month, date, month);
        blok2Model.save();
        Blok2Model temp = new Blok2Model();
        List<Blok2Model>model = temp.getAll();
        for(int i = 0; i < model.size(); i++){
            System.out.println(model.get(i).nksb1);
            System.out.println(model.get(i).nksb2);
            System.out.println(model.get(i).b2r1s1);
            System.out.println(model.get(i).b2r1s2);
            System.out.println(model.get(i).b2r2s1);
            System.out.println(model.get(i).b2r2s2);
            System.out.println(model.get(i).b2r3s1d1);
            System.out.println(model.get(i).b2r3s1d2);
            System.out.println(model.get(i).b2r3s2d1);
            System.out.println(model.get(i).b2r3s2d2);
        }
        onDataSavedBlok1.navigateFragment();
    }

    private void checkValueB1R1(String data) {
        Kabupaten kabupaten = new Kabupaten();
        System.out.println(kabupaten.getKabupaten(data).size());
        if (kabupaten.getKabupaten(data).size() == 1) {
            Kabupaten temp = kabupaten.getKabupaten(data).get(0);
            b1r1 = temp.kodeKabupaten;
        }
    }

    private void checkValueB1R2(String data) {
        Kecamatan kecamatan = new Kecamatan();
        System.out.println(kecamatan.getKecamatan(data).size());
        if (kecamatan.getKecamatan(data).size() == 1) {
            Kecamatan temp = kecamatan.getKecamatan(data).get(0);
            b1r2 = temp.kodeKecamatan;
        }
    }

    private void checkValueB1R3(String data) {
        Kelurahan kelurahan = new Kelurahan();
        System.out.println(kelurahan.getKelurahan(data).size());
        if (kelurahan.getKelurahan(data).size() == 1) {
            Kelurahan temp = kelurahan.getKelurahan(data).get(0);
            b1r3 = temp.kodeKelurahan;
        }
    }

    private void checkValueB1R4(int data) {
        if (data == 0) {
            b1r4 = "1";
        } else {
            b1r4 = "2";
        }
    }

    private void checkValueB1R10(String data) {
        if (data.equals("Berhasil")) {
            b1r10 = "1";
        } else if (data.equals("Menolak diwawancara")) {
            b1r10 = "2";
        } else if (data.equals("Tidak dapat diwawancarai")) {
            b1r10 = "3";
        }
    }
}
