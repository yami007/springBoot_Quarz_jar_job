package com.example.springboot_quartz.web.dto;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Created by EalenXie on 2019/5/14 10:16.
 */
public class ModifyCronDTO {
    @NotNull(message = "the job id cannot be null")
    private Integer id;

    @NotEmpty(message = "the cron cannot be empty")
    private String cron;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }
}
