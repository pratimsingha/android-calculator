package com.example.pratim.calculator;

import android.os.Bundle;
import android.renderscript.Double2;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText operand1;
    private EditText operand2;
    private Button btn_addition;
    private Button btn_subtract;
    private Button btn_division;
    private Button btn_multiply;
    private Button btn_clear;
    private TextView txt_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        operand1 = (EditText) findViewById(R.id.operand1);
        operand2 = (EditText) findViewById(R.id.operand2);
        btn_addition = (Button) findViewById(R.id.btn_addition);
        btn_subtract = (Button) findViewById(R.id.btn_subtract);
        btn_division = (Button) findViewById(R.id.btn_division);
        btn_multiply = (Button) findViewById(R.id.btn_multiply);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        txt_result = (TextView) findViewById(R.id.txt_result);

        btn_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)){
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double result = oper1 + oper2;
                    txt_result.setText(Double.toString(result));
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter number in both the  fields",Toast.LENGTH_LONG).show();
                }

            }
        });
        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)){
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double result = oper1 - oper2;
                    txt_result.setText(Double.toString(result));
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter number in both the  fields",Toast.LENGTH_LONG).show();
                }
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)){
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double result = oper1 * oper2;
                    txt_result.setText(Double.toString(result));
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter number in both the  fields",Toast.LENGTH_LONG).show();
                }
            }
        });
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)){
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double result = oper1 / oper2;
                    txt_result.setText(Double.toString(result));
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter number in both the  fields",Toast.LENGTH_LONG).show();
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operand1.setText("");
                operand2.setText("");
                txt_result.setText("0.00");
                operand1.requestFocus();
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
