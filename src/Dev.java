import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import br.com.challange.dominio.Content;

public class Dev {

    private String name;
    private Set<Content> ContentsSubscribe = new LinkedHashSet<>();
    private Set<Content>  ContentFinished = new LinkedHashSet<>();
    
    public void subscribeBootcamp(Bootcamp bootcamp){
        this.ContentsSubscribe.addAll(bootcamp.getContents());
        bootcamp.getDevSubscribes().add(this);
    }

    public void progress(){
       Optional<Content> content = this.ContentsSubscribe.stream().findFirst();
       if(content.isPresent()){
        this.ContentFinished.add(content.get());
        this.ContentsSubscribe.remove(content.get());
       }else{
            System.err.println("You doesn't subscribe in any content!");
       }
    } 

    public double calculatTotaleXp(){
        return this.ContentFinished
        .stream()
        .mapToDouble(Content::calculateXp)
        .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentsSubscribe() {
        return ContentsSubscribe;
    }

    public void setContentsSubscribe(Set<Content> contentsSubscribe) {
        ContentsSubscribe = contentsSubscribe;
    }

    public Set<Content> getContentFinished() {
        return ContentFinished;
    }

    public void setContentFinished(Set<Content> contentFinished) {
        ContentFinished = contentFinished;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((ContentsSubscribe == null) ? 0 : ContentsSubscribe.hashCode());
        result = prime * result + ((ContentFinished == null) ? 0 : ContentFinished.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (ContentsSubscribe == null) {
            if (other.ContentsSubscribe != null)
                return false;
        } else if (!ContentsSubscribe.equals(other.ContentsSubscribe))
            return false;
        if (ContentFinished == null) {
            if (other.ContentFinished != null)
                return false;
        } else if (!ContentFinished.equals(other.ContentFinished))
            return false;
        return true;
    }

    
    
}
