package pkl54.capi.subseksi.pkl54.Questionnaire;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter.Blok1Presenter;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter.Blok1PresenterImp;
import pkl54.capi.subseksi.pkl54.R;

public class Blok1FragmentImp extends Fragment implements Blok1Fragment, AdapterView.OnItemSelectedListener, TextWatcher, RadioGroup.OnCheckedChangeListener, View.OnClickListener {

    private Blok1Presenter blok1Presenter;

    private View view;

    private Spinner b1r1, b1r2, b1r3, b1r9;
    private EditText b1r5, b1r6, b1r7, b1r8jalan, b1r8rt, b1r8rw, b1r8dusun;
    private RadioGroup b1r4;
    private RelativeLayout b1r1check, b1r2check, b1r3check, b1r4check, b1r5check, b1r6check, b1r7check, b1r8check, b1r9check;

    private Button blok1next;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_blok1, container, false);

        blok1Presenter = new Blok1PresenterImp(this);

        b1r1 = (Spinner) view.findViewById(R.id.b1r1_spinner);
        b1r1.setOnItemSelectedListener(this);
        b1r2 = (Spinner) view.findViewById(R.id.b1r2_spinner);
        b1r2.setOnItemSelectedListener(this);
        b1r3 = (Spinner) view.findViewById(R.id.b1r3_spinner);
        b1r3.setOnItemSelectedListener(this);
        b1r9 = (Spinner) view.findViewById(R.id.b1r9_spinner);
        b1r9.setOnItemSelectedListener(this);

        b1r5 = (EditText) view.findViewById(R.id.b1r5_edittext);
        b1r5.addTextChangedListener(this);
        b1r6 = (EditText) view.findViewById(R.id.b1r6s1_edittext);
        b1r6.addTextChangedListener(this);
        b1r7 = (EditText) view.findViewById(R.id.b1r7_edittext);
        b1r7.addTextChangedListener(this);
        b1r8jalan = (EditText) view.findViewById(R.id.b1r8_edittext_jalan);
        b1r8jalan.addTextChangedListener(this);
        b1r8rt = (EditText) view.findViewById(R.id.b1r8_edittext_rt);
        b1r8rt.addTextChangedListener(this);
        b1r8rw = (EditText) view.findViewById(R.id.b1r8_edittext_rw);
        b1r8rw.addTextChangedListener(this);
        b1r8dusun = (EditText) view.findViewById(R.id.b1r8_edittext_dusun);
        b1r8dusun.addTextChangedListener(this);

        b1r4 = (RadioGroup) view.findViewById(R.id.b1r4_radiogroup);
        b1r4.setOnCheckedChangeListener(this);

        b1r1check = (RelativeLayout) view.findViewById(R.id.b1r1_check);
        b1r2check = (RelativeLayout) view.findViewById(R.id.b1r2_check);
        b1r3check = (RelativeLayout) view.findViewById(R.id.b1r3_check);
        b1r4check = (RelativeLayout) view.findViewById(R.id.b1r4_check);
        b1r5check = (RelativeLayout) view.findViewById(R.id.b1r5_check);
        b1r6check = (RelativeLayout) view.findViewById(R.id.b1r6_check);
        b1r7check = (RelativeLayout) view.findViewById(R.id.b1r7_check);
        b1r8check = (RelativeLayout) view.findViewById(R.id.b1r8_check);
        b1r9check = (RelativeLayout) view.findViewById(R.id.b1r9_check);

        blok1next = (Button) view.findViewById(R.id.b1_button_next);
        blok1next.setOnClickListener(this);

        initiateCheck();

        populateSpinnerB1R1();
        populateSpinnerB1R9();

        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent == b1r1) {
            blok1Presenter.validateB1R1(b1r1.getSelectedItem().toString());
        } else if (parent == b1r2) {
            blok1Presenter.validateB1R2(b1r2.getSelectedItem().toString());
        } else if (parent == b1r3) {
            blok1Presenter.validateB1R3(b1r3.getSelectedItem().toString());
        } else if (parent == b1r9) {
            blok1Presenter.validateB1R9(b1r9.getSelectedItem().toString());
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        if (b1r5.getText().hashCode() == s.hashCode()) {
            blok1Presenter.validateB1R5(s.toString());
        } else if (b1r6.getText().hashCode() == s.hashCode()) {
            blok1Presenter.validateB1R6(s.toString());
        } else if (b1r7.getText().hashCode() == s.hashCode()) {
            blok1Presenter.validateB1R7(s.toString());
        } else if (b1r8jalan.getText().hashCode() == s.hashCode() || b1r8rt.getText().hashCode() == s.hashCode() || b1r8rw.getText().hashCode() == s.hashCode() || b1r8dusun.toString().hashCode() == s.hashCode()) {
            blok1Presenter.validateB1R8(b1r8jalan.getText().toString(), b1r8rt.getText().toString(), b1r8rw.getText().toString(), b1r8dusun.getText().toString());
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (group == b1r4) {
            blok1Presenter.validateB1R4(group.indexOfChild(view.findViewById(checkedId)));
        }
    }

    public void populateSpinnerB1R1() {
        ArrayAdapter<String> B1R1Adapter = new ArrayAdapter<String>(getActivity(), R.layout.spinner_layout, R.id.text, getResources().getStringArray(R.array.kabupaten));
        b1r1.setAdapter(B1R1Adapter);
    }

    @Override
    public void populateSpinnerB1R2(int adapter) {
        ArrayAdapter<String> B1R2Adapter = new ArrayAdapter<String>(getActivity(), R.layout.spinner_layout, R.id.text, getResources().getStringArray(adapter));
        b1r2.setAdapter(B1R2Adapter);
    }

    @Override
    public void unpopulateSpinnerB1R2() {
        b1r2.setAdapter(null);
    }

    @Override
    public void populateSpinnerB1R3(int adapter) {
        ArrayAdapter<String> B1R3Adapter = new ArrayAdapter<String>(getActivity(), R.layout.spinner_layout, R.id.text, getResources().getStringArray(adapter));
        b1r3.setAdapter(B1R3Adapter);
    }

    @Override
    public void unpopulateSpinnerB1R3() {
        b1r3.setAdapter(null);
    }

    public void populateSpinnerB1R9() {
        ArrayAdapter<String> B1R9Adapter = new ArrayAdapter<String>(getActivity(), R.layout.spinner_layout, R.id.text, getResources().getStringArray(R.array.B1R9));
        b1r9.setAdapter(B1R9Adapter);
    }

    @Override
    public void setVisibleCheckB1R1() {
        b1r1check.setVisibility(View.VISIBLE);
    }

    @Override
    public void setVisibleCheckB1R2() {
        b1r2check.setVisibility(View.VISIBLE);
    }

    @Override
    public void setVisibleCheckB1R3() {
        b1r3check.setVisibility(View.VISIBLE);
    }

    @Override
    public void setVisibleCheckB1R4() {
        b1r4check.setVisibility(View.VISIBLE);
    }

    @Override
    public void setVisibleCheckB1R5() {
        b1r5check.setVisibility(View.VISIBLE);
    }

    @Override
    public void setVisibleCheckB1R6() {
        b1r6check.setVisibility(View.VISIBLE);
    }

    @Override
    public void setVisibleCheckB1R7() {
        b1r7check.setVisibility(View.VISIBLE);
    }

    @Override
    public void setVisibleCheckB1R8() {
        b1r8check.setVisibility(View.VISIBLE);
    }

    @Override
    public void setVisibleCheckB1R9() {
        b1r9check.setVisibility(View.VISIBLE);
    }

    @Override
    public void setInvisibleCheckB1R1() {
        b1r1check.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setInvisibleCheckB1R2() {
        b1r2check.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setInvisibleCheckB1R3() {
        b1r3check.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setInvisibleCheckB1R4() {
        b1r4check.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setInvisibleCheckB1R5() {
        b1r5check.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setInvisibleCheckB1R6() {
        b1r6check.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setInvisibleCheckB1R7() {
        b1r7check.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setInvisibleCheckB1R8() {
        b1r8check.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setInvisibleCheckB1R9() {
        b1r9check.setVisibility(View.INVISIBLE);
    }

    @Override
    public void navigateFragment() {
        blok1Presenter.saveData(b1r6.getText().toString(), b1r1.getSelectedItem().toString(), b1r2.getSelectedItem().toString(), b1r3.getSelectedItem().toString(), String.valueOf(b1r4.getCheckedRadioButtonId()), b1r5.getText().toString(), b1r6.getText().toString(), b1r7.getText().toString(), b1r8jalan.getText().toString(), b1r9.getSelectedItem().toString());
        ((QuestionnaireActivityImp) getActivity()).navigateFragmentToBlok2();
    }

    public void initiateCheck() {
        b1r1check.setVisibility(View.INVISIBLE);
        b1r2check.setVisibility(View.INVISIBLE);
        b1r3check.setVisibility(View.INVISIBLE);
        b1r4check.setVisibility(View.INVISIBLE);
        b1r5check.setVisibility(View.INVISIBLE);
        b1r6check.setVisibility(View.INVISIBLE);
        b1r7check.setVisibility(View.INVISIBLE);
        b1r8check.setVisibility(View.INVISIBLE);
        b1r9check.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.b1_button_next) {
            blok1Presenter.validateAll();
        }
    }
}
