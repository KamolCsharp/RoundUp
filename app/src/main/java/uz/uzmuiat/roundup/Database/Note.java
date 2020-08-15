package uz.uzmuiat.roundup.Database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "note_table")
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String soz1;
    private String soz2;

    public Note(String soz1, String soz2) {
        this.soz1 = soz1;
        this.soz2 = soz2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoz1() {
        return soz1;
    }

    public void setSoz1(String soz1) {
        this.soz1 = soz1;
    }

    public String getSoz2() {
        return soz2;
    }

    public void setSoz2(String soz2) {
        this.soz2 = soz2;
    }
}
