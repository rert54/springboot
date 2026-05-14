package com.exam.dto;

public class TodoDTO {

    int id;
    String name;
    String job;

    public TodoDTO(int id) {
    }

    public TodoDTO(String job, String name, int id) {
        this.job = job;
        this.name = name;
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TodoDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

}
