package com.practice.springboot.learn_spring_boot;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "mail")
@Component
@Validated
public class MailServiceConfiguration {
    private String hostName;
    private int port;
    @Size(min = 0, max = 20, message = "Exceeding size")
    @NotEmpty(message = "from address not mentioned")
    @NotNull(message = "from address cannot be empty")
    private String from;

    public MailServiceConfiguration(){

    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "MailServiceConfiguration{" +
                "hostName='" + hostName + '\'' +
                ", port=" + port +
                ", from='" + from + '\'' +
                '}';
    }
}
