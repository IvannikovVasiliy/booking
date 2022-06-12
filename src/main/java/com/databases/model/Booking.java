package com.databases.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;

    @Column(name = "from_utc")
    @NotNull
    private Calendar fromUtc;

    @Column(name = "to_utc")
    @NotNull
    private Calendar toUtc;

    @ManyToOne
    private Person person;

}
