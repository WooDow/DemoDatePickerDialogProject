package tw.leonchen.demodatepickerdialog;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class DemoDatePickerDialogActivity extends AppCompatActivity {

    private TextView tv_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_date_picker_dialog);

        tv_msg = (TextView)findViewById(R.id.tv_msg);

        Calendar c1 = Calendar.getInstance();
        int day = c1.get(Calendar.DAY_OF_MONTH);
        final int month = c1.get(Calendar.MONTH);
        int year = c1.get(Calendar.YEAR);

        DatePickerDialog dialog  = new DatePickerDialog(DemoDatePickerDialogActivity.this,
                                                         android.R.style.Theme_DeviceDefault_Dialog_Alert,
                                                         new DatePickerDialog.OnDateSetListener(){

                                                             @Override
                                                             public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                                                                 tv_msg.setText("Date:" + year + "/" + (month+1) + "/" + day);
                                                             }
                                                         },year, month, day);
        dialog.setTitle("Date Setting:");
        dialog.show();
    }
}
