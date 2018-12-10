package com.darko.danchev.simple.blogging.SimpleBlogging.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;

@MappedSuperclass
@Data
public abstract class Model {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private Timestamp createdAt;

    @NotNull
    private Timestamp modifiedAt;

    public Model(){
        setCreatedAt(new Timestamp(System.currentTimeMillis()));
        setModifiedAt(new Timestamp(System.currentTimeMillis()));
    }


}
