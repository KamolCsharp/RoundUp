package uz.uzmuiat.roundup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import uz.uzmuiat.roundup.Activity.L11Activity;
import uz.uzmuiat.roundup.Activity.L12Activity;
import uz.uzmuiat.roundup.Activity.L13Activity;
import uz.uzmuiat.roundup.Activity.L14Activity;
import uz.uzmuiat.roundup.Activity.L15Activity;
import uz.uzmuiat.roundup.Activity.L16Activity;
import uz.uzmuiat.roundup.Activity.L17Activity;
import uz.uzmuiat.roundup.Activity.L18Activity;
import uz.uzmuiat.roundup.Activity.L19Activity;
import uz.uzmuiat.roundup.Database.LessionAdapter;
import uz.uzmuiat.roundup.Database.Lesson;

public class LessonActivity extends AppCompatActivity {

    private int _unitId;
    private List<Lesson> lessons1;
    private List<Lesson> lessons2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        _unitId = getIntent().getIntExtra("unitId", 0);
        lessons1 = new ArrayList<>();
        lessons2 = new ArrayList<>();
        loadLesson();

        RecyclerView recyclerView = findViewById(R.id.recyclerViewLesson);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        LessionAdapter lessionAdapter = new LessionAdapter(this, lessons2);
        recyclerView.setAdapter(lessionAdapter);

        lessionAdapter.setOnItemClickListener(new LessionAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int lesson) {
                activities(lesson);
            }


        });
    }

    private void activities(int lesson) {
        if (_unitId == 1 && lesson == 1)
            startActivity(new Intent(this, L11Activity.class));
        if (_unitId == 1 && lesson == 2)
            startActivity(new Intent(this, L12Activity.class));
        if (_unitId == 1 && lesson == 3)
            startActivity(new Intent(this, L13Activity.class));
        if (_unitId == 1 && lesson == 4)
            startActivity(new Intent(this, L14Activity.class));
        if (_unitId == 1 && lesson == 5)
            startActivity(new Intent(this, L15Activity.class));
        if (_unitId == 1 && lesson == 6)
            startActivity(new Intent(this, L16Activity.class));
        if (_unitId == 1 && lesson == 7)
            startActivity(new Intent(this, L17Activity.class));
        if (_unitId == 1 && lesson == 8)
            startActivity(new Intent(this, L18Activity.class));
        if (_unitId == 1 && lesson == 9)
            startActivity(new Intent(this, L19Activity.class));


    }

    private void loadLesson() {
        lessons1.add(new Lesson(1, 1, "The Alphabet", 1));
        lessons1.add(new Lesson(1, 2, "Listen and repeat", 2));
        lessons1.add(new Lesson(1, 3, "Sing along!", 3));
        lessons1.add(new Lesson(1, 4, "Listen and repeat", 4));
        lessons1.add(new Lesson(1, 5, "Sing along!", 5));
        lessons1.add(new Lesson(1, 6, "Listen and repeat", 6));
        lessons1.add(new Lesson(1, 7, "Sing along!", 7));
        lessons1.add(new Lesson(1, 8, "Look at the pictures. Look at the letters. Write the words", 8));
        lessons1.add(new Lesson(1, 9, "Listen and repeat", 9));

        lessons1.add(new Lesson(2, 1, "Listen and repeat", 1));
        lessons1.add(new Lesson(2, 2, "Listen and repeat", 2));
        lessons1.add(new Lesson(2, 3, "Fill in: a on an.", 3));
        lessons1.add(new Lesson(2, 4, "Listen and repeat", 4));
        lessons1.add(new Lesson(2, 5, "Write the words in the correct column. Listen and check. Listen and repeat.", 5));
        lessons1.add(new Lesson(2, 6, "Circle the odd word out.", 6));
        lessons1.add(new Lesson(2, 7, "Fill in: ", 7));
        lessons1.add(new Lesson(2, 8, "Fill in: a or an", 8));


        for (int i = 0; i < lessons1.size(); i++) {
            if (lessons1.get(i).getUnitId() == _unitId)
                lessons2.add(lessons1.get(i));
        }
    }

}