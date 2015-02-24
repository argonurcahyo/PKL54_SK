package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityView.QuestionnaireActivityImp;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.AutoSave;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4BController;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4BValidator;
import pkl54.capi.subseksi.pkl54.R;


public class Blok4BFragment extends Fragment implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    private Spinner b4r44_sp, b4r45_sp, b4r46_sp, b4r47_sp, b4r48_sp, b4r49_sp, b4r50_sp, b4r51_sp, b4r52_sp, b4r53_sp, b4r54_sp, b4r55_sp, b4r56_sp;
    private LinearLayout b4r44_ll, b4r45_ll, b4r46_ll, b4r47_ll, b4r48_ll, b4r49_ll, b4r50_ll, b4r51_ll, b4r52_ll, b4r53_ll, b4r54_ll, b4r55_ll, b4r56_ll;
    private Button b4_b_next;
    private RelativeLayout b4r44_rl, b4r45_rl, b4r46_rl, b4r47_rl, b4r48_rl, b4r49_rl, b4r50_rl, b4r51_rl, b4r52_rl, b4r53_rl, b4r54_rl, b4r55_rl, b4r56_rl;

    private ArrayAdapter<String> adapterIsi;
    private View view;
    private AutoSave as;

    private Blok4BController controller;

    private String[] value = new String[13];

    Blok4BValidator validator;

    public Blok4BFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blok4_b, container, false);

        init();

        return view;
    }

    public void init() {

        b4r44_sp = (Spinner) view.findViewById(R.id.b4r44_spinner);
        b4r45_sp = (Spinner) view.findViewById(R.id.b4r45_spinner);
        b4r46_sp = (Spinner) view.findViewById(R.id.b4r46_spinner);
        b4r47_sp = (Spinner) view.findViewById(R.id.b4r47_spinner);
        b4r48_sp = (Spinner) view.findViewById(R.id.b4r48_spinner);
        b4r49_sp = (Spinner) view.findViewById(R.id.b4r49_spinner);
        b4r50_sp = (Spinner) view.findViewById(R.id.b4r50_spinner);
        b4r51_sp = (Spinner) view.findViewById(R.id.b4r51_spinner);
        b4r52_sp = (Spinner) view.findViewById(R.id.b4r52_spinner);
        b4r53_sp = (Spinner) view.findViewById(R.id.b4r53_spinner);
        b4r54_sp = (Spinner) view.findViewById(R.id.b4r54_spinner);
        b4r55_sp = (Spinner) view.findViewById(R.id.b4r55_spinner);
        b4r56_sp = (Spinner) view.findViewById(R.id.b4r56_spinner);

        as = new AutoSave(getActivity());

        b4_b_next = (Button) view.findViewById(R.id.b4_button_next);

        b4r44_ll = (LinearLayout) view.findViewById(R.id.b4r44_linearlayout);
        b4r45_ll = (LinearLayout) view.findViewById(R.id.b4r45_linearlayout);
        b4r46_ll = (LinearLayout) view.findViewById(R.id.b4r46_linearlayout);
        b4r47_ll = (LinearLayout) view.findViewById(R.id.b4r47_linearlayout);
        b4r48_ll = (LinearLayout) view.findViewById(R.id.b4r48_linearlayout);
        b4r49_ll = (LinearLayout) view.findViewById(R.id.b4r49_linearlayout);
        b4r50_ll = (LinearLayout) view.findViewById(R.id.b4r50_linearlayout);
        b4r51_ll = (LinearLayout) view.findViewById(R.id.b4r51_linearlayout);
        b4r52_ll = (LinearLayout) view.findViewById(R.id.b4r52_linearlayout);
        b4r53_ll = (LinearLayout) view.findViewById(R.id.b4r53_linearlayout);
        b4r54_ll = (LinearLayout) view.findViewById(R.id.b4r54_linearlayout);
        b4r55_ll = (LinearLayout) view.findViewById(R.id.b4r55_linearlayout);
        b4r56_ll = (LinearLayout) view.findViewById(R.id.b4r56_linearlayout);

        b4r44_rl = (RelativeLayout) view.findViewById(R.id.b4r44_relativelayout_check);
        b4r45_rl = (RelativeLayout) view.findViewById(R.id.b4r45_relativelayout_check);
        b4r46_rl = (RelativeLayout) view.findViewById(R.id.b4r46_relativelayout_check);
        b4r47_rl = (RelativeLayout) view.findViewById(R.id.b4r47_relativelayout_check);
        b4r48_rl = (RelativeLayout) view.findViewById(R.id.b4r48_relativelayout_check);
        b4r49_rl = (RelativeLayout) view.findViewById(R.id.b4r49_relativelayout_check);
        b4r50_rl = (RelativeLayout) view.findViewById(R.id.b4r50_relativelayout_check);
        b4r51_rl = (RelativeLayout) view.findViewById(R.id.b4r51_relativelayout_check);
        b4r52_rl = (RelativeLayout) view.findViewById(R.id.b4r52_relativelayout_check);
        b4r53_rl = (RelativeLayout) view.findViewById(R.id.b4r53_relativelayout_check);
        b4r54_rl = (RelativeLayout) view.findViewById(R.id.b4r54_relativelayout_check);
        b4r55_rl = (RelativeLayout) view.findViewById(R.id.b4r55_relativelayout_check);
        b4r56_rl = (RelativeLayout) view.findViewById(R.id.b4r56_relativelayout_check);

        b4r44_rl.setVisibility(View.INVISIBLE);
        b4r45_rl.setVisibility(View.INVISIBLE);
        b4r46_rl.setVisibility(View.INVISIBLE);
        b4r47_rl.setVisibility(View.INVISIBLE);
        b4r48_rl.setVisibility(View.INVISIBLE);
        b4r49_rl.setVisibility(View.INVISIBLE);
        b4r50_rl.setVisibility(View.INVISIBLE);
        b4r51_rl.setVisibility(View.INVISIBLE);
        b4r52_rl.setVisibility(View.INVISIBLE);
        b4r53_rl.setVisibility(View.INVISIBLE);
        b4r54_rl.setVisibility(View.INVISIBLE);
        b4r55_rl.setVisibility(View.INVISIBLE);
        b4r56_rl.setVisibility(View.INVISIBLE);

        b4r44_sp.setOnItemSelectedListener(this);
        b4r45_sp.setOnItemSelectedListener(this);
        b4r46_sp.setOnItemSelectedListener(this);
        b4r47_sp.setOnItemSelectedListener(this);
        b4r48_sp.setOnItemSelectedListener(this);
        b4r49_sp.setOnItemSelectedListener(this);
        b4r50_sp.setOnItemSelectedListener(this);
        b4r51_sp.setOnItemSelectedListener(this);
        b4r52_sp.setOnItemSelectedListener(this);
        b4r53_sp.setOnItemSelectedListener(this);
        b4r54_sp.setOnItemSelectedListener(this);
        b4r55_sp.setOnItemSelectedListener(this);
        b4r56_sp.setOnItemSelectedListener(this);

        b4_b_next.setOnClickListener(this);

        adapterIsi = new ArrayAdapter<String>(getActivity(), R.layout.b4_spinner_layout, getResources().getStringArray(R.array.frekuensiKegiatan));

        b4r44_sp.setAdapter(adapterIsi);
        b4r45_sp.setAdapter(adapterIsi);
        b4r46_sp.setAdapter(adapterIsi);
        b4r47_sp.setAdapter(adapterIsi);
        b4r48_sp.setAdapter(adapterIsi);
        b4r49_sp.setAdapter(adapterIsi);
        b4r50_sp.setAdapter(adapterIsi);
        b4r51_sp.setAdapter(adapterIsi);
        b4r52_sp.setAdapter(adapterIsi);
        b4r53_sp.setAdapter(adapterIsi);
        b4r54_sp.setAdapter(adapterIsi);
        b4r55_sp.setAdapter(adapterIsi);
        b4r56_sp.setAdapter(adapterIsi);

        validator = new Blok4BValidator(getActivity());

        validator.validateB4R44(b4r44_sp);
        validator.validateB4R45(b4r45_sp);
        validator.validateB4R46(b4r46_sp);
        validator.validateB4R47(b4r47_sp);
        validator.validateB4R48(b4r48_sp);
        validator.validateB4R49(b4r49_sp);
        validator.validateB4R50(b4r50_sp);
        validator.validateB4R51(b4r51_sp);
        validator.validateB4R52(b4r52_sp);
        validator.validateB4R53(b4r53_sp);
        validator.validateB4R54(b4r54_sp);
        validator.validateB4R55(b4r55_sp);
        validator.validateB4R56(b4r56_sp);

        AutoSave();

    }

    @Override
    public void onClick(View v) {
        if (validator.validateAll()) {
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
        controller = new Blok4BController();
        String nks = ((QuestionnaireActivityImp) getActivity()).loadPrefsString("NKS");
        controller.saveBlok4B(nks, getValue());
    }

    public String[] getValue() {
        value[0] = String.valueOf(as.loadPrefsInt("b4r44"));
        value[1] = String.valueOf(as.loadPrefsInt("b4r45"));
        value[2] = String.valueOf(as.loadPrefsInt("b4r46"));
        value[3] = String.valueOf(as.loadPrefsInt("b4r47"));
        value[4] = String.valueOf(as.loadPrefsInt("b4r48"));
        value[5] = String.valueOf(as.loadPrefsInt("b4r49"));
        value[6] = String.valueOf(as.loadPrefsInt("b4r50"));
        value[7] = String.valueOf(as.loadPrefsInt("b4r51"));
        value[8] = String.valueOf(as.loadPrefsInt("b4r52"));
        value[9] = String.valueOf(as.loadPrefsInt("b4r53"));
        value[10] = String.valueOf(as.loadPrefsInt("b4r54"));
        value[11] = String.valueOf(as.loadPrefsInt("b4r55"));
        value[12] = String.valueOf(as.loadPrefsInt("b4r56"));
        return value;
    }

    public void navigateFragment() {
        ((QuestionnaireActivityImp) getActivity()).navigateFragmentToBlok4C();
    }

    private void AutoSave() {
        b4r44_sp = as.getB4r44(b4r44_sp);
        b4r45_sp = as.getB4r45(b4r45_sp);
        b4r46_sp = as.getB4r46(b4r46_sp);
        b4r47_sp = as.getB4r47(b4r47_sp);
        b4r48_sp = as.getB4r48(b4r48_sp);
        b4r49_sp = as.getB4r49(b4r49_sp);
        b4r50_sp = as.getB4r50(b4r50_sp);
        b4r51_sp = as.getB4r51(b4r51_sp);
        b4r52_sp = as.getB4r52(b4r52_sp);
        b4r53_sp = as.getB4r53(b4r53_sp);
        b4r54_sp = as.getB4r54(b4r54_sp);
        b4r55_sp = as.getB4r55(b4r55_sp);
        b4r56_sp = as.getB4r56(b4r56_sp);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if (parent == b4r44_sp) {
            if (validator.validateB4R44(b4r44_sp)) {
                b4r44_rl.setVisibility(View.VISIBLE);
                as.saveB4r44(position);
            } else {
                b4r44_rl.setVisibility(View.GONE);
            }
        }

        if (parent == b4r45_sp) {
            if (validator.validateB4R45(b4r45_sp)) {
                b4r45_rl.setVisibility(View.VISIBLE);
                as.saveB4r45(position);
            } else {
                b4r45_rl.setVisibility(View.GONE);
            }
        }

        if (parent == b4r46_sp) {
            if (validator.validateB4R46(b4r46_sp)) {
                b4r46_rl.setVisibility(View.VISIBLE);
                as.saveB4r46(position);
            } else {
                b4r46_rl.setVisibility(View.GONE);
            }
        }

        if (parent == b4r47_sp) {
            if (validator.validateB4R47(b4r47_sp)) {
                b4r47_rl.setVisibility(View.VISIBLE);
                as.saveB4r47(position);
            } else {
                b4r47_rl.setVisibility(View.GONE);
            }
        }

        if (parent == b4r48_sp) {
            if (validator.validateB4R48(b4r48_sp)) {
                b4r48_rl.setVisibility(View.VISIBLE);
                as.saveB4r48(position);
            } else {
                b4r48_rl.setVisibility(View.GONE);
            }
        }

        if (parent == b4r49_sp) {
            if (validator.validateB4R49(b4r49_sp)) {
                b4r49_rl.setVisibility(View.VISIBLE);
                as.saveB4r49(position);
            } else {
                b4r49_rl.setVisibility(View.GONE);
            }
        }

        if (parent == b4r50_sp) {
            if (validator.validateB4R50(b4r50_sp)) {
                b4r50_rl.setVisibility(View.VISIBLE);
                as.saveB4r50(position);
            } else {
                b4r50_rl.setVisibility(View.GONE);
            }
        }

        if (parent == b4r51_sp) {
            if (validator.validateB4R51(b4r51_sp)) {
                b4r51_rl.setVisibility(View.VISIBLE);
                as.saveB4r51(position);
            } else {
                b4r51_rl.setVisibility(View.GONE);
            }
        }

        if (parent == b4r52_sp) {
            if (validator.validateB4R52(b4r52_sp)) {
                b4r52_rl.setVisibility(View.VISIBLE);
                as.saveB4r52(position);
            } else {
                b4r52_rl.setVisibility(View.GONE);
            }
        }

        if (parent == b4r53_sp) {
            if (validator.validateB4R53(b4r53_sp)) {
                b4r53_rl.setVisibility(View.VISIBLE);
                as.saveB4r53(position);
            } else {
                b4r53_rl.setVisibility(View.GONE);
            }
        }

        if (parent == b4r54_sp) {
            if (validator.validateB4R54(b4r54_sp)) {
                b4r54_rl.setVisibility(View.VISIBLE);
                as.saveB4r54(position);
            } else {
                b4r54_rl.setVisibility(View.GONE);
            }
        }

        if (parent == b4r55_sp) {
            if (validator.validateB4R55(b4r55_sp)) {
                b4r55_rl.setVisibility(View.VISIBLE);
                as.saveB4r55(position);
            } else {
                b4r55_rl.setVisibility(View.GONE);
            }
        }

        if (parent == b4r56_sp) {
            if (validator.validateB4R56(b4r56_sp)) {
                b4r56_rl.setVisibility(View.VISIBLE);
                as.saveB4r56(position);
            } else {
                b4r56_rl.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

