package xyz.gonzapico.kc_md;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by gonzapico on 15/10/2017.
 */

public abstract class BaseKCActivity extends AppCompatActivity {

  private Toolbar mToolbar;

  public abstract int getLayout();

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayout());
    mToolbar = (Toolbar) findViewById(R.id.toolbar);
    if (mToolbar != null){
      setSupportActionBar(mToolbar);
    }
  }
}
