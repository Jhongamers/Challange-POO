import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.challange.dominio.Content;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate finishDate = startDate.plusDays(45);
    private Set<Dev> devSubscribes = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getFinishDate() {
        return finishDate;
    }
    public Set<Dev> getDevSubscribes() {
        return devSubscribes;
    }
    public void setDevSubscribes(Set<Dev> devSubscribes) {
        this.devSubscribes = devSubscribes;
    }
    public Set<Content> getContents() {
        return contents;
    }
    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
        result = prime * result + ((finishDate == null) ? 0 : finishDate.hashCode());
        result = prime * result + ((devSubscribes == null) ? 0 : devSubscribes.hashCode());
        result = prime * result + ((contents == null) ? 0 : contents.hashCode());
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
        Bootcamp other = (Bootcamp) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        } else if (!startDate.equals(other.startDate))
            return false;
        if (finishDate == null) {
            if (other.finishDate != null)
                return false;
        } else if (!finishDate.equals(other.finishDate))
            return false;
        if (devSubscribes == null) {
            if (other.devSubscribes != null)
                return false;
        } else if (!devSubscribes.equals(other.devSubscribes))
            return false;
        if (contents == null) {
            if (other.contents != null)
                return false;
        } else if (!contents.equals(other.contents))
            return false;
        return true;
    }
    
    

}
