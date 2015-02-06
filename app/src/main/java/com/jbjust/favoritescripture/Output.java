package com.jbjust.favoritescripture;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Output extends ActionBarActivity {

    /**
     * What happens for each instance of output
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(Input.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText("Your favorite scripture is:\n" + message);
        setContentView(textView);
    }

    /**
     * What happens when each option is selected
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        } return super.onOptionsItemSelected(item);
    }
}
