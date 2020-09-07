package ru.mirea.inbo0319.pr1;
import java.lang.*;

public class Ball {
    private String type;
    private Boolean isReadyBool;

    public Ball(String type){
        this.type = type;
        this.isReadyBool = false;
    }
    public Ball(String type, Boolean isReady){
        this.type = type;
        this.isReadyBool = isReady;
    }

    public void setType(String type){
        this.type = type;
    }
    public void setIsReadyBool(Boolean isReadyBool){
        this.isReadyBool = isReadyBool;
    }

    public String getType(){
        return this.type;
    }
    public Boolean isReady(){
        return this.isReadyBool;
    }

    public String toString() {
        String r = isReadyBool?" is ready":" is not ready";
        return type + " ball" + r;
    }
}
