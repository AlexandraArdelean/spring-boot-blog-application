package ro.fasttrackit.springbootblogapplication.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Image {
    @Id
    @GeneratedValue
    private Long id;
    private String url;

    public Image(String url) {
        this.url = url;
    }

}
