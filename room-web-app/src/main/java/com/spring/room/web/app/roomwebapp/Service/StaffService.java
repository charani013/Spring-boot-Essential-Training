package com.spring.room.web.app.roomwebapp.Service;


import java.util.List;


import com.spring.room.web.app.roomwebapp.data.StaffRepository;
import com.spring.room.web.app.roomwebapp.models.StaffMember;

import org.springframework.stereotype.Service;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }
    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }
}