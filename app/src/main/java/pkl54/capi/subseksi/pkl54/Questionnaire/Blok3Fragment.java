package pkl54.capi.subseksi.pkl54.Questionnaire;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok3Validator;
import pkl54.capi.subseksi.pkl54.R;


public class Blok3Fragment extends Fragment implements RadioGroup.OnCheckedChangeListener, AdapterView.OnItemSelectedListener {
    private View view;
    private Blok3Validator validator;

    private RelativeLayout b3r1_check;
    private RelativeLayout b3r2_check;
    private RelativeLayout b3r3_check;
    private RelativeLayout b3r4_check;
    private RelativeLayout b3r5_check;
    private RelativeLayout b3r6_check;
    private RelativeLayout b3r7_check;
    private RelativeLayout b3r8_check;
    private RelativeLayout b3r9_check;
    private RelativeLayout b3r10_check;
    private RelativeLayout b3r11_check;
    private RelativeLayout b3r12_check;
    private RelativeLayout b3r13_check;
    private RelativeLayout b3r14_check;

    private LinearLayout b3r1_layout;
    private LinearLayout b3r2_layout;
    private LinearLayout b3r3_layout;
    private LinearLayout b3r4_layout;
    private LinearLayout b3r5_layout;
    private LinearLayout b3r6_layout;
    private LinearLayout b3r7_layout;
    private LinearLayout b3r8_layout;
    private LinearLayout b3r9_layout;
    private LinearLayout b3r10_layout;
    private LinearLayout b3r11_layout;
    private LinearLayout b3r12_layout;
    private LinearLayout b3r13_layout;
    private LinearLayout b3r14_layout;

    private EditText b3r1_et;
    private RadioGroup b3r2_rg;
    private RadioButton b3r2_rb_1;
    private RadioButton b3r2_rb_2;
    private EditText b3r3_et;
    private EditText b3r4s1_et;
    private EditText b3r4s2_et;
    private EditText b3r5s1_et;
    private EditText b3r5s2_et;
    private Spinner b3r6_sp;
    private Spinner b3r7_sp;
    private RadioGroup b3r8s1d1_rg;
    private RadioButton b3r8s1d1_rb_1;
    private RadioButton b3r8s1d1_rb_2;
    private RadioGroup b3r8s1d2_rg;
    private RadioButton b3r8s1d2_rb_1;
    private RadioButton b3r8s1d2_rb_2;
    private RadioGroup b3r8s1d3_rg;
    private RadioButton b3r8s1d3_rb_1;
    private RadioButton b3r8s1d3_rb_2;
    private RadioGroup b3r8s1d4_rg;
    private RadioButton b3r8s1d4_rb_1;
    private RadioButton b3r8s1d4_rb_2;
    private RadioGroup b3r8s2_rg;
    private RadioButton b3r8s2_rb_1;
    private RadioButton b3r8s2_rb_2;
    private RadioButton b3r8s2_rb_3;
    private RadioButton b3r8s2_rb_4;
    private EditText b3r9_et;
    private Spinner b3r10_sp;
    private Spinner b3r11_sp;
    private Spinner b3r12_sp;
    private Spinner b3r13_sp;
    private Spinner b3r14_sp;

    private ArrayAdapter<CharSequence> b3r6_aa;
    private ArrayAdapter<CharSequence> b3r7_aa;
    private ArrayAdapter<CharSequence> b3r10_aa;
    private ArrayAdapter<CharSequence> b3r11_aa;
    private ArrayAdapter<CharSequence> b3r12_aa;
    private ArrayAdapter<CharSequence> b3r13_aa;
    private ArrayAdapter<CharSequence> b3r14_aa;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_blok3, container, false);
        init();
        return view;
    }

    public void init() {
        validator = new Blok3Validator(getActivity());

        b3r1_check = (RelativeLayout) view.findViewById(R.id.b3r1_check);
        b3r2_check = (RelativeLayout) view.findViewById(R.id.b3r2_check);
        b3r3_check = (RelativeLayout) view.findViewById(R.id.b3r3_check);
        b3r4_check = (RelativeLayout) view.findViewById(R.id.b3r4_check);
        b3r5_check = (RelativeLayout) view.findViewById(R.id.b3r5_check);
        b3r6_check = (RelativeLayout) view.findViewById(R.id.b3r6_check);
        b3r7_check = (RelativeLayout) view.findViewById(R.id.b3r7_check);
        b3r8_check = (RelativeLayout) view.findViewById(R.id.b3r8_check);
        b3r9_check = (RelativeLayout) view.findViewById(R.id.b3r9_check);
        b3r10_check = (RelativeLayout) view.findViewById(R.id.b3r10_check);
        b3r11_check = (RelativeLayout) view.findViewById(R.id.b3r11_check);
        b3r12_check = (RelativeLayout) view.findViewById(R.id.b3r12_check);
        b3r13_check = (RelativeLayout) view.findViewById(R.id.b3r13_check);
        b3r14_check = (RelativeLayout) view.findViewById(R.id.b3r14_check);

        b3r1_layout = (LinearLayout) view.findViewById(R.id.b3r1_layout);
        b3r2_layout = (LinearLayout) view.findViewById(R.id.b3r2_layout);
        b3r3_layout = (LinearLayout) view.findViewById(R.id.b3r3_layout);
        b3r4_layout = (LinearLayout) view.findViewById(R.id.b3r4_layout);
        b3r5_layout = (LinearLayout) view.findViewById(R.id.b3r5_layout);
        b3r6_layout = (LinearLayout) view.findViewById(R.id.b3r6_layout);
        b3r7_layout = (LinearLayout) view.findViewById(R.id.b3r7_layout);
        b3r8_layout = (LinearLayout) view.findViewById(R.id.b3r8_layout);
        b3r9_layout = (LinearLayout) view.findViewById(R.id.b3r9_layout);
        b3r10_layout = (LinearLayout) view.findViewById(R.id.b3r10_layout);
        b3r11_layout = (LinearLayout) view.findViewById(R.id.b3r11_layout);
        b3r12_layout = (LinearLayout) view.findViewById(R.id.b3r12_layout);
        b3r13_layout = (LinearLayout) view.findViewById(R.id.b3r13_layout);
        b3r14_layout = (LinearLayout) view.findViewById(R.id.b3r14_layout);

        b3r1_et = (EditText) view.findViewById(R.id.b3r1_et);
        b3r2_rg = (RadioGroup) view.findViewById(R.id.b3r2_rg);
        b3r2_rb_1 = (RadioButton) view.findViewById(R.id.b3r2_rb_1);
        b3r2_rb_2 = (RadioButton) view.findViewById(R.id.b3r2_rb_2);
        b3r3_et = (EditText) view.findViewById(R.id.b3r3_et);
        b3r4s1_et = (EditText) view.findViewById(R.id.b3r4s1_et);
        b3r4s2_et = (EditText) view.findViewById(R.id.b3r4s2_et);
        b3r5s1_et = (EditText) view.findViewById(R.id.b3r5s1_et);
        b3r5s2_et = (EditText) view.findViewById(R.id.b3r5s2_et);
        b3r6_sp = (Spinner) view.findViewById(R.id.b3r6_sp);
        b3r7_sp = (Spinner) view.findViewById(R.id.b3r7_sp);
        b3r8s1d1_rg = (RadioGroup) view.findViewById(R.id.b3r8s1d1_rg);
        b3r8s1d1_rb_1 = (RadioButton) view.findViewById(R.id.b3r8s1d1_rb_1);
        b3r8s1d1_rb_2 = (RadioButton) view.findViewById(R.id.b3r8s1d1_rb_2);
        b3r8s1d2_rg = (RadioGroup) view.findViewById(R.id.b3r8s1d2_rg);
        b3r8s1d2_rb_1 = (RadioButton) view.findViewById(R.id.b3r8s1d2_rb_1);
        b3r8s1d2_rb_2 = (RadioButton) view.findViewById(R.id.b3r8s1d2_rb_2);
        b3r8s1d3_rg = (RadioGroup) view.findViewById(R.id.b3r8s1d3_rg);
        b3r8s1d3_rb_1 = (RadioButton) view.findViewById(R.id.b3r8s1d3_rb_1);
        b3r8s1d3_rb_2 = (RadioButton) view.findViewById(R.id.b3r8s1d3_rb_2);
        b3r8s1d4_rg = (RadioGroup) view.findViewById(R.id.b3r8s1d4_rg);
        b3r8s1d4_rb_1 = (RadioButton) view.findViewById(R.id.b3r8s1d4_rb_1);
        b3r8s1d4_rb_2 = (RadioButton) view.findViewById(R.id.b3r8s1d4_rb_2);
        b3r8s2_rg = (RadioGroup) view.findViewById(R.id.b3r8s2_rg);
        b3r8s2_rb_1 = (RadioButton) view.findViewById(R.id.b3r8s2_rb_1);
        b3r8s2_rb_2 = (RadioButton) view.findViewById(R.id.b3r8s2_rb_2);
        b3r8s2_rb_3 = (RadioButton) view.findViewById(R.id.b3r8s2_rb_3);
        b3r8s2_rb_4 = (RadioButton) view.findViewById(R.id.b3r8s2_rb_4);
        b3r9_et = (EditText) view.findViewById(R.id.b3r9_et);
        b3r10_sp = (Spinner) view.findViewById(R.id.b3r10_sp);
        b3r11_sp = (Spinner) view.findViewById(R.id.b3r11_sp);
        b3r12_sp = (Spinner) view.findViewById(R.id.b3r12_sp);
        b3r13_sp = (Spinner) view.findViewById(R.id.b3r13_sp);
        b3r14_sp = (Spinner) view.findViewById(R.id.b3r14_sp);

        b3r6_aa = ArrayAdapter.createFromResource(getActivity(), R.array.b3r6_items, android.R.layout.simple_spinner_item);
        b3r7_aa = ArrayAdapter.createFromResource(getActivity(), R.array.b3r7_items, android.R.layout.simple_spinner_item);
        b3r10_aa = ArrayAdapter.createFromResource(getActivity(), R.array.b3r10_items, android.R.layout.simple_spinner_item);
        b3r11_aa = ArrayAdapter.createFromResource(getActivity(), R.array.b3r11_items, android.R.layout.simple_spinner_item);
        b3r12_aa = ArrayAdapter.createFromResource(getActivity(), R.array.b3r12_items, android.R.layout.simple_spinner_item);
        b3r13_aa = ArrayAdapter.createFromResource(getActivity(), R.array.b3r13_items, android.R.layout.simple_spinner_item);
        b3r14_aa = ArrayAdapter.createFromResource(getActivity(), R.array.b3r14_items, android.R.layout.simple_spinner_item);

        b3r6_aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        b3r7_aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        b3r10_aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        b3r11_aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        b3r12_aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        b3r13_aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        b3r14_aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        b3r6_sp.setAdapter(b3r6_aa);
        b3r7_sp.setAdapter(b3r7_aa);
        b3r10_sp.setAdapter(b3r10_aa);
        b3r11_sp.setAdapter(b3r11_aa);
        b3r12_sp.setAdapter(b3r12_aa);
        b3r13_sp.setAdapter(b3r13_aa);
        b3r14_sp.setAdapter(b3r14_aa);

        disableB3r1();
        disableB3r2();
        disableB3r3();
        disableB3r4();
        disableB3r5();
        disableB3r6();
        disableB3r7();
        disableB3r8();
        disableB3r9();
        disableB3r10();
        disableB3r11();
        disableB3r12();
        disableB3r13();
        disableB3r14();

        b3r1_et.addTextChangedListener(B3r1TextWatcher());
        b3r2_rg.setOnCheckedChangeListener(this);
        b3r3_et.addTextChangedListener(B3r3TextWatcher());
        b3r4s1_et.addTextChangedListener(B3r4TextWatcher());
        b3r4s2_et.addTextChangedListener(B3r4TextWatcher());
        b3r5s1_et.addTextChangedListener(B3r5TextWatcher());
        b3r5s2_et.addTextChangedListener(B3r5TextWatcher());
        b3r6_sp.setOnItemSelectedListener(this);
        b3r7_sp.setOnItemSelectedListener(this);
        b3r8s1d1_rg.setOnCheckedChangeListener(this);
        b3r8s1d2_rg.setOnCheckedChangeListener(this);
        b3r8s1d3_rg.setOnCheckedChangeListener(this);
        b3r8s1d4_rg.setOnCheckedChangeListener(this);
        b3r8s2_rg.setOnCheckedChangeListener(this);
        b3r9_et.addTextChangedListener(b3r9TextWatcher());
        b3r10_sp.setOnItemSelectedListener(this);
        b3r11_sp.setOnItemSelectedListener(this);
        b3r12_sp.setOnItemSelectedListener(this);
        b3r13_sp.setOnItemSelectedListener(this);
        b3r14_sp.setOnItemSelectedListener(this);
    }

    private void disableB3r1() {
        b3r1_check.setVisibility(View.GONE);
    }

    private void enableB3r2() {
        b3r2_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r2_rg.setEnabled(true);
        b3r2_rb_1.setEnabled(true);
        b3r2_rb_2.setEnabled(true);
    }

    private void disableB3r2() {
        b3r2_check.setVisibility(View.GONE);
        b3r2_layout.setBackgroundResource(R.drawable.b3_disable_layout);
        b3r2_rg.setEnabled(false);
        b3r2_rg.clearCheck();
        b3r2_rb_1.setEnabled(false);
        b3r2_rb_2.setEnabled(false);
    }

    private void enableB3r3() {
        b3r3_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r3_et.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r3_et.setEnabled(true);
    }

    private void disableB3r3() {
        b3r3_check.setVisibility(View.GONE);
        b3r3_layout.setBackgroundResource(R.drawable.b3_disable_layout);
        b3r3_et.setBackgroundResource(R.drawable.b3_disable_textfield);
        b3r3_et.setEnabled(false);
        b3r3_et.setText("");
    }

    private void enableB3r4() {
        b3r4_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r4s1_et.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r4s2_et.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r4s1_et.setEnabled(true);
        b3r4s2_et.setEnabled(true);

    }

    private void disableB3r4() {
        b3r4_check.setVisibility(View.GONE);
        b3r4_layout.setBackgroundResource(R.drawable.b3_disable_layout);
        b3r4s1_et.setBackgroundResource(R.drawable.b3_disable_textfield);
        b3r4s2_et.setBackgroundResource(R.drawable.b3_disable_textfield);
        b3r4s1_et.setEnabled(false);
        b3r4s2_et.setEnabled(false);
        b3r4s1_et.setText("");
        b3r4s2_et.setText("");
    }

    private void enableB3r5() {
        b3r5_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r5s1_et.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r5s2_et.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r5s1_et.setEnabled(true);
        b3r5s2_et.setEnabled(true);
    }

    private void disableB3r5() {
        b3r5_check.setVisibility(View.GONE);
        b3r5_layout.setBackgroundResource(R.drawable.b3_disable_layout);
        b3r5s1_et.setBackgroundResource(R.drawable.b3_disable_textfield);
        b3r5s2_et.setBackgroundResource(R.drawable.b3_disable_textfield);
        b3r5s1_et.setEnabled(false);
        b3r5s2_et.setEnabled(false);
        b3r5s1_et.setText("");
        b3r5s2_et.setText("");
    }

    private void enableB3r6() {
        b3r6_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r6_sp.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r6_sp.setEnabled(true);
    }

    private void disableB3r6() {
        b3r6_check.setVisibility(View.GONE);
        b3r6_layout.setBackgroundResource(R.drawable.b3_disable_layout);
        b3r6_sp.setBackgroundResource(R.drawable.b3_disable_textfield);
        b3r6_sp.setEnabled(false);
        b3r6_sp.setSelection(0, true);
    }

    private void enableB3r7() {
        b3r7_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r7_sp.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r7_sp.setEnabled(true);

    }

    private void disableB3r7() {
        b3r7_check.setVisibility(View.GONE);
        b3r7_layout.setBackgroundResource(R.drawable.b3_disable_layout);
        b3r7_sp.setBackgroundResource(R.drawable.b3_disable_textfield);
        b3r7_sp.setEnabled(false);
        b3r7_sp.setSelection(0, true);
    }

    private void enableB3r8() {
        b3r8_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r8s1d1_rg.setEnabled(true);
        b3r8s1d1_rb_1.setEnabled(true);
        b3r8s1d1_rb_2.setEnabled(true);
        b3r8s1d2_rg.setEnabled(true);
        b3r8s1d2_rb_1.setEnabled(true);
        b3r8s1d2_rb_2.setEnabled(true);
        b3r8s1d3_rg.setEnabled(true);
        b3r8s1d3_rb_1.setEnabled(true);
        b3r8s1d3_rb_2.setEnabled(true);
        b3r8s1d4_rg.setEnabled(true);
        b3r8s1d4_rb_1.setEnabled(true);
        b3r8s1d4_rb_2.setEnabled(true);
        b3r8s2_rg.setEnabled(true);
        b3r8s2_rb_1.setEnabled(true);
        b3r8s2_rb_2.setEnabled(true);
        b3r8s2_rb_3.setEnabled(true);
        b3r8s2_rb_4.setEnabled(true);
    }

    private void disableB3r8() {
        b3r8_check.setVisibility(View.GONE);
        b3r8_layout.setBackgroundResource(R.drawable.b3_disable_layout);
        b3r8s1d1_rg.setEnabled(false);
        b3r8s1d1_rb_1.setEnabled(false);
        b3r8s1d1_rb_2.setEnabled(false);
        b3r8s1d2_rg.setEnabled(false);
        b3r8s1d2_rb_1.setEnabled(false);
        b3r8s1d2_rb_2.setEnabled(false);
        b3r8s1d3_rg.setEnabled(false);
        b3r8s1d3_rb_1.setEnabled(false);
        b3r8s1d3_rb_2.setEnabled(false);
        b3r8s1d4_rg.setEnabled(false);
        b3r8s1d4_rb_1.setEnabled(false);
        b3r8s1d4_rb_2.setEnabled(false);
        b3r8s2_rg.setEnabled(false);
        b3r8s2_rb_1.setEnabled(false);
        b3r8s2_rb_2.setEnabled(false);
        b3r8s2_rb_3.setEnabled(false);
        b3r8s2_rb_4.setEnabled(false);

        b3r8s1d1_rg.clearCheck();
        b3r8s1d2_rg.clearCheck();
        b3r8s1d3_rg.clearCheck();
        b3r8s1d4_rg.clearCheck();
        b3r8s2_rg.clearCheck();
    }

    private void enableB3r9() {
        b3r9_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r9_et.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r9_et.setEnabled(true);
    }

    private void disableB3r9() {
        b3r9_check.setVisibility(View.GONE);
        b3r9_layout.setBackgroundResource(R.drawable.b3_disable_layout);
        b3r9_et.setBackgroundResource(R.drawable.b3_disable_textfield);
        b3r9_et.setEnabled(false);
        b3r9_et.setText("");
    }

    private void enableB3r10() {
        b3r10_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r10_sp.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r10_sp.setEnabled(true);
    }

    private void disableB3r10() {
        b3r10_check.setVisibility(View.GONE);
        b3r10_layout.setBackgroundResource(R.drawable.b3_disable_layout);
        b3r10_sp.setBackgroundResource(R.drawable.b3_disable_textfield);
        b3r10_sp.setEnabled(false);
        b3r10_sp.setSelection(0, true);
    }

    private void enableB3r11() {
        b3r11_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r11_sp.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r11_sp.setEnabled(true);
    }

    private void disableB3r11() {
        b3r11_check.setVisibility(View.GONE);
        b3r11_layout.setBackgroundResource(R.drawable.b3_disable_layout);
        b3r11_sp.setBackgroundResource(R.drawable.b3_disable_textfield);
        b3r11_sp.setEnabled(false);
        b3r11_sp.setSelection(0, true);
    }

    private void enableB3r12() {
        b3r12_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r12_sp.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r12_sp.setEnabled(true);
    }

    private void disableB3r12() {
        b3r12_check.setVisibility(View.GONE);
        b3r12_layout.setBackgroundResource(R.drawable.b3_disable_layout);
        b3r12_sp.setBackgroundResource(R.drawable.b3_disable_textfield);
        b3r12_sp.setEnabled(false);
        b3r12_sp.setSelection(0, true);
    }

    private void enableB3r13() {
        b3r13_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r13_sp.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r13_sp.setEnabled(true);
    }

    private void disableB3r13() {
        b3r13_check.setVisibility(View.GONE);
        b3r13_layout.setBackgroundResource(R.drawable.b3_disable_layout);
        b3r13_sp.setBackgroundResource(R.drawable.b3_disable_textfield);
        b3r13_sp.setEnabled(false);
        b3r13_sp.setSelection(0, true);
    }

    private void enableB3r14() {
        b3r14_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r14_sp.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r14_sp.setEnabled(true);
    }

    private void disableB3r14() {
        b3r14_check.setVisibility(View.GONE);
        b3r14_layout.setBackgroundResource(R.drawable.b3_disable_layout);
        b3r14_sp.setBackgroundResource(R.drawable.b3_disable_textfield);
        b3r14_sp.setEnabled(false);
        b3r14_sp.setSelection(0, true);
    }

    private TextWatcher B3r1TextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (validator.validateB3r1(b3r1_et)) {
                    enableB3r2();
                    b3r1_check.setVisibility(View.VISIBLE);
                } else {
                    disableB3r2();
                    b3r1_check.setVisibility(View.GONE);
                }
            }
        };
    }

    private TextWatcher B3r3TextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (validator.validateB3r3(b3r3_et)) {
                    enableB3r4();
                    b3r3_check.setVisibility(View.VISIBLE);
                } else {
                    disableB3r4();
                    b3r3_check.setVisibility(View.GONE);
                }
            }
        };
    }

    private TextWatcher B3r4TextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (validator.validateB3r4(b3r4s1_et, b3r4s2_et)) {
                    enableB3r5();
                    b3r4_check.setVisibility(View.VISIBLE);
                } else {
                    disableB3r5();
                    b3r4_check.setVisibility(View.GONE);
                }

            }
        };
    }

    private TextWatcher B3r5TextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (validator.validateB3r5(b3r5s1_et, b3r5s2_et)) {
                    enableB3r6();
                    b3r5_check.setVisibility(View.VISIBLE);
                } else {
                    disableB3r6();
                    b3r5_check.setVisibility(View.GONE);
                }
            }
        };
    }

    private TextWatcher b3r9TextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (validator.validateB3r9(b3r9_et, b3r8s2_rg.getCheckedRadioButtonId())) {
                    enableB3r10();
                    b3r9_check.setVisibility(View.VISIBLE);
                } else {
                    disableB3r10();
                    b3r9_check.setVisibility(View.GONE);
                }

            }
        };
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (group.getId() == R.id.b3r2_rg) {
            if (validator.validateB3r2(group)) {
                enableB3r3();
                b3r2_check.setVisibility(View.VISIBLE);
            } else {
                disableB3r3();
                b3r2_check.setVisibility(View.GONE);
            }
        }
        if (group.getId() == R.id.b3r8s1d1_rg ||
                group.getId() == R.id.b3r8s1d2_rg ||
                group.getId() == R.id.b3r8s1d3_rg ||
                group.getId() == R.id.b3r8s1d4_rg ||
                group.getId() == R.id.b3r8s2_rg
                ) {
            if (validator.validateB3r8(b3r8s1d1_rg, b3r8s1d2_rg, b3r8s1d3_rg, b3r8s1d4_rg, b3r8s2_rg)) {
                if (b3r8s2_rb_1.isChecked()) {
                    enableB3r9();
                    disableB3r11();
                    b3r11_check.setVisibility(View.GONE);
                } else {
                    enableB3r11();
                    disableB3r9();
                    disableB3r10();
                    b3r9_check.setVisibility(View.GONE);
                    b3r10_check.setVisibility(View.GONE);
                }
                validator.validateB3r9(b3r9_et, group.getCheckedRadioButtonId());
                validator.validateB3r10(b3r10_sp, b3r9_et);
                b3r8_check.setVisibility(View.VISIBLE);
            } else {
                disableB3r9();
                b3r8_check.setVisibility(View.GONE);
            }
        }
        if (b3r8s1d1_rb_1.isChecked()) {
            b3r8s2_rb_1.setEnabled(true);
        } else {
            b3r8s2_rb_1.setEnabled(false);
            b3r8s2_rb_1.setChecked(false);
        }
        if (b3r8s1d2_rb_1.isChecked()) {
            b3r8s2_rb_2.setEnabled(true);
        } else {
            b3r8s2_rb_2.setEnabled(false);
            b3r8s2_rb_2.setChecked(false);
        }
        if (b3r8s1d3_rb_1.isChecked()) {
            b3r8s2_rb_3.setEnabled(true);
        } else {
            b3r8s2_rb_3.setEnabled(false);
            b3r8s2_rb_3.setChecked(false);
        }
        if (b3r8s1d4_rb_1.isChecked()) {
            b3r8s2_rb_4.setEnabled(true);
        } else {
            b3r8s2_rb_4.setEnabled(false);
            b3r8s2_rb_4.setChecked(false);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getId() == R.id.b3r6_sp) {
            if (validator.validateB3r6(b3r6_sp)) {
                enableB3r7();
                b3r6_check.setVisibility(View.VISIBLE);
            } else {
                disableB3r7();
                b3r6_check.setVisibility(View.GONE);
            }
        }
        if (parent.getId() == R.id.b3r7_sp) {
            if (validator.validateB3r7(b3r7_sp)) {
                enableB3r8();
                b3r7_check.setVisibility(View.VISIBLE);
            } else {
                disableB3r8();
                b3r7_check.setVisibility(View.GONE);
            }
        }
        if (parent.getId() == R.id.b3r10_sp) {
            if (validator.validateB3r10(b3r10_sp, b3r9_et)) {
                enableB3r11();
                b3r10_check.setVisibility(View.VISIBLE);
            } else {
                disableB3r11();
                b3r10_check.setVisibility(View.GONE);
            }
        }
        if (parent.getId() == R.id.b3r11_sp) {
            if (validator.validateB3r11(b3r11_sp)) {
                enableB3r12();
                b3r11_check.setVisibility(View.VISIBLE);
            } else {
                disableB3r12();
                b3r11_check.setVisibility(View.GONE);
            }
        }
        if (parent.getId() == R.id.b3r12_sp) {
            if (validator.validateB3r12(b3r12_sp)) {
                enableB3r13();
                b3r12_check.setVisibility(View.VISIBLE);
            } else {
                disableB3r13();
                b3r12_check.setVisibility(View.GONE);
            }
        }
        if (parent.getId() == R.id.b3r13_sp) {
            if (validator.validateB3r13(b3r13_sp)) {
                enableB3r14();
                b3r13_check.setVisibility(View.VISIBLE);
            } else {
                disableB3r14();
                b3r13_check.setVisibility(View.GONE);
            }
        }
        if (parent.getId() == R.id.b3r14_sp) {
            if (validator.validateB3r14(b3r14_sp)) {
                b3r14_check.setVisibility(View.VISIBLE);
            } else {
                b3r14_check.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}