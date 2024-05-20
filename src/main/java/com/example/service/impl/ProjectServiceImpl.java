package com.example.service.impl;

import com.example.dto.ProjectDTO;
import com.example.entity.Project;
import com.example.mapper.ProjectMapper;
import com.example.repository.ProjectRepository;
import com.example.service.ProjectService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;

    public ProjectServiceImpl(ProjectRepository projectRepository, ProjectMapper projectMapper) {
        this.projectRepository = projectRepository;
        this.projectMapper = projectMapper;
    }

    @Override
    public ProjectDTO getByProjectCode(String code) {
        return null;
    }

    @Override
    public List<ProjectDTO> listAllProjects() {

        List<Project> list =projectRepository.findAll(Sort.by("ProjectCode"));
        return list.stream().map(projectMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public void save(ProjectDTO dto) {

       projectRepository.save(projectMapper.convertTiEntity(dto));

    }

    @Override
    public void update(ProjectDTO dto) {

    }

    @Override
    public void delete(String code) {

    }
}
