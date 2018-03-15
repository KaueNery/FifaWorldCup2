package com.example.opet.fifaworldcup;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GroupDetailsActivity extends Activity {
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        Bundle group = getIntent().getExtras();

        ArrayList<String> values = new ArrayList<>();
        String selectedGroup = group.getString("List_item");
        switch (selectedGroup){
            case "GRUPO A" : {
                values.removeAll(values);
                values.add("Arábia Saudita");
                values.add("Egito");
                values.add("Rússia");
                values.add("Uruguai");
                break;
            }
            case "GRUPO B" : {
                values.removeAll(values);
                values.add("Espanha");
                values.add("Irã");
                values.add("Marrocos");
                values.add("Portugal");

                break;
            }
            case "GRUPO C" : {
                values.removeAll(values);
                values.add("Austrália");
                values.add("Dinamarca");
                values.add("França");
                values.add("Peru");
                break;
            }
            case "GRUPO D" : {
                values.removeAll(values);
                values.add("Argentina");
                values.add("Croácia");
                values.add("Islândia");
                values.add("Nigéria");
                break;
            }
            case "GRUPO E" : {
                values.removeAll(values);
                values.add("Brasil");
                values.add("Costa Rica");
                values.add("Sérvia");
                values.add("Suíça");
                break;
            }
            case "GRUPO F" : {
                values.removeAll(values);
                values.add("Alemanha");
                values.add("Coreia do Sul");
                values.add("México");
                values.add("Suécia");
                break;
            }
            case "GRUPO G" : {
                values.removeAll(values);
                values.add("Bélgica");
                values.add("Inglaterra");
                values.add("Panamá");
                values.add("Tunísia");
                break;
            }
            case "GRUPO H" : {
                values.removeAll(values);
                values.add("Colômbia");
                values.add("Japão");
                values.add("Polônia");
                values.add("Senegal");
                break;
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View arg1, int position,
//                                    long arg3)
//            {
//                String list_item=(String) parent.getItemAtPosition(position);
//
//                Intent intent = new Intent(arg1.getContext() ,GroupDetailsActivity.class);
//                intent.putExtra("List_item",list_item);
//                startActivity(intent);
//
//            }
//
//        });
    }
}
