package xyz.gonzapico.kc_md;

import android.os.Bundle;
import android.support.design.widget.TabLayout;

public class HomeActivity extends BaseKCActivity {
  @Override public int getLayout() {
    return R.layout.activity_home;
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setUpTabLayout();
  }

  private void setUpTabLayout() {
    TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
    tabs.addTab(tabs.newTab().setText("Tab 1"));
    tabs.addTab(tabs.newTab().setText("Tab 2"));
    tabs.addTab(tabs.newTab().setText("Tab 3"));
  }
}
