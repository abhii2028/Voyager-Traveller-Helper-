package sinners.viswahack.abhijeet.voyager.Acitivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.taishi.flipprogressdialog.FlipProgressDialog;

import java.util.ArrayList;
import java.util.List;

import sinners.viswahack.abhijeet.voyager.R;

public class LoginActivity extends AppCompatActivity {

    Button button;
    FlipProgressDialog fpd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final List<Integer> imageList = new ArrayList<Integer>();
        imageList.add(R.drawable.voyagerlogo);

        button = (Button)findViewById(R.id.submit);
        fpd = new FlipProgressDialog();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fpd.setImageList(imageList);                              // *Set a imageList* [Have to. Transparent background png recommended]
                fpd.setCanceledOnTouchOutside(false);                      // If true, the dialog will be dismissed when user touch outside of the dialog. If false, the dialog won't be dismissed.
                fpd.setDimAmount(0.8f);
                fpd.show(getFragmentManager(),"");
                startActivity(new Intent(LoginActivity.this,HomeActivity.class));
            }
        });

    }
}
