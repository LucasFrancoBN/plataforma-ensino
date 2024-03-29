package entities;

public abstract class Lesson {
  protected String title;

  public Lesson(String title) {
    this.title = title;
  }

  public abstract int duration();

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
