package com.test.example.dao;

import com.simple.base.dao.BaseRepository;
import com.test.example.entity.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends BaseRepository<Department,Long> {
}
