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

public class Blok4EFragment extends Fragment implements View.OnClickListener {

    private RatingBar b4r97_rb, b4r98_rb, b4r99_rb, b4r100_rb, b4r101_rb, b4r102_rb, b4r103_rb, b4r104_rb, b4r105_rb, b4r106_rb, b4r107_rb, b4r108_rb, b4r109_rb, b4r110_rb, b4r111_rb, b4r112_rb, b4r113_rb;
    private Button b4_b_next;
    private TextView b4r97_rating, b4r98_rating, b4r99_rating, b4r100_rating, b4r101_rating, b4r102_rating, b4r103_rating, b4r104_rating, b4r105_rating, b4r106_rating, b4r107_rating, b4r108_rating, b4r109_rating, b4r110_rating, b4r111_rating, b4r112_rating, b4r113_rating;
    private RelativeLayout b4r97_rl, b4r98_rl, b4r99_rl, b4r100_rl, b4r101_rl, b4r102_rl, b4r103_rl, b4r104_rl, b4r105_rl, b4r106_rl, b4r107_rl, b4r108_rl, b4r109_rl, b4r110_rl, b4r111_rl, b4r112_rl, b4r113_rl;

    private View view;

    Blok4EValidator validator;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blok4_e, container, false);

        init();

        return view;
    }

    public void init() {

        b4r97_rb = (RatingBar) view.findViewById(R.id.b4r97_ratingbar);
        b4r98_rb = (RatingBar) view.findViewById(R.id.b4r98_ratingbar);
        b4r99_rb = (RatingBar) view.findViewById(R.id.b4r99_ratingbar);
        b4r100_rb = (RatingBar) view.findViewById(R.id.b4r100_ratingbar);
        b4r101_rb = (RatingBar) view.findViewById(R.id.b4r101_ratingbar);
        b4r102_rb = (RatingBar) view.findViewById(R.id.b4r102_ratingbar);
        b4r103_rb = (RatingBar) view.findViewById(R.id.b4r103_ratingbar);
        b4r104_rb = (RatingBar) view.findViewById(R.id.b4r104_ratingbar);
        b4r105_rb = (RatingBar) view.findViewById(R.id.b4r105_ratingbar);
        b4r106_rb = (RatingBar) view.findViewById(R.id.b4r106_ratingbar);
        b4r107_rb = (RatingBar) view.findViewById(R.id.b4r107_ratingbar);
        b4r108_rb = (RatingBar) view.findViewById(R.id.b4r108_ratingbar);
        b4r109_rb = (RatingBar) view.findViewById(R.id.b4r109_ratingbar);
        b4r110_rb = (RatingBar) view.findViewById(R.id.b4r110_ratingbar);
        b4r111_rb = (RatingBar) view.findViewById(R.id.b4r111_ratingbar);
        b4r112_rb = (RatingBar) view.findViewById(R.id.b4r112_ratingbar);
        b4r113_rb = (RatingBar) view.findViewById(R.id.b4r113_ratingbar);

        b4_b_next = (Button) view.findViewById(R.id.b4_button_next);

        b4r97_rating = (TextView) view.findViewById(R.id.b4r97_rating);
        b4r98_rating = (TextView) view.findViewById(R.id.b4r98_rating);
        b4r99_rating = (TextView) view.findViewById(R.id.b4r99_rating);
        b4r100_rating = (TextView) view.findViewById(R.id.b4r100_rating);
        b4r101_rating = (TextView) view.findViewById(R.id.b4r101_rating);
        b4r102_rating = (TextView) view.findViewById(R.id.b4r102_rating);
        b4r103_rating = (TextView) view.findViewById(R.id.b4r103_rating);
        b4r104_rating = (TextView) view.findViewById(R.id.b4r104_rating);
        b4r105_rating = (TextView) view.findViewById(R.id.b4r105_rating);
        b4r106_rating = (TextView) view.findViewById(R.id.b4r106_rating);
        b4r107_rating = (TextView) view.findViewById(R.id.b4r107_rating);
        b4r108_rating = (TextView) view.findViewById(R.id.b4r108_rating);
        b4r109_rating = (TextView) view.findViewById(R.id.b4r109_rating);
        b4r110_rating = (TextView) view.findViewById(R.id.b4r110_rating);
        b4r111_rating = (TextView) view.findViewById(R.id.b4r111_rating);
        b4r112_rating = (TextView) view.findViewById(R.id.b4r112_rating);
        b4r113_rating = (TextView) view.findViewById(R.id.b4r113_rating);

        b4r97_rl = (RelativeLayout) view.findViewById(R.id.b4r97_relativelayout_check);
        b4r98_rl = (RelativeLayout) view.findViewById(R.id.b4r98_relativelayout_check);
        b4r99_rl = (RelativeLayout) view.findViewById(R.id.b4r99_relativelayout_check);
        b4r100_rl = (RelativeLayout) view.findViewById(R.id.b4r100_relativelayout_check);
        b4r101_rl = (RelativeLayout) view.findViewById(R.id.b4r101_relativelayout_check);
        b4r102_rl = (RelativeLayout) view.findViewById(R.id.b4r102_relativelayout_check);
        b4r103_rl = (RelativeLayout) view.findViewById(R.id.b4r103_relativelayout_check);
        b4r104_rl = (RelativeLayout) view.findViewById(R.id.b4r104_relativelayout_check);
        b4r105_rl = (RelativeLayout) view.findViewById(R.id.b4r105_relativelayout_check);
        b4r106_rl = (RelativeLayout) view.findViewById(R.id.b4r106_relativelayout_check);
        b4r107_rl = (RelativeLayout) view.findViewById(R.id.b4r107_relativelayout_check);
        b4r108_rl = (RelativeLayout) view.findViewById(R.id.b4r108_relativelayout_check);
        b4r109_rl = (RelativeLayout) view.findViewById(R.id.b4r109_relativelayout_check);
        b4r110_rl = (RelativeLayout) view.findViewById(R.id.b4r110_relativelayout_check);
        b4r111_rl = (RelativeLayout) view.findViewById(R.id.b4r111_relativelayout_check);
        b4r112_rl = (RelativeLayout) view.findViewById(R.id.b4r112_relativelayout_check);
        b4r113_rl = (RelativeLayout) view.findViewById(R.id.b4r113_relativelayout_check);

        b4r97_rl.setVisibility(View.INVISIBLE);
        b4r98_rl.setVisibility(View.INVISIBLE);
        b4r99_rl.setVisibility(View.INVISIBLE);
        b4r100_rl.setVisibility(View.INVISIBLE);
        b4r101_rl.setVisibility(View.INVISIBLE);
        b4r102_rl.setVisibility(View.INVISIBLE);
        b4r103_rl.setVisibility(View.INVISIBLE);
        b4r104_rl.setVisibility(View.INVISIBLE);
        b4r105_rl.setVisibility(View.INVISIBLE);
        b4r106_rl.setVisibility(View.INVISIBLE);
        b4r107_rl.setVisibility(View.INVISIBLE);
        b4r108_rl.setVisibility(View.INVISIBLE);
        b4r109_rl.setVisibility(View.INVISIBLE);
        b4r110_rl.setVisibility(View.INVISIBLE);
        b4r111_rl.setVisibility(View.INVISIBLE);
        b4r112_rl.setVisibility(View.INVISIBLE);
        b4r113_rl.setVisibility(View.INVISIBLE);

        b4r97_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r97_rb) {
                    if (validator.validateB4R97(b4r97_rb)) {
                        b4r97_rl.setVisibility(View.VISIBLE);
                        b4r97_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r97_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r98_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r98_rb) {
                    if (validator.validateB4R98(b4r98_rb)) {
                        b4r98_rl.setVisibility(View.VISIBLE);
                        b4r98_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r98_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r99_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r99_rb) {
                    if (validator.validateB4R99(b4r99_rb)) {
                        b4r99_rl.setVisibility(View.VISIBLE);
                        b4r99_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r99_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r100_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r100_rb) {
                    if (validator.validateB4R100(b4r100_rb)) {
                        b4r100_rl.setVisibility(View.VISIBLE);
                        b4r100_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r100_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r101_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r101_rb) {
                    if (validator.validateB4R101(b4r101_rb)) {
                        b4r101_rl.setVisibility(View.VISIBLE);
                        b4r101_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r101_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r102_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r102_rb) {
                    if (validator.validateB4R102(b4r102_rb)) {
                        b4r102_rl.setVisibility(View.VISIBLE);
                        b4r102_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r102_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r103_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r103_rb) {
                    if (validator.validateB4R103(b4r103_rb)) {
                        b4r103_rl.setVisibility(View.VISIBLE);
                        b4r103_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r103_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r104_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r104_rb) {
                    if (validator.validateB4R104(b4r104_rb)) {
                        b4r104_rl.setVisibility(View.VISIBLE);
                        b4r104_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r104_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r105_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r105_rb) {
                    if (validator.validateB4R105(b4r105_rb)) {
                        b4r105_rl.setVisibility(View.VISIBLE);
                        b4r105_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r105_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r106_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r106_rb) {
                    if (validator.validateB4R106(b4r106_rb)) {
                        b4r106_rl.setVisibility(View.VISIBLE);
                        b4r106_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r106_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r107_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r107_rb) {
                    if (validator.validateB4R107(b4r107_rb)) {
                        b4r107_rl.setVisibility(View.VISIBLE);
                        b4r107_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r107_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r108_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r108_rb) {
                    if (validator.validateB4R108(b4r108_rb)) {
                        b4r108_rl.setVisibility(View.VISIBLE);
                        b4r108_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r108_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r109_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r109_rb) {
                    if (validator.validateB4R109(b4r109_rb)) {
                        b4r109_rl.setVisibility(View.VISIBLE);
                        b4r109_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r109_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r110_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r110_rb) {
                    if (validator.validateB4R110(b4r110_rb)) {
                        b4r110_rl.setVisibility(View.VISIBLE);
                        b4r110_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r110_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r111_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r111_rb) {
                    if (validator.validateB4R111(b4r111_rb)) {
                        b4r111_rl.setVisibility(View.VISIBLE);
                        b4r111_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r111_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r112_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r112_rb) {
                    if (validator.validateB4R112(b4r112_rb)) {
                        b4r112_rl.setVisibility(View.VISIBLE);
                        b4r112_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r112_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4r113_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r113_rb) {
                    if (validator.validateB4R113(b4r113_rb)) {
                        b4r113_rl.setVisibility(View.VISIBLE);
                        b4r113_rating.setText(String.valueOf((int) rating));
                    } else {
                        b4r113_rl.setVisibility(View.GONE);
                    }
                }
            }
        });

        b4_b_next.setOnClickListener(this);

        validator = new Blok4EValidator(getActivity());

        validator.validateB4R97(b4r97_rb);
        validator.validateB4R98(b4r98_rb);
        validator.validateB4R99(b4r99_rb);
        validator.validateB4R100(b4r100_rb);
        validator.validateB4R101(b4r101_rb);
        validator.validateB4R102(b4r102_rb);
        validator.validateB4R103(b4r103_rb);
        validator.validateB4R104(b4r104_rb);
        validator.validateB4R105(b4r105_rb);
        validator.validateB4R106(b4r106_rb);
        validator.validateB4R107(b4r107_rb);
        validator.validateB4R108(b4r108_rb);
        validator.validateB4R109(b4r109_rb);
        validator.validateB4R110(b4r110_rb);
        validator.validateB4R111(b4r111_rb);
        validator.validateB4R112(b4r112_rb);
        validator.validateB4R113(b4r113_rb);
    }

    @Override
    public void onClick(View v) {
        validator.validateAll();
    }

}
