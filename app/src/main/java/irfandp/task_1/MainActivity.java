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
                        edt1.setText(edt1.getText()+ "1");
                    }
                });

                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText(edt1.getText()+"2");
                    }
                });

                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText(edt1.getText()+ "3");
                    }
                });

                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText(edt1.getText()+ "4");
                    }
                });

                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText(edt1.getText()+"5");
                    }
                });

                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText(edt1.getText()+ "6");
                    }
                });

                button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText(edt1.getText()+"7");
                    }
                });

                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText(edt1.getText()+ "8");
                    }
                });

                button9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText(edt1.getText()+"9");
                    }
                });

                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText(edt1.getText()+ "2");
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
                        String str = edt1.getText().toString();
                        if (str.length() >= 1) {
                            str = str.substring(0, str.length() - 1);
                            edt1.setText(str);
                        } else if (str.length() <= 1) {
                            edt1.setText("0");
                        }
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
                        edt2.setText(edt2.getText() + "1");
                    }
                });

                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText() + "2");
                    }
                });

                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText() + "3");
                    }
                });

                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText() + "4");
                    }
                });

                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText() + "5");
                    }
                });

                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText() + "6");
                    }
                });

                button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText() + "7");
                    }
                });

                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText() + "8");
                    }
                });

                button9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText() + "9");
                    }
                });

                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText() + "0");
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
                        String str = edt2.getText().toString();
                        if (str.length() >= 1) {
                            str = str.substring(0, str.length() - 1);
                            edt2.setText(str);
                        } else if (str.length() <= 1) {
                            edt2.setText("0");
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

