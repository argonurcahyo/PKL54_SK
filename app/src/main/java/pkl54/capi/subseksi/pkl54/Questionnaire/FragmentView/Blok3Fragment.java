package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityView.QuestionnaireActivityImp;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.AutoSave;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok3Controller;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok3Validator;
import pkl54.capi.subseksi.pkl54.R;

/**
 * Created by EKI on 23/02/2015.
 */
public class Blok3Fragment extends Fragment implements RadioGroup.OnCheckedChangeListener, AdapterView.OnItemSelectedListener, View.OnClickListener {
    private View view;
    private Blok3Validator validator;
    private Blok3Controller controller;
    private AutoSave as;

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

    private Button b3_Button_next;

    private String[] value = new String[20];

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_blok3, container, false);
        init();

        return view;
    }

    public void init() {
        validator = new Blok3Validator(getActivity());


        as = new AutoSave(getActivity());

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


        b3_Button_next = (Button) view.findViewById(R.id.b3_button_next);
        b3_Button_next.setOnClickListener(this);

        AutoSave();
    }

    private void AutoSave() {
        b3r1_et = as.getB3r1(b3r1_et);
        b3r2_rg = as.getB3r2(b3r2_rg, b3r2_rb_1, b3r2_rb_2);
        b3r3_et = as.getB3r3(b3r3_et);
        b3r4s1_et = as.getB3r4s1(b3r4s1_et);
        b3r4s2_et = as.getB3r4s2(b3r4s2_et);
        b3r5s1_et = as.getB3r5s1(b3r5s1_et);
        b3r5s2_et = as.getB3r5s2(b3r5s2_et);
        b3r6_sp = as.getB3r6(b3r6_sp);
        b3r7_sp = as.getB3r7(b3r7_sp);
        b3r8s1d1_rg = as.getB3r8s1d1(b3r8s1d1_rg, b3r8s1d1_rb_1, b3r8s1d1_rb_2);
        b3r8s1d2_rg = as.getB3r8s1d2(b3r8s1d2_rg, b3r8s1d2_rb_1, b3r8s1d2_rb_2);
        b3r8s1d3_rg = as.getB3r8s1d3(b3r8s1d3_rg, b3r8s1d3_rb_1, b3r8s1d3_rb_2);
        b3r8s1d4_rg = as.getB3r8s1d4(b3r8s1d4_rg, b3r8s1d4_rb_1, b3r8s1d4_rb_2);
        b3r8s2_rg = as.getB3r8s2(b3r8s2_rg, b3r8s2_rb_1, b3r8s2_rb_2, b3r8s2_rb_3, b3r8s2_rb_4);
        b3r9_et = as.getB3r9(b3r9_et);
        b3r10_sp = as.getB3r10(b3r10_sp);
        b3r11_sp = as.getB3r11(b3r11_sp);
        b3r12_sp = as.getB3r12(b3r12_sp);
        b3r13_sp = as.getB3r13(b3r13_sp);
        b3r14_sp = as.getB3r14(b3r14_sp);
    }

    private void disableB3r1() {
        b3r1_check.setVisibility(View.INVISIBLE);
    }

    private void enableB3r2() {
        b3r2_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r2_rg.setEnabled(true);
        b3r2_rb_1.setEnabled(true);
        b3r2_rb_2.setEnabled(true);
    }

    private void disableB3r2() {
        b3r2_check.setVisibility(View.INVISIBLE);
    }

    private void enableB3r3() {
        b3r3_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r3_et.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r3_et.setEnabled(true);
    }

    private void disableB3r3() {
        b3r3_check.setVisibility(View.INVISIBLE);
    }

    private void enableB3r4() {
        b3r4_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r4s1_et.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r4s2_et.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r4s1_et.setEnabled(true);
        b3r4s2_et.setEnabled(true);

    }

    private void disableB3r4() {
        b3r4_check.setVisibility(View.INVISIBLE);
    }

    private void enableB3r5() {
        b3r5_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r5s1_et.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r5s2_et.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r5s1_et.setEnabled(true);
        b3r5s2_et.setEnabled(true);
    }

    private void disableB3r5() {
        b3r5_check.setVisibility(View.INVISIBLE);
    }

    private void enableB3r6() {
        b3r6_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r6_sp.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r6_sp.setEnabled(true);
    }

    private void disableB3r6() {
        b3r6_check.setVisibility(View.INVISIBLE);
    }

    private void enableB3r7() {
        b3r7_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r7_sp.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r7_sp.setEnabled(true);

    }

    private void disableB3r7() {
        b3r7_check.setVisibility(View.INVISIBLE);
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
        b3r8_check.setVisibility(View.INVISIBLE);
    }

    private void enableB3r9() {
        b3r9_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r9_et.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r9_et.setEnabled(true);
    }

    private void disableB3r9() {
        b3r9_check.setVisibility(View.INVISIBLE);
        b3r9_layout.setBackgroundResource(R.drawable.b3_disable_layout);
        b3r9_et.setBackgroundResource(R.drawable.b3_disable_textfield);
        b3r9_et.setEnabled(false);
        //b3r9_et.setText("");
    }

    private void enableB3r10() {
        b3r10_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r10_sp.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r10_sp.setEnabled(true);
    }

    private void disableB3r10() {
        b3r10_check.setVisibility(View.INVISIBLE);
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
        b3r11_check.setVisibility(View.INVISIBLE);

    }

    private void enableB3r12() {
        b3r12_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r12_sp.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r12_sp.setEnabled(true);
    }

    private void disableB3r12() {
        b3r12_check.setVisibility(View.INVISIBLE);
    }

    private void enableB3r13() {
        b3r13_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r13_sp.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r13_sp.setEnabled(true);
    }

    private void disableB3r13() {
        b3r13_check.setVisibility(View.INVISIBLE);
    }

    private void enableB3r14() {
        b3r14_layout.setBackgroundResource(R.drawable.b3_enable_layout);
        b3r14_sp.setBackgroundResource(R.drawable.b3_enable_textfield);
        b3r14_sp.setEnabled(true);
    }

    private void disableB3r14() {
        b3r14_check.setVisibility(View.INVISIBLE);
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
                as.saveB3r1(b3r1_et.getText().toString());
                if (validator.validateB3r1(b3r1_et)) {
                    enableB3r2();
                    b3r1_check.setVisibility(View.VISIBLE);
                } else {
                    b3r1_check.setVisibility(View.INVISIBLE);
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
                as.saveB3r3(b3r3_et.getText().toString());
                if (validator.validateB3r3(b3r3_et)) {
                    enableB3r4();
                    b3r3_check.setVisibility(View.VISIBLE);
                } else {
                    b3r3_check.setVisibility(View.INVISIBLE);
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
                    as.saveB3r4s1(b3r4s1_et.getText().toString());
                    as.saveB3r4s2(b3r4s2_et.getText().toString());
                    b3r4_check.setVisibility(View.VISIBLE);
                } else {
                    b3r4_check.setVisibility(View.INVISIBLE);
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
                    as.saveB3r5s1(b3r5s1_et.getText().toString());
                    as.saveB3r5s2(b3r5s2_et.getText().toString());
                    b3r5_check.setVisibility(View.VISIBLE);
                } else {
                    b3r5_check.setVisibility(View.INVISIBLE);
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
                if (validator.validateB3r9(b3r9_et, b3r8s1d1_rg.getCheckedRadioButtonId())) {
                    as.saveB3r9(b3r9_et.getText().toString());
                    b3r9_check.setVisibility(View.VISIBLE);
                } else {
                    b3r9_check.setVisibility(View.INVISIBLE);
                }

                if (b3r9_et.getText().toString().length() != 0) {
                    as.saveB3r9(b3r9_et.getText().toString());
                    b3r9_check.setVisibility(View.VISIBLE);
                }
            }
        };
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int index = 0;
        if (group.getId() == R.id.b3r2_rg) {
            if (validator.validateB3r2(group)) {
                enableB3r3();
                //coding fahmi untuk autosave
                if (b3r2_rg.getCheckedRadioButtonId() == R.id.b3r2_rb_1) index = 1;
                else index = 2;

                b3r2_check.setVisibility(View.VISIBLE);
            } else {
                b3r2_check.setVisibility(View.INVISIBLE);
            }
            as.saveB3r2(index);
        }
        if (group.getId() == R.id.b3r8s1d1_rg ||
                group.getId() == R.id.b3r8s1d2_rg ||
                group.getId() == R.id.b3r8s1d3_rg ||
                group.getId() == R.id.b3r8s1d4_rg ||
                group.getId() == R.id.b3r8s2_rg
                ) {

            if (b3r8s1d1_rb_1.isChecked()) {
                enableB3r9();
                enableB3r10();
            } else {
                disableB3r9();
                disableB3r10();
                b3r9_check.setVisibility(View.INVISIBLE);
                b3r10_check.setVisibility(View.INVISIBLE);
            }

            if (validator.validateB3r8(b3r8s1d1_rg, b3r8s1d2_rg, b3r8s1d3_rg, b3r8s1d4_rg, b3r8s2_rg)) {
                //coding fahmi untuk autosave

                int index1 = 0, index2 = 0, index3 = 0, index4 = 0, index5 = 0;

                if (b3r8s1d1_rg.getCheckedRadioButtonId() == R.id.b3r8s1d1_rb_1) index1 = 1;
                else index1 = 2;

                if (b3r8s1d2_rg.getCheckedRadioButtonId() == R.id.b3r8s1d2_rb_1) index2 = 1;
                else index2 = 2;

                if (b3r8s1d3_rg.getCheckedRadioButtonId() == R.id.b3r8s1d3_rb_1) index3 = 1;
                else index3 = 2;

                if (b3r8s1d4_rg.getCheckedRadioButtonId() == R.id.b3r8s1d4_rb_1) index4 = 1;
                else index4 = 2;

                if (b3r8s2_rg.getCheckedRadioButtonId() == R.id.b3r8s2_rb_1) index5 = 1;
                else if (b3r8s2_rg.getCheckedRadioButtonId() == R.id.b3r8s2_rb_2) index5 = 2;
                else if (b3r8s2_rg.getCheckedRadioButtonId() == R.id.b3r8s2_rb_3) index5 = 3;
                else if (b3r8s2_rg.getCheckedRadioButtonId() == R.id.b3r8s2_rb_4) index5 = 4;
                else index5 = 0;

                //Toast.makeText(getActivity(),index1+index2+index3+index4+index5,Toast.LENGTH_LONG).show();

                as.saveB3r8s1d1(index1);
                as.saveB3r8s1d2(index2);
                as.saveB3r8s1d3(index3);
                as.saveB3r8s1d4(index4);
                as.saveB3r8s2(index5);

                b3r8_check.setVisibility(View.VISIBLE);
            } else {
                disableB3r9();
                b3r8_check.setVisibility(View.INVISIBLE);
            }
        }
        if (b3r8s1d1_rb_1.isChecked()) {
            b3r8s2_rb_1.setEnabled(true);
            b3r8s2_rb_1.setVisibility(View.VISIBLE);
        } else {
            b3r8s2_rb_1.setEnabled(false);
            b3r8s2_rb_1.setChecked(false);
            b3r8s2_rb_1.setVisibility(View.INVISIBLE);
        }
        if (b3r8s1d2_rb_1.isChecked()) {
            b3r8s2_rb_2.setEnabled(true);
            b3r8s2_rb_2.setVisibility(View.VISIBLE);
        } else {
            b3r8s2_rb_2.setEnabled(false);
            b3r8s2_rb_2.setChecked(false);
            b3r8s2_rb_2.setVisibility(View.INVISIBLE);
        }
        if (b3r8s1d3_rb_1.isChecked()) {
            b3r8s2_rb_3.setEnabled(true);
            b3r8s2_rb_3.setVisibility(View.VISIBLE);
        } else {
            b3r8s2_rb_3.setEnabled(false);
            b3r8s2_rb_3.setChecked(false);
            b3r8s2_rb_3.setVisibility(View.INVISIBLE);
        }
        if (b3r8s1d4_rb_1.isChecked()) {
            b3r8s2_rb_4.setEnabled(true);
            b3r8s2_rb_4.setVisibility(View.VISIBLE);
        } else {
            b3r8s2_rb_4.setEnabled(false);
            b3r8s2_rb_4.setChecked(false);
            b3r8s2_rb_4.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if (parent.getId() == R.id.b3r6_sp) {
            if (validator.validateB3r6(b3r6_sp)) {
                enableB3r7();
                //coding fahmi ganteng
                as.saveB3r6(position);

                b3r6_check.setVisibility(View.VISIBLE);
            } else {
                b3r6_check.setVisibility(View.INVISIBLE);
            }
        }
        if (parent.getId() == R.id.b3r7_sp) {
            if (validator.validateB3r7(b3r7_sp)) {
                enableB3r8();
                //coding fahmi ganteng
                as.saveB3r7(position);

                b3r7_check.setVisibility(View.VISIBLE);
            } else {
                b3r7_check.setVisibility(View.INVISIBLE);
            }
        }
        if (parent.getId() == R.id.b3r10_sp) {
            if (validator.validateB3r10(b3r10_sp, b3r9_et)) {
                enableB3r11();
                //coding fahmi ganteng
                as.saveB3r10(position);


                b3r10_check.setVisibility(View.VISIBLE);
            } else {
                b3r10_check.setVisibility(View.INVISIBLE);
            }
        }
        if (parent.getId() == R.id.b3r11_sp) {
            if (validator.validateB3r11(b3r11_sp)) {
                enableB3r12();
                //coding fahmi ganteng
                as.saveB3r11(position);

                b3r11_check.setVisibility(View.VISIBLE);
            } else {
                b3r11_check.setVisibility(View.INVISIBLE);
            }
        }
        if (parent.getId() == R.id.b3r12_sp) {
            if (validator.validateB3r12(b3r12_sp)) {
                enableB3r13();
                //coding fahmi ganteng
                as.saveB3r12(position);

                b3r12_check.setVisibility(View.VISIBLE);
            } else {
                b3r12_check.setVisibility(View.INVISIBLE);
            }
        }
        if (parent.getId() == R.id.b3r13_sp) {
            if (validator.validateB3r13(b3r13_sp)) {
                enableB3r14();
                //coding fahmi ganteng
                as.saveB3r13(position);

                b3r13_check.setVisibility(View.VISIBLE);
            } else {
                b3r13_check.setVisibility(View.INVISIBLE);
            }
        }
        if (parent.getId() == R.id.b3r14_sp) {
            if (validator.validateB3r14(b3r14_sp)) {
                b3r14_check.setVisibility(View.VISIBLE);
                //coding fahmi ganteng
                as.saveB3r14(position);

            } else {
                b3r14_check.setVisibility(View.INVISIBLE);
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void showSummary() {

        AlertDialog.Builder summary = new AlertDialog.Builder(getActivity());
        summary.setMessage(
                " 1. Nama : " + getValue()[0] + "\n" +
                        " 2. JK : " + getValue()[1] + "\n" +
                        " 3. Umur : " + getValue()[2] + "\n" +
                        " 4. Tempat lahir : " + getValue()[4] + getValue()[3] + "\n" +
                        " 5. Tempat tinggal : " + getValue()[6] + getValue()[5] + "\n" +
                        " 6. Status kawin : " + getValue()[7] + "\n" +
                        " 7. Ijazah : " + getValue()[8] + "\n" +
                        " 8. Kegiatan : " + getValue()[9] + getValue()[10] + getValue()[11] + getValue()[12] + getValue()[13] + "\n" +
                        " 9. Lapangan usaha : " + getValue()[14] + "\n" +
                        "10. Status dlm pekerjaan : " + getValue()[15] + "\n" +
                        "11. Status tempat tinggal : " + getValue()[16] + "\n" +
                        "12. Jenis atap : " + getValue()[17] + "\n" +
                        "13. Jenis dinding : " + getValue()[18] + "\n" +
                        "14. Jenis lantai : " + getValue()[19] + "\n\n" +
                        "Anda yakin akan menyimpan?"
        );
        summary.setCancelable(true);
        summary.setTitle("Summary Blok 3");
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
                savetoDB();
                navigateFragment();
                //cuma ngecek blok3 doang, nanti dihapus
            }
        });
        summary.create().show();
    }

    private void navigateFragment() {
        ((QuestionnaireActivityImp) getActivity()).navigateFragmentToBlok4A1();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.b3_button_next) {

            validator.validateB3r1(b3r1_et);
            validator.validateB3r2(b3r2_rg);
            validator.validateB3r3(b3r3_et);
            validator.validateB3r4(b3r4s1_et, b3r4s2_et);
            validator.validateB3r5(b3r5s1_et, b3r5s2_et);
            validator.validateB3r6(b3r6_sp);
            validator.validateB3r7(b3r7_sp);
            validator.validateB3r8(b3r8s1d1_rg, b3r8s1d2_rg, b3r8s1d3_rg, b3r8s1d4_rg, b3r8s2_rg);
            validator.validateB3r9(b3r9_et, b3r8s1d1_rg.getCheckedRadioButtonId());
            validator.validateB3r10(b3r10_sp, b3r9_et);
            validator.validateB3r11(b3r11_sp);
            validator.validateB3r12(b3r12_sp);
            validator.validateB3r13(b3r13_sp);
            validator.validateB3r14(b3r14_sp);

            if (validator.validateAll()) {
                showSummary();
            } else {
                new AlertDialog.Builder(getActivity()).setMessage("Ada yang salah").create().show();
            }
        }
    }

    public void savetoDB() {
        controller = new Blok3Controller();
        String nks = ((QuestionnaireActivityImp) getActivity()).loadPrefsString("NKS");
        controller.saveBlok3(nks, getValue());
    }

    public String[] getValue() {
        value[0] = b3r1_et.getText().toString();

        if (b3r2_rg.getCheckedRadioButtonId() == R.id.b3r2_rb_1) {
            value[1] = "1";
        } else if (b3r2_rg.getCheckedRadioButtonId() == R.id.b3r2_rb_2) {
            value[1] = "2";
        }

        value[2] = b3r3_et.getText().toString();
        value[3] = b3r4s1_et.getText().toString();
        value[4] = b3r4s2_et.getText().toString();
        value[5] = b3r5s2_et.getText().toString();
        value[6] = b3r5s1_et.getText().toString();
        value[7] = String.valueOf(b3r6_sp.getSelectedItemPosition());
        value[8] = String.valueOf(b3r7_sp.getSelectedItemPosition());

        if (b3r8s1d1_rg.getCheckedRadioButtonId() == R.id.b3r8s1d1_rb_1) {
            value[9] = "1";
        } else if (b3r8s1d1_rg.getCheckedRadioButtonId() == R.id.b3r8s1d1_rb_2) {
            value[9] = "2";
        }

        if (b3r8s1d2_rg.getCheckedRadioButtonId() == R.id.b3r8s1d2_rb_1) {
            value[10] = "1";
        } else if (b3r8s1d2_rg.getCheckedRadioButtonId() == R.id.b3r8s1d2_rb_2) {
            value[10] = "2";
        }

        if (b3r8s1d3_rg.getCheckedRadioButtonId() == R.id.b3r8s1d3_rb_1) {
            value[11] = "1";
        } else if (b3r8s1d3_rg.getCheckedRadioButtonId() == R.id.b3r8s1d3_rb_2) {
            value[11] = "2";
        }

        if (b3r8s1d4_rg.getCheckedRadioButtonId() == R.id.b3r8s1d4_rb_1) {
            value[12] = "1";
        } else if (b3r8s1d4_rg.getCheckedRadioButtonId() == R.id.b3r8s1d4_rb_2) {
            value[12] = "2";
        }

        if (b3r8s2_rg.getCheckedRadioButtonId() == R.id.b3r8s2_rb_1) {
            value[13] = "1";
        } else if (b3r8s2_rg.getCheckedRadioButtonId() == R.id.b3r8s2_rb_2) {
            value[13] = "2";
        } else if (b3r8s2_rg.getCheckedRadioButtonId() == R.id.b3r8s2_rb_3) {
            value[13] = "3";
        } else if (b3r8s2_rg.getCheckedRadioButtonId() == R.id.b3r8s2_rb_4) {
            value[13] = "4";
        }

        if (b3r8s1d1_rb_1.isChecked()) {
            value[14] = b3r9_et.getText().toString();
            value[15] = String.valueOf(b3r10_sp.getSelectedItemPosition());
        } else {
            value[14] = "";
            value[15] = "";
        }

        value[16] = String.valueOf(b3r11_sp.getSelectedItemPosition());
        value[17] = String.valueOf(b3r12_sp.getSelectedItemPosition());
        value[18] = String.valueOf(b3r13_sp.getSelectedItemPosition());
        value[19] = String.valueOf(b3r14_sp.getSelectedItemPosition());

        return value;
    }


}
