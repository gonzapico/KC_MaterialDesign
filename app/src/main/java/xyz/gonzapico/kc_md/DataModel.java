package xyz.gonzapico.kc_md;

/**
 * Created by gonzapico on 15/10/2017.
 */

public class DataModel {

  private String text;
  private String image;

  public DataModel(String text, String image) {
    this. text = text;
    this.image = image;
  }

  public String getText() {
    return text;
  }

  public String getImage() {
    return image;
  }
}
