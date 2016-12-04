package milktealabs.riddleme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RiddleMe extends AppCompatActivity {

    //The thing that was here before
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO: move this to the RiddleList afterwards when there is a main menu
        //Pretty much all of this is supposed to be in the RiddleList portion
        setContentView(R.layout.riddlelist);
    }

    public void openRiddle(View view) {
        //jump table here for which riddle button pressed; open the riddle accordingly
        setContentView(R.layout.riddle1);
        //after it is opened, call a method to actually have the functionality for a function?
        while (!checkCorrect()){
            //continue taking in user input
        }
    }
    public boolean checkCorrect(){
        //check whether or not the expected input is matched, else return false
        //maybe take in which riddle we are talking about
        return false;
    }
}
