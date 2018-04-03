package com.example.mariajose.lab32;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by MariaJose on 03-04-2018.
 */

@Entity
public class Form {
    @PrimaryKey
    private int formId;

    @ColumnInfo(name = "form_name")
    private String formName;

    @ColumnInfo(name = "form_date")
    private String formDate;

    @ColumnInfo(name = "form_category")
    private String formCategory;

    @ColumnInfo(name = "form_comment")
    private String formComment;

    public Form(int formId) {
        this.formId = formId;
    }

    @Ignore
    public Form() {
    }

    public int getFormId() {
        return formId;
    }

    public void setFormId(int id) {
        this.formId = id;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String userName) {
        this.formName = userName;
    }

    public String getFormDate() {
        return formDate;
    }

    public void setFormDate(String date) {
        this.formDate = date;
    }

    public String getFormCategory() {
        return formCategory;
    }

    public void setFormCategory(String category) {
        this.formCategory = category;
    }

    public String getFormComment() {
        return formComment;
    }

    public void setFormComment(String comment) {
        this.formComment = comment;
    }
}

