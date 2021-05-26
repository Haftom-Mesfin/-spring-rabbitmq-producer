package com.gebreselassie.springrabbitmqproducer;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomMessage {

    private String messageId;
    private String message;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date messageDate;
}
