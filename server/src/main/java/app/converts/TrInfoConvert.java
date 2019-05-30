package app.converts;

import app.dtos.TrInfoDTO;
import app.entities.TrInfoEntity;
import app.entities.TsubEntity;
import org.springframework.stereotype.Service;

@Service
public class TrInfoConvert {
    public TrInfoDTO TrInfoEntitoDTO(TrInfoEntity trInfoEntity) {
        TrInfoDTO trInfoDTO = new TrInfoDTO();
        trInfoDTO.setId(trInfoEntity.getId());
        trInfoDTO.setTeacherid(trInfoEntity.getTeacherid());
        trInfoDTO.setSubject_id(trInfoEntity.getSubject_id());
        trInfoDTO.setNum(trInfoEntity.getNum());
        trInfoDTO.setStatus(trInfoEntity.getStatus());
        trInfoDTO.setAddtime(trInfoEntity.getAddtime());
        return trInfoDTO;
    }

    public TrInfoEntity TrInfoEntitoEntity(TrInfoDTO trInfoDTO) {
        TrInfoEntity trInfoEntity = new TrInfoEntity();
        trInfoEntity.setId(trInfoDTO.getId());
        trInfoEntity.setTeacherid(trInfoDTO.getTeacherid());
        trInfoEntity.setSubject_id(trInfoDTO.getSubject_id());
        trInfoEntity.setNum(trInfoDTO.getNum());
        trInfoEntity.setStatus(trInfoDTO.getStatus());
        trInfoEntity.setAddtime(trInfoDTO.getAddtime());
        return trInfoEntity;
    }

}
