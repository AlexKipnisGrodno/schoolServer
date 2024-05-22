package edu.school.schoolServer.service;

import edu.school.schoolServer.dto.PupilDto;

import java.util.List;

public interface PupilService {
    List<PupilDto> findAllPupils();
}
