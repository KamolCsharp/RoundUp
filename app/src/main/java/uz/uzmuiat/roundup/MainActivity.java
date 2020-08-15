package uz.uzmuiat.roundup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

import uz.uzmuiat.roundup.Database.UnitAdapter;
import uz.uzmuiat.roundup.Database.Units;

public class MainActivity extends AppCompatActivity {

    BottomAppBar bottomAppBar;
    BottomSheetBehavior<View> bottomSheetBehavior;
    CoordinatorLayout coordinatorLayout;
    FloatingActionButton fab;
    NavigationView navigationView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        List<Units> units = new ArrayList<>();
        units.add(new Units(1, "The Alphabet"));
        units.add(new Units(2, "A - An"));
        units.add(new Units(3, "Progress Check 1 (Units 1-2)"));
        units.add(new Units(4, "Numbers"));
        units.add(new Units(5, "Plurals"));
        units.add(new Units(6, "Progress Check 2 (Units 3-4)"));
        units.add(new Units(7, "Personal Pronouns"));
        units.add(new Units(8, "The verb \'to be\'"));
        units.add(new Units(9, "Progress Check 3 (Units 5-6)"));
        units.add(new Units(10, "This / These - That / Those"));
        units.add(new Units(11, "\'Have / Have got\'"));
        units.add(new Units(12, "Progress Check 4 (Units 7-8)"));
        units.add(new Units(13, "There is / There are"));
        units.add(new Units(14, "\'Can\'"));
        units.add(new Units(15, "Progress Check 5 (Units 9-10)"));
        units.add(new Units(16, "Possessives"));
        units.add(new Units(17, "The Imperative"));
        units.add(new Units(18, "Progress Check 6 (Units 11-12)"));
        units.add(new Units(19, "Present Continuous"));
        units.add(new Units(20, "Present Simple"));
        units.add(new Units(21, "Progress Check 7 (Units 13-14)"));
        units.add(new Units(22, "Prepositions of Place"));
        units.add(new Units(23, "Prepositions of Time"));
        units.add(new Units(24, "Who - What"));
        units.add(new Units(25, "Progress Check 8 (Units 15-17)"));
        units.add(new Units(26, "Revision 1 (Units 1-2)"));
        units.add(new Units(27, "Revision 2 (Units 1-4)"));
        units.add(new Units(28, "Revision 3 (Units 1-6)"));
        units.add(new Units(29, "Revision 4 (Units 1-8)"));
        units.add(new Units(30, "Revision 5 (Units 1-10)"));
        units.add(new Units(31, "Revision 6 (Units 1-12)"));
        units.add(new Units(32, "Revision 7 (Units 1-14)"));
        units.add(new Units(33, "Revision 8 (Units 1-17)"));
        UnitAdapter unitAdapter = new UnitAdapter(this,units);
        recyclerView.setAdapter(unitAdapter);
    }

    private void init() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Round Up");
            getSupportActionBar().setHomeButtonEnabled(true);
        }

        context = MainActivity.this;
        navigationView = findViewById(R.id.nav_view);
        coordinatorLayout = findViewById(R.id.coordinator_layout);
        View bottomDrawer = findViewById(R.id.bottom_drawer);
        bottomAppBar = findViewById(R.id.bottom_app_bar);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.btm_search: {
                        Toast.makeText(context, "Search Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.btm_3d: {
                        Toast.makeText(context, "3D Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.btm_accelerator: {
                        Toast.makeText(context, "Accelerator Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.btm_dashboard: {
                        Toast.makeText(context, "Dashboard Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
                return true;
            }
        });

        bottomSheetBehavior = BottomSheetBehavior.from(bottomDrawer);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);

        bottomAppBar.setNavigationIcon(R.drawable.ic_baseline_menu_24);
        //bottomAppBar.replaceMenu(R.menu.menu_demo);
        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HALF_EXPANDED);
            }
        });

        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.btm_search: {
                        Toast.makeText(context, "Search Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.btm_3d: {
                        Toast.makeText(context, "3D Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.btm_accelerator: {
                        Toast.makeText(context, "Accelerator Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.btm_dashboard: {
                        Toast.makeText(context, "Dashboard Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
                return true;
            }
        });
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Yangi_soz_qoshish.class));
            }
        });
    }
}