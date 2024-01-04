package entities;

public class Task extends Lesson {
  private String description;
  private int questionsCount;

  public Task(String title, String description, int questionsCount) {
    super(title);
    this.description = description;
    this.questionsCount = questionsCount;
  }

  @Override
  public int duration() {
    return questionsCount * 5 * 60;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getQuestionsCount() {
    return questionsCount;
  }

  public void setQuestionsCount(int questionsCount) {
    this.questionsCount = questionsCount;
  }
}
