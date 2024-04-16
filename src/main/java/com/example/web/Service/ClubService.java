package com.example.web.Service;

import com.example.web.Model.Club;
import com.example.web.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
    Club saveClub(ClubDto clubDto);

    ClubDto findClubById(Integer clubId);
    void updateClub(ClubDto club);

    void delete(Integer clubId);

    List<ClubDto> searchClub(String clubName);
}
