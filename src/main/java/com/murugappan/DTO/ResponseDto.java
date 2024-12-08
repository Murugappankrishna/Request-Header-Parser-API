package com.murugappan.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ResponseDto {
    String ipaddress;
    String language;
    String software;
}
