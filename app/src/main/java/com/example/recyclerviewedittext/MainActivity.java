package com.example.recyclerviewedittext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

import static com.example.recyclerviewedittext.R.id.list_spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ArrayList<DataItems> dataItems;
    RecyclerView.SmoothScroller smoothScroller;
    LinearLayoutManager linearLayoutManager;
    private CustomAdaptor objCustomAdaptor = null;
    ArrayList<DataItems> items = new ArrayList();
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        editText = findViewById(R.id.editText);
        dataItems = new ArrayList<>();
        linearLayoutManager = new LinearLayoutManager(this);
        items.addAll(getList());
        objCustomAdaptor = new CustomAdaptor(items);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(objCustomAdaptor);
//spinner
        Spinner spinner2 = findViewById(list_spinner);
        ArrayAdapter<CharSequence> adapter2;
        adapter2 = ArrayAdapter.createFromResource(this,
                R.array.list, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);



        smoothScroller = new
                LinearSmoothScroller(this) {
                    @Override
                    protected int getVerticalSnapPreference() {
                        return LinearSmoothScroller.SNAP_TO_START;
                    }
                };

    }

    ArrayList<DataItems> getList() {
        dataItems = new ArrayList<>();
//        john wick
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2014", "Action Thriller", "7.4/10"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick2", "2016", "Action Thriller", "7.5/10"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick3", "2019", "Action Thriller", "7.9/10"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick4", "2021", "Action Thriller", "8.4/10"));
//lord of the rings
        dataItems.add(new DataItems(R.drawable.johnwick_image, "Lord of the rings1", "2001", "Fantasy", "8.8/10"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "Lord of the rings2", "2002", "Fantasy", "8.7/10"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "Lord of the rings3", "2003", "Fantasy", "8.9/10"));
//        hobbit
        dataItems.add(new DataItems(R.drawable.johnwick_image, "Hobbit1", "2012", "Fantasy", "7.8/10"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "Hobbit2", "2013", "Fantasy", "7.8/10"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "Hobbit3", "2014", "Fantasy", "7.4/10"));
//        starwars
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
//        transformers
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
//        pirates of the caribbean
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
//        mission impossible
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
//        rockey
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
//        maze runner
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        dataItems.add(new DataItems(R.drawable.johnwick_image, "John Wick", "2016", "m", "3"));
        return dataItems;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
        String modifiedName = editText.getText().toString();
        if (items.size() > i && modifiedName!= null && objCustomAdaptor != null) {
            items.get(i).title =modifiedName;
            objCustomAdaptor.notifyItemChanged(i);
            smoothScroller.setTargetPosition(i);
            linearLayoutManager.startSmoothScroll(smoothScroller);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}




