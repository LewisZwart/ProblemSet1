package lewis.problemset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.zip.CheckedInputStream;

public class MainActivity extends AppCompatActivity {

    CheckBox checkArms, checkEars, checkEyebrows, checkEyes, checkGlasses;
    CheckBox checkHat, checkMouth, checkMustache, checkNose, checkShoes;
    ImageView arms, ears, eyebrows, eyes, glasses, hat, mouth, mustache, nose, shoes;

    String[] allImages = {
            "arms", "ears", "eyebrows", "eyes", "glasses", "hat", "mouth", "mustache", "nose", "shoes"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkArms = (CheckBox) findViewById(R.id.check_arms);
        arms = (ImageView) findViewById(R.id.arms);

        checkEars = (CheckBox) findViewById(R.id.check_ears);
        ears = (ImageView) findViewById(R.id.ears);

        checkEyebrows = (CheckBox) findViewById(R.id.check_eyebrows);
        eyebrows = (ImageView) findViewById(R.id.eyebrows);

        checkEyes = (CheckBox) findViewById(R.id.check_eyes);
        eyes = (ImageView) findViewById(R.id.eyes);

        checkGlasses = (CheckBox) findViewById(R.id.check_glasses);
        glasses = (ImageView) findViewById(R.id.glasses);

        checkHat = (CheckBox) findViewById(R.id.check_hat);
        hat = (ImageView) findViewById(R.id.hat);

        checkMouth = (CheckBox) findViewById(R.id.check_mouth);
        mouth = (ImageView) findViewById(R.id.mouth);

        checkMustache = (CheckBox) findViewById(R.id.check_mustache);
        mustache = (ImageView) findViewById(R.id.mustache);

        checkNose = (CheckBox) findViewById(R.id.check_nose);
        nose = (ImageView) findViewById(R.id.nose);

        checkShoes = (CheckBox) findViewById(R.id.check_shoes);
        shoes = (ImageView) findViewById(R.id.shoes);


        // define when attributes are visible

        checkArms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkArms.isChecked()) {
                    arms.setVisibility(View.VISIBLE);
                }
                else {
                    arms.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkEars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkEars.isChecked()) {
                    ears.setVisibility(View.VISIBLE);
                }
                else {
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkEyebrows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkEyebrows.isChecked()) {
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkEyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkEyes.isChecked()) {
                    eyes.setVisibility(View.VISIBLE);
                }
                else {
                    eyes.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkGlasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkGlasses.isChecked()) {
                    glasses.setVisibility(View.VISIBLE);
                }
                else {
                    glasses.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkHat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkHat.isChecked()) {
                    hat.setVisibility(View.VISIBLE);
                }
                else {
                    hat.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkMouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkMouth.isChecked()) {
                    mouth.setVisibility(View.VISIBLE);
                }
                else {
                    mouth.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkMustache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkMustache.isChecked()) {
                    mustache.setVisibility(View.VISIBLE);
                }
                else {
                    mustache.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkNose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkNose.isChecked()) {
                    nose.setVisibility(View.VISIBLE);
                }
                else {
                    nose.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkShoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkShoes.isChecked()) {
                    shoes.setVisibility(View.VISIBLE);
                } else {
                    shoes.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        // Save visibility of attributes to the savedInstanceState.
        String[] images = new String[10];
        int i = 0;

        // extract visible images
        for (String idString: allImages) {
            int id = getResources().getIdentifier(idString, "id", "lewis.problemset1");
            ImageView image = (ImageView) findViewById(id);

            if (image.getVisibility() == View.VISIBLE) {
                images[i]= idString;
                i++;
            }
        };

        // select part of the array that contains information
        String[] visibleImages =  new String[i];
        for (int j = 0; j < i; j++) {
            visibleImages[j] = images[j];
        }

        savedInstanceState.putStringArray("visibleImages", visibleImages);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore visiblity of attributes from the savedInstanceState.
        String[] visibles = savedInstanceState.getStringArray("visibleImages");

        for (String idString : visibles) {
            int id = getResources().getIdentifier(idString, "id", "lewis.problemset1");
            ImageView image = (ImageView) findViewById(id);
            image.setVisibility(View.VISIBLE);
        }
    }
}
