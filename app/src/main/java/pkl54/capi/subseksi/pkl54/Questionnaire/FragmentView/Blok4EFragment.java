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
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.BackupDB;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4DController;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4EController;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4EValidator;
import pkl54.capi.subseksi.pkl54.R;

public class Blok4EFragment extends Fragment implements View.OnClickListener {

    private RatingBar b4r97_rb, b4r98_rb, b4r99_rb, b4r100_rb, b4r101_rb, b4r102_rb, b4r103_rb, b4r104_rb, b4r105_rb, b4r106_rb, b4r107_rb, b4r108_rb, b4r109_rb, b4r110_rb, b4r111_rb, b4r112_rb, b4r113_rb;
    private LinearLayout b4r97_ll, b4r98_ll, b4r99_ll, b4r100_ll, b4r101_ll, b4r102_ll, b4r103_ll, b4r104_ll, b4r105_ll, b4r106_ll, b4r107_ll, b4r108_ll, b4r109_ll, b4r110_ll, b4r111_ll, b4r112_ll, b4r113_ll;
    private Button b4_b_next;
    private TextView b4r97_rating, b4r98_rating, b4r99_rating, b4r100_rating, b4r101_rating, b4r102_rating, b4r103_rating, b4r104_rating, b4r105_rating, b4r106_rating, b4r107_rating, b4r108_rating, b4r109_rating, b4r110_rating, b4r111_rating, b4r112_rating, b4r113_rating;
    private RelativeLayout b4r97_rl, b4r98_rl, b4r99_rl, b4r100_rl, b4r101_rl, b4r102_rl, b4r103_rl, b4r104_rl, b4r105_rl, b4r106_rl, b4r107_rl, b4r108_rl, b4r109_rl, b4r110_rl, b4r111_rl, b4r112_rl, b4r113_rl;

    private View view;
    private AutoSave as;
    private BackupDB backupDB;
    private String[] value = new String[17];

    private Blok4EController controller;

    Blok4EValidator validator;

    public Blok4EFragment() {

    }


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

    private void AutoSave() {
        b4r97_rb = as.getB4r97(b4r97_rb);
        b4r98_rb = as.getB4r98(b4r98_rb);
        b4r99_rb = as.getB4r99(b4r99_rb);
        b4r100_rb = as.getB4r100(b4r100_rb);
        b4r101_rb = as.getB4r101(b4r101_rb);
        b4r102_rb = as.getB4r102(b4r102_rb);
        b4r103_rb = as.getB4r103(b4r103_rb);
        b4r104_rb = as.getB4r104(b4r104_rb);
        b4r105_rb = as.getB4r105(b4r105_rb);
        b4r106_rb = as.getB4r106(b4r106_rb);
        b4r107_rb = as.getB4r107(b4r107_rb);
        b4r108_rb = as.getB4r108(b4r108_rb);
        b4r109_rb = as.getB4r109(b4r109_rb);
        b4r110_rb = as.getB4r110(b4r110_rb);
        b4r111_rb = as.getB4r111(b4r111_rb);
        b4r112_rb = as.getB4r112(b4r112_rb);
        b4r113_rb = as.getB4r113(b4r113_rb);

        b4r97_rating = as.getB4r97_Text(b4r97_rating);
        b4r98_rating = as.getB4r98_Text(b4r98_rating);
        b4r99_rating = as.getB4r99_Text(b4r99_rating);
        b4r100_rating = as.getB4r100_Text(b4r100_rating);
        b4r101_rating = as.getB4r101_Text(b4r101_rating);
        b4r102_rating = as.getB4r102_Text(b4r102_rating);
        b4r103_rating = as.getB4r103_Text(b4r103_rating);
        b4r104_rating = as.getB4r104_Text(b4r104_rating);
        b4r105_rating = as.getB4r105_Text(b4r105_rating);
        b4r106_rating = as.getB4r106_Text(b4r106_rating);
        b4r107_rating = as.getB4r107_Text(b4r107_rating);
        b4r108_rating = as.getB4r108_Text(b4r108_rating);
        b4r109_rating = as.getB4r109_Text(b4r109_rating);
        b4r110_rating = as.getB4r110_Text(b4r110_rating);
        b4r111_rating = as.getB4r111_Text(b4r111_rating);
        b4r112_rating = as.getB4r112_Text(b4r112_rating);
        b4r113_rating = as.getB4r113_Text(b4r113_rating);


        b4r97_rl = as.getB4r97_RL(b4r97_rl);
        b4r98_rl = as.getB4r98_RL(b4r98_rl);
        b4r99_rl = as.getB4r99_RL(b4r99_rl);
        b4r100_rl = as.getB4r100_RL(b4r100_rl);
        b4r101_rl = as.getB4r101_RL(b4r101_rl);
        b4r102_rl = as.getB4r102_RL(b4r102_rl);
        b4r103_rl = as.getB4r103_RL(b4r103_rl);
        b4r104_rl = as.getB4r104_RL(b4r104_rl);
        b4r105_rl = as.getB4r105_RL(b4r105_rl);
        b4r106_rl = as.getB4r106_RL(b4r106_rl);
        b4r107_rl = as.getB4r107_RL(b4r107_rl);
        b4r108_rl = as.getB4r108_RL(b4r108_rl);
        b4r109_rl = as.getB4r109_RL(b4r109_rl);
        b4r110_rl = as.getB4r110_RL(b4r110_rl);
        b4r111_rl = as.getB4r111_RL(b4r111_rl);
        b4r112_rl = as.getB4r112_RL(b4r112_rl);
        b4r113_rl = as.getB4r113_RL(b4r113_rl);


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

        as = new AutoSave(getActivity());
        backupDB = new BackupDB(getActivity());

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

        b4r97_ll = (LinearLayout) view.findViewById(R.id.b4r57_linearlayout);
        b4r98_ll = (LinearLayout) view.findViewById(R.id.b4r58_linearlayout);
        b4r99_ll = (LinearLayout) view.findViewById(R.id.b4r59_linearlayout);
        b4r100_ll = (LinearLayout) view.findViewById(R.id.b4r60_linearlayout);
        b4r101_ll = (LinearLayout) view.findViewById(R.id.b4r61_linearlayout);
        b4r102_ll = (LinearLayout) view.findViewById(R.id.b4r62_linearlayout);
        b4r103_ll = (LinearLayout) view.findViewById(R.id.b4r63_linearlayout);
        b4r104_ll = (LinearLayout) view.findViewById(R.id.b4r64_linearlayout);
        b4r105_ll = (LinearLayout) view.findViewById(R.id.b4r65_linearlayout);
        b4r106_ll = (LinearLayout) view.findViewById(R.id.b4r66_linearlayout);
        b4r107_ll = (LinearLayout) view.findViewById(R.id.b4r67_linearlayout);
        b4r108_ll = (LinearLayout) view.findViewById(R.id.b4r68_linearlayout);
        b4r109_ll = (LinearLayout) view.findViewById(R.id.b4r69_linearlayout);
        b4r110_ll = (LinearLayout) view.findViewById(R.id.b4r70_linearlayout);
        b4r111_ll = (LinearLayout) view.findViewById(R.id.b4r71_linearlayout);
        b4r112_ll = (LinearLayout) view.findViewById(R.id.b4r72_linearlayout);
        b4r113_ll = (LinearLayout) view.findViewById(R.id.b4r73_linearlayout);

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


        AutoSave();

        b4r97_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r97_rb) {
                    as.saveB4r97(rating);
                    if (validator.validateB4R97(b4r97_rb)) {
                        b4r97_rl.setVisibility(View.VISIBLE);
                        b4r97_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r97_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r98_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r98_rb) {
                    as.saveB4r98(rating);
                    if (validator.validateB4R98(b4r98_rb)) {
                        b4r98_rl.setVisibility(View.VISIBLE);
                        b4r98_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r98_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r99_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r99_rb) {
                    as.saveB4r99(rating);
                    if (validator.validateB4R99(b4r99_rb)) {
                        b4r99_rl.setVisibility(View.VISIBLE);
                        b4r99_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r99_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r100_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r100_rb) {
                    as.saveB4r100(rating);
                    if (validator.validateB4R100(b4r100_rb)) {
                        b4r100_rl.setVisibility(View.VISIBLE);
                        b4r100_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r100_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r101_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r101_rb) {
                    as.saveB4r101(rating);
                    if (validator.validateB4R101(b4r101_rb)) {
                        b4r101_rl.setVisibility(View.VISIBLE);
                        b4r101_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r101_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r102_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r102_rb) {
                    as.saveB4r102(rating);
                    if (validator.validateB4R102(b4r102_rb)) {
                        b4r102_rl.setVisibility(View.VISIBLE);
                        b4r102_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r102_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r103_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r103_rb) {
                    as.saveB4r103(rating);
                    if (validator.validateB4R103(b4r103_rb)) {
                        b4r103_rl.setVisibility(View.VISIBLE);
                        b4r103_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r103_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r104_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r104_rb) {
                    as.saveB4r104(rating);
                    if (validator.validateB4R104(b4r104_rb)) {
                        b4r104_rl.setVisibility(View.VISIBLE);
                        b4r104_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r104_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r105_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r105_rb) {
                    as.saveB4r105(rating);
                    if (validator.validateB4R105(b4r105_rb)) {
                        b4r105_rl.setVisibility(View.VISIBLE);
                        b4r105_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r105_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r106_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r106_rb) {
                    as.saveB4r106(rating);
                    if (validator.validateB4R106(b4r106_rb)) {
                        b4r106_rl.setVisibility(View.VISIBLE);
                        b4r106_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r106_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r107_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r107_rb) {
                    as.saveB4r107(rating);
                    if (validator.validateB4R107(b4r107_rb)) {
                        b4r107_rl.setVisibility(View.VISIBLE);
                        b4r107_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r107_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r108_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r108_rb) {
                    as.saveB4r108(rating);
                    if (validator.validateB4R108(b4r108_rb)) {
                        b4r108_rl.setVisibility(View.VISIBLE);
                        b4r108_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r108_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r109_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r109_rb) {
                    as.saveB4r109(rating);
                    if (validator.validateB4R109(b4r109_rb)) {
                        b4r109_rl.setVisibility(View.VISIBLE);
                        b4r109_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r109_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r110_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r110_rb) {
                    as.saveB4r110(rating);
                    if (validator.validateB4R110(b4r110_rb)) {
                        b4r110_rl.setVisibility(View.VISIBLE);
                        b4r110_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r110_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r111_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r111_rb) {
                    as.saveB4r111(rating);
                    if (validator.validateB4R111(b4r111_rb)) {
                        b4r111_rl.setVisibility(View.VISIBLE);
                        b4r111_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r111_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r112_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r112_rb) {
                    as.saveB4r112(rating);
                    if (validator.validateB4R112(b4r112_rb)) {
                        b4r112_rl.setVisibility(View.VISIBLE);
                        b4r112_rating.setText(String.valueOf((int) rating));

                    } else {

                        b4r112_rl.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        b4r113_rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (ratingBar == b4r113_rb) {
                    as.saveB4r113(rating);
                    if (validator.validateB4R113(b4r113_rb)) {
                        b4r113_rl.setVisibility(View.VISIBLE);
                        b4r113_rating.setText(String.valueOf((int) rating));

                    } else {
                        b4r113_rl.setVisibility(View.INVISIBLE);
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
        controller = new Blok4EController();
        String nks = ((QuestionnaireActivityImp) getActivity()).loadPrefsString("NKS");
        long getTime = ((QuestionnaireActivityImp) getActivity()).loadPrefsLong("timeMillis2")-((QuestionnaireActivityImp) getActivity()).loadPrefsLong("timeMillis1");
        controller.saveBlok4E(nks, getTime, getValue());
        backupDB.exportDB();
        as.clearAll();
        Toast.makeText(getActivity(), "Data sudah masuk", Toast.LENGTH_SHORT).show();
    }

    public void setCurrentTime(){
        long tsLong = System.currentTimeMillis()/1000;
        ((QuestionnaireActivityImp)getActivity()).savePrefs("timeMillis2", tsLong);
    }

    public String[] getValue() {
        value[0] = String.valueOf(as.loadPrefsfloat("b4r97"));
        value[1] = String.valueOf(as.loadPrefsfloat("b4r98"));
        value[2] = String.valueOf(as.loadPrefsfloat("b4r99"));
        value[3] = String.valueOf(as.loadPrefsfloat("b4r100"));
        value[4] = String.valueOf(as.loadPrefsfloat("b4r101"));
        value[5] = String.valueOf(as.loadPrefsfloat("b4r102"));
        value[6] = String.valueOf(as.loadPrefsfloat("b4r103"));
        value[7] = String.valueOf(as.loadPrefsfloat("b4r104"));
        value[8] = String.valueOf(as.loadPrefsfloat("b4r105"));
        value[9] = String.valueOf(as.loadPrefsfloat("b4r106"));
        value[10] = String.valueOf(as.loadPrefsfloat("b4r107"));
        value[11] = String.valueOf(as.loadPrefsfloat("b4r108"));
        value[12] = String.valueOf(as.loadPrefsfloat("b4r109"));
        value[13] = String.valueOf(as.loadPrefsfloat("b4r110"));
        value[14] = String.valueOf(as.loadPrefsfloat("b4r111"));
        value[15] = String.valueOf(as.loadPrefsfloat("b4r112"));
        value[16] = String.valueOf(as.loadPrefsfloat("b4r113"));
        return value;
    }

    public void navigateFragment() {
        getActivity().finish();
    }

}
