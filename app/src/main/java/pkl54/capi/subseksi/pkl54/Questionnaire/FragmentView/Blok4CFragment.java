package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityView.QuestionnaireActivityImp;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.AutoSave;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4BController;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4CController;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4CValidator;
import pkl54.capi.subseksi.pkl54.R;


public class Blok4CFragment extends Fragment implements View.OnClickListener {

    private RatingBar b4r57_rb, b4r58_rb, b4r59_rb, b4r60_rb, b4r61_rb, b4r62_rb, b4r63_rb, b4r64_rb, b4r65_rb, b4r66_rb, b4r67_rb, b4r68_rb, b4r69_rb, b4r70_rb, b4r71_rb, b4r72_rb, b4r73_rb;
    private LinearLayout b4r57_ll, b4r58_ll, b4r59_ll, b4r60_ll, b4r61_ll, b4r62_ll, b4r63_ll, b4r64_ll, b4r65_ll, b4r66_ll, b4r67_ll, b4r68_ll, b4r69_ll, b4r70_ll, b4r71_ll, b4r72_ll, b4r73_ll;
    private Button b4_b_next;
    private TextView b4r57_rating, b4r58_rating, b4r59_rating, b4r60_rating, b4r61_rating, b4r62_rating, b4r63_rating, b4r64_rating, b4r65_rating, b4r66_rating, b4r67_rating, b4r68_rating, b4r69_rating, b4r70_rating, b4r71_rating, b4r72_rating, b4r73_rating;
    private RelativeLayout b4r57_rl, b4r58_rl, b4r59_rl, b4r60_rl, b4r61_rl, b4r62_rl, b4r63_rl, b4r64_rl, b4r65_rl, b4r66_rl, b4r67_rl, b4r68_rl, b4r69_rl, b4r70_rl, b4r71_rl, b4r72_rl, b4r73_rl;

    private View view;
    private AutoSave as;

    private Blok4CController controller;

    Blok4CValidator validator;

    private String[] value = new String[17];

    public Blok4CFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blok4_c, container, false);

        init();

        return view;
    }

    private void AutoSave() {
        b4r57_rb = as.getB4r57(b4r57_rb);
        b4r58_rb = as.getB4r58(b4r58_rb);
        b4r59_rb = as.getB4r59(b4r59_rb);
        b4r60_rb = as.getB4r60(b4r60_rb);
        b4r61_rb = as.getB4r61(b4r61_rb);
        b4r62_rb = as.getB4r62(b4r62_rb);
        b4r63_rb = as.getB4r63(b4r63_rb);
        b4r64_rb = as.getB4r64(b4r64_rb);
        b4r65_rb = as.getB4r65(b4r65_rb);
        b4r66_rb = as.getB4r66(b4r66_rb);
        b4r67_rb = as.getB4r67(b4r67_rb);
        b4r68_rb = as.getB4r68(b4r68_rb);
        b4r69_rb = as.getB4r69(b4r69_rb);
        b4r70_rb = as.getB4r70(b4r70_rb);
        b4r71_rb = as.getB4r71(b4r71_rb);
        b4r72_rb = as.getB4r72(b4r72_rb);
        b4r73_rb = as.getB4r73(b4r73_rb);

        b4r57_rating = as.getB4r57_Text(b4r57_rating);
        b4r58_rating = as.getB4r58_Text(b4r58_rating);
        b4r59_rating = as.getB4r59_Text(b4r59_rating);
        b4r60_rating = as.getB4r60_Text(b4r60_rating);
        b4r61_rating = as.getB4r61_Text(b4r61_rating);
        b4r62_rating = as.getB4r62_Text(b4r62_rating);
        b4r63_rating = as.getB4r63_Text(b4r63_rating);
        b4r64_rating = as.getB4r64_Text(b4r64_rating);
        b4r65_rating = as.getB4r65_Text(b4r65_rating);
        b4r66_rating = as.getB4r66_Text(b4r66_rating);
        b4r67_rating = as.getB4r67_Text(b4r67_rating);
        b4r68_rating = as.getB4r68_Text(b4r68_rating);
        b4r69_rating = as.getB4r69_Text(b4r69_rating);
        b4r70_rating = as.getB4r70_Text(b4r70_rating);
        b4r71_rating = as.getB4r71_Text(b4r71_rating);
        b4r72_rating = as.getB4r72_Text(b4r72_rating);
        b4r73_rating = as.getB4r73_Text(b4r73_rating);

        b4r57_rl = as.getB4r57_RL(b4r57_rl);
        b4r58_rl = as.getB4r58_RL(b4r58_rl);
        b4r59_rl = as.getB4r59_RL(b4r59_rl);
        b4r60_rl = as.getB4r60_RL(b4r60_rl);
        b4r61_rl = as.getB4r61_RL(b4r61_rl);
        b4r62_rl = as.getB4r62_RL(b4r62_rl);
        b4r63_rl = as.getB4r63_RL(b4r63_rl);
        b4r64_rl = as.getB4r64_RL(b4r64_rl);
        b4r65_rl = as.getB4r65_RL(b4r65_rl);
        b4r66_rl = as.getB4r66_RL(b4r66_rl);
        b4r67_rl = as.getB4r67_RL(b4r67_rl);
        b4r68_rl = as.getB4r68_RL(b4r68_rl);
        b4r69_rl = as.getB4r69_RL(b4r69_rl);
        b4r70_rl = as.getB4r70_RL(b4r70_rl);
        b4r71_rl = as.getB4r71_RL(b4r71_rl);
        b4r72_rl = as.getB4r72_RL(b4r72_rl);
        b4r73_rl = as.getB4r73_RL(b4r73_rl);


    }

    public void init() {

        b4r57_rb = (RatingBar) view.findViewById(R.id.b4r57_ratingbar);
        b4r58_rb = (RatingBar) view.findViewById(R.id.b4r58_ratingbar);
        b4r59_rb = (RatingBar) view.findViewById(R.id.b4r59_ratingbar);
        b4r60_rb = (RatingBar) view.findViewById(R.id.b4r60_ratingbar);
        b4r61_rb = (RatingBar) view.findViewById(R.id.b4r61_ratingbar);
        b4r62_rb = (RatingBar) view.findViewById(R.id.b4r62_ratingbar);
        b4r63_rb = (RatingBar) view.findViewById(R.id.b4r63_ratingbar);
        b4r64_rb = (RatingBar) view.findViewById(R.id.b4r64_ratingbar);
        b4r65_rb = (RatingBar) view.findViewById(R.id.b4r65_ratingbar);
        b4r66_rb = (RatingBar) view.findViewById(R.id.b4r66_ratingbar);
        b4r67_rb = (RatingBar) view.findViewById(R.id.b4r67_ratingbar);
        b4r68_rb = (RatingBar) view.findViewById(R.id.b4r68_ratingbar);
        b4r69_rb = (RatingBar) view.findViewById(R.id.b4r69_ratingbar);
        b4r70_rb = (RatingBar) view.findViewById(R.id.b4r70_ratingbar);
        b4r71_rb = (RatingBar) view.findViewById(R.id.b4r71_ratingbar);
        b4r72_rb = (RatingBar) view.findViewById(R.id.b4r72_ratingbar);
        b4r73_rb = (RatingBar) view.findViewById(R.id.b4r73_ratingbar);

        b4_b_next = (Button) view.findViewById(R.id.b4_button_next);

        as = new AutoSave(getActivity());

        b4r57_rating = (TextView) view.findViewById(R.id.b4r57_rating);
        b4r58_rating = (TextView) view.findViewById(R.id.b4r58_rating);
        b4r59_rating = (TextView) view.findViewById(R.id.b4r59_rating);
        b4r60_rating = (TextView) view.findViewById(R.id.b4r60_rating);
        b4r61_rating = (TextView) view.findViewById(R.id.b4r61_rating);
        b4r62_rating = (TextView) view.findViewById(R.id.b4r62_rating);
        b4r63_rating = (TextView) view.findViewById(R.id.b4r63_rating);
        b4r64_rating = (TextView) view.findViewById(R.id.b4r64_rating);
        b4r65_rating = (TextView) view.findViewById(R.id.b4r65_rating);
        b4r66_rating = (TextView) view.findViewById(R.id.b4r66_rating);
        b4r67_rating = (TextView) view.findViewById(R.id.b4r67_rating);
        b4r68_rating = (TextView) view.findViewById(R.id.b4r68_rating);
        b4r69_rating = (TextView) view.findViewById(R.id.b4r69_rating);
        b4r70_rating = (TextView) view.findViewById(R.id.b4r70_rating);
        b4r71_rating = (TextView) view.findViewById(R.id.b4r71_rating);
        b4r72_rating = (TextView) view.findViewById(R.id.b4r72_rating);
        b4r73_rating = (TextView) view.findViewById(R.id.b4r73_rating);


        b4r57_ll = (LinearLayout) view.findViewById(R.id.b4r57_linearlayout);
        b4r58_ll = (LinearLayout) view.findViewById(R.id.b4r58_linearlayout);
        b4r59_ll = (LinearLayout) view.findViewById(R.id.b4r59_linearlayout);
        b4r60_ll = (LinearLayout) view.findViewById(R.id.b4r60_linearlayout);
        b4r61_ll = (LinearLayout) view.findViewById(R.id.b4r61_linearlayout);
        b4r62_ll = (LinearLayout) view.findViewById(R.id.b4r62_linearlayout);
        b4r63_ll = (LinearLayout) view.findViewById(R.id.b4r63_linearlayout);
        b4r64_ll = (LinearLayout) view.findViewById(R.id.b4r64_linearlayout);
        b4r65_ll = (LinearLayout) view.findViewById(R.id.b4r65_linearlayout);
        b4r66_ll = (LinearLayout) view.findViewById(R.id.b4r66_linearlayout);
        b4r67_ll = (LinearLayout) view.findViewById(R.id.b4r67_linearlayout);
        b4r68_ll = (LinearLayout) view.findViewById(R.id.b4r68_linearlayout);
        b4r69_ll = (LinearLayout) view.findViewById(R.id.b4r69_linearlayout);
        b4r70_ll = (LinearLayout) view.findViewById(R.id.b4r70_linearlayout);
        b4r71_ll = (LinearLayout) view.findViewById(R.id.b4r71_linearlayout);
        b4r72_ll = (LinearLayout) view.findViewById(R.id.b4r72_linearlayout);
        b4r73_ll = (LinearLayout) view.findViewById(R.id.b4r73_linearlayout);

        b4r57_rl = (RelativeLayout) view.findViewById(R.id.b4r57_relativelayout_check);
        b4r58_rl = (RelativeLayout) view.findViewById(R.id.b4r58_relativelayout_check);
        b4r59_rl = (RelativeLayout) view.findViewById(R.id.b4r59_relativelayout_check);
        b4r60_rl = (RelativeLayout) view.findViewById(R.id.b4r60_relativelayout_check);
        b4r61_rl = (RelativeLayout) view.findViewById(R.id.b4r61_relativelayout_check);
        b4r62_rl = (RelativeLayout) view.findViewById(R.id.b4r62_relativelayout_check);
        b4r63_rl = (RelativeLayout) view.findViewById(R.id.b4r63_relativelayout_check);
        b4r64_rl = (RelativeLayout) view.findViewById(R.id.b4r64_relativelayout_check);
        b4r65_rl = (RelativeLayout) view.findViewById(R.id.b4r65_relativelayout_check);
        b4r66_rl = (RelativeLayout) view.findViewById(R.id.b4r66_relativelayout_check);
        b4r67_rl = (RelativeLayout) view.findViewById(R.id.b4r67_relativelayout_check);
        b4r68_rl = (RelativeLayout) view.findViewById(R.id.b4r68_relativelayout_check);
        b4r69_rl = (RelativeLayout) view.findViewById(R.id.b4r69_relativelayout_check);
        b4r70_rl = (RelativeLayout) view.findViewById(R.id.b4r70_relativelayout_check);
        b4r71_rl = (RelativeLayout) view.findViewById(R.id.b4r71_relativelayout_check);
        b4r72_rl = (RelativeLayout) view.findViewById(R.id.b4r72_relativelayout_check);
        b4r73_rl = (RelativeLayout) view.findViewById(R.id.b4r73_relativelayout_check);

        AutoSave();

        b4r57_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r57_rb) {
                    as.saveB4r57(rating);
                    if (validator.validateB4R57(b4r57_rb)) {
                        b4r57_rl.setVisibility(View.VISIBLE);
                        b4r57_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r57_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r58_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r58_rb) {
                    as.saveB4r58(rating);
                    if (validator.validateB4R58(b4r58_rb)) {
                        b4r58_rl.setVisibility(View.VISIBLE);
                        b4r58_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r58_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r59_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r59_rb) {
                    as.saveB4r59(rating);
                    if (validator.validateB4R59(b4r59_rb)) {
                        b4r59_rl.setVisibility(View.VISIBLE);
                        b4r59_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r59_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r60_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r60_rb) {
                    as.saveB4r60(rating);
                    if (validator.validateB4R60(b4r60_rb)) {
                        b4r60_rl.setVisibility(View.VISIBLE);
                        b4r60_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r60_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r61_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r61_rb) {
                    as.saveB4r61(rating);
                    if (validator.validateB4R61(b4r61_rb)) {
                        b4r61_rl.setVisibility(View.VISIBLE);
                        b4r61_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r57_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r62_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r62_rb) {
                    as.saveB4r62(rating);
                    if (validator.validateB4R62(b4r62_rb)) {
                        b4r62_rl.setVisibility(View.VISIBLE);
                        b4r62_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r62_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r63_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r63_rb) {
                    as.saveB4r63(rating);
                    if (validator.validateB4R63(b4r63_rb)) {
                        b4r63_rl.setVisibility(View.VISIBLE);
                        b4r63_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r63_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r64_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r64_rb) {
                    as.saveB4r64(rating);
                    if (validator.validateB4R64(b4r64_rb)) {
                        b4r64_rl.setVisibility(View.VISIBLE);
                        b4r64_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r64_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r65_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r65_rb) {
                    as.saveB4r65(rating);
                    if (validator.validateB4R65(b4r65_rb)) {
                        b4r65_rl.setVisibility(View.VISIBLE);
                        b4r65_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r65_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r66_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r66_rb) {
                    as.saveB4r66(rating);
                    if (validator.validateB4R66(b4r66_rb)) {
                        b4r66_rl.setVisibility(View.VISIBLE);
                        b4r66_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r66_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r67_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r67_rb) {
                    as.saveB4r67(rating);
                    if (validator.validateB4R67(b4r67_rb)) {
                        b4r67_rl.setVisibility(View.VISIBLE);
                        b4r67_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r67_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r68_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r68_rb) {
                    as.saveB4r68(rating);
                    if (validator.validateB4R68(b4r68_rb)) {
                        b4r68_rl.setVisibility(View.VISIBLE);
                        b4r68_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r68_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r69_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r69_rb) {
                    as.saveB4r69(rating);
                    if (validator.validateB4R69(b4r69_rb)) {
                        b4r69_rl.setVisibility(View.VISIBLE);
                        b4r69_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r69_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r70_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r70_rb) {
                    as.saveB4r70(rating);
                    if (validator.validateB4R70(b4r70_rb)) {
                        b4r70_rl.setVisibility(View.VISIBLE);
                        b4r70_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r70_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r71_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r71_rb) {
                    as.saveB4r71(rating);
                    if (validator.validateB4R71(b4r71_rb)) {
                        b4r71_rl.setVisibility(View.VISIBLE);
                        b4r71_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r71_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r72_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r72_rb) {
                    as.saveB4r72(rating);
                    if (validator.validateB4R72(b4r72_rb)) {
                        b4r72_rl.setVisibility(View.VISIBLE);
                        b4r72_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r72_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r73_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r73_rb) {
                    as.saveB4r73(rating);
                    if (validator.validateB4R73(b4r73_rb)) {
                        b4r73_rl.setVisibility(View.VISIBLE);
                        b4r73_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r73_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4_b_next.setOnClickListener(this);

        validator = new Blok4CValidator(getActivity());

        validator.validateB4R57(b4r57_rb);
        validator.validateB4R58(b4r58_rb);
        validator.validateB4R59(b4r59_rb);
        validator.validateB4R60(b4r60_rb);
        validator.validateB4R61(b4r61_rb);
        validator.validateB4R62(b4r62_rb);
        validator.validateB4R63(b4r63_rb);
        validator.validateB4R64(b4r64_rb);
        validator.validateB4R65(b4r65_rb);
        validator.validateB4R66(b4r66_rb);
        validator.validateB4R67(b4r67_rb);
        validator.validateB4R68(b4r68_rb);
        validator.validateB4R69(b4r69_rb);
        validator.validateB4R70(b4r70_rb);
        validator.validateB4R71(b4r71_rb);
        validator.validateB4R72(b4r72_rb);
        validator.validateB4R73(b4r73_rb);
    }

    @Override
    public void onClick(View v) {
        if(validator.validateAll()){
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
        controller = new Blok4CController();
        String nks = ((QuestionnaireActivityImp) getActivity()).loadPrefsString("NKS");
        controller.saveBlok4C(nks, getValue());
    }

    public String[] getValue() {
        value[0] = String.valueOf(as.loadPrefsfloat("b4r57"));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++"+ value[0]);
        value[1] = String.valueOf(as.loadPrefsfloat("b4r58"));
        value[2] = String.valueOf(as.loadPrefsfloat("b4r59"));
        value[3] = String.valueOf(as.loadPrefsfloat("b4r60"));
        value[4] = String.valueOf(as.loadPrefsfloat("b4r61"));
        value[5] = String.valueOf(as.loadPrefsfloat("b4r62"));
        value[6] = String.valueOf(as.loadPrefsfloat("b4r63"));
        value[7] = String.valueOf(as.loadPrefsfloat("b4r64"));
        value[8] = String.valueOf(as.loadPrefsfloat("b4r65"));
        value[9] = String.valueOf(as.loadPrefsfloat("b4r66"));
        value[10] = String.valueOf(as.loadPrefsfloat("b4r67"));
        value[11] = String.valueOf(as.loadPrefsfloat("b4r68"));
        value[12] = String.valueOf(as.loadPrefsfloat("b4r69"));
        value[13] = String.valueOf(as.loadPrefsfloat("b4r70"));
        value[14] = String.valueOf(as.loadPrefsfloat("b4r71"));
        value[15] = String.valueOf(as.loadPrefsfloat("b4r72"));
        value[16] = String.valueOf(as.loadPrefsfloat("b4r73"));
        return value;
    }

    public void navigateFragment() {
        ((QuestionnaireActivityImp) getActivity()).navigateFragmentToBlok4D();
    }

}
