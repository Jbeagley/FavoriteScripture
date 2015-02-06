/**
 * @author Jared Beagley
 * Colaborated with Braden Stiener and Ryan Hildreth
 */
package com.jbjust.favoritescripture;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Input extends ActionBarActivity {

    public static final String EXTRA_MESSAGE = "com.jbjust.FavoriteScripture.MESSAGE";

    /**
     * What happens when each instance of Input occurs
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
    }

    /**
     * Sets up the option menu
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_input, menu);
        return true;
    }

    /**
     * What to do when each item in the menu is selected
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        } return super.onOptionsItemSelected(item);
    }

    /**
     * What happens when you click the share button
     * @param view
     */
    public void share(View view) {
        Intent intent = new Intent(this, Output.class);
        EditText book = (EditText) findViewById(R.id.bookEnter);
        EditText chapter = (EditText) findViewById(R.id.chapterEnter);
        EditText verse = (EditText) findViewById(R.id.verseEnter);
        String scripture = book.getText().toString() + " " + chapter.getText().toString() + ":" + verse.getText().toString() + "\n";
        intent.putExtra(EXTRA_MESSAGE, scripture);
        startActivity(intent);
    }
}
