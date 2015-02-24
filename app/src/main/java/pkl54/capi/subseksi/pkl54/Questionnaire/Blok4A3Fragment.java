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


public class Blok4A3Fragment extends Fragment implements View.OnClickListener, RatingBar.OnRatingBarChangeListener {

    private RelativeLayout b4r29_rl_check, b4r30_rl_check, b4r31_rl_check, b4r32_rl_check, b4r33_rl_check, b4r34_rl_check,
            b4r35_rl_check, b4r36_rl_check, b4r37_rl_check, b4r38_rl_check, b4r39_rl_check, b4r40_rl_check, b4r41_rl_check, b4r42_rl_check, b4r43_rl_check;
    private Button b4_b_next;
    private TextView b4r29_tv, b4r30_tv, b4r31_tv, b4r32_tv, b4r33_tv, b4r34_tv, b4r35_tv, b4r36_tv, b4r37_tv, b4r38_tv, b4r39_tv, b4r40_tv, b4r41_tv, b4r42_tv, b4r43_tv;
    private RatingBar b4r29_rBar, b4r30_rBar, b4r31_rBar, b4r32_rBar, b4r33_rBar, b4r34_rBar, b4r35_rBar, b4r36_rBar, b4r37_rBar,
            b4r38_rBar, b4r39_rBar, b4r40_rBar, b4r41_rBar, b4r42_rBar, b4r43_rBar;
    private View view;

    Blok4aValidator validator;

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

        return view;
    }

    public void init() {
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
        validator = new Blok4aValidator(getActivity());
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
    }

    @Override
    public void onClick(View v) {
        if (validator.validateAll()) {
            //showSummary();
        }
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        if (ratingBar.getId() == R.id.b4r29_ratingBar) {
            if (validator.validateB4R29(b4r29_rBar)) {
                b4r29_rl_check.setVisibility(View.VISIBLE);
                b4r29_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r29_rl_check.setVisibility(View.GONE);
                b4r29_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r30_ratingBar) {
            if (validator.validateB4R30(b4r30_rBar)) {
                b4r30_rl_check.setVisibility(View.VISIBLE);
                b4r30_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r30_rl_check.setVisibility(View.GONE);
                b4r30_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r31_ratingBar) {
            if (validator.validateB4R32(b4r31_rBar)) {
                b4r31_rl_check.setVisibility(View.VISIBLE);
                b4r31_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r31_rl_check.setVisibility(View.GONE);
                b4r31_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r32_ratingBar) {
            if (validator.validateB4R33(b4r32_rBar)) {
                b4r32_rl_check.setVisibility(View.VISIBLE);
                b4r32_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r32_rl_check.setVisibility(View.GONE);
                b4r32_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r33_ratingBar) {
            if (validator.validateB4R33(b4r33_rBar)) {
                b4r33_rl_check.setVisibility(View.VISIBLE);
                b4r33_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r33_rl_check.setVisibility(View.GONE);
                b4r33_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r34_ratingBar) {
            if (validator.validateB4R34(b4r34_rBar)) {
                b4r34_rl_check.setVisibility(View.VISIBLE);
                b4r34_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r34_rl_check.setVisibility(View.GONE);
                b4r34_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r35_ratingBar) {
            if (validator.validateB4R35(b4r35_rBar)) {
                b4r35_rl_check.setVisibility(View.VISIBLE);
                b4r35_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r35_rl_check.setVisibility(View.GONE);
                b4r35_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r36_ratingBar) {
            if (validator.validateB4R36(b4r36_rBar)) {
                b4r36_rl_check.setVisibility(View.VISIBLE);
                b4r36_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r36_rl_check.setVisibility(View.GONE);
                b4r36_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r37_ratingBar) {
            if (validator.validateB4R37(b4r37_rBar)) {
                b4r37_rl_check.setVisibility(View.VISIBLE);
                b4r37_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r37_rl_check.setVisibility(View.GONE);
                b4r37_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r38_ratingBar) {
            if (validator.validateB4R38(b4r38_rBar)) {
                b4r38_rl_check.setVisibility(View.VISIBLE);
                b4r38_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r38_rl_check.setVisibility(View.GONE);
                b4r38_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r39_ratingBar) {
            if (validator.validateB4R39(b4r39_rBar)) {
                b4r39_rl_check.setVisibility(View.VISIBLE);
                b4r39_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r39_rl_check.setVisibility(View.GONE);
                b4r39_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r40_ratingBar) {
            if (validator.validateB4R40(b4r40_rBar)) {
                b4r40_rl_check.setVisibility(View.VISIBLE);
                b4r40_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r40_rl_check.setVisibility(View.GONE);
                b4r40_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r41_ratingBar) {
            if (validator.validateB4R41(b4r41_rBar)) {
                b4r41_rl_check.setVisibility(View.VISIBLE);
                b4r41_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r41_rl_check.setVisibility(View.GONE);
                b4r41_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r42_ratingBar) {
            if (validator.validateB4R42(b4r42_rBar)) {
                b4r42_rl_check.setVisibility(View.VISIBLE);
                b4r42_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r42_rl_check.setVisibility(View.GONE);
                b4r42_tv.setText("");
            }
        }

        if (ratingBar.getId() == R.id.b4r43_ratingBar) {
            if (validator.validateB4R43(b4r43_rBar)) {
                b4r43_rl_check.setVisibility(View.VISIBLE);
                b4r43_tv.setText(String.valueOf((int) ratingBar.getRating()));
            } else {
                b4r43_rl_check.setVisibility(View.GONE);
                b4r43_tv.setText("");
            }
        }

    }

    private void next() {
        String[] bundle = new String[15];
        bundle[0] = String.valueOf((int) b4r29_rBar.getRating());
        bundle[1] = String.valueOf((int) b4r30_rBar.getRating());
        bundle[2] = String.valueOf((int) b4r31_rBar.getRating());
        bundle[3] = String.valueOf((int) b4r32_rBar.getRating());
        bundle[4] = String.valueOf((int) b4r33_rBar.getRating());
        bundle[5] = String.valueOf((int) b4r34_rBar.getRating());
        bundle[6] = String.valueOf((int) b4r35_rBar.getRating());
        bundle[7] = String.valueOf((int) b4r36_rBar.getRating());
        bundle[8] = String.valueOf((int) b4r37_rBar.getRating());
        bundle[9] = String.valueOf((int) b4r38_rBar.getRating());
        bundle[10] = String.valueOf((int) b4r39_rBar.getRating());
        bundle[11] = String.valueOf((int) b4r40_rBar.getRating());
        bundle[12] = String.valueOf((int) b4r41_rBar.getRating());
        bundle[13] = String.valueOf((int) b4r42_rBar.getRating());
        bundle[14] = String.valueOf((int) b4r43_rBar.getRating());

        //((QuestionnaireActivity) getActivity()).selectItem(11);
    }
}
