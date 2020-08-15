package uz.uzmuiat.roundup.Database;

import android.annotation.SuppressLint;

import java.util.concurrent.TimeUnit;

public class Lesson {
    private int unitId;
    private int type;
    private String lessonName;
    private int lessonId;

    public Lesson(int unitId, int type, String lessonName, int lessonId) {
        this.unitId = unitId;
        this.type = type;
        this.lessonName = lessonName;
        this.lessonId = lessonId;
    }

    @SuppressLint("DefaultLocale")
    public static String convertFormat(int vaqti) {
        return String.format("%02d:%02d",
                TimeUnit.MILLISECONDS.toMinutes(vaqti),
                TimeUnit.MILLISECONDS.toSeconds(vaqti) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(vaqti)));
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }
}
