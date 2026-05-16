package Lesson4;

public abstract class Figure implements Shape{
    private String borderColor;
    private String backgroundColor;

    public Figure(String borderColor, String backgroundColor) {
        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
