package sinners.viswahack.abhijeet.voyager.Acitivities;

import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;

import sinners.viswahack.abhijeet.voyager.R;
import sinners.viswahack.abhijeet.voyager.Utils.BottomNavigationViewHelper;

public class HomeActivity extends AppCompatActivity {

    Button button;
    Dialog dialog;

    LinearLayout hlayout,slayout,glayout,tlayout,mlayout;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.hotel:
                    hlayout.setVisibility(View.VISIBLE);
                    slayout.setVisibility(View.GONE);
                    tlayout.setVisibility(View.GONE);
                    glayout.setVisibility(View.GONE);
                    return true;
                case R.id.scheduler:
                    slayout.setVisibility(View.VISIBLE);
                    hlayout.setVisibility(View.GONE);
                    tlayout.setVisibility(View.GONE);
                    glayout.setVisibility(View.GONE);
                    return true;
                case R.id.general:
                    glayout.setVisibility(View.VISIBLE);
                    hlayout.setVisibility(View.GONE);
                    slayout.setVisibility(View.GONE);
                    tlayout.setVisibility(View.GONE);
                    return true;
                case R.id.translator:
                    tlayout.setVisibility(View.VISIBLE);
                    slayout.setVisibility(View.GONE);
                    hlayout.setVisibility(View.GONE);
                    glayout.setVisibility(View.GONE);
                    return true;
                case R.id.news:

                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.removeShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        button = (Button) findViewById(R.id.addSchedule);
        hlayout = (LinearLayout)findViewById(R.id.hotelLayout);
        slayout = (LinearLayout)findViewById(R.id.schedulerLayout);
        tlayout = (LinearLayout)findViewById(R.id.translatorlayout);
        glayout = (LinearLayout)findViewById(R.id.generalLayout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog = new Dialog(HomeActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setCancelable(true);
                dialog.setContentView(R.layout.dialog);
                dialog.show();
            }
        });



    }
}
