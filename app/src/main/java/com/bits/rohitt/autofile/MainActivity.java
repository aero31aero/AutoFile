package com.bits.rohitt.autofile;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            //animateClick((View)item);
            Intent i=new Intent(MainActivity.this,SettingsActivity.class);
            startActivity(i);
            return true;
        }



        return super.onOptionsItemSelected(item);
    }

    //@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public void onPathsButtonClick(View v){
        animateClick(v);
        Intent i=new Intent(MainActivity.this,PathActivity.class);
        startActivity(i);
    }

    public void onRuleButtonClick(View v){
        animateClick(v);
        Intent i=new Intent(MainActivity.this,RuleActivity.class);
        startActivity(i);
    }

    public void onServiceToggleClick(View v){
        animateClick(v);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public void animateClick(View v){
        Drawable[] color = {getResources().getDrawable(R.drawable.clicked),getResources().getDrawable(R.drawable.rounded)};
        TransitionDrawable trans = new TransitionDrawable(color);
        v.setBackground(trans);
        trans.startTransition(350);
    }
}
