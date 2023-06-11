package com.project.everyfut.repository;

import com.project.everyfut.vo.player.player010I01IN;
import com.project.everyfut.vo.team.team0101I01IN;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface regMapper {
    List<team0101I01IN> getTeamList();
    int insertTeam(team0101I01IN regTeam);
    int insertPlayer(player010I01IN regPlayer);

}
