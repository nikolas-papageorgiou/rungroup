package com.example.web.Service;

import com.example.web.Model.Club;
import com.example.web.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
    Club saveClub(Club club);

    ClubDto findClubById(Integer clubId);
    void updateClub(ClubDto club);
}
