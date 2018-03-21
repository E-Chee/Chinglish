/**
 * Created by per6 on 3/19/18.
 */

public class Flashcard {

    private int number;
    private String chinese;
    private String pinyin;
    private String translation;
    private boolean star;

    public Flashcard(int number, String chinese, String pinyin, String translation, boolean star) {
        this.number = number;
        this.chinese = chinese;
        this.pinyin = pinyin;
        this.translation = translation;
        this.star = star;
    }

    //Getters and setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public boolean isStar() {
        return star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "Flashcard{" +
                "number=" + number +
                ", chinese='" + chinese + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", translation='" + translation + '\'' +
                ", star=" + star +
                '}';
    }

}
