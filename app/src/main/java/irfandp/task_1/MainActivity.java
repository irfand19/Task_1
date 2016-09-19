package irfandp.task_1;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button_clr, button_del;
    EditText edt1, edt2,edt_temp;
    int a,b,c;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button_clr = (Button) findViewById(R.id.button_clr);
        button_del = (Button) findViewById(R.id.button_del);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        tv1 = (TextView) findViewById(R.id.tv1);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(this);
        edt1.setOnClickListener(this);
        edt2.setOnClickListener(this);
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button_clr.setOnClickListener(this);
        button_del.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (getCurrentFocus()==edt1){
            edt_temp = edt1;
        } else if (getCurrentFocus()==edt2){
            edt_temp = edt2;
        }

        int start = edt_temp.getSelectionStart();
        switch (v.getId()) {
            case R.id.button0:
                btn(start,"0");
                break;

            case R.id.button1:
                btn(start,"1");
                break;

            case R.id.button2:
                btn(start,"2");
                break;

            case R.id.button3:
                btn(start,"3");
                break;

            case R.id.button4:
                btn(start,"4");
                break;

            case R.id.button5:
                btn(start,"5");
                break;

            case R.id.button6:
                btn(start,"6");
                break;

            case R.id.button7:
                btn(start,"7");
                break;

            case R.id.button8:
                btn(start,"8");
                break;

            case R.id.button9:
                btn(start,"9");
                break;

            case R.id.button_clr:
                edt_temp.setText("");
                break;

            case R.id.button_del:
                if (start > 0) {
                    edt_temp.setText(edt_temp.getText().delete(start - 1, start));
                    edt_temp.setSelection(start - 1);
                }
                break;

            case R.id.fab:
                String A = edt1.getText().toString();
                String B = edt2.getText().toString();
                if ((A.isEmpty()) && (B.isEmpty())){
                    Toast.makeText(this, "Mohon isi data terlebih dahulu", Toast.LENGTH_LONG).show();
                } else if (A.isEmpty()) {
                    Toast.makeText(this, "Mohon isi data income terlebih dahulu", Toast.LENGTH_LONG).show();
                } else if (B.isEmpty()){
                    Toast.makeText(this, "Mohon isi data outcome terlebih dahulu", Toast.LENGTH_LONG).show();
                } else {
                    a = Integer.parseInt(String.valueOf(edt1.getText()));
                    b = Integer.parseInt(String.valueOf(edt2.getText()));
                    c = a - b;
                    tv1.setText("Balance : " + c);
                }
                break;
        }
    }

    public void btn(int start,String s){
        edt_temp.setText(edt_temp.getText().insert(start, s));
        edt_temp.setSelection(start + 1);
    }
}

