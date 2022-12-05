package br.com.challange.dominio;

public class Course extends Content{
   private int timeLoad;


@Override
public double calculateXp() {
        return XP_DEFAULT * timeLoad;
}


public Course() {
}


public int getTimeLoad() {
    return timeLoad;
}


public void setTimeLoad(int timeLoad) {
    this.timeLoad = timeLoad;
}

@Override
public String toString() {
    return "Course [title=" + getTitle() + ", description=" + getDescription() + ", timeLoad=" + timeLoad + "]";
}
   
}
