package com.lakshay.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void convert(View view)
    {
        EditText dollarET = (EditText)findViewById(R.id.DollarAmount);
        String dollars = dollarET.getText().toString();

        EditText rupeeET = (EditText)findViewById(R.id.RupeeAmount);
        String rupees = rupeeET.getText().toString();

        TextView mymessage = (TextView)findViewById(R.id.mymessage);

        if(dollars.length() != 0)
        {
            try
            {
                Double converted_rupee=Double.parseDouble(dollars)*73;
                rupeeET.setText(""+converted_rupee);
                mymessage.setText("Successfully Converted from Dollar to Rupee!");
            }
            catch (Exception e)
            {
                mymessage.setText("Dollar Value Must Be Numeric!");
            }
        }
        else if(rupees.length() != 0)
        {
            try
            {
                Double converted_dollar=Double.parseDouble(rupees)/73;
                dollarET.setText(""+converted_dollar);
                mymessage.setText("Successfully Converted from Rupee to Dollar!");
            }
            catch (Exception e)
            {
                mymessage.setText("Rupee Value Must Be Numeric!");
            }
        }
        else
        {
            mymessage.setText("Please Enter Some Value!");
        }
    }

    public void clearText(View view)
    {
        EditText dollarET = (EditText)findViewById(R.id.DollarAmount);
        EditText rupeeET = (EditText)findViewById(R.id.RupeeAmount);
        dollarET.setText("");
        rupeeET.setText("");
    }
}