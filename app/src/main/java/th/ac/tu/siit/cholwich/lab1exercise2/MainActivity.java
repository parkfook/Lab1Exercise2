package th.ac.tu.siit.cholwich.lab1exercise2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends Activity {

    public void  Onclicked(View v){

        EditText et;
        et = (EditText)findViewById(R.id.etInput);
        String s = et.getText().toString();

        Double input = Double.parseDouble(s);


        RadioGroup rgFrom =(RadioGroup)findViewById(R.id.rgFrom);
        int selfrom = rgFrom.getCheckedRadioButtonId();

        if(selfrom == R.id.rbFrmC) {

            RadioGroup rgTo = (RadioGroup) findViewById(R.id.rgTo);
            int Tocel = rgTo.getCheckedRadioButtonId();
            if (Tocel == R.id.rbToC) {


               TextView etOutput = (TextView)findViewById(R.id.tvOutput);
                etOutput.setText(Double.toString(input));


            }
            else if (Tocel == R.id.rbToF) {



                TextView etOutput = (TextView)findViewById(R.id.tvOutput);
                input = input * 9/5 + 32 ;
                etOutput.setText(Double.toString(input));


            }

            else  if (Tocel == R.id.rbToK) {



                TextView etOutput = (TextView)findViewById(R.id.tvOutput);
                input = input +273.15 ;
                etOutput.setText(Double.toString(input));



            }
        }
        if(selfrom == R.id.rbFrmF) {

            RadioGroup rgTo = (RadioGroup) findViewById(R.id.rgTo);
            int Tocel = rgTo.getCheckedRadioButtonId();
            if (Tocel == R.id.rbToC) {


                TextView etOutput = (TextView)findViewById(R.id.tvOutput);
                input = (input-32.00) * 5/9 ;
                etOutput.setText(Double.toString(input));


            }
            else if (Tocel == R.id.rbToF) {



                TextView etOutput = (TextView)findViewById(R.id.tvOutput);

                etOutput.setText(Double.toString(input));


            }

            else  if (Tocel == R.id.rbToK) {



                TextView etOutput = (TextView)findViewById(R.id.tvOutput);
                input = (input +495.67) * 5/9 ;
                etOutput.setText(Double.toString(input));



            }
        }
        if(selfrom == R.id.rbFrmK) {

            RadioGroup rgTo = (RadioGroup) findViewById(R.id.rgTo);
            int Tocel = rgTo.getCheckedRadioButtonId();
            if (Tocel == R.id.rbToC) {


                TextView etOutput = (TextView)findViewById(R.id.tvOutput);
                input = input - 273.15 ;
                etOutput.setText(Double.toString(input));


            }
            else if (Tocel == R.id.rbToF) {



                TextView etOutput = (TextView)findViewById(R.id.tvOutput);
                input = input * 9/5 - 459.67 ;
                etOutput.setText(Double.toString(input));


            }

            else  if (Tocel == R.id.rbToK) {



                TextView etOutput = (TextView)findViewById(R.id.tvOutput);

                etOutput.setText(Double.toString(input));



            }
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
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
