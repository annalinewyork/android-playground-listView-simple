package annalinewyork.c4q.nyc.listexample;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //let assume we gonna put foods name in to listView, I need a String array to hold the name of foods.
        String[] foods = {"Bacon", "Ham", "Orange", "Cream", "Patato","HotDog","Banana","CatCake","Spring","Coffee","Cup","Why","Sister"};
        //Need a Array Adapter object, convert this String array to list items.
        //ListView can be showed in text, image, etc, they can combine together. but use this simple_list_item_1, only can display simple words.
        ListAdapter annaAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,foods);
        //get reference to this list.
        ListView annaListView = (ListView)findViewById(R.id.annaListView);
        //set the adapter to listView.
        annaListView.setAdapter(annaAdapter);

        //set onListener on the list
        annaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //whenever type any item in the list, each item have a position (0,1,2....),which is int position, will pass to
                //position in the line below. so get the value of this position and convert to a string.
                String food = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this,food,Toast.LENGTH_LONG).show();
            }
        });
    }


}
