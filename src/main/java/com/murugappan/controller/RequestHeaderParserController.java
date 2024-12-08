package com.murugappan.controller;

import com.murugappan.DTO.ResponseDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class RequestHeaderParserController {
    @GetMapping("/whoami")
    ResponseDto PasrseHeadder(HttpServletRequest request,
                              @RequestHeader(value = "Accept-Language", required = false) String language,
                              @RequestHeader(value = "User-Agent", required = false) String userAgent) {
        ResponseDto responseDto = new ResponseDto();
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if (ipAddress == null || ipAddress.isEmpty()) {
            ipAddress = request.getRemoteAddr();
        }
        responseDto.setIpaddress(ipAddress);
        responseDto.setLanguage(language);
        responseDto.setSoftware(userAgent);
        return responseDto;
    }
}
