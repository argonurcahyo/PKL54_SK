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
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4DController;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4DValidator;
import pkl54.capi.subseksi.pkl54.R;

public class Blok4DFragment extends Fragment implements RatingBar.OnRatingBarChangeListener, View.OnClickListener {

    private View view;
    private Blok4DValidator validator;
    private RelativeLayout[] b4_check = new RelativeLayout[23];
    private RatingBar[] b4_ratbar = new RatingBar[23];
    private TextView[] b4_rating = new TextView[23];
    private Blok4DController controller;
    private String[] value = new String[23];

    //codingan fahmi kece
    private AutoSave as;
    private Button b4_Button_next;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_blok4_d, container, false);
        // TODO Auto-generated method stub
        init();
        AutoSave();
        return view;
    }

    private void init() {
        validator = new Blok4DValidator(getActivity());
        as = new AutoSave(getActivity());
        b4_check[0] = (RelativeLayout) view.findViewById(R.id.b4r74_relativelayout_check);
        b4_check[1] = (RelativeLayout) view.findViewById(R.id.b4r75_relativelayout_check);
        b4_check[2] = (RelativeLayout) view.findViewById(R.id.b4r76_relativelayout_check);
        b4_check[3] = (RelativeLayout) view.findViewById(R.id.b4r77_relativelayout_check);
        b4_check[4] = (RelativeLayout) view.findViewById(R.id.b4r78_relativelayout_check);
        b4_check[5] = (RelativeLayout) view.findViewById(R.id.b4r79_relativelayout_check);
        b4_check[6] = (RelativeLayout) view.findViewById(R.id.b4r80_relativelayout_check);
        b4_check[7] = (RelativeLayout) view.findViewById(R.id.b4r81_relativelayout_check);
        b4_check[8] = (RelativeLayout) view.findViewById(R.id.b4r82_relativelayout_check);
        b4_check[9] = (RelativeLayout) view.findViewById(R.id.b4r83_relativelayout_check);
        b4_check[10] = (RelativeLayout) view.findViewById(R.id.b4r84_relativelayout_check);
        b4_check[11] = (RelativeLayout) view.findViewById(R.id.b4r85_relativelayout_check);
        b4_check[12] = (RelativeLayout) view.findViewById(R.id.b4r86_relativelayout_check);
        b4_check[13] = (RelativeLayout) view.findViewById(R.id.b4r87_relativelayout_check);
        b4_check[14] = (RelativeLayout) view.findViewById(R.id.b4r88_relativelayout_check);
        b4_check[15] = (RelativeLayout) view.findViewById(R.id.b4r89_relativelayout_check);
        b4_check[16] = (RelativeLayout) view.findViewById(R.id.b4r90_relativelayout_check);
        b4_check[17] = (RelativeLayout) view.findViewById(R.id.b4r91_relativelayout_check);
        b4_check[18] = (RelativeLayout) view.findViewById(R.id.b4r92_relativelayout_check);
        b4_check[19] = (RelativeLayout) view.findViewById(R.id.b4r93_relativelayout_check);
        b4_check[20] = (RelativeLayout) view.findViewById(R.id.b4r94_relativelayout_check);
        b4_check[21] = (RelativeLayout) view.findViewById(R.id.b4r95_relativelayout_check);
        b4_check[22] = (RelativeLayout) view.findViewById(R.id.b4r96_relativelayout_check);

        b4_ratbar[0] = (RatingBar) view.findViewById(R.id.b4r74_rat);
        b4_ratbar[1] = (RatingBar) view.findViewById(R.id.b4r75_rat);
        b4_ratbar[2] = (RatingBar) view.findViewById(R.id.b4r76_rat);
        b4_ratbar[3] = (RatingBar) view.findViewById(R.id.b4r77_rat);
        b4_ratbar[4] = (RatingBar) view.findViewById(R.id.b4r78_rat);
        b4_ratbar[5] = (RatingBar) view.findViewById(R.id.b4r79_rat);
        b4_ratbar[6] = (RatingBar) view.findViewById(R.id.b4r80_rat);
        b4_ratbar[7] = (RatingBar) view.findViewById(R.id.b4r81_rat);
        b4_ratbar[8] = (RatingBar) view.findViewById(R.id.b4r82_rat);
        b4_ratbar[9] = (RatingBar) view.findViewById(R.id.b4r83_rat);
        b4_ratbar[10] = (RatingBar) view.findViewById(R.id.b4r84_rat);
        b4_ratbar[11] = (RatingBar) view.findViewById(R.id.b4r85_rat);
        b4_ratbar[12] = (RatingBar) view.findViewById(R.id.b4r86_rat);
        b4_ratbar[13] = (RatingBar) view.findViewById(R.id.b4r87_rat);
        b4_ratbar[14] = (RatingBar) view.findViewById(R.id.b4r88_rat);
        b4_ratbar[15] = (RatingBar) view.findViewById(R.id.b4r89_rat);
        b4_ratbar[16] = (RatingBar) view.findViewById(R.id.b4r90_rat);
        b4_ratbar[17] = (RatingBar) view.findViewById(R.id.b4r91_rat);
        b4_ratbar[18] = (RatingBar) view.findViewById(R.id.b4r92_rat);
        b4_ratbar[19] = (RatingBar) view.findViewById(R.id.b4r93_rat);
        b4_ratbar[20] = (RatingBar) view.findViewById(R.id.b4r94_rat);
        b4_ratbar[21] = (RatingBar) view.findViewById(R.id.b4r95_rat);
        b4_ratbar[22] = (RatingBar) view.findViewById(R.id.b4r96_rat);

        b4_rating[0] = (TextView) view.findViewById(R.id.b4r74_rating);
        b4_rating[1] = (TextView) view.findViewById(R.id.b4r75_rating);
        b4_rating[2] = (TextView) view.findViewById(R.id.b4r76_rating);
        b4_rating[3] = (TextView) view.findViewById(R.id.b4r77_rating);
        b4_rating[4] = (TextView) view.findViewById(R.id.b4r78_rating);
        b4_rating[5] = (TextView) view.findViewById(R.id.b4r79_rating);
        b4_rating[6] = (TextView) view.findViewById(R.id.b4r80_rating);
        b4_rating[7] = (TextView) view.findViewById(R.id.b4r81_rating);
        b4_rating[8] = (TextView) view.findViewById(R.id.b4r82_rating);
        b4_rating[9] = (TextView) view.findViewById(R.id.b4r83_rating);
        b4_rating[10] = (TextView) view.findViewById(R.id.b4r84_rating);
        b4_rating[11] = (TextView) view.findViewById(R.id.b4r85_rating);
        b4_rating[12] = (TextView) view.findViewById(R.id.b4r86_rating);
        b4_rating[13] = (TextView) view.findViewById(R.id.b4r87_rating);
        b4_rating[14] = (TextView) view.findViewById(R.id.b4r88_rating);
        b4_rating[15] = (TextView) view.findViewById(R.id.b4r89_rating);
        b4_rating[16] = (TextView) view.findViewById(R.id.b4r90_rating);
        b4_rating[17] = (TextView) view.findViewById(R.id.b4r91_rating);
        b4_rating[18] = (TextView) view.findViewById(R.id.b4r92_rating);
        b4_rating[19] = (TextView) view.findViewById(R.id.b4r93_rating);
        b4_rating[20] = (TextView) view.findViewById(R.id.b4r94_rating);
        b4_rating[21] = (TextView) view.findViewById(R.id.b4r95_rating);
        b4_rating[22] = (TextView) view.findViewById(R.id.b4r96_rating);

        for (int i = 0; i < b4_check.length; i++) {
            b4_check[i].setVisibility(View.INVISIBLE);
        }

        for (int i = 0; i < b4_ratbar.length; i++) {
            b4_ratbar[i].setOnRatingBarChangeListener(this);
        }

        b4_Button_next = (Button) view.findViewById(R.id.b4_button_next);
        b4_Button_next.setOnClickListener(this);
    }

    public void AutoSave() {
        b4_ratbar[0] = as.getB4r74(b4_ratbar[0]);
        b4_ratbar[1] = as.getB4r75(b4_ratbar[1]);
        b4_ratbar[2] = as.getB4r76(b4_ratbar[2]);
        b4_ratbar[3] = as.getB4r77(b4_ratbar[3]);
        b4_ratbar[4] = as.getB4r78(b4_ratbar[4]);
        b4_ratbar[5] = as.getB4r79(b4_ratbar[5]);
        b4_ratbar[6] = as.getB4r80(b4_ratbar[6]);
        b4_ratbar[7] = as.getB4r81(b4_ratbar[7]);
        b4_ratbar[8] = as.getB4r82(b4_ratbar[8]);
        b4_ratbar[9] = as.getB4r83(b4_ratbar[9]);
        b4_ratbar[10] = as.getB4r84(b4_ratbar[10]);
        b4_ratbar[11] = as.getB4r85(b4_ratbar[11]);
        b4_ratbar[12] = as.getB4r86(b4_ratbar[12]);
        b4_ratbar[13] = as.getB4r87(b4_ratbar[13]);
        b4_ratbar[14] = as.getB4r88(b4_ratbar[14]);
        b4_ratbar[15] = as.getB4r89(b4_ratbar[15]);
        b4_ratbar[16] = as.getB4r90(b4_ratbar[16]);
        b4_ratbar[17] = as.getB4r91(b4_ratbar[17]);
        b4_ratbar[18] = as.getB4r92(b4_ratbar[18]);
        b4_ratbar[19] = as.getB4r93(b4_ratbar[19]);
        b4_ratbar[20] = as.getB4r94(b4_ratbar[20]);
        b4_ratbar[21] = as.getB4r95(b4_ratbar[21]);
        b4_ratbar[22] = as.getB4r96(b4_ratbar[22]);

        b4_rating[0] = as.getB4r74_Text(b4_rating[0]);
        b4_rating[1] = as.getB4r75_Text(b4_rating[1]);
        b4_rating[2] = as.getB4r76_Text(b4_rating[2]);
        b4_rating[3] = as.getB4r77_Text(b4_rating[3]);
        b4_rating[4] = as.getB4r78_Text(b4_rating[4]);
        b4_rating[5] = as.getB4r79_Text(b4_rating[5]);
        b4_rating[6] = as.getB4r80_Text(b4_rating[6]);
        b4_rating[7] = as.getB4r81_Text(b4_rating[7]);
        b4_rating[8] = as.getB4r82_Text(b4_rating[8]);
        b4_rating[9] = as.getB4r83_Text(b4_rating[9]);
        b4_rating[10] = as.getB4r84_Text(b4_rating[10]);
        b4_rating[11] = as.getB4r85_Text(b4_rating[11]);
        b4_rating[12] = as.getB4r86_Text(b4_rating[12]);
        b4_rating[13] = as.getB4r87_Text(b4_rating[13]);
        b4_rating[14] = as.getB4r88_Text(b4_rating[14]);
        b4_rating[15] = as.getB4r89_Text(b4_rating[15]);
        b4_rating[16] = as.getB4r90_Text(b4_rating[16]);
        b4_rating[17] = as.getB4r91_Text(b4_rating[17]);
        b4_rating[18] = as.getB4r92_Text(b4_rating[18]);
        b4_rating[19] = as.getB4r93_Text(b4_rating[19]);
        b4_rating[20] = as.getB4r94_Text(b4_rating[20]);
        b4_rating[21] = as.getB4r95_Text(b4_rating[21]);
        b4_rating[22] = as.getB4r96_Text(b4_rating[22]);

        b4_check[0] = as.getB4r74_RL(b4_check[0]);
        b4_check[1] = as.getB4r75_RL(b4_check[1]);
        b4_check[2] = as.getB4r76_RL(b4_check[2]);
        b4_check[3] = as.getB4r77_RL(b4_check[3]);
        b4_check[4] = as.getB4r78_RL(b4_check[4]);
        b4_check[5] = as.getB4r79_RL(b4_check[5]);
        b4_check[6] = as.getB4r80_RL(b4_check[6]);
        b4_check[7] = as.getB4r81_RL(b4_check[7]);
        b4_check[8] = as.getB4r82_RL(b4_check[8]);
        b4_check[9] = as.getB4r83_RL(b4_check[9]);
        b4_check[10] = as.getB4r84_RL(b4_check[10]);
        b4_check[11] = as.getB4r85_RL(b4_check[11]);
        b4_check[12] = as.getB4r86_RL(b4_check[12]);
        b4_check[13] = as.getB4r87_RL(b4_check[13]);
        b4_check[14] = as.getB4r88_RL(b4_check[14]);
        b4_check[15] = as.getB4r89_RL(b4_check[15]);
        b4_check[16] = as.getB4r90_RL(b4_check[16]);
        b4_check[17] = as.getB4r91_RL(b4_check[17]);
        b4_check[18] = as.getB4r92_RL(b4_check[18]);
        b4_check[19] = as.getB4r93_RL(b4_check[19]);
        b4_check[20] = as.getB4r94_RL(b4_check[20]);
        b4_check[21] = as.getB4r95_RL(b4_check[21]);
        b4_check[22] = as.getB4r96_RL(b4_check[22]);


    }

    @Override
    public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
        // TODO Auto-generated method stub
        if (arg0 == b4_ratbar[0]) as.saveB4r74(arg1);
        else if (arg0 == b4_ratbar[1]) as.saveB4r75(arg1);
        else if (arg0 == b4_ratbar[2]) as.saveB4r76(arg1);
        else if (arg0 == b4_ratbar[3]) as.saveB4r77(arg1);
        else if (arg0 == b4_ratbar[4]) as.saveB4r78(arg1);
        else if (arg0 == b4_ratbar[5]) as.saveB4r79(arg1);
        else if (arg0 == b4_ratbar[6]) as.saveB4r80(arg1);
        else if (arg0 == b4_ratbar[7]) as.saveB4r81(arg1);
        else if (arg0 == b4_ratbar[8]) as.saveB4r82(arg1);
        else if (arg0 == b4_ratbar[9]) as.saveB4r83(arg1);
        else if (arg0 == b4_ratbar[10]) as.saveB4r84(arg1);
        else if (arg0 == b4_ratbar[11]) as.saveB4r85(arg1);
        else if (arg0 == b4_ratbar[12]) as.saveB4r86(arg1);
        else if (arg0 == b4_ratbar[13]) as.saveB4r87(arg1);
        else if (arg0 == b4_ratbar[14]) as.saveB4r88(arg1);
        else if (arg0 == b4_ratbar[15]) as.saveB4r89(arg1);
        else if (arg0 == b4_ratbar[16]) as.saveB4r90(arg1);
        else if (arg0 == b4_ratbar[17]) as.saveB4r91(arg1);
        else if (arg0 == b4_ratbar[18]) as.saveB4r92(arg1);
        else if (arg0 == b4_ratbar[19]) as.saveB4r93(arg1);
        else if (arg0 == b4_ratbar[20]) as.saveB4r94(arg1);
        else if (arg0 == b4_ratbar[21]) as.saveB4r95(arg1);
        else if (arg0 == b4_ratbar[22]) as.saveB4r96(arg1);

        if (arg0 == b4_ratbar[0]) if (validator.validateB4R74(arg0)) {
            b4_check[0].setVisibility(View.VISIBLE);
            b4_rating[0].setText(String.valueOf((int) arg1));
        } else {
            b4_check[0].setVisibility(View.INVISIBLE);
            b4_rating[0].setText("");
        }
        else if (arg0 == b4_ratbar[1]) if (validator.validateB4R75(arg0)) {
            b4_check[1].setVisibility(View.VISIBLE);
            b4_rating[1].setText(String.valueOf((int) arg1));
        } else {
            b4_check[1].setVisibility(View.INVISIBLE);
            b4_rating[1].setText("");
        }
        else if (arg0 == b4_ratbar[2]) if (validator.validateB4R76(arg0)) {
            b4_check[2].setVisibility(View.VISIBLE);
            b4_rating[2].setText(String.valueOf((int) arg1));
        } else {
            b4_check[2].setVisibility(View.INVISIBLE);
            b4_rating[2].setText("");
        }
        else if (arg0 == b4_ratbar[3]) if (validator.validateB4R77(arg0)) {
            b4_check[3].setVisibility(View.VISIBLE);
            b4_rating[3].setText(String.valueOf((int) arg1));
        } else {
            b4_check[3].setVisibility(View.INVISIBLE);
            b4_rating[3].setText("");
        }
        else if (arg0 == b4_ratbar[4]) if (validator.validateB4R78(arg0)) {
            b4_check[4].setVisibility(View.VISIBLE);
            b4_rating[4].setText(String.valueOf((int) arg1));
        } else {
            b4_check[4].setVisibility(View.INVISIBLE);
            b4_rating[4].setText("");
        }
        else if (arg0 == b4_ratbar[5]) if (validator.validateB4R79(arg0)) {
            b4_check[5].setVisibility(View.VISIBLE);
            b4_rating[5].setText(String.valueOf((int) arg1));
        } else {
            b4_check[5].setVisibility(View.INVISIBLE);
            b4_rating[5].setText("");
        }
        else if (arg0 == b4_ratbar[6]) if (validator.validateB4R80(arg0)) {
            b4_check[6].setVisibility(View.VISIBLE);
            b4_rating[6].setText(String.valueOf((int) arg1));
        } else {
            b4_check[6].setVisibility(View.INVISIBLE);
            b4_rating[6].setText("");
        }
        else if (arg0 == b4_ratbar[7]) if (validator.validateB4R81(arg0)) {
            b4_check[7].setVisibility(View.VISIBLE);
            b4_rating[7].setText(String.valueOf((int) arg1));
        } else {
            b4_check[7].setVisibility(View.INVISIBLE);
            b4_rating[7].setText("");
        }
        else if (arg0 == b4_ratbar[8]) if (validator.validateB4R82(arg0)) {
            b4_check[8].setVisibility(View.VISIBLE);
            b4_rating[8].setText(String.valueOf((int) arg1));
        } else {
            b4_check[8].setVisibility(View.INVISIBLE);
            b4_rating[8].setText("");
        }
        else if (arg0 == b4_ratbar[9]) if (validator.validateB4R83(arg0)) {
            b4_check[9].setVisibility(View.VISIBLE);
            b4_rating[9].setText(String.valueOf((int) arg1));
        } else {
            b4_check[9].setVisibility(View.INVISIBLE);
            b4_rating[9].setText("");
        }
        else if (arg0 == b4_ratbar[10]) if (validator.validateB4R84(arg0)) {
            b4_check[10].setVisibility(View.VISIBLE);
            b4_rating[10].setText(String.valueOf((int) arg1));
        } else {
            b4_check[10].setVisibility(View.INVISIBLE);
            b4_rating[10].setText("");
        }
        else if (arg0 == b4_ratbar[11]) if (validator.validateB4R85(arg0)) {
            b4_check[11].setVisibility(View.VISIBLE);
            b4_rating[11].setText(String.valueOf((int) arg1));
        } else {
            b4_check[11].setVisibility(View.INVISIBLE);
            b4_rating[11].setText("");
        }
        else if (arg0 == b4_ratbar[12]) if (validator.validateB4R86(arg0)) {
            b4_check[12].setVisibility(View.VISIBLE);
            b4_rating[12].setText(String.valueOf((int) arg1));
        } else {
            b4_check[12].setVisibility(View.INVISIBLE);
            b4_rating[12].setText("");
        }
        else if (arg0 == b4_ratbar[13]) if (validator.validateB4R87(arg0)) {
            b4_check[13].setVisibility(View.VISIBLE);
            b4_rating[13].setText(String.valueOf((int) arg1));
        } else {
            b4_check[13].setVisibility(View.INVISIBLE);
            b4_rating[13].setText("");
        }
        else if (arg0 == b4_ratbar[14]) if (validator.validateB4R88(arg0)) {
            b4_check[14].setVisibility(View.VISIBLE);
            b4_rating[14].setText(String.valueOf((int) arg1));
        } else {
            b4_check[14].setVisibility(View.INVISIBLE);
            b4_rating[14].setText("");
        }
        else if (arg0 == b4_ratbar[15]) if (validator.validateB4R89(arg0)) {
            b4_check[15].setVisibility(View.VISIBLE);
            b4_rating[15].setText(String.valueOf((int) arg1));
        } else {
            b4_check[15].setVisibility(View.INVISIBLE);
            b4_rating[15].setText("");
        }
        else if (arg0 == b4_ratbar[16]) if (validator.validateB4R90(arg0)) {
            b4_check[16].setVisibility(View.VISIBLE);
            b4_rating[16].setText(String.valueOf((int) arg1));
        } else {
            b4_check[16].setVisibility(View.INVISIBLE);
            b4_rating[16].setText("");
        }
        else if (arg0 == b4_ratbar[17]) if (validator.validateB4R91(arg0)) {
            b4_check[17].setVisibility(View.VISIBLE);
            b4_rating[17].setText(String.valueOf((int) arg1));
        } else {
            b4_check[17].setVisibility(View.INVISIBLE);
            b4_rating[17].setText("");
        }
        else if (arg0 == b4_ratbar[18]) if (validator.validateB4R92(arg0)) {
            b4_check[18].setVisibility(View.VISIBLE);
            b4_rating[18].setText(String.valueOf((int) arg1));
        } else {
            b4_check[18].setVisibility(View.INVISIBLE);
            b4_rating[18].setText("");
        }
        else if (arg0 == b4_ratbar[19]) if (validator.validateB4R93(arg0)) {
            b4_check[19].setVisibility(View.VISIBLE);
            b4_rating[19].setText(String.valueOf((int) arg1));
        } else {
            b4_check[19].setVisibility(View.INVISIBLE);
            b4_rating[19].setText("");
        }
        else if (arg0 == b4_ratbar[20]) if (validator.validateB4R94(arg0)) {
            b4_check[20].setVisibility(View.VISIBLE);
            b4_rating[20].setText(String.valueOf((int) arg1));
        } else {
            b4_check[20].setVisibility(View.INVISIBLE);
            b4_rating[20].setText("");
        }
        else if (arg0 == b4_ratbar[21]) if (validator.validateB4R95(arg0)) {
            b4_check[21].setVisibility(View.VISIBLE);
            b4_rating[21].setText(String.valueOf((int) arg1));
        } else {
            b4_check[21].setVisibility(View.INVISIBLE);
            b4_rating[21].setText("");
        }
        else if (arg0 == b4_ratbar[22]) if (validator.validateB4R96(arg0)) {
            b4_check[22].setVisibility(View.VISIBLE);
            b4_rating[22].setText(String.valueOf((int) arg1));
        } else {
            b4_check[22].setVisibility(View.INVISIBLE);
            b4_rating[22].setText("");
        }

/*
        for (int i = 0; i < 23; i++) {
            if (arg0.getId() == b4_ratbar[i].getId())

                if (validator.validateRating(arg0)) {
                    b4_check[i].setVisibility(View.VISIBLE);
                    b4_rating[i].setText(String.valueOf((int) arg1));
                } else {
                    b4_check[i].setVisibility(View.INVISIBLE);
                    b4_rating[i].setText("");
                }

        }*/
    }


    //        if(arg0.getId()==R.id.b4r96_rat){if(validator.validateRating(arg0)){b4_check[22].setVisibility(View.VISIBLE);}else{b4_check[22].setVisibility(View.INVISIBLE);}}


    public void showSummary() {
        String b4r74 = String.valueOf(b4_ratbar[0].getRating());
        String b4r75 = String.valueOf(b4_ratbar[0].getRating());
        String b4r76 = String.valueOf(b4_ratbar[2].getRating());
        String b4r77 = String.valueOf(b4_ratbar[3].getRating());
        String b4r78 = String.valueOf(b4_ratbar[4].getRating());
        String b4r79 = String.valueOf(b4_ratbar[5].getRating());
        String b4r80 = String.valueOf(b4_ratbar[6].getRating());
        String b4r81 = String.valueOf(b4_ratbar[7].getRating());
        String b4r82 = String.valueOf(b4_ratbar[8].getRating());
        String b4r83 = String.valueOf(b4_ratbar[9].getRating());
        String b4r84 = String.valueOf(b4_ratbar[10].getRating());
        String b4r85 = String.valueOf(b4_ratbar[11].getRating());
        String b4r86 = String.valueOf(b4_ratbar[12].getRating());
        String b4r87 = String.valueOf(b4_ratbar[13].getRating());
        String b4r88 = String.valueOf(b4_ratbar[14].getRating());
        String b4r89 = String.valueOf(b4_ratbar[15].getRating());
        String b4r90 = String.valueOf(b4_ratbar[16].getRating());
        String b4r91 = String.valueOf(b4_ratbar[17].getRating());
        String b4r92 = String.valueOf(b4_ratbar[18].getRating());
        String b4r93 = String.valueOf(b4_ratbar[19].getRating());
        String b4r94 = String.valueOf(b4_ratbar[20].getRating());
        String b4r95 = String.valueOf(b4_ratbar[21].getRating());
        String b4r96 = String.valueOf(b4_ratbar[22].getRating());

        AlertDialog.Builder summary = new AlertDialog.Builder(getActivity());
        summary.setMessage(
                b4r74 + " \n" +
                        b4r75 + " \n" +
                        b4r76 + " \n" +
                        b4r77 + " \n" +
                        b4r78 + " \n" +
                        b4r79 + " \n" +
                        b4r80 + " \n" +
                        b4r81 + " \n" +
                        b4r82 + " \n" +
                        b4r83 + " \n" +
                        b4r84 + " \n" +
                        b4r85 + " \n" +
                        b4r86 + " \n" +
                        b4r87 + " \n" +
                        b4r88 + " \n" +
                        b4r89 + " \n" +
                        b4r90 + " \n" +
                        b4r91 + " \n" +
                        b4r92 + " \n" +
                        b4r93 + " \n" +
                        b4r94 + " \n" +
                        b4r95 + " \n" +
                        b4r96 + " "
        );

        summary.setCancelable(true);
        summary.setTitle("Summary Blok 4 - Nasionalisme");
        summary.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        summary.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        summary.create().show();

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
        controller = new Blok4DController();
        String nks = ((QuestionnaireActivityImp) getActivity()).loadPrefsString("NKS");
        controller.saveBlok4D(nks, getValue());
    }

    public String[] getValue() {
        value[0] = String.valueOf(as.loadPrefsfloat("b4r74"));
        value[1] = String.valueOf(as.loadPrefsfloat("b4r75"));
        value[2] = String.valueOf(as.loadPrefsfloat("b4r76"));
        value[3] = String.valueOf(as.loadPrefsfloat("b4r77"));
        value[4] = String.valueOf(as.loadPrefsfloat("b4r78"));
        value[5] = String.valueOf(as.loadPrefsfloat("b4r79"));
        value[6] = String.valueOf(as.loadPrefsfloat("b4r80"));
        value[7] = String.valueOf(as.loadPrefsfloat("b4r81"));
        value[8] = String.valueOf(as.loadPrefsfloat("b4r82"));
        value[9] = String.valueOf(as.loadPrefsfloat("b4r83"));
        value[10] = String.valueOf(as.loadPrefsfloat("b4r84"));
        value[11] = String.valueOf(as.loadPrefsfloat("b4r85"));
        value[12] = String.valueOf(as.loadPrefsfloat("b4r86"));
        value[13] = String.valueOf(as.loadPrefsfloat("b4r87"));
        value[14] = String.valueOf(as.loadPrefsfloat("b4r88"));
        value[15] = String.valueOf(as.loadPrefsfloat("b4r89"));
        value[16] = String.valueOf(as.loadPrefsfloat("b4r90"));
        value[17] = String.valueOf(as.loadPrefsfloat("b4r91"));
        value[18] = String.valueOf(as.loadPrefsfloat("b4r92"));
        value[19] = String.valueOf(as.loadPrefsfloat("b4r93"));
        value[20] = String.valueOf(as.loadPrefsfloat("b4r94"));
        value[21] = String.valueOf(as.loadPrefsfloat("b4r95"));
        value[22] = String.valueOf(as.loadPrefsfloat("b4r96"));
        return value;
    }

    public void navigateFragment() {
        ((QuestionnaireActivityImp) getActivity()).navigateFragmentToBlok4E();
    }
}
