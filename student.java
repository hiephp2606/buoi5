public class student extends people {
    private int Score;

    public student(String name, int age, int score) {
        super(name, age);
        this.Score = score;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        this.Score = score;
    }

    @Override
    public String toString() {
        return "student{" +
                "Score=" + Score +
                ", Name='" + getName() + '\'' +
                ", Age=" + getAge() +
                '}';
    }
}
