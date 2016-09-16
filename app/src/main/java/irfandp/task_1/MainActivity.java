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
    EditText edt1, edt2;
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


        edt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start1 = edt1.getSelectionStart();
                        edt1.setText(edt1.getText().insert(start1, "1"));
                        edt1.setSelection(start1+1);
                    }
                });

                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start1 = edt1.getSelectionStart();
                        edt1.setText(edt1.getText().insert(start1, "2"));
                        edt1.setSelection(start1 + 1);
                    }
                });

                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start1 = edt1.getSelectionStart();
                        edt1.setText(edt1.getText().insert(start1, "3"));
                        edt1.setSelection(start1 + 1);
                    }
                });

                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start1 = edt1.getSelectionStart();
                        edt1.setText(edt1.getText().insert(start1, "4"));
                        edt1.setSelection(start1 + 1);
                    }
                });

                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start1 = edt1.getSelectionStart();
                        edt1.setText(edt1.getText().insert(start1, "5"));
                        edt1.setSelection(start1 + 1);
                    }
                });

                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start1 = edt1.getSelectionStart();
                        edt1.setText(edt1.getText().insert(start1, "6"));
                        edt1.setSelection(start1 + 1);
                    }
                });

                button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start1 = edt1.getSelectionStart();
                        edt1.setText(edt1.getText().insert(start1, "7"));
                        edt1.setSelection(start1 + 1);
                    }
                });

                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start1 = edt1.getSelectionStart();
                        edt1.setText(edt1.getText().insert(start1, "8"));
                        edt1.setSelection(start1 + 1);
                    }
                });

                button9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start1 = edt1.getSelectionStart();
                        edt1.setText(edt1.getText().insert(start1, "9"));
                        edt1.setSelection(start1 + 1);
                    }
                });

                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start1 = edt1.getSelectionStart();
                        edt1.setText(edt1.getText().insert(start1, "0"));
                        edt1.setSelection(start1 + 1);
                    }
                });

                button_clr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText("");
                    }
                });

                button_del.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        int cursorPosition = edt1.getSelectionStart();
                        if (cursorPosition > 0) {
                            edt1.setText(edt1.getText().delete(cursorPosition - 1, cursorPosition));
                            edt1.setSelection(cursorPosition - 1);
                        }



//                        int start1 = edt1.getSelectionStart();
//                        String str = edt1.getText().toString();
//                        if (str.length() >= 1) {
//                            str = str.substring(0, start1 - 1);
//                            edt1.setText(str);
//                            edt1.setSelection(start1 + 1);
//                        } else if (str.length() <= 1) {
//                            edt1.setText("0");
//                            edt1.setSelection(start1 + 1);
//                        }
                    }
                });

            }
        });

        edt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start2 = edt2.getSelectionStart();
                        edt2.setText(edt2.getText().insert(start2, "1"));
                        edt2.setSelection(start2 + 1);
                    }
                });

                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start2 = edt2.getSelectionStart();
                        edt2.setText(edt2.getText().insert(start2, "2"));
                        edt2.setSelection(start2 + 1);
                    }
                });

                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start2 = edt2.getSelectionStart();
                        edt2.setText(edt2.getText().insert(start2, "3"));
                        edt2.setSelection(start2 + 1);
                    }
                });

                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start2 = edt2.getSelectionStart();
                        edt2.setText(edt2.getText().insert(start2, "4"));
                        edt2.setSelection(start2 + 1);
                    }
                });

                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start2 = edt2.getSelectionStart();
                        edt2.setText(edt2.getText().insert(start2, "5"));
                        edt2.setSelection(start2 + 1);
                    }
                });

                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start2 = edt2.getSelectionStart();
                        edt2.setText(edt2.getText().insert(start2, "6"));
                        edt2.setSelection(start2 + 1);
                    }
                });

                button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start2 = edt2.getSelectionStart();
                        edt2.setText(edt2.getText().insert(start2, "7"));
                        edt2.setSelection(start2 + 1);
                    }
                });

                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start2 = edt2.getSelectionStart();
                        edt2.setText(edt2.getText().insert(start2, "8"));
                        edt2.setSelection(start2 + 1);
                    }
                });

                button9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start2 = edt2.getSelectionStart();
                        edt2.setText(edt2.getText().insert(start2, "9"));
                        edt2.setSelection(start2 + 1);
                    }
                });

                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int start2 = edt2.getSelectionStart();
                        edt2.setText(edt2.getText().insert(start2, "0"));
                        edt2.setSelection(start2+1);
                    }
                });

                button_clr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText("");
                    }
                });

                button_del.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int cursorPosition = edt2.getSelectionStart();
                        if (cursorPosition > 0) {
                            edt2.setText(edt2.getText().delete(cursorPosition - 1, cursorPosition));
                            edt2.setSelection(cursorPosition - 1);
                        }
                    }
                });

            }
        });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
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
}

