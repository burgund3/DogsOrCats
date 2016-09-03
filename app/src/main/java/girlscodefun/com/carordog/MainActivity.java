package girlscodefun.com.carordog;

import android.media.Image;
import android.support.annotation.IntegerRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected Integer dogs = 0;
    protected Integer cats = 0;

    protected TextView dogsCounter = null;
    protected TextView catsCounter = null;

    protected ImageView dogsImage = null;
    protected ImageView catsImage = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dogsCounter = (TextView) findViewById(R.id.dogs_counter);
        dogsImage = (ImageView) findViewById(R.id.dogs_image);

        catsCounter = (TextView) findViewById(R.id.cats_counter);
        catsImage = (ImageView) findViewById(R.id.cats_image);

    }

    public void voteDogs(View view) {

        dogs = counterIncrease(dogs);

        dogsCounter.setText(dogs.toString());
        dogsImage.setLayoutParams(getParamsWeigth(dogs + 1));

    }

    public void voteCats(View view) {

        cats = counterIncrease(cats);

        catsCounter.setText(cats.toString());
        catsImage.setLayoutParams(getParamsWeigth(cats + 1));

    }

    protected LinearLayout.LayoutParams getParamsWeigth(Integer weigth) {

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT);
        params.weight = weigth;

        return params;
    }

    protected Integer counterIncrease(Integer counter) {

        counter++;
        if (counter > 99) counter = 0;

        return counter;

    }

}
