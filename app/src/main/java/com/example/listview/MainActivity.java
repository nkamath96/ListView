package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.*;

public class MainActivity extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<BookDetails> books = new ArrayList<BookDetails>();
        books.add(new BookDetails("Harry Potter And The Philosopher's Stone", R.drawable.hp_philosophers));
        books.add(new BookDetails("To Kill A Mocking Bird", R.drawable.to_kill_a_mocking_bird));
        books.add(new BookDetails("Angels and Demons", R.drawable.angels_and_demons));
        books.add(new BookDetails("A Thousand Splendid Suns", R.drawable.a_thousand_splendid_suns));
        books.add(new BookDetails("Who Moved My Cheese", R.drawable.who_moved_my_cheese));
        books.add(new BookDetails("To Sir With Love", R.drawable.to_sir_with_love));
        books.add(new BookDetails("Dharma", R.drawable.dharma));
        books.add(new BookDetails("Murder on the Orient Express", R.drawable.murder_on_the_orient_express));
        books.add(new BookDetails("Eat That Frog", R.drawable.eat_that_frog));
        books.add(new BookDetails("Harry Potter And The Chamber of Secrets", R.drawable.hp_chamber));
        books.add(new BookDetails("The Hound of Baskerville", R.drawable.the_hound));
        books.add(new BookDetails("The Exorcist", R.drawable.the_exorcist));
        books.add(new BookDetails("Adventures of Huckleberry Finn", R.drawable.huckleberryfinn));
        books.add(new BookDetails("The Kite Runner", R.drawable.the_kite_runner));
        books.add(new BookDetails("The Seven Habits of Highly Effective People", R.drawable.the_7_habits));
        books.add(new BookDetails("Atomic Habits", R.drawable.atomic_habits));
        BookAdapter bookAdapter = new BookAdapter(this, books);

        list = findViewById(R.id.list);
        list.setAdapter(bookAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent1= new Intent(getApplicationContext(), MainActivity2.class);
                String str1=bookAdapter.getItem(position).getBookName();
                intent1.putExtra("sid",str1);
                startActivity(intent1);
            }
        });

    }
}