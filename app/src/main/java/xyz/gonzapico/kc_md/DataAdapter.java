package xyz.gonzapico.kc_md;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.List;

/**
 * Created by gonzapico on 15/10/2017.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> implements View.OnClickListener {

  private List<DataModel> items;
  private OnItemClickListener onItemClickListener;

  public DataAdapter(List<DataModel> items) {
    this.items = items;
  }

  public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
    this.onItemClickListener = onItemClickListener;
  }

  @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
    v.setOnClickListener(this);
    return new ViewHolder(v);
  }

  @Override public void onBindViewHolder(ViewHolder holder, int position) {
    DataModel item = items.get(position);
    holder.text.setText(item.getText());
    holder.image.setImageBitmap(null);
    Picasso.with(holder.image.getContext()).load(item.getImage()).into(holder.image);
    holder.itemView.setTag(item);
  }

  @Override public int getItemCount() {
    return items.size();
  }

  @Override public void onClick(final View v) {
    onItemClickListener.onItemClick(v, (DataModel) v.getTag());
  }

  protected static class ViewHolder extends RecyclerView.ViewHolder {
    public ImageView image;
    public TextView text;

    public ViewHolder(View itemView) {
      super(itemView);
      image = (ImageView) itemView.findViewById(R.id.image);
      text = (TextView) itemView.findViewById(R.id.text);
    }
  }

  public interface OnItemClickListener {

    void onItemClick(View view, DataModel viewModel);

  }
}
