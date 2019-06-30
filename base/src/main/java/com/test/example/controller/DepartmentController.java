package com.test.example.controller;

import com.simple.base.controller.BaseController;
import com.test.example.entity.Department;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("department")
public class DepartmentController extends BaseController<Department,Long> {
}
