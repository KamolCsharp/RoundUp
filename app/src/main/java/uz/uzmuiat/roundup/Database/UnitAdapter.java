package uz.uzmuiat.roundup.Database;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.uzmuiat.roundup.LessonActivity;
import uz.uzmuiat.roundup.R;

public class UnitAdapter extends RecyclerView.Adapter<UnitAdapter.ViewHolder> {
    private List<Units> units;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    private Context context;

    public UnitAdapter(Context context, List<Units> data) {
        this.mInflater = LayoutInflater.from(context);
        this.units = data;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Units animal = units.get(position);
        holder.unitId.setText(animal.UnitId + " - Unit");
        holder.unitName.setText(animal.getUnitName());
    }

    @Override
    public int getItemCount() {
        return units.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView unitId;
        TextView unitName;
        ImageView imageView;


        ViewHolder(final View itemView) {
            super(itemView);
            unitId = itemView.findViewById(R.id.unitId);
            unitName = itemView.findViewById(R.id.unitName);
            imageView = itemView.findViewById(R.id.imageId);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int unitId1 = Integer.parseInt(unitId.getText().toString().substring(0, unitId.getText().toString().indexOf(" ")).trim());
                    context.startActivity(new Intent(context, LessonActivity.class)
                            .putExtra("unitId", unitId1));
                }
            });
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public Units getItem(int id) {
        return units.get(id);
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}