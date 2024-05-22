package edu.school.schoolServer.service.Impl;

import edu.school.schoolServer.dto.PupilDto;
import edu.school.schoolServer.dto.TeacherDto;
import edu.school.schoolServer.dto.mapper.PupilDtoMapper;
import edu.school.schoolServer.dto.mapper.TeacherDtoMapper;
import edu.school.schoolServer.entity.Pupil;
import edu.school.schoolServer.entity.Teacher;
import edu.school.schoolServer.repository.PupilRepository;
import edu.school.schoolServer.service.PupilService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PupilServiceImpl implements PupilService {
    private final PupilRepository pupilRepository;

    @Override
    public List<PupilDto> findAllPupils() {
        return PupilDtoMapper.EntitiesToDtos(pupilRepository.findAllPupils());
    }

}
