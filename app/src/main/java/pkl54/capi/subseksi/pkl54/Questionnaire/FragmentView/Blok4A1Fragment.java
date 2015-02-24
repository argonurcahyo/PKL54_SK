package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityView.QuestionnaireActivityImp;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.AutoSave;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4A1Controller;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4a1Validator;
import pkl54.capi.subseksi.pkl54.R;

public class Blok4A1Fragment extends Fragment implements RatingBar.OnRatingBarChangeListener, View.OnClickListener {

    private RelativeLayout b4r1_rl_check, b4r2_rl_check, b4r3_rl_check, b4r4_rl_check, b4r5_rl_check, b4r6_rl_check, b4r7_rl_check, b4r8_rl_check, b4r9_rl_check, b4r10_rl_check, b4r11_rl_check, b4r12_rl_check, b4r13_rl_check, b4r14_rl_check;
    private Button b4_b_next;
    private TextView b4r1_tv, b4r2_tv, b4r3_tv, b4r4_tv, b4r5_tv, b4r6_tv, b4r7_tv, b4r8_tv, b4r9_tv, b4r10_tv, b4r11_tv, b4r12_tv, b4r13_tv, b4r14_tv;
    private RatingBar b4r1_rBar, b4r2_rBar, b4r3_rBar, b4r4_rBar, b4r5_rBar, b4r6_rBar, b4r7_rBar, b4r8_rBar, b4r9_rBar, b4r10_rBar, b4r11_rBar, b4r12_rBar, b4r13_rBar, b4r14_rBar;
    private View view;
    private AutoSave as;
    private Blok4A1Controller controller;
    private String[] value = new String[14];
    //private Blok4A1Presenter blok4A1Presenter;

    Blok4a1Validator validator;

    public Blok4A1Fragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blok4_a1, container, false);

        init();
        AutoSave();
        //blok4A1Presenter = new Blok4A1PresenterImp(this);

        return view;
    }

    public void init() {
        as = new AutoSave(getActivity());
        b4r1_rBar = (RatingBar) view.findViewById(R.id.b4r1_ratingBar);
        b4r2_rBar = (RatingBar) view.findViewById(R.id.b4r2_ratingBar);
        b4r3_rBar = (RatingBar) view.findViewById(R.id.b4r3_ratingBar);
        b4r4_rBar = (RatingBar) view.findViewById(R.id.b4r4_ratingBar);
        b4r5_rBar = (RatingBar) view.findViewById(R.id.b4r5_ratingBar);
        b4r6_rBar = (RatingBar) view.findViewById(R.id.b4r6_ratingBar);
        //b4r7_rBar = (RatingBar) view.findViewById(R.id.b4r7_ratingBar);
        b4r8_rBar = (RatingBar) view.findViewById(R.id.b4r8_ratingBar);
        b4r9_rBar = (RatingBar) view.findViewById(R.id.b4r9_ratingBar);
        b4r10_rBar = (RatingBar) view.findViewById(R.id.b4r10_ratingBar);
        b4r11_rBar = (RatingBar) view.findViewById(R.id.b4r11_ratingBar);
        b4r12_rBar = (RatingBar) view.findViewById(R.id.b4r12_ratingBar);
        b4r13_rBar = (RatingBar) view.findViewById(R.id.b4r13_ratingBar);
        b4r14_rBar = (RatingBar) view.findViewById(R.id.b4r14_ratingBar);

        b4r1_rBar.setOnRatingBarChangeListener(this);
        b4r2_rBar.setOnRatingBarChangeListener(this);
        b4r3_rBar.setOnRatingBarChangeListener(this);
        b4r4_rBar.setOnRatingBarChangeListener(this);
        b4r5_rBar.setOnRatingBarChangeListener(this);
        b4r6_rBar.setOnRatingBarChangeListener(this);
        //b4r7_rBar.setOnRatingBarChangeListener(this);
        b4r8_rBar.setOnRatingBarChangeListener(this);
        b4r9_rBar.setOnRatingBarChangeListener(this);
        b4r10_rBar.setOnRatingBarChangeListener(this);
        b4r11_rBar.setOnRatingBarChangeListener(this);
        b4r12_rBar.setOnRatingBarChangeListener(this);
        b4r13_rBar.setOnRatingBarChangeListener(this);
        b4r14_rBar.setOnRatingBarChangeListener(this);

        b4_b_next = (Button) view.findViewById(R.id.b4_button_next);

        b4r1_tv = (TextView) view.findViewById(R.id.b4r1_ratingvalue);
        b4r2_tv = (TextView) view.findViewById(R.id.b4r2_ratingvalue);
        b4r3_tv = (TextView) view.findViewById(R.id.b4r3_ratingvalue);
        b4r4_tv = (TextView) view.findViewById(R.id.b4r4_ratingvalue);
        b4r5_tv = (TextView) view.findViewById(R.id.b4r5_ratingvalue);
        b4r6_tv = (TextView) view.findViewById(R.id.b4r6_ratingvalue);
        //b4r7_tv= (TextView) view.findViewById(R.id.b4r7_ratingvalue);
        b4r8_tv = (TextView) view.findViewById(R.id.b4r8_ratingvalue);
        b4r9_tv = (TextView) view.findViewById(R.id.b4r9_ratingvalue);
        b4r10_tv = (TextView) view.findViewById(R.id.b4r10_ratingvalue);
        b4r11_tv = (TextView) view.findViewById(R.id.b4r11_ratingvalue);
        b4r12_tv = (TextView) view.findViewById(R.id.b4r12_ratingvalue);
        b4r13_tv = (TextView) view.findViewById(R.id.b4r13_ratingvalue);
        b4r14_tv = (TextView) view.findViewById(R.id.b4r14_ratingvalue);

        b4r1_rl_check = (RelativeLayout) view.findViewById(R.id.b4r1_check);
        b4r2_rl_check = (RelativeLayout) view.findViewById(R.id.b4r2_check);
        b4r3_rl_check = (RelativeLayout) view.findViewById(R.id.b4r3_check);
        b4r4_rl_check = (RelativeLayout) view.findViewById(R.id.b4r4_check);
        b4r5_rl_check = (RelativeLayout) view.findViewById(R.id.b4r5_check);
        b4r6_rl_check = (RelativeLayout) view.findViewById(R.id.b4r6_check);
        //b4r7_rl_check = (RelativeLayout) view.findViewById(R.id.b4r7_check);
        b4r8_rl_check = (RelativeLayout) view.findViewById(R.id.b4r8_check);
        b4r9_rl_check = (RelativeLayout) view.findViewById(R.id.b4r9_check);
        b4r10_rl_check = (RelativeLayout) view.findViewById(R.id.b4r10_check);
        b4r11_rl_check = (RelativeLayout) view.findViewById(R.id.b4r11_check);
        b4r12_rl_check = (RelativeLayout) view.findViewById(R.id.b4r12_check);
        b4r13_rl_check = (RelativeLayout) view.findViewById(R.id.b4r13_check);
        b4r14_rl_check = (RelativeLayout) view.findViewById(R.id.b4r14_check);

        b4r1_rl_check.setVisibility(View.INVISIBLE);
        b4r2_rl_check.setVisibility(View.INVISIBLE);
        b4r3_rl_check.setVisibility(View.INVISIBLE);
        b4r4_rl_check.setVisibility(View.INVISIBLE);
        b4r5_rl_check.setVisibility(View.INVISIBLE);
        b4r6_rl_check.setVisibility(View.INVISIBLE);
        //b4r7_rl_check.setVisibility(View.INVISIBLE);
        b4r8_rl_check.setVisibility(View.INVISIBLE);
        b4r9_rl_check.setVisibility(View.INVISIBLE);
        b4r10_rl_check.setVisibility(View.INVISIBLE);
        b4r11_rl_check.setVisibility(View.INVISIBLE);
        b4r12_rl_check.setVisibility(View.INVISIBLE);
        b4r13_rl_check.setVisibility(View.INVISIBLE);
        b4r14_rl_check.setVisibility(View.INVISIBLE);

        b4_b_next.setOnClickListener(this);

        //initiateCheck();

        validator = new Blok4a1Validator(getActivity());
        validator.validateB4R1(b4r1_rBar);
        validator.validateB4R2(b4r2_rBar);
        validator.validateB4R3(b4r3_rBar);
        validator.validateB4R4(b4r4_rBar);
        validator.validateB4R5(b4r5_rBar);
        validator.validateB4R6(b4r6_rBar);
        //validator.validateB4R7(b4r7_rBar);
        validator.validateB4R8(b4r8_rBar);
        validator.validateB4R9(b4r9_rBar);
        validator.validateB4R10(b4r10_rBar);
        validator.validateB4R11(b4r11_rBar);
        validator.validateB4R12(b4r12_rBar);
        validator.validateB4R13(b4r13_rBar);
        validator.validateB4R14(b4r14_rBar);

    }

    public void AutoSave() {
        b4r1_rBar = as.getB4r1(b4r1_rBar);
        b4r2_rBar = as.getB4r2(b4r2_rBar);
        b4r3_rBar = as.getB4r3(b4r3_rBar);
        b4r4_rBar = as.getB4r4(b4r4_rBar);
        b4r5_rBar = as.getB4r5(b4r5_rBar);
        b4r6_rBar = as.getB4r6(b4r6_rBar);
        //b4r7_rBar = as.getB4r7(b4r7_rBar);
        b4r8_rBar = as.getB4r8(b4r8_rBar);
        b4r9_rBar = as.getB4r9(b4r9_rBar);
        b4r10_rBar = as.getB4r10(b4r10_rBar);
        b4r11_rBar = as.getB4r11(b4r11_rBar);
        b4r12_rBar = as.getB4r12(b4r12_rBar);
        b4r13_rBar = as.getB4r13(b4r13_rBar);
        b4r14_rBar = as.getB4r14(b4r14_rBar);

        b4r1_tv = as.getB4r1_Text(b4r1_tv);
        b4r2_tv = as.getB4r2_Text(b4r2_tv);
        b4r3_tv = as.getB4r3_Text(b4r3_tv);
        b4r4_tv = as.getB4r4_Text(b4r4_tv);
        b4r5_tv = as.getB4r5_Text(b4r5_tv);
        b4r6_tv = as.getB4r6_Text(b4r6_tv);
        //b4r7_tv = as.getB4r7_Text(b4r7_tv);
        b4r8_tv = as.getB4r8_Text(b4r8_tv);
        b4r9_tv = as.getB4r9_Text(b4r9_tv);
        b4r10_tv = as.getB4r10_Text(b4r10_tv);
        b4r11_tv = as.getB4r11_Text(b4r11_tv);
        b4r12_tv = as.getB4r12_Text(b4r12_tv);
        b4r13_tv = as.getB4r13_Text(b4r13_tv);
        b4r14_tv = as.getB4r14_Text(b4r14_tv);

        b4r1_rl_check = as.getB4r1_RL(b4r1_rl_check);
        b4r2_rl_check = as.getB4r2_RL(b4r2_rl_check);
        b4r3_rl_check = as.getB4r3_RL(b4r3_rl_check);
        b4r4_rl_check = as.getB4r4_RL(b4r4_rl_check);
        b4r5_rl_check = as.getB4r5_RL(b4r5_rl_check);
        b4r6_rl_check = as.getB4r6_RL(b4r6_rl_check);
        //b4r7_rl_check = as.getB4r7_RL(b4r7_rl_check);
        b4r8_rl_check = as.getB4r8_RL(b4r8_rl_check);
        b4r9_rl_check = as.getB4r9_RL(b4r9_rl_check);
        b4r10_rl_check = as.getB4r10_RL(b4r10_rl_check);
        b4r11_rl_check = as.getB4r11_RL(b4r11_rl_check);
        b4r12_rl_check = as.getB4r12_RL(b4r12_rl_check);
        b4r13_rl_check = as.getB4r13_RL(b4r13_rl_check);
        b4r14_rl_check = as.getB4r14_RL(b4r14_rl_check);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.b4_button_next) {
            if (validator.validateAll()) {
                showDialog();
            }
        }
    }

    public void showDialog() {
        new AlertDialog.Builder(getActivity())
                .setTitle("Pesan Konfirmasi")
                .setMessage("Yakin untuk melanjutkan ke blok selanjutnya?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        saveToDB();
                        navigateFragment();
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void saveToDB() {
        controller = new Blok4A1Controller();
        String nks = ((QuestionnaireActivityImp) getActivity()).loadPrefsString("NKS");
        controller.saveBlok4A1(nks, getValue());
    }

    public String[] getValue() {
        value[0] = String.valueOf(as.loadPrefsfloat("b4r1"));
        value[1] = String.valueOf(as.loadPrefsfloat("b4r2"));
        value[2] = String.valueOf(as.loadPrefsfloat("b4r3"));
        value[3] = String.valueOf(as.loadPrefsfloat("b4r4"));
        value[4] = String.valueOf(as.loadPrefsfloat("b4r5"));
        value[5] = String.valueOf(as.loadPrefsfloat("b4r6"));
        value[6] = String.valueOf(as.loadPrefsfloat("b4r7"));
        value[7] = String.valueOf(as.loadPrefsfloat("b4r8"));
        value[8] = String.valueOf(as.loadPrefsfloat("b4r9"));
        value[9] = String.valueOf(as.loadPrefsfloat("b4r10"));
        value[10] = String.valueOf(as.loadPrefsfloat("b4r11"));
        value[11] = String.valueOf(as.loadPrefsfloat("b4r12"));
        value[12] = String.valueOf(as.loadPrefsfloat("b4r13"));
        value[13] = String.valueOf(as.loadPrefsfloat("b4r14"));
        return value;
    }

    public void navigateFragment() {
        ((QuestionnaireActivityImp) getActivity()).navigateFragmentToBlok4A2();
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        if (ratingBar.getId() == R.id.b4r1_ratingBar) {
            as.saveB4r1(rating);
            if (validator.validateB4R1(b4r1_rBar)) {

                b4r1_rl_check.setVisibility(View.VISIBLE);
                b4r1_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r1_rl_check.setVisibility(View.INVISIBLE);
                b4r1_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r2_ratingBar) {
            as.saveB4r2(rating);
            if (validator.validateB4R2(b4r2_rBar)) {

                b4r2_rl_check.setVisibility(View.VISIBLE);
                b4r2_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r2_rl_check.setVisibility(View.INVISIBLE);
                b4r2_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r3_ratingBar) {
            as.saveB4r3(rating);
            if (validator.validateB4R3(b4r3_rBar)) {

                b4r3_rl_check.setVisibility(View.VISIBLE);
                b4r3_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r3_rl_check.setVisibility(View.INVISIBLE);
                b4r3_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r4_ratingBar) {
            as.saveB4r4(rating);
            if (validator.validateB4R4(b4r4_rBar)) {

                b4r4_rl_check.setVisibility(View.VISIBLE);
                b4r4_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r4_rl_check.setVisibility(View.INVISIBLE);
                b4r4_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r5_ratingBar) {
            as.saveB4r5(rating);
            if (validator.validateB4R5(b4r5_rBar)) {

                b4r5_rl_check.setVisibility(View.VISIBLE);
                b4r5_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r5_rl_check.setVisibility(View.INVISIBLE);
                b4r5_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r6_ratingBar) {
            as.saveB4r6(rating);
            if (validator.validateB4R6(b4r6_rBar)) {

                b4r6_rl_check.setVisibility(View.VISIBLE);
                b4r6_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r6_rl_check.setVisibility(View.INVISIBLE);
                b4r6_tv.setText("");
            }
        /*} else if (ratingBar.getId() == R.id.b4r7_ratingBar) {
            as.saveB4r7(rating);
            if (validator.validateB4R7(b4r7_rBar)) {

                b4r7_rl_check.setVisibility(View.VISIBLE);
                b4r7_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r7_rl_check.setVisibility(View.INVISIBLE);
                b4r7_tv.setText("");
            }*/
        } else if (ratingBar.getId() == R.id.b4r8_ratingBar) {
            as.saveB4r8(rating);
            if (validator.validateB4R8(b4r8_rBar)) {

                b4r8_rl_check.setVisibility(View.VISIBLE);
                b4r8_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r8_rl_check.setVisibility(View.INVISIBLE);
                b4r8_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r9_ratingBar) {
            as.saveB4r9(rating);
            if (validator.validateB4R9(b4r9_rBar)) {

                b4r9_rl_check.setVisibility(View.VISIBLE);
                b4r9_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r9_rl_check.setVisibility(View.INVISIBLE);
                b4r9_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r10_ratingBar) {
            as.saveB4r10(rating);
            if (validator.validateB4R10(b4r10_rBar)) {

                b4r10_rl_check.setVisibility(View.VISIBLE);
                b4r10_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r10_rl_check.setVisibility(View.INVISIBLE);
                b4r10_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r11_ratingBar) {
            as.saveB4r11(rating);
            if (validator.validateB4R11(b4r11_rBar)) {

                b4r11_rl_check.setVisibility(View.VISIBLE);
                b4r11_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r11_rl_check.setVisibility(View.INVISIBLE);
                b4r11_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r12_ratingBar) {
            as.saveB4r12(rating);
            if (validator.validateB4R12(b4r12_rBar)) {

                b4r12_rl_check.setVisibility(View.VISIBLE);
                b4r12_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r12_rl_check.setVisibility(View.INVISIBLE);
                b4r12_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r13_ratingBar) {
            as.saveB4r13(rating);
            if (validator.validateB4R13(b4r13_rBar)) {

                b4r13_rl_check.setVisibility(View.VISIBLE);
                b4r13_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r13_rl_check.setVisibility(View.INVISIBLE);
                b4r13_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r14_ratingBar) {
            as.saveB4r14(rating);
            if (validator.validateB4R14(b4r14_rBar)) {

                b4r14_rl_check.setVisibility(View.VISIBLE);
                b4r14_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r14_rl_check.setVisibility(View.INVISIBLE);
                b4r14_tv.setText("");
            }
        }

    }

    public void initiateCheck() {
        b4r1_rl_check.setVisibility(View.INVISIBLE);
        b4r2_rl_check.setVisibility(View.INVISIBLE);
        b4r3_rl_check.setVisibility(View.INVISIBLE);
        b4r4_rl_check.setVisibility(View.INVISIBLE);
        b4r5_rl_check.setVisibility(View.INVISIBLE);
        b4r6_rl_check.setVisibility(View.INVISIBLE);
        b4r8_rl_check.setVisibility(View.INVISIBLE);
        b4r9_rl_check.setVisibility(View.INVISIBLE);
        b4r10_rl_check.setVisibility(View.INVISIBLE);
        b4r12_rl_check.setVisibility(View.INVISIBLE);
        b4r13_rl_check.setVisibility(View.INVISIBLE);
        b4r14_rl_check.setVisibility(View.INVISIBLE);
    }
}
