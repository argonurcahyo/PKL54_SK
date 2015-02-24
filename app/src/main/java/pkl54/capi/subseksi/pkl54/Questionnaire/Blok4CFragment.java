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

import pkl54.capi.subseksi.pkl54.R;


public class Blok4CFragment extends Fragment implements View.OnClickListener {

    private RatingBar b4r57_rb, b4r58_rb, b4r59_rb, b4r60_rb, b4r61_rb, b4r62_rb, b4r63_rb, b4r64_rb, b4r65_rb, b4r66_rb, b4r67_rb, b4r68_rb, b4r69_rb, b4r70_rb, b4r71_rb, b4r72_rb, b4r73_rb;
    private Button b4_b_next;
    private TextView b4r57_rating, b4r58_rating, b4r59_rating, b4r60_rating, b4r61_rating, b4r62_rating, b4r63_rating, b4r64_rating, b4r65_rating, b4r66_rating, b4r67_rating, b4r68_rating, b4r69_rating, b4r70_rating, b4r71_rating, b4r72_rating, b4r73_rating;
    private RelativeLayout b4r57_rl, b4r58_rl, b4r59_rl, b4r60_rl, b4r61_rl, b4r62_rl, b4r63_rl, b4r64_rl, b4r65_rl, b4r66_rl, b4r67_rl, b4r68_rl, b4r69_rl, b4r70_rl, b4r71_rl, b4r72_rl, b4r73_rl;

    private View view;

    Blok4CValidator validator;

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

        b4r57_rl.setVisibility(View.INVISIBLE);
        b4r58_rl.setVisibility(View.INVISIBLE);
        b4r59_rl.setVisibility(View.INVISIBLE);
        b4r60_rl.setVisibility(View.INVISIBLE);
        b4r61_rl.setVisibility(View.INVISIBLE);
        b4r62_rl.setVisibility(View.INVISIBLE);
        b4r63_rl.setVisibility(View.INVISIBLE);
        b4r64_rl.setVisibility(View.INVISIBLE);
        b4r65_rl.setVisibility(View.INVISIBLE);
        b4r66_rl.setVisibility(View.INVISIBLE);
        b4r67_rl.setVisibility(View.INVISIBLE);
        b4r68_rl.setVisibility(View.INVISIBLE);
        b4r69_rl.setVisibility(View.INVISIBLE);
        b4r70_rl.setVisibility(View.INVISIBLE);
        b4r71_rl.setVisibility(View.INVISIBLE);
        b4r72_rl.setVisibility(View.INVISIBLE);
        b4r73_rl.setVisibility(View.INVISIBLE);

        b4r57_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r57_rb) {
                    if (validator.validateB4R57(b4r57_rb)) {
                        b4r57_rl.setVisibility(View.VISIBLE);
                        b4r57_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r57_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r58_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r58_rb) {
                    if (validator.validateB4R58(b4r58_rb)) {
                        b4r58_rl.setVisibility(View.VISIBLE);
                        b4r58_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r58_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r59_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r59_rb) {
                    if (validator.validateB4R59(b4r59_rb)) {
                        b4r59_rl.setVisibility(View.VISIBLE);
                        b4r59_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r59_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r60_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r60_rb) {
                    if (validator.validateB4R60(b4r60_rb)) {
                        b4r60_rl.setVisibility(View.VISIBLE);
                        b4r60_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r60_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r61_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r61_rb) {
                    if (validator.validateB4R61(b4r61_rb)) {
                        b4r61_rl.setVisibility(View.VISIBLE);
                        b4r61_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r57_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r62_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r62_rb) {
                    if (validator.validateB4R62(b4r62_rb)) {
                        b4r62_rl.setVisibility(View.VISIBLE);
                        b4r62_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r62_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r63_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r63_rb) {
                    if (validator.validateB4R63(b4r63_rb)) {
                        b4r63_rl.setVisibility(View.VISIBLE);
                        b4r63_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r63_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r64_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r64_rb) {
                    if (validator.validateB4R64(b4r64_rb)) {
                        b4r64_rl.setVisibility(View.VISIBLE);
                        b4r64_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r64_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r65_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r65_rb) {
                    if (validator.validateB4R65(b4r65_rb)) {
                        b4r65_rl.setVisibility(View.VISIBLE);
                        b4r65_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r65_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r66_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r66_rb) {
                    if (validator.validateB4R66(b4r66_rb)) {
                        b4r66_rl.setVisibility(View.VISIBLE);
                        b4r66_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r66_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r67_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r67_rb) {
                    if (validator.validateB4R67(b4r67_rb)) {
                        b4r67_rl.setVisibility(View.VISIBLE);
                        b4r67_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r67_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r68_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r68_rb) {
                    if (validator.validateB4R68(b4r68_rb)) {
                        b4r68_rl.setVisibility(View.VISIBLE);
                        b4r68_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r68_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r69_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r69_rb) {
                    if (validator.validateB4R69(b4r69_rb)) {
                        b4r69_rl.setVisibility(View.VISIBLE);
                        b4r69_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r69_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r70_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r70_rb) {
                    if (validator.validateB4R70(b4r70_rb)) {
                        b4r70_rl.setVisibility(View.VISIBLE);
                        b4r70_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r70_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r71_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r71_rb) {
                    if (validator.validateB4R71(b4r71_rb)) {
                        b4r71_rl.setVisibility(View.VISIBLE);
                        b4r71_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r71_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r72_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r72_rb) {
                    if (validator.validateB4R72(b4r72_rb)) {
                        b4r72_rl.setVisibility(View.VISIBLE);
                        b4r72_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r72_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r73_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r73_rb) {
                    if (validator.validateB4R73(b4r73_rb)) {
                        b4r73_rl.setVisibility(View.VISIBLE);
                        b4r73_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r73_rl.setVisibility(View.GONE);
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
        validator.validateAll();
    }
}
