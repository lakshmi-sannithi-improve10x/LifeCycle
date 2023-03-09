package com.improve10x.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "On Created method called", Toast.LENGTH_SHORT).show();
        Log.d("Life Cycle","On Created method called" );
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent  firstActivity = new Intent(this,FirstActivity.class);
            startActivity(firstActivity);
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "On Start Method Called", Toast.LENGTH_LONG).show();
        Log.d("Life Cycle","On Start Method Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "On Resume Method called", Toast.LENGTH_SHORT).show();
        Log.d("Life cycle","On Resume Method Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "On Pause Method Called", Toast.LENGTH_SHORT).show();
        Log.d("Life Cycle","On Pause Method Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "On Stop Method Called", Toast.LENGTH_SHORT).show();
        Log.d("Life Cycle","On Stop Method Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "On Destroy Method Called", Toast.LENGTH_SHORT).show();
        Log.d("Life Cycle","On Destroy Method Called");
    }
}