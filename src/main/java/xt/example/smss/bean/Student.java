package xt.example.smss.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
public class Student implements Serializable {
    @ApiModelProperty(value = "st学生ID",required = true)
    private int id;
    @ApiModelProperty(value = "st学生姓名",required = true)
    private String name;
    @ApiModelProperty(value = "st学生分数",required = true)
    private double score;

    //getter 和 setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //重写toString方法，否则返回值为对象的地址

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}