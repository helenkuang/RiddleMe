package milktealabs.riddleme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RiddleMe extends AppCompatActivity {

    //The thing that was here before
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO: move this to the RiddleList afterwards
        setContentView(R.layout.riddlelist);
    }

    public void openRiddle(View view) {
        
        setContentView(R.layout.riddle1);
    }
}
