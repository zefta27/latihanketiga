package palembang.gelumbang.zefta.uwalq.implicitintent;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.lang.Object;

public class MainActivity extends AppCompatActivity {

    EditText etsubject, etText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToNote(View v)
    {
        etsubject = (EditText) findViewById(R.id.et_subject);
        String sSubject = etsubject.getText().toString();
//        String sText = etText.getText().toString();
          searchWeb(sSubject);
    }
    public void searchWeb(String query) {
        Intent intent = new Intent(Intent.ACTION_SEARCH);
        intent.putExtra(SearchManager.QUERY, query);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }



}
