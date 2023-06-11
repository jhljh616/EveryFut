package com.project.everyfut.service.REG;

import com.project.everyfut.vo.player.player010I01IN;
import com.project.everyfut.vo.player.player010I01OUT;
import com.project.everyfut.vo.team.team0101I01IN;
import com.project.everyfut.repository.regMapper;
import com.project.everyfut.vo.team.team0101I01OUT;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class regTeamService {
    private final regMapper regMapper;

    public List<team0101I01IN> getTeamList() {
        return regMapper.getTeamList();
    }
    @Transactional
    public boolean team0101I01(team0101I01IN in, team0101I01OUT out) {
        Date now = new Date();
        DateFormat date = new SimpleDateFormat("yyyyMMdd");
        in.setRegDate(date.format(now));

        int cnt = regMapper.insertTeam(in);

        if(cnt >0){

            out.setMsg("팀 등록 완료");
        }

        return true;
    }

    @Transactional

    public boolean player010I01(ArrayList<player010I01IN> in, player010I01OUT out) {
        Date now = new Date();
        DateFormat date = new SimpleDateFormat("yyyyMMdd");
        int cnt = 0;
        for(player010I01IN data: in){

            data.setRegDate(date.format(now));
            regMapper.insertPlayer(data);
            cnt++;
        }


        if(cnt > 0){

            out.setMsg("선수 등록 완료");
        }
            return true;
    }

}

