package com.example.opet.fifaworldcup;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);


        String[] values = new String[] { "GRUPO A",
                "GRUPO B",
                "GRUPO C",
                "GRUPO D",
                "GRUPO E",
                "GRUPO F",
                "GRUPO G",
                "GRUPO H"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View arg1, int position,
                                    long arg3)
            {
                String list_item=(String) parent.getItemAtPosition(position);

                Intent intent = new Intent(arg1.getContext() ,GroupDetailsActivity.class);
                intent.putExtra("List_item",list_item);
                startActivity(intent);

            }

        });
    }
}
