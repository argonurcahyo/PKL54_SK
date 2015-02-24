package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityView.QuestionnaireActivityImp;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter.Blok2Presenter;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter.Blok2PresenterImp;
import pkl54.capi.subseksi.pkl54.R;

public class Blok2FragmentImp extends Fragment implements Blok2Fragment, TextWatcher, View.OnClickListener {

    private Blok2Presenter blok2Presenter;

    private EditText b2r1, b2r2;

    private Button blok2next;

    private RelativeLayout b2r1check, b2r2check;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blok2, container, false);

        blok2Presenter = new Blok2PresenterImp(this);

        b2r1 = (EditText) view.findViewById(R.id.b2r1_edittext);
        b2r1.addTextChangedListener(this);
        b2r2 = (EditText) view.findViewById(R.id.b2r2_edittext);
        b2r2.addTextChangedListener(this);

        blok2next = (Button) view.findViewById(R.id.b2_button_next);
        blok2next.setOnClickListener(this);

        b2r1check = (RelativeLayout) view.findViewById(R.id.b2r1_check);
        b2r2check = (RelativeLayout) view.findViewById(R.id.b2r2_check);

        initiateCheck();

        return view;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        if (b2r1.getText().hashCode() == s.hashCode()) {
            blok2Presenter.validateB2R1(s.toString());
        } else if (b2r2.getText().hashCode() == s.hashCode()) {
            blok2Presenter.validateB2R2(s.toString());
        }
    }

    public void initiateCheck() {
        b2r1check.setVisibility(View.INVISIBLE);
        b2r2check.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setVisibleCheckB2R1() {
        b2r1check.setVisibility(View.VISIBLE);
    }

    @Override
    public void setVisibleCheckB2R2() {
        b2r2check.setVisibility(View.VISIBLE);
    }

    @Override
    public void setInvisibleCheckB2R1() {
        b2r1check.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setInvisibleCheckB2R2() {
        b2r2check.setVisibility(View.INVISIBLE);
    }

    @Override
    public void navigateFragment() {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = df.format(c.getTime());
        ((QuestionnaireActivityImp)getActivity()).navigateFragmentToBlok3();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.b2_button_next){
            blok2Presenter.validateAll();
        }
    }
}
