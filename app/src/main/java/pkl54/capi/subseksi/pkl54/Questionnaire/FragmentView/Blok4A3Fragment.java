package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView;

/**
 * Created by Ahmad Mustaqim on 16/02/2015.
 */

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
import android.widget.Toast;

import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityView.QuestionnaireActivityImp;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.AutoSave;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4A2Controller;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4A3Controller;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4a3Validator;
import pkl54.capi.subseksi.pkl54.R;


public class Blok4A3Fragment extends Fragment implements View.OnClickListener, RatingBar.OnRatingBarChangeListener {

    private RelativeLayout b4r29_rl_check, b4r30_rl_check, b4r31_rl_check, b4r32_rl_check, b4r33_rl_check, b4r34_rl_check,
            b4r35_rl_check, b4r36_rl_check, b4r37_rl_check, b4r38_rl_check, b4r39_rl_check, b4r40_rl_check, b4r41_rl_check, b4r42_rl_check, b4r43_rl_check;
    private Button b4_b_next;
    private TextView b4r29_tv, b4r30_tv, b4r31_tv, b4r32_tv, b4r33_tv, b4r34_tv, b4r35_tv, b4r36_tv, b4r37_tv, b4r38_tv, b4r39_tv, b4r40_tv, b4r41_tv, b4r42_tv, b4r43_tv;
    private RatingBar b4r29_rBar, b4r30_rBar, b4r31_rBar, b4r32_rBar, b4r33_rBar, b4r34_rBar, b4r35_rBar, b4r36_rBar, b4r37_rBar,
            b4r38_rBar, b4r39_rBar, b4r40_rBar, b4r41_rBar, b4r42_rBar, b4r43_rBar;
    private View view;
    private AutoSave as;
    private Blok4A3Controller controller;
    private String[] value = new String[15];

    Blok4a3Validator validator;

    //private Blok4A3Presenter blok4A3Presenter;

    public Blok4A3Fragment() {


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blok4_a3, container, false);

        init();

        //blok4A3Presenter = new Blok4A3PresenterImp();

        return view;
    }

    public void init() {
        as = new AutoSave(getActivity());
        b4r29_rBar = (RatingBar) view.findViewById(R.id.b4r29_ratingBar);
        b4r30_rBar = (RatingBar) view.findViewById(R.id.b4r30_ratingBar);
        b4r31_rBar = (RatingBar) view.findViewById(R.id.b4r31_ratingBar);
        b4r32_rBar = (RatingBar) view.findViewById(R.id.b4r32_ratingBar);
        b4r33_rBar = (RatingBar) view.findViewById(R.id.b4r33_ratingBar);
        b4r34_rBar = (RatingBar) view.findViewById(R.id.b4r34_ratingBar);
        b4r35_rBar = (RatingBar) view.findViewById(R.id.b4r35_ratingBar);
        b4r36_rBar = (RatingBar) view.findViewById(R.id.b4r36_ratingBar);
        b4r37_rBar = (RatingBar) view.findViewById(R.id.b4r37_ratingBar);
        b4r38_rBar = (RatingBar) view.findViewById(R.id.b4r38_ratingBar);
        b4r39_rBar = (RatingBar) view.findViewById(R.id.b4r39_ratingBar);
        b4r40_rBar = (RatingBar) view.findViewById(R.id.b4r40_ratingBar);
        b4r41_rBar = (RatingBar) view.findViewById(R.id.b4r41_ratingBar);
        b4r42_rBar = (RatingBar) view.findViewById(R.id.b4r42_ratingBar);
        b4r43_rBar = (RatingBar) view.findViewById(R.id.b4r43_ratingBar);

        b4r29_rBar.setOnRatingBarChangeListener(this);
        b4r30_rBar.setOnRatingBarChangeListener(this);
        b4r31_rBar.setOnRatingBarChangeListener(this);
        b4r32_rBar.setOnRatingBarChangeListener(this);
        b4r33_rBar.setOnRatingBarChangeListener(this);
        b4r34_rBar.setOnRatingBarChangeListener(this);
        b4r35_rBar.setOnRatingBarChangeListener(this);
        b4r36_rBar.setOnRatingBarChangeListener(this);
        b4r37_rBar.setOnRatingBarChangeListener(this);
        b4r38_rBar.setOnRatingBarChangeListener(this);
        b4r39_rBar.setOnRatingBarChangeListener(this);
        b4r40_rBar.setOnRatingBarChangeListener(this);
        b4r41_rBar.setOnRatingBarChangeListener(this);
        b4r42_rBar.setOnRatingBarChangeListener(this);
        b4r43_rBar.setOnRatingBarChangeListener(this);

        b4_b_next = (Button) view.findViewById(R.id.b4_button_next);

        b4r29_tv = (TextView) view.findViewById(R.id.b4r29_ratingvalue);
        b4r30_tv = (TextView) view.findViewById(R.id.b4r30_ratingvalue);
        b4r31_tv = (TextView) view.findViewById(R.id.b4r31_ratingvalue);
        b4r32_tv = (TextView) view.findViewById(R.id.b4r32_ratingvalue);
        b4r33_tv = (TextView) view.findViewById(R.id.b4r33_ratingvalue);
        b4r34_tv = (TextView) view.findViewById(R.id.b4r34_ratingvalue);
        b4r35_tv = (TextView) view.findViewById(R.id.b4r35_ratingvalue);
        b4r36_tv = (TextView) view.findViewById(R.id.b4r36_ratingvalue);
        b4r37_tv = (TextView) view.findViewById(R.id.b4r37_ratingvalue);
        b4r38_tv = (TextView) view.findViewById(R.id.b4r38_ratingvalue);
        b4r39_tv = (TextView) view.findViewById(R.id.b4r39_ratingvalue);
        b4r40_tv = (TextView) view.findViewById(R.id.b4r40_ratingvalue);
        b4r41_tv = (TextView) view.findViewById(R.id.b4r41_ratingvalue);
        b4r42_tv = (TextView) view.findViewById(R.id.b4r42_ratingvalue);
        b4r43_tv = (TextView) view.findViewById(R.id.b4r43_ratingvalue);

        b4r29_rl_check = (RelativeLayout) view.findViewById(R.id.b4r29_check);
        b4r30_rl_check = (RelativeLayout) view.findViewById(R.id.b4r30_check);
        b4r31_rl_check = (RelativeLayout) view.findViewById(R.id.b4r31_check);
        b4r32_rl_check = (RelativeLayout) view.findViewById(R.id.b4r32_check);
        b4r33_rl_check = (RelativeLayout) view.findViewById(R.id.b4r33_check);
        b4r34_rl_check = (RelativeLayout) view.findViewById(R.id.b4r34_check);
        b4r35_rl_check = (RelativeLayout) view.findViewById(R.id.b4r35_check);
        b4r36_rl_check = (RelativeLayout) view.findViewById(R.id.b4r36_check);
        b4r37_rl_check = (RelativeLayout) view.findViewById(R.id.b4r37_check);
        b4r38_rl_check = (RelativeLayout) view.findViewById(R.id.b4r38_check);
        b4r39_rl_check = (RelativeLayout) view.findViewById(R.id.b4r39_check);
        b4r40_rl_check = (RelativeLayout) view.findViewById(R.id.b4r40_check);
        b4r41_rl_check = (RelativeLayout) view.findViewById(R.id.b4r41_check);
        b4r42_rl_check = (RelativeLayout) view.findViewById(R.id.b4r42_check);
        b4r43_rl_check = (RelativeLayout) view.findViewById(R.id.b4r43_check);

        b4r29_rl_check.setVisibility(View.INVISIBLE);
        b4r30_rl_check.setVisibility(View.INVISIBLE);
        b4r31_rl_check.setVisibility(View.INVISIBLE);
        b4r32_rl_check.setVisibility(View.INVISIBLE);
        b4r33_rl_check.setVisibility(View.INVISIBLE);
        b4r34_rl_check.setVisibility(View.INVISIBLE);
        b4r35_rl_check.setVisibility(View.INVISIBLE);
        b4r36_rl_check.setVisibility(View.INVISIBLE);
        b4r37_rl_check.setVisibility(View.INVISIBLE);
        b4r38_rl_check.setVisibility(View.INVISIBLE);
        b4r39_rl_check.setVisibility(View.INVISIBLE);
        b4r40_rl_check.setVisibility(View.INVISIBLE);
        b4r41_rl_check.setVisibility(View.INVISIBLE);
        b4r42_rl_check.setVisibility(View.INVISIBLE);
        b4r43_rl_check.setVisibility(View.INVISIBLE);

        b4_b_next.setOnClickListener(this);
        validator = new Blok4a3Validator(getActivity());
        validator.validateB4R29(b4r29_rBar);
        validator.validateB4R30(b4r30_rBar);
        validator.validateB4R31(b4r31_rBar);
        validator.validateB4R32(b4r32_rBar);
        validator.validateB4R33(b4r33_rBar);
        validator.validateB4R34(b4r34_rBar);
        validator.validateB4R35(b4r35_rBar);
        validator.validateB4R36(b4r36_rBar);
        validator.validateB4R37(b4r37_rBar);
        validator.validateB4R38(b4r38_rBar);
        validator.validateB4R39(b4r39_rBar);
        validator.validateB4R40(b4r40_rBar);
        validator.validateB4R41(b4r41_rBar);
        validator.validateB4R42(b4r42_rBar);
        validator.validateB4R43(b4r43_rBar);

        AutoSave();
    }

    public void AutoSave() {
        b4r29_rBar = as.getB4r29(b4r29_rBar);
        b4r30_rBar = as.getB4r30(b4r30_rBar);
        b4r31_rBar = as.getB4r31(b4r31_rBar);
        b4r32_rBar = as.getB4r32(b4r32_rBar);
        b4r33_rBar = as.getB4r33(b4r33_rBar);
        b4r34_rBar = as.getB4r34(b4r34_rBar);
        b4r35_rBar = as.getB4r35(b4r35_rBar);
        b4r36_rBar = as.getB4r36(b4r36_rBar);
        b4r37_rBar = as.getB4r37(b4r37_rBar);
        b4r38_rBar = as.getB4r38(b4r38_rBar);
        b4r39_rBar = as.getB4r39(b4r39_rBar);
        b4r40_rBar = as.getB4r40(b4r40_rBar);
        b4r41_rBar = as.getB4r41(b4r41_rBar);
        b4r42_rBar = as.getB4r42(b4r42_rBar);
        b4r43_rBar = as.getB4r43(b4r43_rBar);

        b4r29_tv = as.getB4r29_Text(b4r29_tv);
        b4r30_tv = as.getB4r30_Text(b4r30_tv);
        b4r31_tv = as.getB4r31_Text(b4r31_tv);
        b4r32_tv = as.getB4r32_Text(b4r32_tv);
        b4r33_tv = as.getB4r33_Text(b4r33_tv);
        b4r34_tv = as.getB4r34_Text(b4r34_tv);
        b4r35_tv = as.getB4r35_Text(b4r35_tv);
        b4r36_tv = as.getB4r36_Text(b4r36_tv);
        b4r37_tv = as.getB4r37_Text(b4r37_tv);
        b4r38_tv = as.getB4r38_Text(b4r38_tv);
        b4r39_tv = as.getB4r39_Text(b4r39_tv);
        b4r40_tv = as.getB4r40_Text(b4r40_tv);
        b4r41_tv = as.getB4r41_Text(b4r41_tv);
        b4r42_tv = as.getB4r42_Text(b4r42_tv);
        b4r43_tv = as.getB4r43_Text(b4r43_tv);

        b4r29_rl_check = as.getB4r29_RL(b4r29_rl_check);
        b4r30_rl_check = as.getB4r30_RL(b4r30_rl_check);
        b4r31_rl_check = as.getB4r31_RL(b4r31_rl_check);
        b4r32_rl_check = as.getB4r32_RL(b4r32_rl_check);
        b4r33_rl_check = as.getB4r33_RL(b4r33_rl_check);
        b4r34_rl_check = as.getB4r34_RL(b4r34_rl_check);
        b4r35_rl_check = as.getB4r35_RL(b4r35_rl_check);
        b4r36_rl_check = as.getB4r36_RL(b4r36_rl_check);
        b4r37_rl_check = as.getB4r37_RL(b4r37_rl_check);
        b4r38_rl_check = as.getB4r38_RL(b4r38_rl_check);
        b4r39_rl_check = as.getB4r39_RL(b4r39_rl_check);
        b4r40_rl_check = as.getB4r40_RL(b4r40_rl_check);
        b4r41_rl_check = as.getB4r41_RL(b4r41_rl_check);
        b4r42_rl_check = as.getB4r42_RL(b4r42_rl_check);
        b4r43_rl_check = as.getB4r43_RL(b4r43_rl_check);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.b4_button_next)
            if (validator.validateAll()) {
                showDialog();
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
        controller = new Blok4A3Controller();
        String nks = ((QuestionnaireActivityImp) getActivity()).loadPrefsString("NKS");
        controller.saveBlok4A3(nks, getValue());
    }

    public String[] getValue() {
        value[0] = String.valueOf(as.loadPrefsfloat("b4r29"));
        value[1] = String.valueOf(as.loadPrefsfloat("b4r30"));
        value[2] = String.valueOf(as.loadPrefsfloat("b4r31"));
        value[3] = String.valueOf(as.loadPrefsfloat("b4r32"));
        value[4] = String.valueOf(as.loadPrefsfloat("b4r33"));
        value[5] = String.valueOf(as.loadPrefsfloat("b4r34"));
        value[6] = String.valueOf(as.loadPrefsfloat("b4r35"));
        value[7] = String.valueOf(as.loadPrefsfloat("b4r36"));
        value[8] = String.valueOf(as.loadPrefsfloat("b4r37"));
        value[9] = String.valueOf(as.loadPrefsfloat("b4r38"));
        value[10] = String.valueOf(as.loadPrefsfloat("b4r39"));
        value[11] = String.valueOf(as.loadPrefsfloat("b4r40"));
        value[12] = String.valueOf(as.loadPrefsfloat("b4r41"));
        value[13] = String.valueOf(as.loadPrefsfloat("b4r42"));
        value[14] = String.valueOf(as.loadPrefsfloat("b4r43"));
        return value;
    }

    public void navigateFragment() {
        ((QuestionnaireActivityImp) getActivity()).navigateFragmentToBlok4B();
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        if (ratingBar.getId() == R.id.b4r29_ratingBar) {
            as.saveB4r29(rating);
            if (validator.validateB4R29(b4r29_rBar)) {

                b4r29_rl_check.setVisibility(View.VISIBLE);
                b4r29_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r29_rl_check.setVisibility(View.INVISIBLE);
                b4r29_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r30_ratingBar) {
            as.saveB4r30(rating);
            if (validator.validateB4R30(b4r30_rBar)) {

                b4r30_rl_check.setVisibility(View.VISIBLE);
                b4r30_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r30_rl_check.setVisibility(View.INVISIBLE);
                b4r30_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r31_ratingBar) {
            as.saveB4r31(rating);
            if (validator.validateB4R31(b4r31_rBar)) {

                b4r31_rl_check.setVisibility(View.VISIBLE);
                b4r31_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r31_rl_check.setVisibility(View.INVISIBLE);
                b4r31_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r32_ratingBar) {
            as.saveB4r32(rating);
            if (validator.validateB4R32(b4r32_rBar)) {

                b4r32_rl_check.setVisibility(View.VISIBLE);
                b4r32_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r32_rl_check.setVisibility(View.INVISIBLE);
                b4r32_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r33_ratingBar) {
            as.saveB4r33(rating);
            if (validator.validateB4R33(b4r33_rBar)) {

                b4r33_rl_check.setVisibility(View.VISIBLE);
                b4r33_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r33_rl_check.setVisibility(View.INVISIBLE);
                b4r33_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r34_ratingBar) {
            as.saveB4r34(rating);
            if (validator.validateB4R34(b4r34_rBar)) {

                b4r34_rl_check.setVisibility(View.VISIBLE);
                b4r34_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r34_rl_check.setVisibility(View.INVISIBLE);
                b4r34_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r35_ratingBar) {
            as.saveB4r35(rating);
            if (validator.validateB4R35(b4r35_rBar)) {

                b4r35_rl_check.setVisibility(View.VISIBLE);
                b4r35_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r35_rl_check.setVisibility(View.INVISIBLE);
                b4r35_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r36_ratingBar) {
            as.saveB4r36(rating);
            if (validator.validateB4R36(b4r36_rBar)) {

                b4r36_rl_check.setVisibility(View.VISIBLE);
                b4r36_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r36_rl_check.setVisibility(View.INVISIBLE);
                b4r36_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r37_ratingBar) {
            as.saveB4r37(rating);
            if (validator.validateB4R37(b4r37_rBar)) {

                b4r37_rl_check.setVisibility(View.VISIBLE);
                b4r37_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r37_rl_check.setVisibility(View.INVISIBLE);
                b4r37_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r38_ratingBar) {
            as.saveB4r38(rating);
            if (validator.validateB4R38(b4r38_rBar)) {

                b4r38_rl_check.setVisibility(View.VISIBLE);
                b4r38_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r38_rl_check.setVisibility(View.INVISIBLE);
                b4r38_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r39_ratingBar) {
            as.saveB4r39(rating);
            if (validator.validateB4R39(b4r39_rBar)) {
                b4r39_rl_check.setVisibility(View.VISIBLE);
                b4r39_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r39_rl_check.setVisibility(View.INVISIBLE);
                b4r39_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r40_ratingBar) {
            as.saveB4r40(rating);
            if (validator.validateB4R40(b4r40_rBar)) {

                b4r40_rl_check.setVisibility(View.VISIBLE);
                b4r40_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r40_rl_check.setVisibility(View.INVISIBLE);
                b4r40_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r41_ratingBar) {
            as.saveB4r41(rating);
            if (validator.validateB4R41(b4r41_rBar)) {

                b4r41_rl_check.setVisibility(View.VISIBLE);
                b4r41_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r41_rl_check.setVisibility(View.INVISIBLE);
                b4r41_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r42_ratingBar) {
            as.saveB4r42(rating);
            if (validator.validateB4R42(b4r42_rBar)) {

                b4r42_rl_check.setVisibility(View.VISIBLE);
                b4r42_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r42_rl_check.setVisibility(View.INVISIBLE);
                b4r42_tv.setText("");
            }
        } else if (ratingBar.getId() == R.id.b4r43_ratingBar) {
            as.saveB4r43(rating);
            if (validator.validateB4R43(b4r43_rBar)) {

                b4r43_rl_check.setVisibility(View.VISIBLE);
                b4r43_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r43_rl_check.setVisibility(View.INVISIBLE);
                b4r43_tv.setText("");
            }
        }
    }
}
