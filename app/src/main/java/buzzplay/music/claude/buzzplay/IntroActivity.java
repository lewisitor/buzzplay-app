package buzzplay.music.claude.buzzplay;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.model.SliderPage;

public class IntroActivity extends AppIntro {


        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            SliderPage sliderPage1 = new SliderPage();
            sliderPage1.setTitle("Good Experience with better music");
            sliderPage1.setDescription("We are going to add some lorem ipsum information here to make this clear.");
            sliderPage1.setImageDrawable(R.drawable.ic_slide1);
            sliderPage1.setBgColor(Color.TRANSPARENT);
            addSlide(AppIntroFragment.newInstance(sliderPage1));

            SliderPage sliderPage2 = new SliderPage();
            sliderPage2.setTitle("Explore");
            sliderPage2.setDescription("Feel free to explore the rest of this app to what ever dimension. Music should change you from now");
            sliderPage2.setImageDrawable(R.drawable.ic_slide1);
            sliderPage2.setBgColor(Color.TRANSPARENT);
            addSlide(AppIntroFragment.newInstance(sliderPage2));

        }

        @Override
        public void onSkipPressed(Fragment currentFragment) {
            super.onSkipPressed(currentFragment);
            finish();
        }

        @Override
        public void onDonePressed(Fragment currentFragment) {
            super.onDonePressed(currentFragment);
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
