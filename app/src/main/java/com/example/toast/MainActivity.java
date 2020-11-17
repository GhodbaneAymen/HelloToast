package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    int a=0;
    TextView tv;
    Button bt;
    Button bc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView);
        bt=(Button)findViewById(R.id.TOAST);
        bc=(Button)findViewById(R.id.button2);
if (savedInstanceState != null  ) {
    a = Integer.parseInt(savedInstanceState.getString("myVar"));
    tv.setText(Integer.toString(a));
}

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();



    }

    public void countact(View view) {

       ++a;
        if (tv != null){
            tv.setText(Integer.toString(a));
    }



}

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.putString("Counter",Integer.toString(a));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // Save the values you need into "outState"
        super.onSaveInstanceState(outState);
        outState.putString("myVar", Integer.toString(a));

    }

}
