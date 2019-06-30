package com.test.example.service.impl;

import com.simple.base.service.impl.BaseServiceImpl;
import com.test.example.entity.Department;
import com.test.example.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl extends BaseServiceImpl<Department,Long> implements DepartmentService {
}
