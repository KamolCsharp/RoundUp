package uz.uzmuiat.roundup.Database;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.uzmuiat.roundup.Activity.L11Activity;
import uz.uzmuiat.roundup.R;

public class LessionAdapter extends RecyclerView.Adapter<LessionAdapter.ViewHolder> {
    private List<Lesson> lessons;
    private LayoutInflater mInflater;
    private Context context;
    private OnItemClickListener listener;


    public LessionAdapter(Context context, List<Lesson> lessons) {
        this.mInflater = LayoutInflater.from(context);
        this.lessons = lessons;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.list_lesson_item, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Lesson animal = lessons.get(position);
        holder.lessonId.setText(animal.getLessonId() + " - Lesson");
        holder.lessonName.setText(animal.getLessonName());
        holder.imageView.setImageResource(getImage(animal.getType()));

    }

    public int getImage(int x) {
        switch (x) {
            case 1:
                return R.drawable.one;
            case 2:
                return R.drawable.two;
            case 3:
                return R.drawable.three;
            case 4:
                return R.drawable.four;
            case 5:
                return R.drawable.five;
            case 6:
                return R.drawable.six;
            case 7:
                return R.drawable.seven;
            case 8:
                return R.drawable.eight;
            case 9:
                return R.drawable.nine;
            default:
                return 0;
        }
    }

    @Override
    public int getItemCount() {
        return lessons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView lessonId;
        TextView lessonName;
        ImageView imageView;


        ViewHolder(View itemView) {
            super(itemView);
            lessonId = itemView.findViewById(R.id.lessonId);
            lessonName = itemView.findViewById(R.id.lessonName);
            imageView = itemView.findViewById(R.id.lessonImage);
            itemView.setClickable(true);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int lessonId1 = Integer.parseInt(lessonId.getText().toString().substring(0, lessonId.getText().toString().indexOf(" ")).trim());
                    listener.onItemClick(lessonId1);
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int lessonId1);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }
}
