package cnns.com.example.appli_fil_conducteur;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import cnns.com.example.appli_fil_conducteur.Data;


public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoViewHolder>{
    private String[] dataList;

    public static class TodoViewHolder extends RecyclerView.ViewHolder{

        TextView task;
        public TodoViewHolder(@NonNull View itemView) {
            super(itemView);
            task = itemView.findViewById(R.id.nom_tache);
        }
    }

    public TodoAdapter(String[] dataList){
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_tache, parent, false);
        TodoViewHolder todoViewHolder = new TodoViewHolder(view);
        return todoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TodoViewHolder holder, int position) {
        String tache_string = Data.get_tasks()[position];
        holder.task.setText(tache_string);
    }

    @Override
    public int getItemCount() {
        return Data.get_tasks().length;
    }
}
