package com.infy.domein;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Infy on 23.05.2016.
 */
@Entity
@Table(name="file_info", schema = "public")
public class FileInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String type;

    private String tadig;

    private String file_name;

    @Column(nullable = false)
    private Date created_on;

   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", unique = true,  nullable = false)
    private User updated_by;*/

    private int updated_by;

    public FileInfo() {
    }

    public FileInfo(String type, String tadig, String file_name, Date created_on, int user) {
        this.type = type;
        this.tadig = tadig;
        this.file_name = file_name;
        this.created_on = created_on;
        this.updated_by = user;
    }
}
