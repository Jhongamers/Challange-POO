package br.com.challange.dominio;

public abstract class Content {
    
   protected static final double XP_DEFAULT = 10d;
   private String title;
   private String description;

   public abstract double calculateXp();

public String getTitle() {
    return title;
}

public String getDescription() {
    return description;
}

public void setTitle(String title) {
    this.title = title;
}

public void setDescription(String description) {
    this.description = description;
}

   

}
