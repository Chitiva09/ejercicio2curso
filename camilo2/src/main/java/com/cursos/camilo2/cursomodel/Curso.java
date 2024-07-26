package com.cursos.camilo2.cursomodel;

public class Curso {

    private String name="";
    private int duration;
    private String timeTable;

    
    public Curso(String name, int duration, String timeTable) {
        this.name = name;
        this.duration = duration;
        this.timeTable = timeTable;
    }


    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getTimeTable() {
        return timeTable;
    }
    public void setTimeTable(String timeTable) {
        this.timeTable = timeTable;
    }

   

}
