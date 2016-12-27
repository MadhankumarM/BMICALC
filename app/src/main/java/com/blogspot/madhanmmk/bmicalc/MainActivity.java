package com.blogspot.madhanmmk.bmicalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;





public class MainActivity extends Activity implements View.OnClickListener {

    private static final String TAG="stepp";

    Button btnrel;
    EditText txtval1,txtval2;
    Button k;
    String s="http://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG,"onCreate");

        btnrel=(Button)findViewById(R.id.btn);

        txtval1=(EditText)findViewById(R.id.t1);
        txtval2=(EditText)findViewById(R.id.t2);

        btnrel.setOnClickListener(this);
        addListenerOnButton();

    }

    public void onClick(View v) {
        Log.i(TAG,"onClick");

        float value1=Integer.parseInt(txtval1.getText().toString());
        float value2=Integer.parseInt(txtval2.getText().toString());
        float h=value2/100;
        h=h*h;
        float sum=value1/h;

        EditText t=(EditText) findViewById(R.id.t3);
        t.setText("BMI="+sum);
        TextView f=(TextView)findViewById(R.id.v);
        if(sum<18.5)
        {
            f.setText("You are Underweight");
            s="http://www.freedieting.com/tools/calories_in_food.htm";

        }
        else if(sum<24.9)
        {
            f.setText("You have a Normal body");
            s="http://www.freedieting.com/tools/calories_in_food.htm";
        }
        else if(sum<30)
        {
            f.setText("You are in overweight category");
            s="http://www.freedieting.com/weight_loss_articles.htm";

        }
        else
        {
            f.setText("You have obecitys");
            s="http://www.freedieting.com/weight_loss_articles.htm";

        }


    }

    public void addListenerOnButton() {


        k = (Button) findViewById(R.id.button);

        k.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {


                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("string",s);
                startActivity(intent);

            }

        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
        Toast.makeText(getApplicationContext(),"Welocome",Toast.LENGTH_LONG);
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }
}

