package com.spring.room.web.app.roomwebapp.controller;

import java.util.List;

import com.spring.room.web.app.roomwebapp.Service.StaffService;
import com.spring.room.web.app.roomwebapp.models.StaffMember;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

    private final StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffMember> getAllStaff(){
        return staffService.getAllStaff();
    }
}
