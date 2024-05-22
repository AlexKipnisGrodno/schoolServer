package edu.school.schoolServer.controller;

import edu.school.schoolServer.dto.PupilDto;
import edu.school.schoolServer.service.Impl.PupilServiceImpl;
import edu.school.schoolServer.service.PupilService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pupils")
@RequiredArgsConstructor
public class PupilController {
    private final PupilServiceImpl pupilServiceImpl;

    @GetMapping
    public List<PupilDto> getAllPupils() {
        return pupilServiceImpl.findAllPupils();
    }

}
