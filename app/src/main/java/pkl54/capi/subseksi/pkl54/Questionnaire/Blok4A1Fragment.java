package pkl54.capi.subseksi.pkl54.Questionnaire;

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

public class Blok4A1Fragment extends Fragment implements RatingBar.OnRatingBarChangeListener, View.OnClickListener {

    private RelativeLayout b4r1_rl_check, b4r2_rl_check, b4r3_rl_check, b4r4_rl_check, b4r5_rl_check, b4r6_rl_check, b4r7_rl_check, b4r8_rl_check, b4r9_rl_check, b4r10_rl_check, b4r11_rl_check, b4r12_rl_check, b4r13_rl_check, b4r14_rl_check;
    private Button b4_b_next;
    private TextView b4r1_tv, b4r2_tv, b4r3_tv, b4r4_tv, b4r5_tv, b4r6_tv, b4r7_tv, b4r8_tv, b4r9_tv, b4r10_tv, b4r11_tv, b4r12_tv, b4r13_tv, b4r14_tv;
    private RatingBar b4r1_rBar, b4r2_rBar, b4r3_rBar, b4r4_rBar, b4r5_rBar, b4r6_rBar, b4r7_rBar, b4r8_rBar, b4r9_rBar, b4r10_rBar, b4r11_rBar, b4r12_rBar, b4r13_rBar, b4r14_rBar;
    private View view;

    Blok4aValidator validator;

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

        return view;
    }

    public void init() {
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

        validator = new Blok4aValidator(getActivity());
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

    @Override
    public void onClick(View v) {
        if (validator.validateAll()) {
            //showSummary();
        }
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        if (ratingBar.getId() == R.id.b4r1_ratingBar) {
            if (validator.validateB4R1(b4r1_rBar)) {
                b4r1_rl_check.setVisibility(View.VISIBLE);
                b4r1_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r1_rl_check.setVisibility(View.GONE);
                b4r1_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r2_ratingBar) {
            if (validator.validateB4R2(b4r2_rBar)) {
                b4r2_rl_check.setVisibility(View.VISIBLE);
                b4r2_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r2_rl_check.setVisibility(View.GONE);
                b4r2_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r3_ratingBar) {
            if (validator.validateB4R3(b4r3_rBar)) {
                b4r3_rl_check.setVisibility(View.VISIBLE);
                b4r3_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r3_rl_check.setVisibility(View.GONE);
                b4r3_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r4_ratingBar) {
            if (validator.validateB4R4(b4r4_rBar)) {
                b4r4_rl_check.setVisibility(View.VISIBLE);
                b4r4_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r4_rl_check.setVisibility(View.GONE);
                b4r4_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r5_ratingBar) {
            if (validator.validateB4R5(b4r5_rBar)) {
                b4r5_rl_check.setVisibility(View.VISIBLE);
                b4r5_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r5_rl_check.setVisibility(View.GONE);
                b4r5_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r6_ratingBar) {
            if (validator.validateB4R6(b4r6_rBar)) {
                b4r6_rl_check.setVisibility(View.VISIBLE);
                b4r6_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r6_rl_check.setVisibility(View.GONE);
                b4r6_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r8_ratingBar) {
            if (validator.validateB4R8(b4r8_rBar)) {
                b4r8_rl_check.setVisibility(View.VISIBLE);
                b4r8_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r8_rl_check.setVisibility(View.GONE);
                b4r8_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r9_ratingBar) {
            if (validator.validateB4R9(b4r9_rBar)) {
                b4r9_rl_check.setVisibility(View.VISIBLE);
                b4r9_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r9_rl_check.setVisibility(View.GONE);
                b4r9_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r10_ratingBar) {
            if (validator.validateB4R10(b4r10_rBar)) {
                b4r10_rl_check.setVisibility(View.VISIBLE);
                b4r10_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r10_rl_check.setVisibility(View.GONE);
                b4r10_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r11_ratingBar) {
            if (validator.validateB4R11(b4r11_rBar)) {
                b4r11_rl_check.setVisibility(View.VISIBLE);
                b4r11_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r11_rl_check.setVisibility(View.GONE);
                b4r11_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r12_ratingBar) {
            if (validator.validateB4R12(b4r12_rBar)) {
                b4r12_rl_check.setVisibility(View.VISIBLE);
                b4r12_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r12_rl_check.setVisibility(View.GONE);
                b4r12_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r13_ratingBar) {
            if (validator.validateB4R13(b4r13_rBar)) {
                b4r13_rl_check.setVisibility(View.VISIBLE);
                b4r13_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r13_rl_check.setVisibility(View.GONE);
                b4r13_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r14_ratingBar) {
            if (validator.validateB4R14(b4r14_rBar)) {
                b4r14_rl_check.setVisibility(View.VISIBLE);
                b4r14_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r14_rl_check.setVisibility(View.GONE);
                b4r14_tv.setText("");
            }
        }
    }

}
