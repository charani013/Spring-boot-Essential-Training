package com.spring.room.web.app.roomwebapp.data;

import com.spring.room.web.app.roomwebapp.models.StaffMember;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffMember,String>{

}
    
