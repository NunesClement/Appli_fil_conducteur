package cnns.com.example.appli_fil_conducteur;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private TodoAdapter todoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_affichage);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        todoAdapter = new TodoAdapter(Data.get_tasks());
        recyclerView.setAdapter(todoAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int itemId = item.getItemId();
        View vue_ajout;
        vue_ajout = findViewById(R.id.vue_ajout);

        switch(itemId){
            case R.id.add_todo_btn:
                //envoyer(vue_ajout);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void envoyer (View view){
    Intent intent = new Intent(this, Page_add.class);
    startActivity(intent);
    }
}