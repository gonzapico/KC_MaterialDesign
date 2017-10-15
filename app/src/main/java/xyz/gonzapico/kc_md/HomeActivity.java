package xyz.gonzapico.kc_md;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends BaseKCActivity {


  private static List<DataModel> items = new ArrayList<>();

  static {
    for (int i = 1; i <= 10; i++) {
      items.add(new DataModel("Sport " + i, "http://lorempixel.com/500/500/sports/" + i));
    }
  }

  private RecyclerView rvCards;
  @Override public int getLayout() {
    return R.layout.activity_home;
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setUpTabLayout();

    setUpRecyclerView();
    setUpAdapter();
  }

  private void setUpAdapter() {
    DataAdapter adapter = new DataAdapter(items);
    rvCards.setAdapter(adapter);
    rvCards.setHasFixedSize(true);
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
