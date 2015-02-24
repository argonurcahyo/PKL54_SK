package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by EKI on 23/02/2015.
 */
public class AutoSave {
    Context ct;

    public AutoSave(Context ct) {
        this.ct = ct;
    }

    public void savePrefs(String key, String value) {
        SharedPreferences sp = PreferenceManager
                .getDefaultSharedPreferences(ct);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString(key, value);
        edit.commit();

    }

    public String loadPrefsString(String key) {
        SharedPreferences sp = PreferenceManager
                .getDefaultSharedPreferences(ct);
        return sp.getString(key, "");
    }

    public void savePrefs(String key, int value) {
        SharedPreferences sp = PreferenceManager
                .getDefaultSharedPreferences(ct);
        SharedPreferences.Editor edit = sp.edit();
        edit.putInt(key, value);
        edit.commit();

    }

    public int loadPrefsInt(String key) {
        SharedPreferences sp = PreferenceManager
                .getDefaultSharedPreferences(ct);
        return sp.getInt(key, 0);
    }

    public void savePrefs(String key, float value) {
        SharedPreferences sp = PreferenceManager
                .getDefaultSharedPreferences(ct);
        SharedPreferences.Editor edit = sp.edit();
        edit.putFloat(key, value);
        edit.commit();

    }

    public float loadPrefsfloat(String key) {
        SharedPreferences sp = PreferenceManager
                .getDefaultSharedPreferences(ct);
        return sp.getFloat(key, 0);
    }

    public Spinner getB1r1(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b1r1"));
        return spinner;
    }

    public void saveB1r1(int index) {
        savePrefs("b1r1", index);
    }

    public Spinner getB1r2(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b1r2"));
        if (loadPrefsInt("b1r2") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB1r2(int index) {
        savePrefs("b1r2", index);
    }

    public Spinner getB1r3(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b1r3"));
        if (loadPrefsInt("b1r3") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB1r3(int index) {
        savePrefs("b1r3", index);
    }

    public RadioGroup getB1r4(RadioGroup radioGroup, RadioButton desa,
                              RadioButton kelurahan) {
        if (loadPrefsInt("b1r4") == 0)
            radioGroup.clearCheck();
        else if (loadPrefsInt("b1r4") == 1)
            radioGroup.check(desa.getId());
        else
            radioGroup.check(kelurahan.getId());

        return radioGroup;
    }

    public void saveB1r4(int index) {
        savePrefs("b1r4", index);
    }

    public EditText getB1r5(EditText editText) {
        editText.setText(loadPrefsString("b1r5"));
        return editText;
    }

    public void saveB1r5(String value) {
        savePrefs("b1r5", value);
    }

    public EditText getB1r6(EditText editText) {
        editText.setText(loadPrefsString("b1r6"));
        return editText;
    }

    public void saveB1r6(String value) {
        savePrefs("b1r6", value);
    }

    public EditText getB1r7(EditText editText) {
        editText.setText(loadPrefsString("b1r7"));
        return editText;
    }

    public void saveB1r7(String value) {
        savePrefs("b1r7", value);
    }

    public EditText getB1r8(EditText editText) {
        editText.setText(loadPrefsString("b1r8"));
        return editText;
    }

    public void saveB1r8(String value) {
        savePrefs("b1r8", value);
    }

    public EditText getB1r9(EditText editText) {
        editText.setText(loadPrefsString("b1r9"));
        return editText;
    }

    public void saveB1r9(String value) {
        savePrefs("b1r9", value);
    }

    public Spinner getB1r10(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b1r10"));
        if (loadPrefsInt("b1r10") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB1r10(int index) {
        savePrefs("b1r10", index);
    }

    public EditText getB3r1(EditText editText) {
        editText.setText(loadPrefsString("b3r1"));
        return editText;
    }

    public void saveB3r1(String value) {
        savePrefs("b3r1", value);
    }

    public RadioGroup getB3r2(RadioGroup radioGroup, RadioButton laki,
                              RadioButton perempuan) {
        if (loadPrefsInt("b3r2") == 0)
            radioGroup.clearCheck();
        else if (loadPrefsInt("b3r2") == 1)
            radioGroup.check(laki.getId());
        else
            radioGroup.check(perempuan.getId());

        return radioGroup;
    }

    public void saveB3r2(int index) {
        savePrefs("b3r2", index);
    }

    public EditText getB3r3(EditText editText) {
        editText.setText(loadPrefsString("b3r3"));
        return editText;
    }

    public void saveB3r3(String value) {
        savePrefs("b3r3", value);
    }

    public EditText getB3r4s1(EditText editText) {
        editText.setText(loadPrefsString("b3r4s1"));
        return editText;
    }

    public void saveB3r4s1(String value) {
        savePrefs("b3r4s1", value);
    }

    public EditText getB3r4s2(EditText editText) {
        editText.setText(loadPrefsString("b3r4s2"));
        return editText;
    }

    public void saveB3r4s2(String value) {
        savePrefs("b3r4s2", value);
    }

    public EditText getB3r5s1(EditText editText) {
        editText.setText(loadPrefsString("b3r5s1"));
        return editText;
    }

    public void saveB3r5s1(String value) {

        savePrefs("b3r5s1", value);
    }

    public EditText getB3r5s2(EditText editText) {
        editText.setText(loadPrefsString("b3r5s2"));
        return editText;
    }

    public void saveB3r5s2(String value) {
        savePrefs("b3r5s2", value);
    }

    public Spinner getB3r6(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b3r6"));
        if (loadPrefsInt("b3r6") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB3r6(int value) {
        savePrefs("b3r6", value);
    }

    public Spinner getB3r7(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b3r7"));
        if (loadPrefsInt("b3r7") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB3r7(int value) {
        savePrefs("b3r7", value);
    }

    public RadioGroup getB3r8s1d1(RadioGroup radioGroup, RadioButton ya,
                                  RadioButton tidak) {
        if (loadPrefsInt("b3r8s1d1") == 0)
            radioGroup.clearCheck();
        else if (loadPrefsInt("b3r8s1d1") == 1)
            radioGroup.check(ya.getId());
        else
            radioGroup.check(tidak.getId());

        return radioGroup;
    }

    public void saveB3r8s1d1(int value) {
        savePrefs("b3r8s1d1", value);
    }

    public RadioGroup getB3r8s1d2(RadioGroup radioGroup, RadioButton ya,
                                  RadioButton tidak) {
        if (loadPrefsInt("b3r8s1d2") == 0)
            radioGroup.clearCheck();
        else if (loadPrefsInt("b3r8s1d2") == 1)
            radioGroup.check(ya.getId());
        else
            radioGroup.check(tidak.getId());

        return radioGroup;
    }

    public void saveB3r8s1d2(int value) {
        savePrefs("b3r8s1d2", value);
    }

    public RadioGroup getB3r8s1d3(RadioGroup radioGroup, RadioButton ya,
                                  RadioButton tidak) {
        if (loadPrefsInt("b3r8s1d3") == 0)
            radioGroup.clearCheck();
        else if (loadPrefsInt("b3r8s1d3") == 1)
            radioGroup.check(ya.getId());
        else
            radioGroup.check(tidak.getId());

        return radioGroup;
    }

    public void saveB3r8s1d3(int value) {
        savePrefs("b3r8s1d3", value);
    }

    public RadioGroup getB3r8s1d4(RadioGroup radioGroup, RadioButton ya,
                                  RadioButton tidak) {
        if (loadPrefsInt("b3r8s1d4") == 0)
            radioGroup.clearCheck();
        else if (loadPrefsInt("b3r8s1d4") == 1)
            radioGroup.check(ya.getId());
        else
            radioGroup.check(tidak.getId());

        return radioGroup;
    }

    public void saveB3r8s1d4(int value) {
        savePrefs("b3r8s1d4", value);
    }

    public RadioGroup getB3r8s2(RadioGroup radioGroup, RadioButton satu,
                                RadioButton dua, RadioButton tiga, RadioButton empat) {
        if (loadPrefsInt("b3r8s2") == 0)
            radioGroup.clearCheck();
        else if (loadPrefsInt("b3r8s2") == 1)
            radioGroup.check(satu.getId());
        else if (loadPrefsInt("b3r8s2") == 2)
            radioGroup.check(dua.getId());
        else if (loadPrefsInt("b3r8s2") == 3)
            radioGroup.check(tiga.getId());
        else if (loadPrefsInt("b3r8s2") == 4)
            radioGroup.check(empat.getId());

        return radioGroup;
    }

    public void saveB3r8s2(int value) {
        savePrefs("b3r8s2", value);
    }

    public EditText getB3r9(EditText editText) {
        editText.setText(loadPrefsString("b3r9"));
        return editText;
    }

    public void saveB3r9(String value) {
        savePrefs("b3r9", value);
    }

    public Spinner getB3r10(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b3r10"));
        if (loadPrefsInt("b3r10") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB3r10(int index) {
        savePrefs("b3r10", index);
    }

    public Spinner getB3r11(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b3r11"));
        if (loadPrefsInt("b3r11") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB3r11(int index) {
        savePrefs("b3r11", index);
    }

    public Spinner getB3r12(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b3r12"));
        if (loadPrefsInt("b3r12") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB3r12(int index) {
        savePrefs("b3r12", index);
    }

    public Spinner getB3r13(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b3r13"));
        if (loadPrefsInt("b3r13") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB3r13(int index) {
        savePrefs("b3r13", index);
    }

    public Spinner getB3r14(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b3r14"));
        if (loadPrefsInt("b3r14") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB3r14(int index) {
        savePrefs("b3r14", index);
    }

    public RatingBar getB4r1(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r1"));
        return ratingBar;
    }

    public void saveB4r1(float value) {
        savePrefs("b4r1", value);
    }

    public RatingBar getB4r2(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r2"));
        return ratingBar;
    }

    public void saveB4r2(float value) {
        savePrefs("b4r2", value);
    }

    public RatingBar getB4r3(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r3"));
        return ratingBar;
    }

    public void saveB4r3(float value) {
        savePrefs("b4r3", value);
    }

    public RatingBar getB4r4(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r4"));
        return ratingBar;
    }

    public void saveB4r4(float value) {
        savePrefs("b4r4", value);
    }

    public RatingBar getB4r5(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r5"));
        return ratingBar;
    }

    public void saveB4r5(float value) {
        savePrefs("b4r5", value);
    }

    public RatingBar getB4r6(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r6"));
        return ratingBar;
    }

    public void saveB4r6(float value) {
        savePrefs("b4r6", value);
    }

    public RatingBar getB4r7(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r7"));
        return ratingBar;
    }

    public void saveB4r7(float value) {
        savePrefs("b4r7", value);
    }

    public RatingBar getB4r8(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r8"));
        return ratingBar;
    }

    public void saveB4r8(float value) {
        savePrefs("b4r8", value);
    }

    public RatingBar getB4r9(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r9"));
        return ratingBar;
    }

    public void saveB4r9(float value) {
        savePrefs("b4r9", value);
    }

    public RatingBar getB4r10(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r10"));
        return ratingBar;
    }

    public void saveB4r10(float value) {
        savePrefs("b4r10", value);
    }

    public RatingBar getB4r11(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r11"));
        return ratingBar;
    }

    public void saveB4r11(float value) {
        savePrefs("b4r11", value);
    }

    public RatingBar getB4r12(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r12"));
        return ratingBar;
    }

    public void saveB4r12(float value) {
        savePrefs("b4r12", value);
    }

    public RatingBar getB4r13(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r13"));
        return ratingBar;
    }

    public void saveB4r13(float value) {
        savePrefs("b4r13", value);
    }

    public RatingBar getB4r14(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r14"));
        return ratingBar;
    }

    public void saveB4r14(float value) {
        savePrefs("b4r14", value);
    }

    public RatingBar getB4r15(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r15"));
        return ratingBar;
    }

    public void saveB4r15(float value) {
        savePrefs("b4r15", value);
    }

    public RatingBar getB4r16(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r16"));
        return ratingBar;
    }

    public void saveB4r16(float value) {
        savePrefs("b4r16", value);
    }

    public RatingBar getB4r17(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r17"));
        return ratingBar;
    }

    public void saveB4r17(float value) {
        savePrefs("b4r17", value);
    }

    public RatingBar getB4r18(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r18"));
        return ratingBar;
    }

    public void saveB4r18(float value) {
        savePrefs("b4r18", value);
    }

    public RatingBar getB4r19(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r19"));
        return ratingBar;
    }

    public void saveB4r19(float value) {
        savePrefs("b4r19", value);
    }

    public RatingBar getB4r20(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r20"));
        return ratingBar;
    }

    public void saveB4r20(float value) {
        savePrefs("b4r20", value);
    }

    public RatingBar getB4r21(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r21"));
        return ratingBar;
    }

    public void saveB4r21(float value) {
        savePrefs("b4r21", value);
    }

    public RatingBar getB4r22(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r22"));
        return ratingBar;
    }

    public void saveB4r22(float value) {
        savePrefs("b4r22", value);
    }

    public RatingBar getB4r23(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r23"));
        return ratingBar;
    }

    public void saveB4r23(float value) {
        savePrefs("b4r23", value);
    }

    public RatingBar getB4r24(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r24"));
        return ratingBar;
    }

    public void saveB4r24(float value) {
        savePrefs("b4r24", value);
    }

    public RatingBar getB4r25(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r25"));
        return ratingBar;
    }

    public void saveB4r25(float value) {
        savePrefs("b4r25", value);
    }

    public RatingBar getB4r26(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r26"));
        return ratingBar;
    }

    public void saveB4r26(float value) {
        savePrefs("b4r26", value);
    }

    public RatingBar getB4r27(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r27"));
        return ratingBar;
    }

    public void saveB4r27(float value) {
        savePrefs("b4r27", value);
    }

    public RatingBar getB4r28(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r28"));
        return ratingBar;
    }

    public void saveB4r28(float value) {
        savePrefs("b4r28", value);
    }

    public RatingBar getB4r29(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r29"));
        return ratingBar;
    }

    public void saveB4r29(float value) {
        savePrefs("b4r29", value);
    }

    public RatingBar getB4r30(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r30"));
        return ratingBar;
    }

    public void saveB4r30(float value) {
        savePrefs("b4r30", value);
    }

    public RatingBar getB4r31(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r31"));
        return ratingBar;
    }

    public void saveB4r31(float value) {
        savePrefs("b4r31", value);
    }

    public RatingBar getB4r32(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r32"));
        return ratingBar;
    }

    public void saveB4r32(float value) {
        savePrefs("b4r32", value);
    }

    public RatingBar getB4r33(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r33"));
        return ratingBar;
    }

    public void saveB4r33(float value) {
        savePrefs("b4r33", value);
    }

    public RatingBar getB4r34(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r34"));
        return ratingBar;
    }

    public void saveB4r34(float value) {
        savePrefs("b4r34", value);
    }

    public RatingBar getB4r35(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r35"));
        return ratingBar;
    }

    public void saveB4r35(float value) {
        savePrefs("b4r35", value);
    }

    public RatingBar getB4r36(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r36"));
        return ratingBar;
    }

    public void saveB4r36(float value) {
        savePrefs("b4r36", value);
    }

    public RatingBar getB4r37(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r37"));
        return ratingBar;
    }

    public void saveB4r37(float value) {
        savePrefs("b4r37", value);
    }

    public RatingBar getB4r38(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r38"));
        return ratingBar;
    }

    public void saveB4r38(float value) {
        savePrefs("b4r38", value);
    }

    public RatingBar getB4r39(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r39"));
        return ratingBar;
    }

    public void saveB4r39(float value) {
        savePrefs("b4r39", value);
    }

    public RatingBar getB4r40(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r40"));
        return ratingBar;
    }

    public void saveB4r40(float value) {
        savePrefs("b4r40", value);
    }

    public RatingBar getB4r41(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r41"));
        return ratingBar;
    }

    public void saveB4r41(float value) {
        savePrefs("b4r41", value);
    }

    public RatingBar getB4r42(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r42"));
        return ratingBar;
    }

    public void saveB4r42(float value) {
        savePrefs("b4r42", value);
    }

    public RatingBar getB4r43(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r43"));
        return ratingBar;
    }

    public void saveB4r43(float value) {
        savePrefs("b4r43", value);
    }

    public Spinner getB4r44(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b4r44"));
        if (loadPrefsInt("b4r44") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB4r44(int value) {
        savePrefs("b4r44", value);
    }

    public Spinner getB4r45(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b4r45"));
        if (loadPrefsInt("b4r45") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB4r45(int value) {
        savePrefs("b4r45", value);
    }

    public Spinner getB4r46(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b4r46"));
        if (loadPrefsInt("b4r46") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB4r46(int value) {
        savePrefs("b4r46", value);
    }

    public Spinner getB4r47(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b4r47"));
        if (loadPrefsInt("b4r47") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB4r47(int value) {
        savePrefs("b4r47", value);
    }

    public Spinner getB4r48(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b4r48"));
        if (loadPrefsInt("b4r48") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB4r48(int value) {
        savePrefs("b4r48", value);
    }

    public Spinner getB4r49(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b4r49"));
        if (loadPrefsInt("b4r49") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB4r49(int value) {
        savePrefs("b4r49", value);
    }

    public Spinner getB4r50(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b4r50"));
        if (loadPrefsInt("b4r50") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB4r50(int value) {
        savePrefs("b4r50", value);
    }

    public Spinner getB4r51(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b4r51"));
        if (loadPrefsInt("b4r51") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB4r51(int value) {
        savePrefs("b4r51", value);
    }

    public Spinner getB4r52(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b4r52"));
        if (loadPrefsInt("b4r52") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB4r52(int value) {
        savePrefs("b4r52", value);
    }

    public Spinner getB4r53(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b4r53"));
        if (loadPrefsInt("b4r53") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB4r53(int value) {
        savePrefs("b4r53", value);
    }

    public Spinner getB4r54(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b4r54"));
        if (loadPrefsInt("b4r54") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB4r54(int value) {
        savePrefs("b4r54", value);
    }

    public Spinner getB4r55(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b4r55"));
        if (loadPrefsInt("b4r55") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB4r55(int value) {
        savePrefs("b4r55", value);
    }

    public Spinner getB4r56(Spinner spinner) {
        spinner.setSelection(loadPrefsInt("b4r56"));
        if (loadPrefsInt("b4r56") == 0)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.VISIBLE);
        return spinner;
    }

    public void saveB4r56(int value) {
        savePrefs("b4r56", value);
    }

    // stop
    public RatingBar getB4r57(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r57"));
        return ratingBar;
    }

    public void saveB4r57(float value) {
        savePrefs("b4r57", value);
    }

    public RatingBar getB4r58(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r58"));
        return ratingBar;
    }

    public void saveB4r58(float value) {
        savePrefs("b4r58", value);
    }

    public RatingBar getB4r59(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r59"));
        return ratingBar;
    }

    public void saveB4r59(float value) {
        savePrefs("b4r59", value);
    }

    public RatingBar getB4r60(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r60"));
        return ratingBar;
    }

    public void saveB4r60(float value) {
        savePrefs("b4r60", value);
    }

    public RatingBar getB4r61(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r61"));
        return ratingBar;
    }

    public void saveB4r61(float value) {
        savePrefs("b4r61", value);
    }

    public RatingBar getB4r62(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r62"));
        return ratingBar;
    }

    public void saveB4r62(float value) {
        savePrefs("b4r62", value);
    }

    public RatingBar getB4r63(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r63"));
        return ratingBar;
    }

    public void saveB4r63(float value) {
        savePrefs("b4r63", value);
    }

    public RatingBar getB4r64(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r64"));
        return ratingBar;
    }

    public void saveB4r64(float value) {
        savePrefs("b4r64", value);
    }

    public RatingBar getB4r65(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r65"));
        return ratingBar;
    }

    public void saveB4r65(float value) {
        savePrefs("b4r65", value);
    }

    public RatingBar getB4r66(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r66"));
        return ratingBar;
    }

    public void saveB4r66(float value) {
        savePrefs("b4r66", value);
    }

    public RatingBar getB4r67(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r67"));
        return ratingBar;
    }

    public void saveB4r67(float value) {
        savePrefs("b4r67", value);
    }

    public RatingBar getB4r68(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r68"));
        return ratingBar;
    }

    public void saveB4r68(float value) {
        savePrefs("b4r68", value);
    }

    public RatingBar getB4r69(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r69"));
        return ratingBar;
    }

    public void saveB4r69(float value) {
        savePrefs("b4r69", value);
    }

    public RatingBar getB4r70(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r70"));
        return ratingBar;
    }

    public void saveB4r70(float value) {
        savePrefs("b4r70", value);
    }

    public RatingBar getB4r71(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r71"));
        return ratingBar;
    }

    public void saveB4r71(float value) {
        savePrefs("b4r71", value);
    }

    public RatingBar getB4r72(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r72"));
        return ratingBar;
    }

    public void saveB4r72(float value) {
        savePrefs("b4r72", value);
    }

    public RatingBar getB4r73(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r73"));
        return ratingBar;
    }

    public void saveB4r73(float value) {
        savePrefs("b4r73", value);
    }

    public RatingBar getB4r74(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r74"));
        return ratingBar;
    }

    public void saveB4r74(float value) {
        savePrefs("b4r74", value);
    }

    public RatingBar getB4r75(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r75"));
        return ratingBar;
    }

    public void saveB4r75(float value) {
        savePrefs("b4r75", value);
    }

    public RatingBar getB4r76(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r76"));
        return ratingBar;
    }

    public void saveB4r76(float value) {
        savePrefs("b4r76", value);
    }

    public RatingBar getB4r77(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r77"));
        return ratingBar;
    }

    public void saveB4r77(float value) {
        savePrefs("b4r77", value);
    }

    public RatingBar getB4r78(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r78"));
        return ratingBar;
    }

    public void saveB4r78(float value) {
        savePrefs("b4r78", value);
    }

    public RatingBar getB4r79(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r79"));
        return ratingBar;
    }

    public void saveB4r79(float value) {
        savePrefs("b4r79", value);
    }

    public RatingBar getB4r80(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r80"));
        return ratingBar;
    }

    public void saveB4r80(float value) {
        savePrefs("b4r80", value);
    }

    public RatingBar getB4r81(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r81"));
        return ratingBar;
    }

    public void saveB4r81(float value) {
        savePrefs("b4r81", value);
    }

    public RatingBar getB4r82(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r82"));
        return ratingBar;
    }

    public void saveB4r82(float value) {
        savePrefs("b4r82", value);
    }

    public RatingBar getB4r83(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r83"));
        return ratingBar;
    }

    public void saveB4r83(float value) {
        savePrefs("b4r83", value);
    }

    public RatingBar getB4r84(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r84"));
        return ratingBar;
    }

    public void saveB4r84(float value) {
        savePrefs("b4r84", value);
    }

    public RatingBar getB4r85(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r85"));
        return ratingBar;
    }

    public void saveB4r85(float value) {
        savePrefs("b4r85", value);
    }

    public RatingBar getB4r86(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r86"));
        return ratingBar;
    }

    public void saveB4r86(float value) {
        savePrefs("b4r86", value);
    }

    public RatingBar getB4r87(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r87"));
        return ratingBar;
    }

    public void saveB4r87(float value) {
        savePrefs("b4r87", value);
    }

    public RatingBar getB4r88(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r88"));
        return ratingBar;
    }

    public void saveB4r88(float value) {
        savePrefs("b4r88", value);
    }

    public RatingBar getB4r89(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r89"));
        return ratingBar;
    }

    public void saveB4r89(float value) {
        savePrefs("b4r89", value);
    }

    public RatingBar getB4r90(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r90"));
        return ratingBar;
    }

    public void saveB4r90(float value) {
        savePrefs("b4r90", value);
    }

    public RatingBar getB4r91(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r91"));
        return ratingBar;
    }

    public void saveB4r91(float value) {
        savePrefs("b4r91", value);
    }

    public RatingBar getB4r92(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r92"));
        return ratingBar;
    }

    public void saveB4r92(float value) {
        savePrefs("b4r92", value);
    }

    public RatingBar getB4r93(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r93"));
        return ratingBar;
    }

    public void saveB4r93(float value) {
        savePrefs("b4r93", value);
    }

    public RatingBar getB4r94(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r94"));
        return ratingBar;
    }

    public void saveB4r94(float value) {
        savePrefs("b4r94", value);
    }

    public RatingBar getB4r95(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r95"));
        return ratingBar;
    }

    public void saveB4r95(float value) {
        savePrefs("b4r95", value);
    }

    public RatingBar getB4r96(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r96"));
        return ratingBar;
    }

    public void saveB4r96(float value) {
        savePrefs("b4r96", value);
    }

    public RatingBar getB4r97(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r97"));
        return ratingBar;
    }

    public void saveB4r97(float value) {
        savePrefs("b4r97", value);
    }

    public RatingBar getB4r98(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r98"));
        return ratingBar;
    }

    public void saveB4r98(float value) {
        savePrefs("b4r98", value);
    }

    public RatingBar getB4r99(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r99"));
        return ratingBar;
    }

    public void saveB4r99(float value) {
        savePrefs("b4r99", value);
    }

    public RatingBar getB4r100(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r100"));
        return ratingBar;
    }

    public void saveB4r100(float value) {
        savePrefs("b4r100", value);
    }

    public RatingBar getB4r101(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r101"));
        return ratingBar;
    }

    public void saveB4r101(float value) {
        savePrefs("b4r101", value);
    }

    public RatingBar getB4r102(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r102"));
        return ratingBar;
    }

    public void saveB4r102(float value) {
        savePrefs("b4r102", value);
    }

    public RatingBar getB4r103(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r103"));
        return ratingBar;
    }

    public void saveB4r103(float value) {
        savePrefs("b4r103", value);
    }

    public RatingBar getB4r104(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r104"));
        return ratingBar;
    }

    public void saveB4r104(float value) {
        savePrefs("b4r104", value);
    }

    public RatingBar getB4r105(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r105"));
        return ratingBar;
    }

    public void saveB4r105(float value) {
        savePrefs("b4r105", value);
    }

    public RatingBar getB4r106(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r106"));
        return ratingBar;
    }

    public void saveB4r106(float value) {
        savePrefs("b4r106", value);
    }

    public RatingBar getB4r107(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r107"));
        return ratingBar;
    }

    public void saveB4r107(float value) {
        savePrefs("b4r107", value);
    }

    public RatingBar getB4r108(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r108"));
        return ratingBar;
    }

    public void saveB4r108(float value) {
        savePrefs("b4r108", value);
    }

    public RatingBar getB4r109(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r109"));
        return ratingBar;
    }

    public void saveB4r109(float value) {
        savePrefs("b4r109", value);
    }

    public RatingBar getB4r110(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r110"));
        return ratingBar;
    }

    public void saveB4r110(float value) {
        savePrefs("b4r110", value);
    }

    public RatingBar getB4r111(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r111"));
        return ratingBar;
    }

    public void saveB4r111(float value) {
        savePrefs("b4r111", value);
    }

    public RatingBar getB4r112(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r112"));
        return ratingBar;
    }

    public void saveB4r112(float value) {
        savePrefs("b4r112", value);
    }

    public RatingBar getB4r113(RatingBar ratingBar) {
        ratingBar.setRating(loadPrefsfloat("b4r113"));
        return ratingBar;
    }

    public void saveB4r113(float value) {
        savePrefs("b4r113", value);
    }

    public TextView getB4r1_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r1"));
        return textview;
    }

    public TextView getB4r2_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r2"));
        return textview;
    }

    public TextView getB4r3_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r3"));
        return textview;
    }

    public TextView getB4r4_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r4"));
        return textview;
    }

    public TextView getB4r5_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r5"));
        return textview;
    }

    public TextView getB4r6_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r6"));
        return textview;
    }

    public TextView getB4r7_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r7"));
        return textview;
    }

    public TextView getB4r8_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r8"));
        return textview;
    }

    public TextView getB4r9_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r9"));
        return textview;
    }

    public TextView getB4r10_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r10"));
        return textview;
    }

    public TextView getB4r11_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r11"));
        return textview;
    }

    public TextView getB4r12_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r12"));
        return textview;
    }

    public TextView getB4r13_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r13"));
        return textview;
    }

    public TextView getB4r14_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r14"));
        return textview;
    }

    public TextView getB4r15_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r15"));
        return textview;
    }

    public TextView getB4r16_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r16"));
        return textview;
    }

    public TextView getB4r17_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r17"));
        return textview;
    }

    public TextView getB4r18_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r18"));
        return textview;
    }

    public TextView getB4r19_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r19"));
        return textview;
    }

    public TextView getB4r20_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r20"));
        return textview;
    }

    public TextView getB4r21_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r21"));
        return textview;
    }

    public TextView getB4r22_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r22"));
        return textview;
    }

    public TextView getB4r23_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r23"));
        return textview;
    }

    public TextView getB4r24_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r24"));
        return textview;
    }

    public TextView getB4r25_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r25"));
        return textview;
    }

    public TextView getB4r26_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r26"));
        return textview;
    }

    public TextView getB4r27_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r27"));
        return textview;
    }

    public TextView getB4r28_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r28"));
        return textview;
    }

    public TextView getB4r29_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r29"));
        return textview;
    }

    public TextView getB4r30_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r30"));
        return textview;
    }

    public TextView getB4r31_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r31"));
        return textview;
    }

    public TextView getB4r32_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r32"));
        return textview;
    }

    public TextView getB4r33_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r33"));
        return textview;
    }

    public TextView getB4r34_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r34"));
        return textview;
    }

    public TextView getB4r35_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r35"));
        return textview;
    }

    public TextView getB4r36_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r36"));
        return textview;
    }

    public TextView getB4r37_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r37"));
        return textview;
    }

    public TextView getB4r38_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r38"));
        return textview;
    }

    public TextView getB4r39_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r39"));
        return textview;
    }

    public TextView getB4r40_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r40"));
        return textview;
    }

    public TextView getB4r41_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r41"));
        return textview;
    }

    public TextView getB4r42_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r42"));
        return textview;
    }

    public TextView getB4r43_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r43"));
        return textview;
    }

    public TextView getB4r57_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r57"));
        return textview;
    }

    public TextView getB4r58_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r58"));
        return textview;
    }

    public TextView getB4r59_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r59"));
        return textview;
    }

    public TextView getB4r60_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r60"));
        return textview;
    }

    public TextView getB4r61_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r61"));
        return textview;
    }

    public TextView getB4r62_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r62"));
        return textview;
    }

    public TextView getB4r63_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r63"));
        return textview;
    }

    public TextView getB4r64_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r64"));
        return textview;
    }

    public TextView getB4r65_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r65"));
        return textview;
    }

    public TextView getB4r66_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r66"));
        return textview;
    }

    public TextView getB4r67_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r67"));
        return textview;
    }

    public TextView getB4r68_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r68"));
        return textview;
    }

    public TextView getB4r69_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r69"));
        return textview;
    }

    public TextView getB4r70_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r70"));
        return textview;
    }

    public TextView getB4r71_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r71"));
        return textview;
    }

    public TextView getB4r72_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r72"));
        return textview;
    }

    public TextView getB4r73_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r73"));
        return textview;
    }

    public TextView getB4r74_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r74"));
        return textview;
    }

    public TextView getB4r75_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r75"));
        return textview;
    }

    public TextView getB4r76_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r76"));
        return textview;
    }

    public TextView getB4r77_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r77"));
        return textview;
    }

    public TextView getB4r78_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r78"));
        return textview;
    }

    public TextView getB4r79_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r79"));
        return textview;
    }

    public TextView getB4r80_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r80"));
        return textview;
    }

    public TextView getB4r81_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r81"));
        return textview;
    }

    public TextView getB4r82_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r82"));
        return textview;
    }

    public TextView getB4r83_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r83"));
        return textview;
    }

    public TextView getB4r84_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r84"));
        return textview;
    }

    public TextView getB4r85_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r85"));
        return textview;
    }

    public TextView getB4r86_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r86"));
        return textview;
    }

    public TextView getB4r87_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r87"));
        return textview;
    }

    public TextView getB4r88_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r88"));
        return textview;
    }

    public TextView getB4r89_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r89"));
        return textview;
    }

    public TextView getB4r90_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r90"));
        return textview;
    }

    public TextView getB4r91_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r91"));
        return textview;
    }

    public TextView getB4r92_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r92"));
        return textview;
    }

    public TextView getB4r93_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r93"));
        return textview;
    }

    public TextView getB4r94_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r94"));
        return textview;
    }

    public TextView getB4r95_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r95"));
        return textview;
    }

    public TextView getB4r96_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r96"));
        return textview;
    }

    public TextView getB4r97_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r97"));
        return textview;
    }

    public TextView getB4r98_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r98"));
        return textview;
    }

    public TextView getB4r99_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r99"));
        return textview;
    }

    public TextView getB4r100_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r100"));
        return textview;
    }

    public TextView getB4r101_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r101"));
        return textview;
    }

    public TextView getB4r102_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r102"));
        return textview;
    }

    public TextView getB4r103_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r103"));
        return textview;
    }

    public TextView getB4r104_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r104"));
        return textview;
    }

    public TextView getB4r105_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r105"));
        return textview;
    }

    public TextView getB4r106_Text(TextView textview) {

        textview.setText("" + (int) loadPrefsfloat("b4r106"));
        return textview;
    }

    public TextView getB4r107_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r107"));
        return textview;
    }

    public TextView getB4r108_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r108"));
        return textview;
    }

    public TextView getB4r109_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r109"));
        return textview;
    }

    public TextView getB4r110_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r110"));
        return textview;
    }

    public TextView getB4r111_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r111"));
        return textview;
    }

    public TextView getB4r112_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r112"));
        return textview;
    }

    public TextView getB4r113_Text(TextView textview) {
        textview.setText("" + (int) loadPrefsfloat("b4r113"));
        return textview;
    }

    public RelativeLayout getB4r1_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r1") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r2_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r2") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r3_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r3") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r4_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r4") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r5_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r5") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r6_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r6") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r7_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r7") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r8_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r8") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r9_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r9") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r10_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r10") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r11_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r11") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r12_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r12") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r13_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r13") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r14_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r14") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r15_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r15") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r16_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r16") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r17_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r17") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r18_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r18") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r19_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r19") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r20_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r20") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r21_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r21") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r22_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r22") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r23_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r23") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r24_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r24") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r25_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r25") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r26_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r26") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r27_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r27") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r28_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r28") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r29_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r29") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r30_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r30") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r31_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r31") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r32_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r32") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r33_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r33") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r34_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r34") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r35_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r35") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r36_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r36") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r37_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r37") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r38_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r38") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r39_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r39") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r40_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r40") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r41_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r41") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r42_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r42") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r43_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r43") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }


    public RelativeLayout getB4r57_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r57") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r58_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r58") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r59_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r59") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r60_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r60") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r61_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r61") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r62_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r62") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r63_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r63") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r64_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r64") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r65_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r65") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r66_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r66") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r67_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r67") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r68_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r68") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r69_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r69") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r70_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r70") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r71_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r71") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r72_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r72") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r73_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r73") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r74_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r74") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r75_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r75") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r76_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r76") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r77_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r77") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r78_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r78") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r79_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r79") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r80_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r80") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r81_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r81") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r82_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r82") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r83_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r83") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r84_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r84") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r85_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r85") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r86_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r86") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r87_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r87") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r88_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r88") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r89_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r89") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r90_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r90") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r91_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r91") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r92_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r92") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r93_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r93") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r94_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r94") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r95_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r95") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r96_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r96") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }


    public RelativeLayout getB4r97_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r97") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r98_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r98") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r99_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r99") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r100_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r100") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r101_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r101") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r102_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r102") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r103_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r103") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r104_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r104") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r105_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r105") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r106_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r106") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r107_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r107") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r108_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r108") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r109_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r109") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r110_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r110") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r111_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r111") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r112_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r112") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }

    public RelativeLayout getB4r113_RL(RelativeLayout relativeLayout) {
        if (loadPrefsfloat("b4r113") != 0) {
            relativeLayout.setVisibility(View.VISIBLE);
        } else {
            relativeLayout.setVisibility(View.INVISIBLE);
        }

        return relativeLayout;
    }


    public void clearAll() {
        saveB1r1(0);
        saveB1r2(0);
        saveB1r3(0);
        saveB1r4(0);
        saveB1r5("");
        saveB1r6("");
        saveB1r7("");
        saveB1r8("");
        saveB1r9("");
        saveB1r10(0);
        saveB3r1("");
        saveB3r2(0);
        saveB3r3("");
        saveB3r4s1("");
        saveB3r4s2("");
        saveB3r5s1("");
        saveB3r5s2("");
        saveB3r6(0);
        saveB3r7(0);
        saveB3r8s1d1(0);
        saveB3r8s1d2(0);
        saveB3r8s1d3(0);
        saveB3r8s1d4(0);
        saveB3r8s2(0);
        saveB3r9("");
        saveB3r10(0);
        saveB3r11(0);
        saveB3r12(0);
        saveB3r13(0);
        saveB3r14(0);
        saveB4r1(0);
        saveB4r2(0);
        saveB4r3(0);
        saveB4r4(0);
        saveB4r5(0);
        saveB4r6(0);
        saveB4r7(0);
        saveB4r8(0);
        saveB4r9(0);
        saveB4r10(0);
        saveB4r11(0);
        saveB4r12(0);
        saveB4r13(0);
        saveB4r14(0);
        saveB4r15(0);
        saveB4r16(0);
        saveB4r17(0);
        saveB4r18(0);
        saveB4r19(0);
        saveB4r20(0);
        saveB4r21(0);
        saveB4r22(0);
        saveB4r23(0);
        saveB4r24(0);
        saveB4r25(0);
        saveB4r26(0);
        saveB4r27(0);
        saveB4r28(0);
        saveB4r29(0);
        saveB4r30(0);
        saveB4r31(0);
        saveB4r32(0);
        saveB4r33(0);
        saveB4r34(0);
        saveB4r35(0);
        saveB4r36(0);
        saveB4r37(0);
        saveB4r38(0);
        saveB4r39(0);
        saveB4r40(0);
        saveB4r41(0);
        saveB4r42(0);
        saveB4r43(0);
        saveB4r44(0);
        saveB4r45(0);
        saveB4r46(0);
        saveB4r47(0);
        saveB4r48(0);
        saveB4r49(0);
        saveB4r50(0);
        saveB4r51(0);
        saveB4r52(0);
        saveB4r53(0);
        saveB4r54(0);
        saveB4r55(0);
        saveB4r56(0);
        saveB4r57(0);
        saveB4r58(0);
        saveB4r59(0);
        saveB4r60(0);
        saveB4r61(0);
        saveB4r62(0);
        saveB4r63(0);
        saveB4r64(0);
        saveB4r65(0);
        saveB4r66(0);
        saveB4r67(0);
        saveB4r68(0);
        saveB4r69(0);
        saveB4r70(0);
        saveB4r71(0);
        saveB4r72(0);
        saveB4r73(0);
        saveB4r74(0);
        saveB4r75(0);
        saveB4r76(0);
        saveB4r77(0);
        saveB4r78(0);
        saveB4r79(0);
        saveB4r80(0);
        saveB4r81(0);
        saveB4r82(0);
        saveB4r83(0);
        saveB4r84(0);
        saveB4r85(0);
        saveB4r86(0);
        saveB4r87(0);
        saveB4r88(0);
        saveB4r89(0);
        saveB4r90(0);
        saveB4r91(0);
        saveB4r92(0);
        saveB4r93(0);
        saveB4r94(0);
        saveB4r95(0);
        saveB4r96(0);
        saveB4r97(0);
        saveB4r98(0);
        saveB4r99(0);
        saveB4r100(0);
        saveB4r101(0);
        saveB4r102(0);
        saveB4r103(0);
        saveB4r104(0);
        saveB4r105(0);
        saveB4r106(0);
        saveB4r107(0);
        saveB4r108(0);
        saveB4r109(0);
        saveB4r110(0);
        saveB4r111(0);
        saveB4r112(0);
        saveB4r113(0);

    }

}
