package tw.edu.tut.mis.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "ooxx MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("aaaaa","faaaaaa");
        Log.i("aaaaa","This is a book");
        super.onCreate(savedInstanceState);
        Log.d("aaaaa","This is a book");
        setContentView(R.layout.activity_main);
    }
}
