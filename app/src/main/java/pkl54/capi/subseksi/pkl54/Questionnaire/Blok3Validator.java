package pkl54.capi.subseksi.pkl54.Questionnaire;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import pkl54.capi.subseksi.pkl54.R;

/**
 * Created by EKI on 18/02/2015.
 */
public class Blok3Validator {
    private Context context;
    private WidgetValidation wv;
    private boolean[] valid = new boolean[14];
    private String[] peringatan = new String[14];

    public Blok3Validator(Context context) {
        this.context = context;
        wv = new WidgetValidation();
    }

    public boolean validateB3r1(EditText data) {
        if (wv.validateEditText(data)) {
            valid[0] = true;
        } else {
            valid[0] = false;
        }
        return valid[0];
    }

    public boolean validateB3r2(RadioGroup radioGroup) {
        if (wv.validateRadioButton(radioGroup)) {
            valid[1] = true;
        } else {
            valid[1] = false;
        }
        return valid[1];
    }

    public boolean validateB3r3(EditText data) {
        if (wv.validateEditText(data)) {
            if (Integer.parseInt(data.getText().toString()) < 150) {
                valid[2] = true;
            } else valid[2] = false;
        } else {
            valid[2] = false;
        }
        return valid[2];
    }

    public boolean validateB3r4(EditText data1, EditText data2) {
        if (wv.validateEditText(data1) && wv.validateEditText(data2)) {
            valid[3] = true;
        } else {
            valid[3] = false;
        }
        return valid[3];
    }

    public boolean validateB3r5(EditText data1, EditText data2) {
        if (wv.validateEditText(data1) && wv.validateEditText(data2)) {
            valid[4] = true;
        } else {
            valid[4] = false;
        }
        return valid[4];
    }

    public boolean validateB3r6(Spinner spinner) {
        if (wv.validateSpinner(spinner)) {
            valid[5] = true;
        } else {
            valid[5] = false;
        }
        return valid[5];
    }

    public boolean validateB3r7(Spinner spinner) {
        if (wv.validateSpinner(spinner)) {
            valid[6] = true;
        } else {
            valid[6] = false;
        }
        return valid[6];
    }

    public boolean validateB3r8(RadioGroup radioGroup1,
                                RadioGroup radioGroup2,
                                RadioGroup radioGroup3,
                                RadioGroup radioGroup4,
                                RadioGroup radioGroups
    ) {
        if (wv.validateRadioButton(radioGroup1) &&
                wv.validateRadioButton(radioGroup2) &&
                wv.validateRadioButton(radioGroup3) &&
                wv.validateRadioButton(radioGroup4) &&
                wv.validateRadioButton(radioGroups)
                ) {
            valid[7] = true;
        } else {
            valid[7] = false;
        }
        return valid[7];
    }

    public boolean validateB3r9(EditText data, int select) {
        if (!data.isEnabled() && select != R.id.b3r8s2_rb_1 && select != -1) {
            valid[8] = true;
        } else {
            if (wv.validateEditText(data)) {
                valid[8] = true;
            } else {
                valid[8] = false;
            }
        }
        return valid[8];
    }

    public boolean validateB3r10(Spinner spinner, EditText data) {
        if (!spinner.isEnabled() && !data.isEnabled() && valid[8]) {
            valid[9] = true;
        } else {
            if (wv.validateSpinner(spinner)) {
                valid[9] = true;
            } else {
                valid[9] = false;
            }
        }
        return valid[9];
    }

    public boolean validateB3r11(Spinner spinner) {
        if (wv.validateSpinner(spinner)) {
            valid[10] = true;
        } else {
            valid[10] = false;
        }
        return valid[10];
    }

    public boolean validateB3r12(Spinner spinner) {
        if (wv.validateSpinner(spinner)) {
            valid[11] = true;
        } else {
            valid[11] = false;
        }
        return valid[11];
    }

    public boolean validateB3r13(Spinner spinner) {
        if (wv.validateSpinner(spinner)) {
            valid[12] = true;
        } else {
            valid[12] = false;
        }
        return valid[12];
    }

    public boolean validateB3r14(Spinner spinner) {
        if (wv.validateSpinner(spinner)) {
            valid[13] = true;
        } else {
            valid[13] = false;
        }
        return valid[13];
    }

    public boolean validateAll() {
        if (valid[0] &&
                valid[1] &&
                valid[2] &&
                valid[3] &&
                valid[4] &&
                valid[5] &&
                valid[6] &&
                valid[7] &&
                valid[8] &&
                valid[9] &&
                valid[10] &&
                valid[11] &&
                valid[12] &&
                valid[13]) {
            return true;
        } else {
            showPeringatan();
            return false;
        }
    }

    public void showPeringatan() {
        for (int i = 0; i < valid.length; i++) {

            if (valid[i]) {
                peringatan[i] = "";
            } else {
                peringatan[i] = "Rincian " + (i + 1) + " belum diisi\n";
            }

        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < peringatan.length; i++) {
            if (peringatan[i] != null) {
                s.append(peringatan[i]);
            }
        }
        AlertDialog.Builder warning = new AlertDialog.Builder(context);
        warning.setMessage(s);
        warning.setTitle("Isian belum lengkap");
        warning.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        warning.create().show();
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < valid.length; i++) {
            s += i + ". " + String.valueOf(valid[i]) + "\n";
        }
        return s;
    }


}

