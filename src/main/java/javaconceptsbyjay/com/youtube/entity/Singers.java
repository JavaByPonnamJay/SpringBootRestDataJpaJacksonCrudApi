package javaconceptsbyjay.com.youtube.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Singers {
    @Id
    @Column(name="singerpos",length = 3)
    @SequenceGenerator(sequenceName = "singer_gen1",allocationSize = 20,initialValue = 100,name="gen1")
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "gen1")
    private Integer singersPosition;
    @Column(name="singername",length = 15)
    private String singersName;
    @Column(name="singerremuner",length= 15)
    private Double singersRemuneration;
}
