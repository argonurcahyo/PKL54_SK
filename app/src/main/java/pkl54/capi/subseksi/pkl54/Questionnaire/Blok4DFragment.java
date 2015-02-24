package pkl54.capi.subseksi.pkl54.Questionnaire;

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

import pkl54.capi.subseksi.pkl54.R;

public class Blok4DFragment extends Fragment implements RatingBar.OnRatingBarChangeListener, View.OnClickListener {

    private View view;
    private Blok4DValidator validator;
    private RelativeLayout[] b4_check = new RelativeLayout[23];
    private RatingBar[] b4_ratbar = new RatingBar[23];
    private TextView[] b4_rating = new TextView[23];

    private Button b4_Button_next;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_blok4_d, container, false);
        // TODO Auto-generated method stub
        init();
        return view;
    }

    private void init() {
        validator = new Blok4DValidator();

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

    @Override
    public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
        // TODO Auto-generated method stub
        for (int i = 0; i < 23; i++) {
            if (arg0.getId() == b4_ratbar[i].getId())
                if (validator.validateRating(arg0)) {
                    b4_check[i].setVisibility(View.VISIBLE);
                    b4_rating[i].setText(String.valueOf((int) arg1));
                } else {
                    b4_check[i].setVisibility(View.INVISIBLE);
                    b4_rating[i].setText("");
                }
        }
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
            showSummary();
        }
    }
}
