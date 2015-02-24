package pkl54.capi.subseksi.pkl54.Questionnaire;

import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

/**
 * Created by EKI on 18/02/2015.
 */
public class WidgetValidation {
    public boolean validateEditText(EditText data) {
        if (data.getText().toString().length() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateSpinner(Spinner spinner) {
        if (spinner.getSelectedItemPosition() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateRadioButton(RadioGroup radioGroup) {
        if (radioGroup.getCheckedRadioButtonId() != -1) {
            return true;
        } else {
            return false;
        }
    }
}
