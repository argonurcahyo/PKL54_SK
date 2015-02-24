package pkl54.capi.subseksi.pkl54.Questionnaire;

/**
 * Created by Ahmad Mustaqim on 16/02/2015.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4aValidator;
import pkl54.capi.subseksi.pkl54.R;


public class Blok4A2Fragment extends Fragment implements View.OnClickListener, RatingBar.OnRatingBarChangeListener {

    private RelativeLayout b4r15_rl_check, b4r16_rl_check, b4r17_rl_check, b4r18_rl_check, b4r19_rl_check, b4r20_rl_check, b4r21_rl_check, b4r22_rl_check, b4r23_rl_check, b4r24_rl_check, b4r25_rl_check, b4r26_rl_check, b4r27_rl_check, b4r28_rl_check;
    private Button b4_b_next;
    private TextView b4r15_tv, b4r16_tv, b4r17_tv, b4r18_tv, b4r19_tv, b4r20_tv, b4r21_tv, b4r22_tv, b4r23_tv, b4r24_tv, b4r25_tv, b4r26_tv, b4r27_tv, b4r28_tv;
    private RatingBar b4r15_rBar, b4r16_rBar, b4r17_rBar, b4r18_rBar, b4r19_rBar, b4r20_rBar, b4r21_rBar, b4r22_rBar, b4r23_rBar, b4r24_rBar, b4r25_rBar, b4r26_rBar, b4r27_rBar, b4r28_rBar;
    private View view;

    Blok4aValidator validator;

    public Blok4A2Fragment() {


    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blok4_a2, container, false);

        init();

        return view;
    }

    public void init() {
        b4r15_rBar = (RatingBar) view.findViewById(R.id.b4r15_ratingBar);
        b4r16_rBar = (RatingBar) view.findViewById(R.id.b4r16_ratingBar);
        b4r17_rBar = (RatingBar) view.findViewById(R.id.b4r17_ratingBar);
        b4r18_rBar = (RatingBar) view.findViewById(R.id.b4r18_ratingBar);
        b4r19_rBar = (RatingBar) view.findViewById(R.id.b4r19_ratingBar);
        b4r20_rBar = (RatingBar) view.findViewById(R.id.b4r20_ratingBar);
        b4r21_rBar = (RatingBar) view.findViewById(R.id.b4r21_ratingBar);
        b4r22_rBar = (RatingBar) view.findViewById(R.id.b4r22_ratingBar);
        b4r23_rBar = (RatingBar) view.findViewById(R.id.b4r23_ratingBar);
        b4r24_rBar = (RatingBar) view.findViewById(R.id.b4r24_ratingBar);
        b4r25_rBar = (RatingBar) view.findViewById(R.id.b4r25_ratingBar);
        b4r26_rBar = (RatingBar) view.findViewById(R.id.b4r26_ratingBar);
        b4r27_rBar = (RatingBar) view.findViewById(R.id.b4r27_ratingBar);
        b4r28_rBar = (RatingBar) view.findViewById(R.id.b4r28_ratingBar);

        b4r15_rBar.setOnRatingBarChangeListener(this);
        b4r16_rBar.setOnRatingBarChangeListener(this);
        b4r17_rBar.setOnRatingBarChangeListener(this);
        b4r18_rBar.setOnRatingBarChangeListener(this);
        b4r19_rBar.setOnRatingBarChangeListener(this);
        b4r20_rBar.setOnRatingBarChangeListener(this);
        b4r21_rBar.setOnRatingBarChangeListener(this);
        b4r22_rBar.setOnRatingBarChangeListener(this);
        b4r23_rBar.setOnRatingBarChangeListener(this);
        b4r24_rBar.setOnRatingBarChangeListener(this);
        b4r25_rBar.setOnRatingBarChangeListener(this);
        b4r26_rBar.setOnRatingBarChangeListener(this);
        b4r27_rBar.setOnRatingBarChangeListener(this);
        b4r28_rBar.setOnRatingBarChangeListener(this);

        b4_b_next = (Button) view.findViewById(R.id.b4_button_next);

        b4r15_tv = (TextView) view.findViewById(R.id.b4r15_ratingvalue);
        b4r16_tv = (TextView) view.findViewById(R.id.b4r16_ratingvalue);
        b4r17_tv = (TextView) view.findViewById(R.id.b4r17_ratingvalue);
        b4r18_tv = (TextView) view.findViewById(R.id.b4r18_ratingvalue);
        b4r19_tv = (TextView) view.findViewById(R.id.b4r19_ratingvalue);
        b4r20_tv = (TextView) view.findViewById(R.id.b4r20_ratingvalue);
        b4r21_tv = (TextView) view.findViewById(R.id.b4r21_ratingvalue);
        b4r22_tv = (TextView) view.findViewById(R.id.b4r22_ratingvalue);
        b4r23_tv = (TextView) view.findViewById(R.id.b4r23_ratingvalue);
        b4r24_tv = (TextView) view.findViewById(R.id.b4r24_ratingvalue);
        b4r25_tv = (TextView) view.findViewById(R.id.b4r25_ratingvalue);
        b4r26_tv = (TextView) view.findViewById(R.id.b4r26_ratingvalue);
        b4r27_tv = (TextView) view.findViewById(R.id.b4r27_ratingvalue);
        b4r28_tv = (TextView) view.findViewById(R.id.b4r28_ratingvalue);

        b4r15_rl_check = (RelativeLayout) view.findViewById(R.id.b4r15_check);
        b4r16_rl_check = (RelativeLayout) view.findViewById(R.id.b4r16_check);
        b4r17_rl_check = (RelativeLayout) view.findViewById(R.id.b4r17_check);
        b4r18_rl_check = (RelativeLayout) view.findViewById(R.id.b4r18_check);
        b4r19_rl_check = (RelativeLayout) view.findViewById(R.id.b4r19_check);
        b4r20_rl_check = (RelativeLayout) view.findViewById(R.id.b4r20_check);
        b4r21_rl_check = (RelativeLayout) view.findViewById(R.id.b4r21_check);
        b4r22_rl_check = (RelativeLayout) view.findViewById(R.id.b4r22_check);
        b4r23_rl_check = (RelativeLayout) view.findViewById(R.id.b4r23_check);
        b4r24_rl_check = (RelativeLayout) view.findViewById(R.id.b4r24_check);
        b4r25_rl_check = (RelativeLayout) view.findViewById(R.id.b4r25_check);
        b4r26_rl_check = (RelativeLayout) view.findViewById(R.id.b4r26_check);
        b4r27_rl_check = (RelativeLayout) view.findViewById(R.id.b4r27_check);
        b4r28_rl_check = (RelativeLayout) view.findViewById(R.id.b4r28_check);

        b4r15_rl_check.setVisibility(View.INVISIBLE);
        b4r16_rl_check.setVisibility(View.INVISIBLE);
        b4r17_rl_check.setVisibility(View.INVISIBLE);
        b4r18_rl_check.setVisibility(View.INVISIBLE);
        b4r19_rl_check.setVisibility(View.INVISIBLE);
        b4r20_rl_check.setVisibility(View.INVISIBLE);
        b4r21_rl_check.setVisibility(View.INVISIBLE);
        b4r22_rl_check.setVisibility(View.INVISIBLE);
        b4r23_rl_check.setVisibility(View.INVISIBLE);
        b4r24_rl_check.setVisibility(View.INVISIBLE);
        b4r25_rl_check.setVisibility(View.INVISIBLE);
        b4r26_rl_check.setVisibility(View.INVISIBLE);
        b4r27_rl_check.setVisibility(View.INVISIBLE);
        b4r28_rl_check.setVisibility(View.INVISIBLE);

        b4_b_next.setOnClickListener(this);
        validator = new Blok4aValidator(getActivity());
        validator.validateB4R15(b4r15_rBar);
        validator.validateB4R16(b4r16_rBar);
        validator.validateB4R17(b4r17_rBar);
        validator.validateB4R18(b4r18_rBar);
        validator.validateB4R19(b4r19_rBar);
        validator.validateB4R20(b4r20_rBar);
        validator.validateB4R21(b4r21_rBar);
        validator.validateB4R22(b4r22_rBar);
        validator.validateB4R23(b4r23_rBar);
        validator.validateB4R24(b4r24_rBar);
        validator.validateB4R25(b4r25_rBar);
        validator.validateB4R26(b4r26_rBar);
        validator.validateB4R27(b4r27_rBar);
        validator.validateB4R28(b4r28_rBar);
    }

    @Override
    public void onClick(View v) {
        if (validator.validateAll()) {
            //showSummary();
        }
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        if (ratingBar.getId() == R.id.b4r15_ratingBar) {
            if (validator.validateB4R15(b4r15_rBar)) {
                b4r15_rl_check.setVisibility(View.VISIBLE);
                b4r15_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r15_rl_check.setVisibility(View.GONE);
                b4r15_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r16_ratingBar) {
            if (validator.validateB4R16(b4r16_rBar)) {
                b4r16_rl_check.setVisibility(View.VISIBLE);
                b4r16_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r16_rl_check.setVisibility(View.GONE);
                b4r16_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r17_ratingBar) {
            if (validator.validateB4R17(b4r17_rBar)) {
                b4r17_rl_check.setVisibility(View.VISIBLE);
                b4r17_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r17_rl_check.setVisibility(View.GONE);
                b4r17_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r18_ratingBar) {
            if (validator.validateB4R18(b4r18_rBar)) {
                b4r18_rl_check.setVisibility(View.VISIBLE);
                b4r18_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r18_rl_check.setVisibility(View.GONE);
                b4r18_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r19_ratingBar) {
            if (validator.validateB4R19(b4r19_rBar)) {
                b4r19_rl_check.setVisibility(View.VISIBLE);
                b4r19_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r19_rl_check.setVisibility(View.GONE);
                b4r19_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r20_ratingBar) {
            if (validator.validateB4R20(b4r20_rBar)) {
                b4r20_rl_check.setVisibility(View.VISIBLE);
                b4r20_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r20_rl_check.setVisibility(View.GONE);
                b4r20_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r21_ratingBar) {
            if (validator.validateB4R21(b4r21_rBar)) {
                b4r21_rl_check.setVisibility(View.VISIBLE);
                b4r21_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r21_rl_check.setVisibility(View.GONE);
                b4r21_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r22_ratingBar) {
            if (validator.validateB4R22(b4r22_rBar)) {
                b4r22_rl_check.setVisibility(View.VISIBLE);
                b4r22_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r22_rl_check.setVisibility(View.GONE);
                b4r22_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r23_ratingBar) {
            if (validator.validateB4R23(b4r23_rBar)) {
                b4r23_rl_check.setVisibility(View.VISIBLE);
                b4r23_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r23_rl_check.setVisibility(View.GONE);
                b4r23_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r24_ratingBar) {
            if (validator.validateB4R24(b4r24_rBar)) {
                b4r24_rl_check.setVisibility(View.VISIBLE);
                b4r24_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r24_rl_check.setVisibility(View.GONE);
                b4r24_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r25_ratingBar) {
            if (validator.validateB4R25(b4r25_rBar)) {
                b4r25_rl_check.setVisibility(View.VISIBLE);
                b4r25_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r25_rl_check.setVisibility(View.GONE);
                b4r25_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r26_ratingBar) {
            if (validator.validateB4R26(b4r26_rBar)) {
                b4r26_rl_check.setVisibility(View.VISIBLE);
                b4r26_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r26_rl_check.setVisibility(View.GONE);
                b4r26_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r27_ratingBar) {
            if (validator.validateB4R27(b4r27_rBar)) {
                b4r27_rl_check.setVisibility(View.VISIBLE);
                b4r27_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r27_rl_check.setVisibility(View.GONE);
                b4r27_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r28_ratingBar) {
            if (validator.validateB4R28(b4r28_rBar)) {
                b4r28_rl_check.setVisibility(View.VISIBLE);
                b4r28_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r28_rl_check.setVisibility(View.GONE);
                b4r28_tv.setText("");
            }
        }
    }

    /**
     * public void showSummary(){
     * String b4r1,b4r2,b4r3,b4r4,b4r5,b4r6s1,b4r6s2,b4r7,b4r8,b4r9s1,b4r9s2,b4r9s3,b4r10;
     * b4r1=b4r2=b4r3=b4r4=b4r5=b4r6s1=b4r6s2=b4r7=b4r8=b4r9s1=b4r9s2=b4r9s3=b4r10="";
     * <p/>
     * b4r1   = b4r1_sp.getSelectedItem().toString();
     * b4r2   = b4r2_sp.getSelectedItem().toString();
     * b4r3   = b4r3_sp.getSelectedItem().toString();
     * b4r4   = b4r4_sp.getSelectedItem().toString();
     * b4r5   = b4r5_et.getText().toString();
     * b4r6s1 = b4r6s1_sp.getSelectedItem().toString();
     * if (b4r6s2_sp.getSelectedItem().toString().equals("--Pilih Item--")){
     * b4r6s2 = "-";
     * }else{
     * b4r6s2 = b4r6s2_sp.getSelectedItem().toString();
     * }
     * if (b4r7_sp.getSelectedItem().toString().equals("--Pilih Item--")){
     * b4r7 = "-";
     * }else{
     * b4r7 = b4r7_sp.getSelectedItem().toString();
     * }
     * b4r8   = b4r8_sp.getSelectedItem().toString();
     * b4r9s1 = b4r9s1_sp.getSelectedItem().toString();
     * if (b4r9s2_sp.getSelectedItem().toString().equals("--Pilih Item--")){
     * b4r9s2 = "-";
     * }else{
     * b4r9s2 = b4r9s2_sp.getSelectedItem().toString();
     * }
     * if (b4r9s3_sp.getSelectedItem().toString().equals("--Pilih Item--")){
     * b4r9s3 = "-";
     * }else{
     * b4r9s3 = b4r9s3_sp.getSelectedItem().toString();
     * }
     * b4r10  = b4r10_sp.getSelectedItem().toString();
     * <p/>
     * AlertDialog.Builder ab = new AlertDialog.Builder(getActivity());
     * ab.setMessage("1.Status tempat tinggal : " + b4r1 +
     * "\n\n2.Jenis atap terluas : " + b4r2 +
     * "\n\n3.Jenis dinding terluas : " + b4r3 +
     * "\n\n4.Jenis lantai terluas : " + b4r4 +
     * "\n\n5.Luas Lantai : " + b4r5 + " m persegi" +
     * "\n\n6a.Sumber air minum : " + b4r6s1 +
     * "\n\n6b.Jarak ke penampungan tinja : " + b4r6s2 +
     * "\n\n7.Penggunaan fasilitas air minum : " + b4r7 +
     * "\n\n8.Cara memperoleh air minum : " + b4r8 +
     * "\n\n9a.Penggunaan fasilitas BAB : " + b4r9s1 +
     * "\n\n9b.Jenis Kloset : " + b4r9s2 +
     * "\n\n9c.Pembuangan akhir tinja : " + b4r9s3 +
     * "\n\n10.Sumber Penerangan : " + b4r10 +
     * "\n\n\n Anda yakin akan menyimpan?");
     * ab.setTitle("SUMMARY");
     * ab.setCancelable(false);
     * ab.setNegativeButton("Ya", new DialogInterface.OnClickListener() {
     * public void onClick(DialogInterface dialog, int which) {
     * next();
     * dialog.cancel();
     * }}
     * );
     * ab.setPositiveButton("Tidak", new DialogInterface.OnClickListener() {
     * public void onClick(DialogInterface dialog, int which) {
     * dialog.cancel();
     * }}
     * );
     * ab.create().show();
     * }
     */

    private void next() {
        String[] bundle = new String[14];
        bundle[0] = String.valueOf((int) b4r15_rBar.getRating());
        bundle[1] = String.valueOf((int) b4r16_rBar.getRating());
        bundle[2] = String.valueOf((int) b4r17_rBar.getRating());
        bundle[3] = String.valueOf((int) b4r18_rBar.getRating());
        bundle[4] = String.valueOf((int) b4r19_rBar.getRating());
        bundle[5] = String.valueOf((int) b4r20_rBar.getRating());
        bundle[6] = String.valueOf((int) b4r21_rBar.getRating());
        bundle[7] = String.valueOf((int) b4r22_rBar.getRating());
        bundle[8] = String.valueOf((int) b4r23_rBar.getRating());
        bundle[9] = String.valueOf((int) b4r24_rBar.getRating());
        bundle[10] = String.valueOf((int) b4r25_rBar.getRating());
        bundle[11] = String.valueOf((int) b4r26_rBar.getRating());
        bundle[12] = String.valueOf((int) b4r27_rBar.getRating());
        bundle[13] = String.valueOf((int) b4r28_rBar.getRating());

        //((QuestionnaireActivity) getActivity()).selectItem(11);
    }
}
