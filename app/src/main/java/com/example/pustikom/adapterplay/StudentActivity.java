package com.example.pustikom.adapterplay;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pustikom.adapterplay.com.example.pustikom.adapter.StudentArrayAdapter;
import com.example.pustikom.adapterplay.com.example.pustikom.user.Student;

import java.util.ArrayList;

/**
 * Created by pustikom on 07/10/16.
 */


public class StudentActivity extends AppCompatActivity {

    private ListView listView;
    private Student students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Student> students = populateStudentDummies();
        StudentArrayAdapter studentArrayAdapter = new StudentArrayAdapter(this,students);
        ListView list_item = (ListView) findViewById(R.id.list_item);
        list_item.setAdapter(studentArrayAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){

        }
        return super.onContextItemSelected(item);
    }

    private ArrayList<Student> populateStudentDummies(){
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1,"3145136188","TRI FEBRIANA SIAMI","0858xxxxxx","tri@mhs.unj.ac.id"));
        studentList.add(new Student(2,"3145136192","Ummu Kultsum","0813xxxxxx","ummu@mhs.unj.ac.id"));
        return studentList;
    }


}
