package sut.se.g14.entity;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.*;
import lombok.Getter;
import lombok.Setter;
import lombok.*;
@Entity
@Data
@Table(name="event")

public class Event {

    @Id()
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private   Long id;
    private   String event;

    public Event(){}
    public Event(String event) {
         this.event = event;
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }


}