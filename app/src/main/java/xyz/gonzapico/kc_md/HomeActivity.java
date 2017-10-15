package xyz.gonzapico.kc_md;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

public class HomeActivity extends BaseKCActivity {

  private RecyclerView rvCards;
  @Override public int getLayout() {
    return R.layout.activity_home;
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setUpTabLayout();

    setUpRecyclerView();
  }

  private void setUpRecyclerView() {
    rvCards = (RecyclerView) findViewById(R.id.rvCards);
    /***
     * Layout manager:
     *  - Linear
     *  - Grid
     *  - StaggeredGrid
     */
    rvCards.setLayoutManager(new GridLayoutManager(this, 2));
    // rvCards.setLayoutManager(new LinearLayoutManager(this));
    // rvCards.setLayoutManager(new StaggeredGridLayoutManager(2, 2));
  }

  private void setUpTabLayout() {
    TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
    tabs.addTab(tabs.newTab().setText("Tab 1"));
    tabs.addTab(tabs.newTab().setText("Tab 2"));
    tabs.addTab(tabs.newTab().setText("Tab 3"));
  }
}
